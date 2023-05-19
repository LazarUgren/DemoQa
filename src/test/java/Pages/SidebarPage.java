package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SidebarPage {

    public WebDriver driver;
    public WebDriverWait wdwait;
    public Select selectX;

    WebElement Elements;
    WebElement Forms;
    WebElement Alerts_Frame_and_Windows;
    WebElement Widgets;
    WebElement Interactions;
    WebElement Book_Store_Application;

    public SidebarPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getElements() {
        return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[1]/span"));
    }

    public WebElement getForms() {
        return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[2]/span"));
    }

    public WebElement getAlerts_Frame_and_Windows() {
        return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[3]/span/div"));
    }

    public WebElement getWidgets() {
        return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[4]/span"));
    }

    public WebElement getInteractions() {
        return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[5]/span"));
    }

    public WebElement getBook_Store_Application() {
        return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[6]/span"));
    }

    //--------------------------------------------------

    public void clickElements(){
        this.getElements().click();
    }
    public void clickForms(){
        this.getForms().click();
    }
    public void clickAlerts_Frame_and_Windows(){
        this.getAlerts_Frame_and_Windows().click();
    }
    public void clickWidgets(){
        this.getWidgets().click();
    }
    public void clickInteractions(){
        this.getInteractions().click();
    }
    public void clickBook_Store_Application(){
        this.getBook_Store_Application().click();
    }

    //------------

    public void selectBrowserWindows(){
        selectX = new Select(getAlerts_Frame_and_Windows());
        selectX.selectByValue("BrowserWindows");
    }

    //-------------
    public void scrollTo(WebElement element){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }
}
