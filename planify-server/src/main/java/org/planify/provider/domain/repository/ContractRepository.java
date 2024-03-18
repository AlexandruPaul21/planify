package org.planify.provider.domain.repository;

import org.planify.contract.domain.Contract;
import org.planify.contract.domain.ContractStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ContractRepository extends JpaRepository<Contract, UUID> {
    List<Contract> findAllByStatusIsNotAndClientIdIs(ContractStatus status, UUID clientId);
    List<Contract> findAllByStatusIsAndClientIdIs(ContractStatus status, UUID clientId);
}
