package Pages.SideBarMenu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementsPage {

    public WebDriver driver;
    public WebDriverWait wdwait;

    WebElement TextBox;
    WebElement CheckBox;
    WebElement RadioButton;
    WebElement WebTables;
    WebElement Buttons;
    WebElement Links;
    WebElement BrokenLinks_Images;
    WebElement UploadAndDownload;
    WebElement DynamicProperties;

    public ElementsPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getTextBox() {
        return driver.findElement(By.xpath("//*[@id=\"item-0\"]"));
    }

    public WebElement getCheckBox() {
        return driver.findElement(By.xpath("//*[@id=\"item-1\"]/span"));
    }
//'//input[@data-test="username"]'
    public WebElement getRadioButton() {
        return driver.findElement(By.xpath("//*[@id=\"item-2\"]/span"));
    }

    public WebElement getWebTables() {
        return driver.findElement(By.xpath("//*[@id=\"item-3\"]/span"));
    }

    public WebElement getButtons() {
        return driver.findElement(By.xpath("//*[@id=\"item-4\"]/span"));
    }

    public WebElement getLinks() {
        return driver.findElement(By.xpath("//*[@id=\"item-5\"]/span"));
    }

    public WebElement getBrokenLinks_Images() {
        return driver.findElement(By.xpath("//*[@id=\"item-6\"]/span"));
    }

    public WebElement getUploadAndDownload() {
        return driver.findElement(By.xpath("//*[@id=\"item-7\"]/span"));
    }

    public WebElement getDynamicProperties() {
        return driver.findElement(By.xpath("//*[@id=\"item-8\"]/span"));
    }

    //---------------------------------------------


    public void clickTextBox(){
        this.getTextBox().click();
    }
    public void clickCheckBox(){
        this.getCheckBox().click();
    }
    public void clickRadioButton(){
        this.getRadioButton().click();
    }
    public void clickWebTables(){
        this.getWebTables().click();
    }
    public void clickButtons(){
        this.getButtons().click();
    }
    public void clickLinks(){
        this.getLinks().click();
    }
    public void clickBrokenLinks_Images(){
        this.getBrokenLinks_Images().click();
    }
    public void clickUploadAndDownload(){
        this.getUploadAndDownload().click();
    }
    public void clickDynamicProperties(){
        this.getDynamicProperties().click();
    }

}
