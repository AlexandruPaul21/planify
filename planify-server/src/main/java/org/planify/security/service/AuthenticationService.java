package org.planify.security.service;

import org.planify.api.provider.dto.security.ClientSignUpDto;
import org.planify.api.provider.dto.security.JwtAuthenticationResponse;
import org.planify.api.provider.dto.security.JwtSignInResponse;
import org.planify.api.provider.dto.security.ProviderSignUpDto;
import org.planify.api.provider.dto.security.SignInDto;

public interface AuthenticationService {
    JwtSignInResponse signIn(SignInDto request);
    JwtAuthenticationResponse clientSignUp(ClientSignUpDto request);
    JwtAuthenticationResponse providerSignUp(ProviderSignUpDto request);
}
