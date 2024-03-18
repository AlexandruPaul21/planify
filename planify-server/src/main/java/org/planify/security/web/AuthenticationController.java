package org.planify.security.web;

import org.planify.api.provider.AuthenticationApi;
import org.planify.api.provider.dto.security.ClientSignUpDto;
import org.planify.api.provider.dto.security.JwtAuthenticationResponse;
import org.planify.api.provider.dto.security.JwtSignInResponse;
import org.planify.api.provider.dto.security.ProviderSignUpDto;
import org.planify.api.provider.dto.security.SignInDto;
import org.planify.security.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController implements AuthenticationApi {
    private final AuthenticationService authenticationService;

    @Autowired
    public AuthenticationController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @Override
    public ResponseEntity<JwtSignInResponse> signIn(SignInDto request) {
        return ResponseEntity.ok(authenticationService.signIn(request));
    }

    @Override
    public ResponseEntity<JwtAuthenticationResponse> clientSignUp(ClientSignUpDto request) {
        return ResponseEntity.ok(authenticationService.clientSignUp(request));
    }

    @Override
    public ResponseEntity<JwtAuthenticationResponse> providerSignUp(ProviderSignUpDto request) {
        return ResponseEntity.ok(authenticationService.providerSignUp(request));
    }
}
