package org.planify.api.provider.dto;

import java.io.Serializable;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class ProviderDto implements Serializable {
    private UUID id;
    private String username;
    private String name;
    private String fiscalCode;
    private String address;
    private String phoneNumber;
    private List<ServiceDto> offeredServices;
    private BigInteger revenue;
    private Integer rating;
    private LocalDateTime createdAt;

    public ProviderDto() {
    }

    public ProviderDto(UUID id, String username, String name, String fiscalCode, String address, String phoneNumber, List<ServiceDto> offeredServices, BigInteger revenue, Integer rating, LocalDateTime createdAt) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.fiscalCode = fiscalCode;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.offeredServices = offeredServices;
        this.revenue = revenue;
        this.rating = rating;
        this.createdAt = createdAt;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFiscalCode() {
        return fiscalCode;
    }

    public void setFiscalCode(String fiscalCode) {
        this.fiscalCode = fiscalCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<ServiceDto> getOfferedServices() {
        return offeredServices;
    }

    public void setOfferedServices(List<ServiceDto> offeredServices) {
        this.offeredServices = offeredServices;
    }

    public BigInteger getRevenue() {
        return revenue;
    }

    public void setRevenue(BigInteger revenue) {
        this.revenue = revenue;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
