package com.bw.jcart_administration_back.dto.in;

public class AdministratorUpdateInDTO {
    private Integer administratorId;
    private String tralName;
    private String password;
    private String email;
    private Byte status;

    public AdministratorUpdateInDTO(Integer administratorId, String tralName, String password, String email, Byte status) {
        this.administratorId = administratorId;
        this.tralName = tralName;
        this.password = password;
        this.email = email;
        this.status = status;
    }

    public Integer getAdministratorId() {
        return administratorId;
    }

    public void setAdministratorId(Integer administratorId) {
        this.administratorId = administratorId;
    }

    public String getTralName() {
        return tralName;
    }

    public void setTralName(String tralName) {
        this.tralName = tralName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}
