package com.thiago.page;

import com.thiago.core.CorePage;
import com.thiago.driver.TLDriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class PageGuruDragDrop extends CorePage<PageGuruDragDrop> {

    @FindBy(xpath = "//*[@id=\"fourth\"]")
    private WebElement labelFourth;
    @FindBy(id = "credit2")
    private WebElement labelBank;
    @FindBy(id = "credit1")
    private WebElement labelSales;
    @FindBy(id = "equal")
    private WebElement labelSucess;
    @FindBy(xpath = "//*[@id=\"bank\"]")
    private WebElement labelDebitAccount;
    @FindBy(xpath = "//*[@id=\"amt7\"]")
    private WebElement labelDebitAmount;
    @FindBy(xpath = "//*[@id=\"loan\"]")
    private WebElement labelCreditAccount;
    @FindBy(xpath = "//*[@id=\"amt8\"]")
    private WebElement labelCreditAmount;

    public PageGuruDragDrop(){
        this.driver = TLDriverFactory.getDriver();
        PageFactory.initElements(this.driver, this);
    }

    public void DragDop(){

        Actions actions = new Actions(this.driver);
        Action dragAndDrop = null;

        dragAndDrop = actions.clickAndHold(labelBank).moveToElement(labelDebitAccount).release().build();
        dragAndDrop.perform();

        dragAndDrop = actions.clickAndHold(labelSales).moveToElement(labelCreditAccount).release().build();
        dragAndDrop.perform();

        dragAndDrop = actions.clickAndHold(labelFourth).moveToElement(labelDebitAmount).release().build();
        dragAndDrop.perform();

        dragAndDrop = actions.clickAndHold(labelFourth).moveToElement(labelCreditAmount).release().build();
        dragAndDrop.perform();

        Assert.assertEquals(getTextElement(labelSucess),"Perfect!");

    }


}
