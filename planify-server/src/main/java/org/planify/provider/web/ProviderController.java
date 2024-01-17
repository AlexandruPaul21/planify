package org.planify.provider.web;

import org.planify.api.provider.ProviderApi;
import org.planify.api.provider.dto.ProviderDto;
import org.planify.provider.domain.mapper.ProviderMapper;
import org.planify.provider.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ProviderController implements ProviderApi {
    private final ProviderService providerService;
    private final ProviderMapper providerMapper;

    @Autowired
    public ProviderController(ProviderService providerService, ProviderMapper providerMapper) {
        this.providerService = providerService;
        this.providerMapper = providerMapper;
    }

    @Override
    public ResponseEntity<List<ProviderDto>> getProviders() {
        return ResponseEntity.ok(
            providerService.findAll().stream().map(providerMapper::entityToDto).collect(Collectors.toList())
        );
    }
}
