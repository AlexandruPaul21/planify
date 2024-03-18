package org.planify.api.provider.dto;

import org.planify.contract.domain.ContractStatus;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.UUID;

public class ContractDto {
    private UUID id;
    private ContractStatus status;
    private Boolean providerApproved;
    private ProviderDto provider;
    private ClientDto client;
    private ServiceDto service;
    private BigInteger price;
    private BigInteger advancePayment;
    private String providerNotes;
    private String clientNotes;
    private LocalDateTime contractDate;

    public ContractDto() {
    }

    public ContractDto(UUID id, ContractStatus status, Boolean providerApproved, ProviderDto provider, ClientDto client, ServiceDto service, BigInteger price, BigInteger advancePayment, String providerNotes, String clientNotes, LocalDateTime contractDate) {
        this.id = id;
        this.status = status;
        this.providerApproved = providerApproved;
        this.provider = provider;
        this.client = client;
        this.service = service;
        this.price = price;
        this.advancePayment = advancePayment;
        this.providerNotes = providerNotes;
        this.clientNotes = clientNotes;
        this.contractDate = contractDate;
    }

    public ProviderDto getProvider() {
        return provider;
    }

    public void setProvider(ProviderDto provider) {
        this.provider = provider;
    }

    public ClientDto getClient() {
        return client;
    }

    public void setClient(ClientDto client) {
        this.client = client;
    }

    public BigInteger getAdvancePayment() {
        return advancePayment;
    }

    public void setAdvancePayment(BigInteger advancePayment) {
        this.advancePayment = advancePayment;
    }

    public String getProviderNotes() {
        return providerNotes;
    }

    public void setProviderNotes(String providerNotes) {
        this.providerNotes = providerNotes;
    }

    public String getClientNotes() {
        return clientNotes;
    }

    public void setClientNotes(String clientNotes) {
        this.clientNotes = clientNotes;
    }

    public LocalDateTime getContractDate() {
        return contractDate;
    }

    public void setContractDate(LocalDateTime contractDate) {
        this.contractDate = contractDate;
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
