package com.thiago.page;

import com.thiago.core.CorePage;
import com.thiago.driver.TLDriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PageGuruDeleteCustomer extends CorePage<PageGuruDeleteCustomer> {

    @FindBy(name = "cusid")
    private WebElement imputCustomerId;
    @FindBy(name = "submit")
    private WebElement btnSubmit;

    public PageGuruDeleteCustomer(){
        this.driver = TLDriverFactory.getDriver();
        PageFactory.initElements(this.driver, this);
    }

    public void deleteCustomerById(String id){
        preencherCampo(imputCustomerId, id);
        btnSubmit.click();
        String confirmeMessage = getAlert();
        acceptAlert();
        String sucessMessage = getAlert();
        acceptAlert();

        Assert.assertEquals(confirmeMessage, "Do you really want to delete this Customer?");
        Assert.assertEquals(sucessMessage, "Customer Successfully Delete!");

    }

}
