package Test.SideBarButtonCheck.ElementsMenu;

import BasePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TextBoxTest extends BasePage {

    @BeforeMethod
    public void setUpPage(){
        driver.manage().window().maximize();
        driver.navigate().to(HomeURL);
    }

    @Test(priority = 10)
    public void happyFlowTest(){
        wdwait.until(ExpectedConditions.elementToBeClickable(sidebarPage.getElements()));
        sidebarPage.scrollTo(sidebarPage.getElements());
        sidebarPage.clickElements();
        wdwait.until(ExpectedConditions.elementToBeClickable(elementsPage.getTextBox()));
        elementsPage.clickTextBox();
        wdwait.until(ExpectedConditions.visibilityOf(textBoxPage.getTextBoxFullName()));
        textBoxPage.insertFullName(excelReader.getStringData("TextBoxData", 1, 0));
        textBoxPage.insertEmail(excelReader.getStringData("TextBoxData", 1, 1));
        textBoxPage.insertCurrentAddress(excelReader.getStringData("TextBoxData", 1, 2));
        textBoxPage.insertPermanentAddress(excelReader.getStringData("TextBoxData", 1, 3));
        sidebarPage.scrollTo(textBoxPage.getSubminButton());
        textBoxPage.clickSubmit();
        String actualResponse = textBoxPage.getOutputBox().getText();
        Assert.assertTrue(actualResponse.contains(textBoxPage.getTextBoxFullName().getText()+
                textBoxPage.getTextBoxEmail().getText()+textBoxPage.getTextBoxCurrentAddress().getText()+
                textBoxPage.getTextBoxPermanentAddress().getText()));
    }

    @Test(priority = 30)
    public void insertInvalidEmailForm2(){
        goToTextBox();
        sidebarPage.scrollTo(textBoxPage.getHeadEmail());
        wdwait.until(ExpectedConditions.elementToBeClickable(textBoxPage.getTextBoxEmail()));
        textBoxPage.insertEmail(excelReader.getStringData("TextBoxData", 3,1));
        sidebarPage.scrollTo(textBoxPage.getSubminButton());
        textBoxPage.clickSubmit();
        String actual = textBoxPage.getOutputBox().getText();
        String expected = "";
        Assert.assertEquals(actual, expected);
    }


    @Test(priority = 20)
    public void insertInvalidEmailForm1(){
        goToTextBox();
        sidebarPage.scrollTo(textBoxPage.getHeadEmail());
        wdwait.until(ExpectedConditions.elementToBeClickable(textBoxPage.getTextBoxEmail()));
        textBoxPage.insertEmail(excelReader.getStringData("TextBoxData", 2,1));
        sidebarPage.scrollTo(textBoxPage.getSubminButton());
        textBoxPage.clickSubmit();
        Assert.assertFalse(textBoxPage.getOutputBox().isDisplayed());
    }

    @Test(priority = 40)
    public void insertInvalidEmailForm3(){
        goToTextBox();
        sidebarPage.scrollTo(textBoxPage.getHeadEmail());
        wdwait.until(ExpectedConditions.elementToBeClickable(textBoxPage.getTextBoxEmail()));
        textBoxPage.insertEmail(excelReader.getStringData("TextBoxData", 4,1));
        sidebarPage.scrollTo(textBoxPage.getSubminButton());
        textBoxPage.clickSubmit();
        Assert.assertTrue(textBoxPage.getOutputBox().isDisplayed());
        Assert.assertNotNull(textBoxPage.getOutputBox());
        String actual = textBoxPage.getOutputBox().getText();
        String expected = "a@gmail.com";
        Assert.assertTrue(actual.contains(expected));
    }

    @Test(priority = 50)
    public void insertInvalidEmailForm4(){
        goToTextBox();
        sidebarPage.scrollTo(textBoxPage.getHeadEmail());
        wdwait.until(ExpectedConditions.elementToBeClickable(textBoxPage.getTextBoxEmail()));
        textBoxPage.insertEmail(excelReader.getStringData("TextBoxData", 5,1));
        sidebarPage.scrollTo(textBoxPage.getSubminButton());
        textBoxPage.clickSubmit();
        Assert.assertTrue(textBoxPage.getOutputBox().isDisplayed());
        Assert.assertNotNull(textBoxPage.getOutputBox());
        String actual = textBoxPage.getOutputBox().getText();
        String expected = excelReader.getStringData("TextBoxData", 5,1);
        Assert.assertTrue(actual.contains(expected));
    }

    @Test(priority = 60)
    public void insertInvalidEmailForm5(){
        goToTextBox();
        sidebarPage.scrollTo(textBoxPage.getHeadEmail());
        wdwait.until(ExpectedConditions.elementToBeClickable(textBoxPage.getTextBoxEmail()));
        textBoxPage.insertEmail(excelReader.getStringData("TextBoxData", 6,1));
        sidebarPage.scrollTo(textBoxPage.getSubminButton());
        textBoxPage.clickSubmit();
        Assert.assertFalse(textBoxPage.getOutputBox().isDisplayed());
        Assert.assertNotNull(textBoxPage.getTextBoxEmail());
        String actual = textBoxPage.getOutputBox().getText();
        String expected = excelReader.getStringData("TextBoxData", 6,1);
        Assert.assertFalse(actual.contains(expected));
    }

    @Test(priority = 80)
    public void insertInvalidEmailForm6(){
        goToTextBox();
        textBoxPage.insertEmail(excelReader.getStringData("TextBoxData", 7,1));
        sidebarPage.scrollTo(textBoxPage.getSubminButton());
        textBoxPage.clickSubmit();
        Assert.assertTrue(textBoxPage.getOutputBox().isDisplayed());
        String actual = textBoxPage.getOutputBox().getText();
        String expected = textBoxPage.getTextBoxEmail().getText();
        Assert.assertTrue(actual.contains(expected));
    }

    @Test(priority = 90)
    public void doesRedAlertColorWorkIfYouInsertEmail() throws InterruptedException {
        goToTextBox();
        wdwait.until(ExpectedConditions.elementToBeClickable(textBoxPage.getTextBoxEmail()));
        textBoxPage.insertEmail(excelReader.getStringData("TextBoxData", 2,1));
        wdwait.until(ExpectedConditions.visibilityOf(textBoxPage.getTextBoxEmail()));
        sidebarPage.scrollTo(textBoxPage.getSubminButton());
        textBoxPage.clickSubmit();
        sidebarPage.scrollTo(textBoxPage.getTextBoxFullName());
        //wdwait.until(ExpectedConditions.visibilityOf(textBoxPage.getTextBoxEmail()));
        Thread.sleep(2000);
        //wdwait.withTimeout(Duration.ofSeconds(4000));


        String actualColor = textBoxPage.getTextBoxEmail().getCssValue("border-color");//-color
        String hexBackColor = Color.fromString(actualColor).asHex();
        String expectedColorRed = excelReader.getStringData("TextBoxData",1,5);
        Assert.assertEquals(hexBackColor,expectedColorRed, "Color are not same, red Alert");
    }

    //-------------

    public void goToTextBox(){
        wdwait.until(ExpectedConditions.elementToBeClickable(sidebarPage.getElements()));
        sidebarPage.scrollTo(sidebarPage.getElements());
        sidebarPage.clickElements();
        wdwait.until(ExpectedConditions.elementToBeClickable(elementsPage.getTextBox()));
        elementsPage.clickTextBox();
        wdwait.until(ExpectedConditions.visibilityOf(textBoxPage.getTextBoxFullName()));
    }


}
