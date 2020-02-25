package com.bw.jcart_administration_back.dto.in;

public class AdministratorResrtPwdInDTO {
    private String email;
    private String reserCode;
    private String newPwd;

    public AdministratorResrtPwdInDTO(String email, String reserCode, String newPwd) {
        this.email = email;
        this.reserCode = reserCode;
        this.newPwd = newPwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getReserCode() {
        return reserCode;
    }

    public void setReserCode(String reserCode) {
        this.reserCode = reserCode;
    }

    public String getNewPwd() {
        return newPwd;
    }

    public void setNewPwd(String newPwd) {
        this.newPwd = newPwd;
    }
}
