package Pages.ElementsMenu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBoxPage {

    public WebDriver driver;
    public WebDriverWait wdwait;

    WebElement Picture;
    //----------
    WebElement Naslov;
    //-----------
    WebElement HeadFullName;
    WebElement HeadEmail;
    WebElement HeadCurrentAddress;
    WebElement HeadPermanentAddress;
    //---------------------------
    WebElement textBoxFullName;
    WebElement textBoxEmail;
    WebElement textBoxCurrentAddress;
    WebElement textBoxPermanentAddress;
    //---------
    WebElement subminButton;
    //-----
    // Odgovor
    WebElement outputBox;

    public TextBoxPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getPicture() {
        return Picture;
    }

    public WebElement getNaslov() {
        return driver.findElement(By.cssSelector(".pattern-backgound.playgound-header"));
    }

    public WebElement getHeadFullName() {
        return driver.findElement(By.id("userName-label"));
    }

    public WebElement getHeadEmail() {
        return driver.findElement(By.id("userEmail-label"));
    }

    public WebElement getHeadCurrentAddress() {
        return driver.findElement(By.id("currentAddress-label"));
    }

    public WebElement getHeadPermanentAddress() {
        return driver.findElement(By.id("permanentAddress-label"));
    }

    public WebElement getTextBoxFullName() {
        return driver.findElement(By.id("userName"));
    }

    public WebElement getTextBoxEmail() {
        //return driver.findElement(By.id("userEmail"));
        return driver.findElement(By.xpath("//input[@id='userEmail' or @class='mr-sm-2 field-error form-control']"));
    }

    public WebElement getTextBoxCurrentAddress() {
        return driver.findElement(By.id("currentAddress"));
    }

    public WebElement getTextBoxPermanentAddress() {
        return driver.findElement(By.id("permanentAddress"));
    }

    public WebElement getSubminButton() {
        return driver.findElement(By.id("submit"));
    }

    public WebElement getOutputBox() {
        return driver.findElement(By.id("output"));
    }

    //-----------------------

    public void insertFullName(String name){
        this.getTextBoxFullName().clear();
        this.getTextBoxFullName().sendKeys(name);
    }

    public void insertEmail(String Email){
        this.getTextBoxEmail().clear();
        this.getTextBoxEmail().sendKeys(Email);
    }

    public void insertCurrentAddress(String Address){
        this.getTextBoxCurrentAddress().clear();
        this.getTextBoxCurrentAddress().sendKeys(Address);
    }

    public void insertPermanentAddress(String Address){
        this.getTextBoxPermanentAddress().clear();
        this.getTextBoxPermanentAddress().sendKeys(Address);
    }

    public void clickSubmit(){
        this.getSubminButton().click();
    }
}
