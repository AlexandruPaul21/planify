package org.planify.provider.service.impl;

import org.planify.client.domain.Client;
import org.planify.provider.domain.Provider;
import org.planify.provider.domain.repository.ClientRepository;
import org.planify.provider.domain.repository.ProviderRepository;
import org.planify.provider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    private final ClientRepository clientRepository;
    private final ProviderRepository providerRepository;

    @Autowired
    public UserServiceImpl(ClientRepository clientRepository, ProviderRepository providerRepository) {
        this.clientRepository = clientRepository;
        this.providerRepository = providerRepository;
    }

    @Override
    public UserDetailsService userDetailsService() {
        return username -> {
            Optional<Client> client = clientRepository.findByUsername(username);
            Optional<Provider> provider = providerRepository.findByUsername(username);

            if (client.isEmpty() && provider.isEmpty()) {
                throw new UsernameNotFoundException("Invalid email and password");
            }

            if (client.isPresent()) {
                return client.get();
            }

            return provider.get();
        };
    }
}
