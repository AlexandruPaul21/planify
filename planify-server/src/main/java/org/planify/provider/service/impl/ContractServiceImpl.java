package org.planify.provider.service.impl;

import org.planify.contract.domain.Contract;
import org.planify.provider.domain.repository.ContractRepository;
import org.planify.provider.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractServiceImpl implements ContractService {
    private final ContractRepository contractRepository;

    @Autowired
    public ContractServiceImpl(ContractRepository contractRepository) {
        this.contractRepository = contractRepository;
    }

    @Override
    public List<Contract> findAll() {
        return contractRepository.findAll();
    }
}
