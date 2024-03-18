package org.planify.api.provider;

import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import org.planify.api.provider.dto.ProviderDto;
import org.planify.api.provider.dto.ServiceDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @Operation(
        description = "Get a provider by it's id"
    )
    @GetMapping(
        value = CONTEXT_PATH + "/{id}"
    )
    ResponseEntity<ProviderDto> getProviderById(@PathVariable String id);

    @Operation(
        description = "Updates the specified provider"
    )
    @PutMapping(
        value = CONTEXT_PATH + "/{id}"
    )
    ResponseEntity<ProviderDto> updateProvider(@RequestBody ProviderDto providerDto, @PathVariable String id);


    @Operation(
        description = "Retrieves all the providers that have the specified service"
    )
    @PostMapping(
        value = CONTEXT_PATH + "/fetch/filter/service"
    )
    ResponseEntity<List<ProviderDto>> getAllProvidersForService(@RequestBody ServiceDto serviceDto);
}
