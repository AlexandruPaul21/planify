package org.planify.api.provider;

import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import org.planify.api.provider.dto.ServiceDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Api("Service")
public interface ServiceApi {
    String CONTEXT_PATH = "/api/services";

    @Operation(
        description = "Returns all the available services"
    )
    @GetMapping(
        value = CONTEXT_PATH
    )
    ResponseEntity<List<ServiceDto>> getServices();
}
