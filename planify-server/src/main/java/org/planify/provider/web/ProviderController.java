package org.planify.provider.web;

import org.planify.api.provider.ProviderApi;
import org.planify.api.provider.dto.ProviderDto;
import org.planify.api.provider.dto.ServiceDto;
import org.planify.provider.domain.mapper.ProviderMapper;
import org.planify.provider.domain.mapper.ServiceMapper;
import org.planify.provider.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
public class ProviderController implements ProviderApi {
    private final ProviderService providerService;
    private final ProviderMapper providerMapper;
    private final ServiceMapper serviceMapper;

    @Autowired
    public ProviderController(ProviderService providerService, ProviderMapper providerMapper, ServiceMapper serviceMapper) {
        this.providerService = providerService;
        this.providerMapper = providerMapper;
        this.serviceMapper = serviceMapper;
    }


    @Override
    public ResponseEntity<List<ProviderDto>> getProviders() {
        return ResponseEntity.ok(
                providerService.findAll().stream().map(providerMapper::entityToDto).collect(Collectors.toList())
        );
    }

    @Override
    public ResponseEntity<ProviderDto> getProviderById(String id) {
        return ResponseEntity.ok(providerMapper.entityToDto(providerService.findById(UUID.fromString(id))));
    }

    @Override
    public ResponseEntity<ProviderDto> updateProvider(ProviderDto providerDto, String id) {
        providerDto.setId(UUID.fromString(id));
        return ResponseEntity.ok(providerMapper.entityToDto(providerService.save(providerDto)));
    }

    @Override
    public ResponseEntity<List<ProviderDto>> getAllProvidersForService(ServiceDto serviceDto) {
        return ResponseEntity.ok(
            providerService
                .getAllByOfferedService(serviceDto.getServiceName())
                .stream()
                .map(providerMapper::entityToDto)
                .collect(Collectors.toList())
        );
    }
}
