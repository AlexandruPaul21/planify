package org.planify.api.provider.dto.security;

import java.io.Serializable;

public class SignInDto implements Serializable {
    private String username;
    private String password;

    public SignInDto(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public SignInDto() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
