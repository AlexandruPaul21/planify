package org.planify.provider.web;

import org.planify.api.provider.ServiceApi;
import org.planify.api.provider.dto.ServiceDto;
import org.planify.provider.domain.mapper.ServiceMapper;
import org.planify.provider.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ServiceController implements ServiceApi {
    private final ServiceService serviceService;
    private final ServiceMapper serviceMapper;

    @Autowired
    public ServiceController(ServiceService serviceService, ServiceMapper serviceMapper) {
        this.serviceService = serviceService;
        this.serviceMapper = serviceMapper;
    }

    @Override
    public ResponseEntity<List<ServiceDto>> getServices() {
        return ResponseEntity.ok(serviceService.findAll().stream().map(serviceMapper::entityToDto).collect(Collectors.toList()));
    }
}
