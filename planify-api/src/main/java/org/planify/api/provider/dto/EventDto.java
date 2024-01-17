package org.planify.api.provider.dto;

import java.util.List;
import java.util.UUID;

public class EventDto {
    private UUID id;
    private String eventName;
    private List<ServiceDto> services;

    public EventDto() {
    }

    public EventDto(UUID id, String eventName, List<ServiceDto> services) {
        this.id = id;
        this.eventName = eventName;
        this.services = services;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public List<ServiceDto> getServices() {
        return services;
    }

    public void setServices(List<ServiceDto> services) {
        this.services = services;
    }
}
