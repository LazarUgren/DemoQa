package Pages.ElementsMenu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ButtonsPage {

    public WebDriver driver;
    public WebDriverWait wdwait;
    public Actions act;

    WebElement Picture;
    //----------
    WebElement Naslov;
    //------
    WebElement DoubleClickMeButton;
    WebElement RightClickMebutton;
    WebElement ClickMeButton;

    WebElement doubleClickMeMessage;
    WebElement rightClickMeMessage;
    WebElement clickMeMessage;

    public ButtonsPage(WebDriver driver, WebDriverWait wdwait, Actions act) {
        this.driver = driver;
        this.wdwait = wdwait;
        this.act = act;
    }

    public WebElement getPicture() {
        return Picture;
    }

    public WebElement getNaslov() {
        return driver.findElement(By.xpath("//div[@class='main-header']"));
    }

    public WebElement getDoubleClickMeButton() {
        return driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
    }

    public WebElement getRightClickMebutton() {
        return driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
    }

    public WebElement getClickMeButton() {
        return driver.findElement(By.xpath("(//button[normalize-space()='Click Me'])[1]"));
    }

    public WebElement getDoubleClickMeMessage() {
        return driver.findElement(By.id("doubleClickMessage"));
    }

    public WebElement getRightClickMeMessage() {
        return driver.findElement(By.id("rightClickMessage"));
    }

    public WebElement getClickMeMessage() {
        return driver.findElement(By.xpath("//p[@id='dynamicClickMessage']"));
    }

    //-------------------------

    public void clickOnDoubleOnDoubleClickButton(){
        //act.doubleClick(driver.findElement(By.xpath("//button[@id='doubleClickBtn']"))).build().perform();
        act.doubleClick(this.getDoubleClickMeButton()).build().perform();
    }

    public void clickOnRightClickButton(){
        act.contextClick(this.getRightClickMebutton()).build().perform();
    }

    public void clickOnClickMeButton(){
        this.getClickMeButton().click();
    }
}
