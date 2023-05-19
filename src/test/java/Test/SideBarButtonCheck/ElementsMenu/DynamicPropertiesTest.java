package Test.SideBarButtonCheck.ElementsMenu;

import BasePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class DynamicPropertiesTest extends BasePage {

    @BeforeMethod
    public void setUpPage(){
        driver.manage().window().maximize();
        driver.navigate().to(HomeURL);
    }

    @Test(priority = 10)
    public void firstButtonisIsUnavailableBefore5Sec(){
        goToDynamicProperties();
        wdwait.until(ExpectedConditions.visibilityOf(dynamicPropertiesPage.getWillEnable5SecondsButton()));
        Assert.assertTrue(dynamicPropertiesPage.getWillEnable5SecondsButton().isDisplayed());
        Assert.assertFalse(dynamicPropertiesPage.getWillEnable5SecondsButton().isEnabled());
        Assert.assertFalse(dynamicPropertiesPage.getWillEnable5SecondsButton().isSelected());
    }

    @Test(priority = 20)
    public void firstButtonIsAvailableAfter5Sec(){
        goToDynamicProperties();
        wdwait.until(ExpectedConditions.elementToBeClickable(dynamicPropertiesPage.getWillEnable5SecondsButton()));
        Assert.assertTrue(dynamicPropertiesPage.getWillEnable5SecondsButton().isDisplayed());
        Assert.assertTrue(dynamicPropertiesPage.getWillEnable5SecondsButton().isEnabled());
        Assert.assertFalse(dynamicPropertiesPage.getWillEnable5SecondsButton().isSelected());
    }

    @Test(priority = 30)
    public void theSecondButtonDoesNotChangeColorBefore5Sec(){
        goToDynamicProperties();
        wdwait.until(ExpectedConditions.visibilityOf(dynamicPropertiesPage.getColorChangeButton()));
        String actualColorRGBA = dynamicPropertiesPage.getColorChangeButton().getCssValue("color");
        String expectedRGBAColor = "rgba(255, 255, 255, 1)";
        System.out.println(actualColorRGBA);
        String hexColor = Color.fromString(actualColorRGBA).asHex();
        System.out.println(hexColor);
        String expectedHexColor = "#ffffff";

        Assert.assertEquals(actualColorRGBA, expectedRGBAColor);
        Assert.assertEquals(hexColor, expectedHexColor);
    }

    @Test(priority = 40)
    public void theSecondButtonChangesColorAfter5Sec(){
        goToDynamicProperties();
        wdwait.until(ExpectedConditions.elementToBeClickable(dynamicPropertiesPage.getWillEnable5SecondsButton()));
        String actualColorRGBA = dynamicPropertiesPage.getColorChangeButton().getCssValue("color");
        String expectedRGBAColor = "rgba(220, 53, 69, 1)";
        System.out.println(actualColorRGBA);
        String hexColor = Color.fromString(actualColorRGBA).asHex();
        System.out.println(hexColor);
        String expectedHexColor = "#dc3545";
        Assert.assertEquals(actualColorRGBA, expectedRGBAColor);
        Assert.assertEquals(hexColor, expectedHexColor);
    }

    @Test(priority = 50)
    public void doesTheThirdButtonAppearAfter5Sec(){
        goToDynamicProperties();
        wdwait.until(ExpectedConditions.textToBe(By.xpath("//button[@id='visibleAfter']"), "Visible After 5 Seconds"));
        Assert.assertTrue(dynamicPropertiesPage.getVisibleAfter5Seconds().isDisplayed());
        Assert.assertTrue(dynamicPropertiesPage.getVisibleAfter5Seconds().isEnabled());
        Assert.assertFalse(dynamicPropertiesPage.getVisibleAfter5Seconds().isSelected());
    }


    //--------------------------------------------------------

    public void goToDynamicProperties(){
        sidebarPage.clickElements();
        //wdwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Text Box']")));
        wdwait.until(ExpectedConditions.visibilityOf(elementsPage.getDynamicProperties()));
        sidebarPage.scrollTo(elementsPage.getDynamicProperties());
        wdwait.until(ExpectedConditions.elementToBeClickable(elementsPage.getDynamicProperties()));
        elementsPage.clickDynamicProperties();

    }

}
