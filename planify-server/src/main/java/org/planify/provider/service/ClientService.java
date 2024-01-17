package org.planify.provider.service;

import org.planify.client.domain.Client;

import java.util.List;

public interface ClientService {
    List<Client> findAll();
}
