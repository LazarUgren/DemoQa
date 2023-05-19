package Pages.SideBarMenu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InteractionsPage {

    public WebDriver driver;
    public WebDriverWait wdwait;

    WebElement Sortable;
    WebElement Selectable;
    WebElement Resizable;
    WebElement Droppable;
    WebElement Dragabble;

    public InteractionsPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getSortable() {
        return driver.findElement(By.xpath("//*[@id=\"item-0\"]/span"));
    }

    public WebElement getSelectable() {
        return driver.findElement(By.xpath("//*[@id=\"item-1\"]/span"));
    }

    public WebElement getResizable() {
        return driver.findElement(By.xpath("//*[@id=\"item-2\"]/span"));
    }

    public WebElement getDroppable() {
        return driver.findElement(By.xpath("//*[@id=\"item-3\"]/span"));
    }

    public WebElement getDragabble() {
        return driver.findElement(By.xpath("//*[@id=\"item-4\"]/span"));
    }

    //---------------------

    public void clickSortable(){
        this.getSortable().click();
    }
    public void clickSelectable(){
        this.getSelectable().click();
    }
    public void clickResizable(){
        this.getResizable().click();
    }
    public void clickDroppable(){
        this.getDroppable().click();
    }
    public void clickDragabble(){
        this.getDragabble().click();
    }

}
