package Pages.SideBarMenu;

import BasePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Alerts_Frame_and_WindowsPage {

    public WebDriver driver;
    public WebDriverWait wdwait;




    WebElement BrowserWindows;
    WebElement Alerts;
    WebElement Frames;
    WebElement NestedFrames;
    WebElement ModalDialogs;


    public Alerts_Frame_and_WindowsPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getBrowserWindows() {
        return driver.findElement(By.xpath("//*[@id=\"item-0\"]"));
    }

    public WebElement getAlerts() {
        //return driver.findElement(By.xpath("//*[@id=\"item-1\"]/span"));
        return driver.findElement(By.xpath("//*[@id=\"item-1\"]"));
    }

    public WebElement getFrames() {
        return driver.findElement(By.xpath("//*[@id=\"item-2\"]/span"));
    }

    public WebElement getNestedFrames() {
        return driver.findElement(By.xpath("//*[@id=\"item-3\"]/span"));
    }

    public WebElement getModalDialogs() {
        return driver.findElement(By.xpath("//*[@id=\"item-4\"]/span"));
    }

    //-------------------------------------



    //--------------------------

    public void clickBrowserWindows(){
        this.getBrowserWindows().click();
    }
    public void clickAlerts(){
        this.getAlerts().click();
    }
    public void clickFrames(){
        this.getFrames().click();
    }
    public void clickNestedFrames(){
        this.getNestedFrames().click();
    }
    public void clickModalDialogs(){
        this.getModalDialogs().click();
    }


}
