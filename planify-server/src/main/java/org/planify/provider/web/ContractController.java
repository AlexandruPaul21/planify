package org.planify.provider.web;

import org.planify.api.provider.ContractApi;
import org.planify.api.provider.dto.ContractDto;
import org.planify.provider.domain.mapper.ContractMapper;
import org.planify.provider.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
public class ContractController implements ContractApi {
    private final ContractService contractService;
    private final ContractMapper contractMapper;

    @Autowired
    public ContractController(ContractService contractService, ContractMapper contractMapper) {
        this.contractService = contractService;
        this.contractMapper = contractMapper;
    }

    @Override
    public ResponseEntity<List<ContractDto>> getContracts() {
        return ResponseEntity.ok(
            contractService.findAll()
                .stream()
                .map(contractMapper::entityToDto)
                .collect(Collectors.toList())
        );
    }

    @Override
    public ResponseEntity<List<ContractDto>> getActiveContractsForClientId(String clientId) {
        return ResponseEntity.ok(
            contractService.findActiveByClientId(UUID.fromString(clientId))
                .stream()
                .map(contractMapper::entityToDto)
                .collect(Collectors.toList())
        );
    }

    @Override
    public ResponseEntity<List<ContractDto>> getPaidContractsForClientId(String clientId) {
        return ResponseEntity.ok(
            contractService.findPaidByClientId(UUID.fromString(clientId))
                .stream()
                .map(contractMapper::entityToDto)
                .collect(Collectors.toList())
        );
    }
}
