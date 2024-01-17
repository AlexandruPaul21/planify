package org.planify.api.provider.dto;

import org.planify.contract.domain.ContractStatus;

import java.math.BigInteger;
import java.util.UUID;

public class ContractDto {
    private UUID id;
    private ContractStatus status;
    private Boolean providerApproved;
    private ServiceDto service;
    private BigInteger price;

    public ContractDto() {
    }

    public ContractDto(UUID id, ContractStatus status, Boolean providerApproved, ServiceDto service, BigInteger price) {
        this.id = id;
        this.status = status;
        this.providerApproved = providerApproved;
        this.service = service;
        this.price = price;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public ContractStatus getStatus() {
        return status;
    }

    public void setStatus(ContractStatus status) {
        this.status = status;
    }

    public Boolean getProviderApproved() {
        return providerApproved;
    }

    public void setProviderApproved(Boolean providerApproved) {
        this.providerApproved = providerApproved;
    }

    public ServiceDto getService() {
        return service;
    }

    public void setService(ServiceDto service) {
        this.service = service;
    }

    public BigInteger getPrice() {
        return price;
    }

    public void setPrice(BigInteger price) {
        this.price = price;
    }
}
