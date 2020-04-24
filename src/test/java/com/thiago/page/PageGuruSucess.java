package com.thiago.page;

import com.thiago.core.CorePage;
import com.thiago.driver.TLDriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageGuruSucess extends CorePage<PageGuruSucess> {

    @FindBy(xpath = "/html/body/div[2]/div/div/h3")
    private WebElement h3Sucess;

    public PageGuruSucess(){
        this.driver = TLDriverFactory.getDriver();
        PageFactory.initElements(this.driver, this);
    }

    public String verificarMensagemLogin(){
        aguardarElementoVisivel(h3Sucess);
        return h3Sucess.getText();
    }

}
