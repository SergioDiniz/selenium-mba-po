package com.thiago.page;

import com.thiago.core.CorePage;
import com.thiago.driver.TLDriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PageGuruRegisterSucess extends CorePage<PageGuruRegisterSucess> {

    @FindBy(xpath = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]")
    private WebElement labelMassagemRegisterSucess;

    public PageGuruRegisterSucess(){
        this.driver = TLDriverFactory.getDriver();
        PageFactory.initElements(this.driver, this);
    }

    public void validarRegistro(){
        aguardarElementoVisivel(labelMassagemRegisterSucess);
        Assert.assertEquals(getTextElement(labelMassagemRegisterSucess), "Thank you for registering. You may now sign-in using the user name and password you've just entered.");
    }

}
