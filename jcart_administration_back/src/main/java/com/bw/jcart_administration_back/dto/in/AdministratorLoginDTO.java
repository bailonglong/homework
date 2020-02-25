package com.bw.jcart_administration_back.dto.in;

public class AdministratorLoginDTO {
    private String username;
    private String password;

    public AdministratorLoginDTO(String username, String password) {
        this.username = username;
        this.password = password;
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
