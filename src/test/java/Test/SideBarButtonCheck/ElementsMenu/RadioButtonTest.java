package Test.SideBarButtonCheck.ElementsMenu;

import BasePage.BasePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RadioButtonTest extends BasePage {

    @BeforeMethod
    public void setUpPage(){
        driver.manage().window().maximize();
        driver.navigate().to(HomeURL);
    }
/*
    @Test(priority = 5)
    public void locatorCheck() throws InterruptedException {
        goToRadioButton();
        radioButtonPage.clickOnYesButton();
        Thread.sleep(3000);
        radioButtonPage.clickOnImpressiveButton();
        Assert.assertTrue(radioButtonPage.getImpressiveButtonSelected().isSelected());
        Thread.sleep(1000);
    }

 */

    @Test(priority = 10)
    public void selectYesButton(){
        goToRadioButton();
        radioButtonPage.clickOnYesButton();
        Assert.assertTrue(radioButtonPage.getYesButtonSelected().isSelected());
        Assert.assertTrue(radioButtonPage.getYesButton().isEnabled());
        Assert.assertTrue(radioButtonPage.getYesButton().isDisplayed());
        textAssert(1,0);
        Assert.assertTrue(radioButtonPage.getImpressiveButton().isDisplayed());
        Assert.assertTrue(radioButtonPage.getImpressiveButton().isEnabled());
        Assert.assertFalse(radioButtonPage.getImpressiveButtonSelected().isSelected());
        //Assert.assertTrue(radioButtonPage.getNoButton().isDisplayed());
        Assert.assertFalse(radioButtonPage.getNoButton().isEnabled());
        Assert.assertFalse(radioButtonPage.getNoButton().isSelected());
    }

    @Test(priority = 20)
    public void selectImpressiveButton(){
        goToRadioButton();
        radioButtonPage.clickOnImpressiveButton();
        textAssert(1,1);
        Assert.assertTrue(radioButtonPage.getYesButton().isDisplayed());
        Assert.assertTrue(radioButtonPage.getYesButton().isEnabled());
        Assert.assertFalse(radioButtonPage.getYesButtonSelected().isSelected());
        Assert.assertTrue(radioButtonPage.getImpressiveButton().isDisplayed());
        Assert.assertTrue(radioButtonPage.getImpressiveButton().isEnabled());
        Assert.assertTrue(radioButtonPage.getImpressiveButtonSelected().isSelected());
        Assert.assertFalse(radioButtonPage.getNoButton().isEnabled());
        Assert.assertFalse(radioButtonPage.getNoButton().isSelected());
    }

    @Test(priority = 30)
    public void isItNoButtonEnabled(){
        goToRadioButton();
        Assert.assertFalse(radioButtonPage.getNoButton().isDisplayed());
        Assert.assertFalse(radioButtonPage.getNoButton().isEnabled());
        Assert.assertFalse(radioButtonPage.getNoButton().isSelected());
        //Assert.assertTrue(radioButtonPage.getNoButton().isDisplayed());
        //Assert.assertTrue(radioButtonPage.getNoButton().isEnabled());
        //Assert.assertTrue(radioButtonPage.getNoButton().isSelected());
    }

    //-----------------

    public void textAssert(int a, int b){
        String actual = radioButtonPage.getTextMessage().getText();
        String expected = excelReader.getStringData("RadioButtonData",a,b);
        Assert.assertEquals(actual,expected);
    }

    public void goToRadioButton(){
        sidebarPage.clickElements();
        wdwait.until(ExpectedConditions.visibilityOf(elementsPage.getTextBox()));
        sidebarPage.scrollTo(elementsPage.getCheckBox());
        elementsPage.clickRadioButton();
    }

}
