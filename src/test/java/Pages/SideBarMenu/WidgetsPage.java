package Pages.SideBarMenu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WidgetsPage {

    public WebDriver driver;
    public WebDriverWait wdwait;

    WebElement Accordian;
    WebElement AutoComplete;
    WebElement DatePicker;
    WebElement Slider;
    WebElement ProgressBar;
    WebElement Tabs;
    WebElement ToolTips;
    WebElement Menu;
    WebElement SelectMenu;


    public WidgetsPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getAccordian() {
        return driver.findElement(By.xpath("//*[@id=\"item-0\"]"));
    }

    public WebElement getAutoComplete() {
        return driver.findElement(By.xpath("//*[@id=\"item-1\"]/span"));
    }

    public WebElement getDatePicker() {
        return driver.findElement(By.xpath("//*[@id=\"item-2\"]/span"));
    }

    public WebElement getSlider() {
        return driver.findElement(By.xpath("//*[@id=\"item-3\"]/span"));
    }

    public WebElement getProgressBar() {
        return driver.findElement(By.xpath("//*[@id=\"item-4\"]/span"));
    }

    public WebElement getTabs() {
        return driver.findElement(By.xpath("//*[@id=\"item-5\"]/span"));
    }

    public WebElement getToolTips() {
        return driver.findElement(By.xpath("//*[@id=\"item-6\"]/span"));
    }

    public WebElement getMenu() {
        return driver.findElement(By.xpath("//*[@id=\"item-7\"]/span"));
    }

    public WebElement getSelectMenu() {
        return driver.findElement(By.xpath("//*[@id=\"item-8\"]/span"));
    }
    //---------------------

    public void clickAccordian(){
        this.getAccordian().click();
    }
    public void clickAutoComplete(){
        this.getAutoComplete().click();
    }
    public void clickDatePicker(){
        this.getDatePicker().click();
    }
    public void clickSlider(){
        this.getSlider().click();
    }
    public void clickProgressBar(){
        this.getProgressBar().click();
    }
    public void clickTabs(){
        this.getTabs().click();
    }
    public void clickToolTips(){
        this.getToolTips().click();
    }
    public void clickMenu(){
        this.getMenu().click();
    }
    public void clickSelectMenu(){
        this.getSelectMenu().click();
    }

}
