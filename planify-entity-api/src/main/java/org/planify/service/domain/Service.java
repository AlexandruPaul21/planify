package org.planify.service.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.planify.Identifiable;

import java.time.LocalDateTime;

@Entity
@Table(name = "service")
public class Service extends Identifiable {
    @Column(nullable = false)
    private String serviceName;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    public Service() {
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
