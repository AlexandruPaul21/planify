package org.planify.api.provider;

import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import org.planify.api.provider.dto.ClientDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Api("Client")
public interface ClientApi {
    String CONTEXT_PATH = "/api/clients";

    @Operation(
        description = "Returns all the available clients"
    )
    @GetMapping(
        value = CONTEXT_PATH
    )
    ResponseEntity<List<ClientDto>> getClients();
}
