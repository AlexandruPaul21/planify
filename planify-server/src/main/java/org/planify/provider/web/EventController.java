package org.planify.provider.web;

import org.planify.api.provider.EventApi;
import org.planify.api.provider.dto.EventDto;
import org.planify.provider.domain.mapper.EventMapper;
import org.planify.provider.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class EventController implements EventApi {
    private final EventService eventService;
    private final EventMapper eventMapper;

    @Autowired
    public EventController(EventService eventService, EventMapper eventMapper) {
        this.eventService = eventService;
        this.eventMapper = eventMapper;
    }

    @Override
    public ResponseEntity<List<EventDto>> getEvents() {
        return ResponseEntity.ok(eventService.findAll().stream().map(eventMapper::entityToDto).collect(Collectors.toList()));
    }
}
