package org.planify.event.domain;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import org.planify.Identifiable;
import org.planify.service.domain.Service;

import java.util.List;

@Entity
@Table(name = "event")
public class Event extends Identifiable {
    @Column(nullable = false)
    private String eventName;

    @ManyToMany
    private List<Service> services;

    public Event() {
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }
}
