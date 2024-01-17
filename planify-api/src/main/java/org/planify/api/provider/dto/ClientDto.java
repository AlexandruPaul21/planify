package org.planify.api.provider.dto;

import org.planify.contract.domain.Contract;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class ClientDto {
    private UUID id;
    private String username;
    private String firstname;
    private String lastname;
    private BigInteger budget;
    private String address;
    private String phoneNumber;
    private List<ContractDto> contracts;
    private Integer rating;
    private LocalDateTime createdAt;

    public ClientDto() {
    }

    public ClientDto(String username, String firstname, String lastname, BigInteger budget, String address, String phoneNumber, List<ContractDto> contracts, Integer rating, LocalDateTime createdAt) {
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.budget = budget;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.contracts = contracts;
        this.rating = rating;
        this.createdAt = createdAt;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public BigInteger getBudget() {
        return budget;
    }

    public void setBudget(BigInteger budget) {
        this.budget = budget;
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

    public List<ContractDto> getContracts() {
        return contracts;
    }

    public void setContracts(List<ContractDto> contracts) {
        this.contracts = contracts;
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
