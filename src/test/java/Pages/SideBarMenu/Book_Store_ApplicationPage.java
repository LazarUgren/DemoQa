package Pages.SideBarMenu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Book_Store_ApplicationPage {

    public WebDriver driver;
    public WebDriverWait wdwait;

    WebElement Login;
    WebElement BookStore;
    WebElement Profile;
    WebElement BookStoreAPI;

    public Book_Store_ApplicationPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getLogin() {
        return driver.findElement(By.xpath("//*[@id=\"item-0\"]/span"));
    }

    public WebElement getBookStore() {
        return driver.findElement(By.xpath("//*[@id=\"item-2\"]/span"));
    }

    public WebElement getProfile() {
        return driver.findElement(By.xpath("//*[@id=\"item-3\"]/span"));
    }

    public WebElement getBookStoreAPI() {
        return driver.findElement(By.xpath("//*[@id=\"item-4\"]/span"));
    }

    //----------------------

    public void clickLogin(){
        this.getLogin().click();
    }
    public void clickBookStore(){
        this.getBookStore().click();
    }
    public void clickProfile(){
        this.getProfile().click();
    }
    public void clickBookStoreAPI(){
        this.getBookStoreAPI().click();
    }

}
