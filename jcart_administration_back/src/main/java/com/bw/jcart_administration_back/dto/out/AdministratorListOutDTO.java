package com.bw.jcart_administration_back.dto.out;

public class AdministratorListOutDTO {
    private Integer administratorId;
    private String username;
    private Byte status;
    private Long createTimestamp;

    public AdministratorListOutDTO(Integer administratorId, String username, Byte status, Long createTimestamp) {
        this.administratorId = administratorId;
        this.username = username;
        this.status = status;
        this.createTimestamp = createTimestamp;
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

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Long getCreateTimestamp() {
        return createTimestamp;
    }

    public void setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
    }
}
