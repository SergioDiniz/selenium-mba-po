package com.thiago.page;

import com.thiago.core.CorePage;
import com.thiago.driver.TLDriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageGuruLogin extends CorePage<PageGuruLogin> {

    @FindBy(id = "email")
    private WebElement imputEmail;
    @FindBy(id = "passwd")
    private WebElement imputPassword;
    @FindBy(xpath = "//*[@id=\"SubmitLogin\"]")
    private WebElement btnSignIn;

    public PageGuruLogin(){
        this.driver = TLDriverFactory.getDriver();
        PageFactory.initElements(this.driver, this);
    }

    public void fazerLogin(String email, String password){
        aguardarElementoVisivel(imputEmail);
        preencherCampo(imputEmail, email);
        preencherCampo(imputPassword, password);
        btnSignIn.click();
    }
}
