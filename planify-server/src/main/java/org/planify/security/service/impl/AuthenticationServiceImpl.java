package org.planify.security.service.impl;

import org.planify.api.provider.dto.security.ClientSignUpDto;
import org.planify.api.provider.dto.security.JwtAuthenticationResponse;
import org.planify.api.provider.dto.security.JwtSignInResponse;
import org.planify.api.provider.dto.security.ProviderSignUpDto;
import org.planify.api.provider.dto.security.SignInDto;
import org.planify.client.domain.Client;
import org.planify.provider.domain.Provider;
import org.planify.provider.domain.mapper.ServiceMapper;
import org.planify.provider.domain.repository.ClientRepository;
import org.planify.provider.domain.repository.ProviderRepository;
import org.planify.security.service.AuthenticationService;
import org.planify.security.service.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private final ClientRepository clientRepository;
    private final ProviderRepository providerRepository;
    private final ServiceMapper serviceMapper;

    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;

    @Autowired
    public AuthenticationServiceImpl(ClientRepository clientRepository, ProviderRepository providerRepository, ServiceMapper serviceMapper, PasswordEncoder passwordEncoder, JwtService jwtService, AuthenticationManager authenticationManager) {
        this.clientRepository = clientRepository;
        this.providerRepository = providerRepository;
        this.serviceMapper = serviceMapper;
        this.passwordEncoder = passwordEncoder;
        this.jwtService = jwtService;
        this.authenticationManager = authenticationManager;
    }


    @Override
    public JwtSignInResponse signIn(SignInDto request) {
        authenticationManager.authenticate(
            new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword())
        );

        Optional<Client> client = clientRepository.findByUsername(request.getUsername());
        Optional<Provider> provider = providerRepository.findByUsername(request.getUsername());

        if (client.isEmpty() && provider.isEmpty()) {
            throw new IllegalArgumentException("Invalid email and password");
        }

        String jwt;
        String role;
        UUID id;
        if (client.isPresent()) {
            jwt = jwtService.generateToken(client.get());
            role = "CLIENT";
            id = client.get().getId();
        } else {
            jwt = jwtService.generateToken(provider.get());
            role = "PROVIDER";
            id = provider.get().getId();
        }

        return new JwtSignInResponse(jwt, role, id);
    }

    @Override
    public JwtAuthenticationResponse clientSignUp(ClientSignUpDto request) {
        Client client = new Client(
                request.getUsername(),
                passwordEncoder.encode(request.getPassword()),
                request.getFirstname(),
                request.getLastname(),
                request.getBudget(),
                request.getAddress(),
                request.getPhoneNumber(),
                request.getEmail(),
                new ArrayList<>(),
                -1,
                LocalDateTime.now()
        );
        clientRepository.save(client);

        String jwt = jwtService.generateToken(client);

        return new JwtAuthenticationResponse(jwt);
    }

    @Override
    public JwtAuthenticationResponse providerSignUp(ProviderSignUpDto request) {
        Provider provider = new Provider(
            request.getUsername(),
            passwordEncoder.encode(request.getPassword()),
            request.getEmail(),
            request.getName(),
            request.getFiscalCode(),
            request.getAddress(),
            request.getPhoneNumber(),
            request.getOfferedServices().stream().map(serviceMapper::dtoToEntity).collect(Collectors.toList()),
            -1,
            LocalDateTime.now()
        );

        providerRepository.save(provider);

        String jwt = jwtService.generateToken(provider);

        return new JwtAuthenticationResponse(jwt);
    }
}
