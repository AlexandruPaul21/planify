package org.planify.provider.service;

import org.planify.api.provider.dto.ClientDto;
import org.planify.client.domain.Client;

import java.util.List;
import java.util.UUID;

public interface ClientService {
    List<Client> findAll();
    Client findById(UUID id);
    Client save(ClientDto client);
}
