package org.planify.provider.domain.repository;

import org.planify.provider.domain.Provider;
import org.planify.service.domain.Service;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProviderRepository extends JpaRepository<Provider, UUID> {
    Optional<Provider> findByUsername(String username);
    List<Provider> findAllByOfferedServicesContaining(Service service);
}
