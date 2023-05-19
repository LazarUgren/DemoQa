package Test.SideBarButtonCheck.ElementsMenu;

import BasePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestElementsMenu extends BasePage {

    @BeforeMethod
    public void setUpPage(){
        driver.manage().window().maximize();
        driver.navigate().to(HomeURL);
    }

    @Test(priority = 10)
    public void clickOnTextBox(){
        sidebarPage.scrollTo(sidebarPage.getElements());
        sidebarPage.clickElements();
        wdwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Text Box']")));
        sidebarPage.scrollTo(elementsPage.getTextBox());
        elementsPage.clickTextBox();
        String actualText = textBoxPage.getHeadFullName().getText();
        String expectedText = "Full Name";
        Assert.assertEquals(actualText, expectedText);
        Assert.assertTrue(textBoxPage.getTextBoxFullName().isDisplayed());
    }

    @Test(priority = 20)
    public void clickOnCheckBox(){
        goToElemets();
        sidebarPage.scrollTo(elementsPage.getCheckBox());
        elementsPage.clickCheckBox();
        Assert.assertTrue(checkBoxPage.getHome().isDisplayed());
        Assert.assertFalse(checkBoxPage.getHome().isSelected());
    }

    @Test(priority = 30)
    public void clickOnRadioButton(){
        goToElemets();
        sidebarPage.scrollTo(elementsPage.getRadioButton());
        elementsPage.clickRadioButton();
        Assert.assertTrue(radioButtonPage.getYesButton().isDisplayed());
        Assert.assertFalse(radioButtonPage.getImpressiveButton().isSelected());
    }

    @Test(priority = 40)
    public void clickOnWebTables(){
        goToElemets();
        sidebarPage.scrollTo(elementsPage.getWebTables());
        elementsPage.clickWebTables();

    }

    @Test(priority = 50)
    public void clickOnButtons(){
        goToElemets();
        sidebarPage.scrollTo(elementsPage.getButtons());
        elementsPage.clickButtons();
    }

    @Test(priority = 60)
    public void clickOnLinks(){
        goToElemets();
        sidebarPage.scrollTo(elementsPage.getLinks());
        elementsPage.clickLinks();
    }

    @Test(priority = 70)
    public void clickOnBrokenLinks_Images(){
        goToElemets();
        sidebarPage.scrollTo(elementsPage.getBrokenLinks_Images());
        elementsPage.clickBrokenLinks_Images();
    }

    @Test(priority = 80)
    public void clickOnUploadAndDownload(){
        goToElemets();
        sidebarPage.scrollTo(elementsPage.getUploadAndDownload());
        elementsPage.clickUploadAndDownload();
    }

    @Test(priority = 90)
    public void clickOnDynamicProperties(){
        goToElemets();
        sidebarPage.scrollTo(elementsPage.getDynamicProperties());
        elementsPage.clickDynamicProperties();
    }

    //----------------------

    public void goToElemets(){
        sidebarPage.scrollTo(sidebarPage.getElements());
        sidebarPage.clickElements();
        wdwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Text Box']")));
    }

}
