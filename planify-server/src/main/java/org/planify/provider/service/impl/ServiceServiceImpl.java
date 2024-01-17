package org.planify.provider.service.impl;

import org.planify.provider.domain.repository.ServiceRepository;
import org.planify.provider.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceServiceImpl implements ServiceService {
    private final ServiceRepository serviceRepository;

    @Autowired
    public ServiceServiceImpl(ServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
    }

    @Override
    public List<org.planify.service.domain.Service> findAll() {
        return serviceRepository.findAll();
    }
}
