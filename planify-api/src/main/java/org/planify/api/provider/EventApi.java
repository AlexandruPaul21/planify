package org.planify.api.provider;

import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import org.planify.api.provider.dto.EventDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Api("Event")
public interface EventApi {
    String CONTEXT_PATH = "/api/events";

    @Operation(
        description = "Returns all the available events"
    )
    @GetMapping(
        value = CONTEXT_PATH
    )
    ResponseEntity<List<EventDto>> getEvents();
}
