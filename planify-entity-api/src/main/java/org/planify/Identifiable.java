package org.planify;

import jakarta.persistence.*;

import java.util.UUID;

@MappedSuperclass
public class Identifiable {
    @Id
    @Column(unique = true)
    @GeneratedValue(strategy = GenerationType.UUID)
    UUID id;

    public Identifiable(UUID id) {
        this.id = id;
    }

    public Identifiable() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
