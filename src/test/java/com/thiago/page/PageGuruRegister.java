package com.thiago.page;

import com.sun.image.codec.jpeg.JPEGEncodeParam;
import com.thiago.core.CorePage;
import com.thiago.driver.TLDriverFactory;
import com.thiago.dto.RegisterDTO;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageGuruRegister extends CorePage<PageGuruRegister> {

    @FindBy(name = "firstName")
    private WebElement imputFirstName;
    @FindBy(name = "lastName")
    private WebElement imputLastName;
    @FindBy(name = "phone")
    private WebElement imputPhone;
    @FindBy(name = "userName")
    private WebElement imputEmail;
    @FindBy(name = "address1")
    private WebElement imputAddress;
    @FindBy(name = "city")
    private WebElement imputCity;
    @FindBy(name = "state")
    private WebElement imputStateProvince;
    @FindBy(name = "postalCode")
    private WebElement imputPostalCode;
    @FindBy(name = "country")
    private WebElement selectCountry;
    @FindBy(name = "email")
    private WebElement imputUserName;
    @FindBy(name = "password")
    private WebElement imputPassword;
    @FindBy(name = "confirmPassword")
    private WebElement imputConfirmPassword;
    @FindBy(name = "submit")
    private WebElement btnEnviar;

    public PageGuruRegister () {
        this.driver = TLDriverFactory.getDriver();
        PageFactory.initElements(this.driver, this);
    }

    public PageGuruRegisterSucess realizarRegistro(RegisterDTO registerDTO){
        preencherCampo(imputFirstName, registerDTO.getImputFirstName());
        preencherCampo(imputLastName, registerDTO.getImputLastName());
        preencherCampo(imputPhone, registerDTO.getImputPhone());
        preencherCampo(imputEmail, registerDTO.getImputEmail());
        preencherCampo(imputAddress, registerDTO.getImputAddress());
        preencherCampo(imputCity, registerDTO.getImputCity());
        preencherCampo(imputStateProvince, registerDTO.getImputStateProvince());
        preencherCampo(imputPostalCode, registerDTO.getImputPostalCode());
        selectElementByVisibleText(selectCountry, registerDTO.getSelectCountry());
        preencherCampo(imputUserName, registerDTO.getImputUserName());
        preencherCampo(imputPassword, registerDTO.getImputPassword());
        preencherCampo(imputConfirmPassword, registerDTO.getImputConfirmPassword());

        btnEnviar.click();

        return new PageGuruRegisterSucess();

    }
}
