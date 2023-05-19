package Pages.ElementsMenu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrokenLinks_ImagesPage {

    public WebDriver driver;
    public WebDriverWait wdwait;

    WebElement naslov;
    //-------------------
    WebElement validImage;
    WebElement brokenImage;
    WebElement validLinkButton;
    WebElement brokenLinkButton;
    //--------------------

    public BrokenLinks_ImagesPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getNaslov() {
        return driver.findElement(By.xpath("//div[@class='main-header']"));
    }

    public WebElement getValidImage() {
        return driver.findElement(By.xpath("//div[@class='body-height']//img[1]"));
    }

    public WebElement getBrokenImage() {
        return driver.findElement(By.xpath("//img[2]"));
    }

    public WebElement getValidLinkButton() {
        return driver.findElement(By.xpath("//a[normalize-space()='Click Here for Valid Link']"));
    }

    public WebElement getBrokenLinkButton() {
        return driver.findElement(By.xpath("//a[normalize-space()='Click Here for Broken Link']"));
    }

    //---------------------------


    public void clickOnValidLinkButton(){
        this.getValidLinkButton().click();
    }

    public void clickOnBrokenLinkButton(){
        this.getBrokenLinkButton().click();
    }

}
