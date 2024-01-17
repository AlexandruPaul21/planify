package org.planify.provider.service;

import org.planify.provider.domain.Provider;

import java.util.List;

public interface ProviderService {
    List<Provider> findAll();
}
