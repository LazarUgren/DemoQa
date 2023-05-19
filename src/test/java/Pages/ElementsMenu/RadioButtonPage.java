package Pages.ElementsMenu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioButtonPage {

    public WebDriver driver;
    public WebDriverWait wdwait;

    WebElement Picture;
    //----------
    WebElement Naslov;
    //-----------
    WebElement QwestionHead;
    //-------
    WebElement YesButton;
    WebElement ImpressiveButton;
    WebElement NoButton;
    //---
    WebElement YesButtonSelected;
    WebElement ImpressiveButtonSelected;
    //--------
    WebElement textMessage;

    public RadioButtonPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getPicture() {
        return Picture;
    }

    public WebElement getNaslov() {
        return driver.findElement(By.cssSelector(".pattern-backgound.playgound-header"));
    }

    public WebElement getQwestionHead() {
        return driver.findElement(By.className("Do you like the site?"));
    }

    public WebElement getYesButton() {
        return driver.findElement(By.xpath("//label[@for='yesRadio']"));
    }

    public WebElement getImpressiveButton() {
        return driver.findElement(By.xpath("//label[@for='impressiveRadio']"));
    }

    public WebElement getNoButton() {
        return driver.findElement(By.id("noRadio"));
    }


    public WebElement getTextMessage() {
        return driver.findElement(By.className("mt-3"));
    }

    public WebElement getYesButtonSelected() {
        return driver.findElement(By.xpath("//*[@id=\"yesRadio\"]"));
    }

    public WebElement getImpressiveButtonSelected() {
        return driver.findElement(By.xpath("//*[@id=\"impressiveRadio\"]"));
    }

    //----------------------------

    public void clickOnYesButton(){
        this.getYesButton().click();
    }

    public void clickOnImpressiveButton(){
        this.getImpressiveButton().click();
    }




}
