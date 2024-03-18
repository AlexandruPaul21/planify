package org.planify.provider.service.impl;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.planify.api.provider.dto.ProviderDto;
import org.planify.provider.domain.mapper.ServiceMapper;
import org.planify.provider.domain.repository.ProviderRepository;
import org.planify.provider.domain.repository.ServiceRepository;
import org.planify.provider.service.ProviderService;
import org.planify.provider.domain.Provider;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class ProviderServiceImpl implements ProviderService {
    private final ProviderRepository providerRepository;
    private final ServiceMapper serviceMapper;
    private final ServiceRepository serviceRepository;

    public ProviderServiceImpl(ProviderRepository providerRepository, ServiceMapper serviceMapper, ServiceRepository serviceRepository) {
        this.providerRepository = providerRepository;
        this.serviceMapper = serviceMapper;
        this.serviceRepository = serviceRepository;
    }

    @Override
    public List<Provider> findAll() {
        return providerRepository.findAll();
    }

    @Override
    public Provider findById(UUID id) {
        Optional<Provider> provider = providerRepository.findById(id);

        if (provider.isEmpty()) {
            throw new EntityNotFoundException();
        }

        return provider.get();
    }

    @Override
    @Transactional
    public List<Provider> getAllByOfferedService(String serviceName) {
        return providerRepository.findAllByOfferedServicesContaining(serviceRepository.findByServiceName(serviceName));
    }

    @Override
    @Transactional
    public Provider save(ProviderDto providerDto) {
        Provider provider = providerRepository.getReferenceById(providerDto.getId());

        copyProvider(provider, providerDto);

        return providerRepository.save(provider);
    }

    private void copyProvider(Provider provider, ProviderDto providerDto) {
        provider.setName(providerDto.getName());
        provider.setEmail(providerDto.getEmail());
        provider.setAddress(providerDto.getAddress());
        provider.setPhoneNumber(providerDto.getPhoneNumber());
        provider.setFiscalCode(providerDto.getFiscalCode());
        provider.setOfferedServices(providerDto
                .getOfferedServices()
                .stream()
                .map(serviceMapper::dtoToEntity)
                .collect(Collectors.toList())
        );
    }
}
