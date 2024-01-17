package org.planify.provider.service;

import org.planify.service.domain.Service;

import java.util.List;

public interface ServiceService {
    List<Service> findAll();
}
