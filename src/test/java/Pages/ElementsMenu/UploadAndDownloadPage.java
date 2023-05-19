package Pages.ElementsMenu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UploadAndDownloadPage {

    public WebDriver driver;
    public WebDriverWait wdwait;

    WebElement Picture;
    //----------
    WebElement Naslov;
    //---
    WebElement DownloadButton;
    WebElement SelectFileButton;
    WebElement ResponseMessage;

    public UploadAndDownloadPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getPicture() {
        return Picture;
    }

    public WebElement getNaslov() {
        return Naslov;
    }

    public WebElement getDownloadButton() {
        return driver.findElement(By.xpath("//a[@id='downloadButton']"));
    }

    public WebElement getSelectFileButton() {
        return driver.findElement(By.xpath("//input[@id='uploadFile']"));
    }

    public WebElement getResponseMessage() {
        return driver.findElement(By.xpath("//p[@id='uploadedFilePath']"));
    }

    //----------------------------

    public void clickOnDownloadButton(){
        this.getDownloadButton().click();
    }

    public void clickOnSelectFileButton(){
        this.getSelectFileButton().sendKeys("C:\\Users\\pc\\IdeaProjects\\DemoQa\\up-down load file\\");
    }
}
