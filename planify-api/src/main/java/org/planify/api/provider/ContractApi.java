package org.planify.api.provider;

import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import org.planify.api.provider.dto.ContractDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Api("Contract")
public interface ContractApi {
    String CONTEXT_PATH = "/api/contracts";

    @Operation(
        description = "Returns all the available contracts"
    )
    @GetMapping(
        value = CONTEXT_PATH
    )
    ResponseEntity<List<ContractDto>> getContracts();

    @Operation(
        description = "Returns all the available contracts for which the client match the id"
    )
    @GetMapping(
        value = CONTEXT_PATH + "/active/{clientId}"
    )
    ResponseEntity<List<ContractDto>> getActiveContractsForClientId(@PathVariable String clientId);

    @Operation(
        description = "Returns all the available contracts for which the client match the id"
    )
    @GetMapping(
        value = CONTEXT_PATH + "/paid/{clientId}"
    )
    ResponseEntity<List<ContractDto>> getPaidContractsForClientId(@PathVariable String clientId);
}
