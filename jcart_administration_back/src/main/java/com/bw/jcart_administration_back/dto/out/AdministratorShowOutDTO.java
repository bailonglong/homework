package com.bw.jcart_administration_back.dto.out;

public class AdministratorShowOutDTO {
    private Integer administratorId;
    private String username;
    private String email;
    private String avatarUrl;
    private Byte status;

    public AdministratorShowOutDTO(Integer administratorId, String username, String email, String avatarUrl, Byte status) {
        this.administratorId = administratorId;
        this.username = username;
        this.email = email;
        this.avatarUrl = avatarUrl;
        this.status = status;
    }

    public Integer getAdministratorId() {
        return administratorId;
    }

    public void setAdministratorId(Integer administratorId) {
        this.administratorId = administratorId;
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

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}
