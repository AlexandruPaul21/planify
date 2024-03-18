package org.planify.api.provider.dto.security;

import org.planify.api.provider.dto.ServiceDto;

import java.io.Serializable;
import java.util.List;

public class ProviderSignUpDto implements Serializable {
    private String name;
    private String fiscalCode;
    private String username;
    private String email;
    private String address;
    private List<ServiceDto> offeredServices;
    private String phoneNumber;
    private String password;

    public List<ServiceDto> getOfferedServices() {
        return offeredServices;
    }

    public void setOfferedServices(List<ServiceDto> offeredServices) {
        this.offeredServices = offeredServices;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
