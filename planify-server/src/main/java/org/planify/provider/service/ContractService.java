package org.planify.provider.service;

import org.planify.contract.domain.Contract;

import java.util.List;

public interface ContractService {
    List<Contract> findAll();
}
