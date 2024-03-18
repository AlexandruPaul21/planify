package org.planify.provider.service;

import org.planify.api.provider.dto.ProviderDto;
import org.planify.provider.domain.Provider;
import org.planify.service.domain.Service;

import java.util.List;
import java.util.UUID;

public interface ProviderService {
    List<Provider> findAll();
    Provider findById(UUID id);
    Provider save(ProviderDto provider);
    List<Provider> getAllByOfferedService(String serviceName);
}
