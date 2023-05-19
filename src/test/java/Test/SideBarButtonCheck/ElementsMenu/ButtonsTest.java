package Test.SideBarButtonCheck.ElementsMenu;

import BasePage.BasePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ButtonsTest extends BasePage {

    @BeforeMethod
    public void setUpPage(){
        driver.manage().window().maximize();
        driver.navigate().to(HomeURL);
    }
/*
    @Test(priority = 10)
    public void locatorCheck() throws InterruptedException {
        goToButtons();
        sidebarPage.scrollTo(buttonsPage.getDoubleClickMeButton());
        buttonsPage.clickOnClickMeButton();
        Thread.sleep(500);
        buttonsPage.clickOnRightClickButton();
        Thread.sleep(500);
        buttonsPage.clickOnDoubleOnDoubleClickButton();
    }

 */

    @Test(priority = 20)
    public void performClick(){
        goToButtons();
        sidebarPage.scrollTo(buttonsPage.getDoubleClickMeButton());
        buttonsPage.clickOnClickMeButton();
        String expected = "You have done a dynamic click";
        String actual = buttonsPage.getClickMeMessage().getText();
        Assert.assertEquals(actual,expected, "the messages are not the same");
    }

    @Test(priority = 30)
    public void performRightClick(){
        goToButtons();
        sidebarPage.scrollTo(buttonsPage.getDoubleClickMeButton());
        buttonsPage.clickOnRightClickButton();
        String expected = "You have done a right click";
        String actual = buttonsPage.getRightClickMeMessage().getText();
        Assert.assertEquals(actual,expected, "the messages are not the same");
    }

    @Test(priority = 40)
    public void performDoubleClick(){
        goToButtons();
        sidebarPage.scrollTo(buttonsPage.getDoubleClickMeButton());
        buttonsPage.clickOnDoubleOnDoubleClickButton();
        String expected = "You have done a double click";
        String actual = buttonsPage.getDoubleClickMeMessage().getText();
        Assert.assertEquals(actual,expected, "the messages are not the same");
    }

//------------

    public void goToButtons(){
        sidebarPage.clickElements();
        wdwait.until(ExpectedConditions.visibilityOf(elementsPage.getButtons()));
        sidebarPage.scrollTo(elementsPage.getButtons());
        wdwait.until(ExpectedConditions.visibilityOf(elementsPage.getButtons()));
        elementsPage.clickButtons();
    }

}
