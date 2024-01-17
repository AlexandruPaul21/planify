package org.planify.api.provider;

import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import org.planify.api.provider.dto.ProviderDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

import java.util.List;
import java.util.Locale;

@Api("Providers")
public interface ProviderApi {
    String CONTEXT_PATH = "/api/providers";

    @Operation(
        description = "Returns all the available providers"
    )
    @GetMapping(
        value = CONTEXT_PATH
    )
    ResponseEntity<List<ProviderDto>> getProviders();
}
