package Pages.BookStoreApplicationMenu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookStorePage {

    public WebDriver driver;
    public WebDriverWait wdwait;

    public BookStorePage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }
}
