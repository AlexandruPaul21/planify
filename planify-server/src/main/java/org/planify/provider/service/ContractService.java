package org.planify.provider.service;

import org.planify.contract.domain.Contract;

import java.util.List;
import java.util.UUID;

public interface ContractService {
    List<Contract> findAll();
    List<Contract> findActiveByClientId(UUID id);
    List<Contract> findPaidByClientId(UUID id);
}
