package org.planify.provider.service.impl;

import org.planify.provider.domain.repository.ProviderRepository;
import org.planify.provider.service.ProviderService;
import org.planify.provider.domain.Provider;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProviderServiceImpl implements ProviderService {
    private final ProviderRepository providerRepository;

    public ProviderServiceImpl(ProviderRepository providerRepository) {
        this.providerRepository = providerRepository;
    }

    @Override
    public List<Provider> findAll() {
        return providerRepository.findAll();
    }
}
