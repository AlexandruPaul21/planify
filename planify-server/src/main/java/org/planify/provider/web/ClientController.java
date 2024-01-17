package org.planify.provider.web;

import org.planify.api.provider.ClientApi;
import org.planify.api.provider.dto.ClientDto;
import org.planify.provider.domain.mapper.ClientMapper;
import org.planify.provider.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ClientController implements ClientApi {
    private final ClientService clientService;
    private final ClientMapper clientMapper;

    @Autowired
    public ClientController(ClientService clientService, ClientMapper clientMapper) {
        this.clientService = clientService;
        this.clientMapper = clientMapper;
    }

    @Override
    public ResponseEntity<List<ClientDto>> getClients() {
        return ResponseEntity.ok(clientService.findAll().stream().map(clientMapper::entityToDto).collect(Collectors.toList()));
    }
}
