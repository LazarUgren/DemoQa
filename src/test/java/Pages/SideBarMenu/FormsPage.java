package Pages.SideBarMenu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormsPage {

    public WebDriver driver;
    public WebDriverWait wdwait;

    public WebElement PracticeForm;


    public FormsPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getPracticeForm() {
        //return driver.findElement(By.xpath("//*[@id=\"item-0\"]/span"));
        //return driver.findElement(By.id("item-0"));
        //return driver.findElement(By.xpath("//*[@id=\"item-0\"]"));
        //return driver.findElement(By.xpath("//*[@id=\"item-0\"]"));
        //return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[2]/div/ul"));
        return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[2]/div"));
    }


    //--------------------------

    public void clickPracticeForm(){
        this.getPracticeForm().click();
    }

}
