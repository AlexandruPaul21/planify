package org.planify.contract.domain;

import io.hypersistence.utils.hibernate.type.basic.PostgreSQLEnumType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import org.hibernate.annotations.Type;
import org.planify.Identifiable;
import org.planify.client.domain.Client;
import org.planify.provider.domain.Provider;
import org.planify.service.domain.Service;

import java.math.BigInteger;

@Entity
@Table(name = "contract")
public class Contract extends Identifiable {
    @ManyToOne(optional = false)
    private Client client;

    @ManyToOne(optional = false)
    private Provider provider;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private ContractStatus status;

    @Column(nullable = false)
    private Boolean providerApproved;

    @ManyToOne(optional = false)
    private Service service;

    @Column(nullable = false)
    private BigInteger price;

    public Contract() {
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
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

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public BigInteger getPrice() {
        return price;
    }

    public void setPrice(BigInteger price) {
        this.price = price;
    }
}
