package Pages.ElementsMenu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicPropertiesPage {

    public WebDriver driver;
    public WebDriverWait wdwait;

    WebElement naslov;
    //--------------
    WebElement firstHead;
    WebElement willEnable5SecondsButton;
    WebElement colorChangeButton;
    WebElement visibleAfter5Seconds;

    public DynamicPropertiesPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getNaslov() {
        return driver.findElement(By.xpath("//div[@class='main-header']"));
    }

    public WebElement getWillEnable5SecondsButton() {
        return driver.findElement(By.xpath("//button[@id='enableAfter']"));
    }

    public WebElement getColorChangeButton() {
        return driver.findElement(By.xpath("//button[@id='colorChange']"));
    }

    public WebElement getVisibleAfter5Seconds() {
        return driver.findElement(By.xpath("//button[@id='visibleAfter']"));
    }

    public WebElement getFirstHead() {
        return driver.findElement(By.xpath("//p[@id='IB25y']"));
    }

    //--------------------------------------




}
