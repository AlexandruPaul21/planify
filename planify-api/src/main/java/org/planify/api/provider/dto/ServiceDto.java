package org.planify.api.provider.dto;

import java.time.LocalDateTime;
import java.util.UUID;

public class ServiceDto {
    private UUID id;
    private String serviceName;
    private LocalDateTime createdAt;

    public ServiceDto() {
    }

    public ServiceDto(UUID id, String serviceName, LocalDateTime createdAt) {
        this.id = id;
        this.serviceName = serviceName;
        this.createdAt = createdAt;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
