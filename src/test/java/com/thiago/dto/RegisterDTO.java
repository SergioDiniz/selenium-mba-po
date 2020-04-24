package com.thiago.dto;

public class RegisterDTO {

    private String imputFirstName;
    private String imputLastName;
    private String imputPhone;
    private String imputEmail;
    private String imputAddress;
    private String imputCity;
    private String imputStateProvince;
    private String imputPostalCode;
    private String selectCountry;
    private String imputUserName;
    private String imputPassword;
    private String imputConfirmPassword;
    private String btnEnviar;

    public RegisterDTO() { }

    public RegisterDTO(String imputFirstName, String imputLastName, String imputPhone, String imputEmail, String imputAddress, String imputCity, String imputStateProvince, String imputPostalCode, String selectCountry, String imputUserName, String imputPassword, String imputConfirmPassword, String btnEnviar) {
        this.imputFirstName = imputFirstName;
        this.imputLastName = imputLastName;
        this.imputPhone = imputPhone;
        this.imputEmail = imputEmail;
        this.imputAddress = imputAddress;
        this.imputCity = imputCity;
        this.imputStateProvince = imputStateProvince;
        this.imputPostalCode = imputPostalCode;
        this.selectCountry = selectCountry;
        this.imputUserName = imputUserName;
        this.imputPassword = imputPassword;
        this.imputConfirmPassword = imputConfirmPassword;
        this.btnEnviar = btnEnviar;
    }

    public String getImputFirstName() {
        return imputFirstName;
    }

    public void setImputFirstName(String imputFirstName) {
        this.imputFirstName = imputFirstName;
    }

    public String getImputLastName() {
        return imputLastName;
    }

    public void setImputLastName(String imputLastName) {
        this.imputLastName = imputLastName;
    }

    public String getImputPhone() {
        return imputPhone;
    }

    public void setImputPhone(String imputPhone) {
        this.imputPhone = imputPhone;
    }

    public String getImputEmail() {
        return imputEmail;
    }

    public void setImputEmail(String imputEmail) {
        this.imputEmail = imputEmail;
    }

    public String getImputAddress() {
        return imputAddress;
    }

    public void setImputAddress(String imputAddress) {
        this.imputAddress = imputAddress;
    }

    public String getImputCity() {
        return imputCity;
    }

    public void setImputCity(String imputCity) {
        this.imputCity = imputCity;
    }

    public String getImputStateProvince() {
        return imputStateProvince;
    }

    public void setImputStateProvince(String imputStateProvince) {
        this.imputStateProvince = imputStateProvince;
    }

    public String getImputPostalCode() {
        return imputPostalCode;
    }

    public void setImputPostalCode(String imputPostalCode) {
        this.imputPostalCode = imputPostalCode;
    }

    public String getSelectCountry() {
        return selectCountry;
    }

    public void setSelectCountry(String selectCountry) {
        this.selectCountry = selectCountry;
    }

    public String getImputUserName() {
        return imputUserName;
    }

    public void setImputUserName(String imputUserName) {
        this.imputUserName = imputUserName;
    }

    public String getImputPassword() {
        return imputPassword;
    }

    public void setImputPassword(String imputPassword) {
        this.imputPassword = imputPassword;
    }

    public String getImputConfirmPassword() {
        return imputConfirmPassword;
    }

    public void setImputConfirmPassword(String imputConfirmPassword) {
        this.imputConfirmPassword = imputConfirmPassword;
    }

    public String getBtnEnviar() {
        return btnEnviar;
    }

    public void setBtnEnviar(String btnEnviar) {
        this.btnEnviar = btnEnviar;
    }
}
