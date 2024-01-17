package org.planify.api.provider;

import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import org.planify.api.provider.dto.ContractDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Api("Contract")
public interface ContractApi {
    String CONTEXT_PATH = "/api/contract";

    @Operation(
        description = "Returns all the available contracts"
    )
    @GetMapping(
        value = CONTEXT_PATH
    )
    ResponseEntity<List<ContractDto>> getContracts();
}
