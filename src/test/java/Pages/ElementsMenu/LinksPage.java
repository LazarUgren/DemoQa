package Pages.ElementsMenu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinksPage {

    public WebDriver driver;
    public WebDriverWait wdwait;

    WebElement Picture;
    //----------
    WebElement Naslov;
    //---
    WebElement FirstHead;
    //---
    WebElement HomeLink;
    WebElement HomeXLink;
    //---
    WebElement SecondHead;
    //---
    WebElement CreatedLink;
    WebElement NoContentLink;
    WebElement MovedLink;
    WebElement BadRequestLink;
    WebElement UnauthorizedLink;
    WebElement ForbiddenLink;
    WebElement NotFoundLink;
    //-----------------------
    WebElement linkResponse;

    public LinksPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getPicture() {
        return Picture;
    }

    public WebElement getNaslov() {
        return driver.findElement(By.xpath("//div[@class='main-header']"));
    }

    public WebElement getFirstHead() {
        return driver.findElement(By.xpath("//strong[normalize-space()='Following links will open new tab']"));
    }

    public WebElement getHomeLink() {
        return driver.findElement(By.xpath("//a[@id='simpleLink']"));
    }

    public WebElement getHomeXLink() {
        return driver.findElement(By.xpath("//a[@id='dynamicLink']"));
    }

    public WebElement getSecondHead() {
        return driver.findElement(By.xpath("//strong[normalize-space()='Following links will send an api call']"));
    }

    public WebElement getCreatedLink() {
        return driver.findElement(By.xpath("//a[@id='created']"));
    }

    public WebElement getNoContentLink() {
        return driver.findElement(By.xpath("//a[@id='no-content']"));
    }

    public WebElement getMovedLink() {
        return driver.findElement(By.xpath("//a[@id='moved']"));
    }

    public WebElement getBadRequestLink() {
        return driver.findElement(By.xpath("//a[@id='bad-request']"));
    }

    public WebElement getUnauthorizedLink() {
        return driver.findElement(By.xpath("//a[@id='unauthorized']"));
    }

    public WebElement getForbiddenLink() {
        return driver.findElement(By.xpath("//a[@id='forbidden']"));
    }

    public WebElement getNotFoundLink() {
        return driver.findElement(By.xpath("//a[@id='invalid-url']"));
    }

    public WebElement getLinkResponse() {
        //return driver.findElement(By.xpath("//p[@id='linkResponse']"));
        //return driver.findElement(By.id("linkResponse"));
        return driver.findElement(By.cssSelector("#linkResponse"));
        //return driver.findElement(By.xpath("(//p[@id='linkResponse'])[1]"));
        //return driver.findElement(By.partialLinkText("Link has responded with staus"));
    }

    //------------------------

    public void clickOnHome(){
        this.getHomeLink().click();
    }

    public void clickOnHomeXLink(){
        this.getHomeXLink().click();
    }

    public void clickOnCreated(){
        this.getCreatedLink().click();
    }

    public void clickOnNoContent(){
        this.getNoContentLink().click();
    }

    public void clickOnMoved(){
        this.getMovedLink().click();
    }

    public void clickOnBadRequest(){
        this.getBadRequestLink().click();
    }

    public void clickOnUnauthorized(){
        this.getUnauthorizedLink().click();
    }

    public void clickOnForbidden(){
        this.getForbiddenLink().click();
    }

    public void clickOnNotFound(){
        this.getNotFoundLink().click();
    }









}
