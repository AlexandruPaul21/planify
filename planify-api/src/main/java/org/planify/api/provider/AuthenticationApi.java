package org.planify.api.provider;

import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import org.planify.api.provider.dto.security.ClientSignUpDto;
import org.planify.api.provider.dto.security.JwtAuthenticationResponse;
import org.planify.api.provider.dto.security.JwtSignInResponse;
import org.planify.api.provider.dto.security.ProviderSignUpDto;
import org.planify.api.provider.dto.security.SignInDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Api("Authentication")
public interface AuthenticationApi {
    String CONTEXT_PATH = "/api/auth";

    @Operation(
        description = "Sign in into the application"
    )
    @PostMapping(
        CONTEXT_PATH + "/sign-in"
    )
    ResponseEntity<JwtSignInResponse> signIn(@RequestBody SignInDto request);


    @Operation(
        description = "Registers a new client"
    )
    @PostMapping(
            CONTEXT_PATH + "/client/sign-up"
    )
    ResponseEntity<JwtAuthenticationResponse> clientSignUp(@RequestBody ClientSignUpDto request);

    @Operation(
        description = "Register as a new provider"
    )
    @PostMapping(
        CONTEXT_PATH + "/provider/sign-up"
    )
    ResponseEntity<JwtAuthenticationResponse> providerSignUp(@RequestBody ProviderSignUpDto request);
}
