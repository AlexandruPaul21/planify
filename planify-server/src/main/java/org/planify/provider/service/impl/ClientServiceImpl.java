package org.planify.provider.service.impl;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.planify.api.provider.dto.ClientDto;
import org.planify.client.domain.Client;
import org.planify.provider.domain.repository.ClientRepository;
import org.planify.provider.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ClientServiceImpl implements ClientService {
    private final ClientRepository clientRepository;

    @Autowired
    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public List<Client> findAll() {
        return clientRepository.findAll();
    }

    @Override
    public Client findById(UUID id) {
        Optional<Client> client = clientRepository.findById(id);

        if (client.isEmpty()) {
            throw new EntityNotFoundException();
        }

        return client.get();
    }

    @Override
    @Transactional
    public Client save(ClientDto clientDto) {
        Client client = clientRepository.getReferenceById(clientDto.getId());

        copyClient(client, clientDto);

        return clientRepository.save(client);
    }

    private void copyClient(Client client, ClientDto clientDto) {
        client.setFirstname(clientDto.getFirstname());
        client.setLastname(clientDto.getLastname());
        client.setEmail(clientDto.getEmail());
        client.setAddress(clientDto.getAddress());
        client.setPhoneNumber(clientDto.getPhoneNumber());
        client.setBudget(clientDto.getBudget());
    }
}
