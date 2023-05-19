package Pages.BookStoreApplicationMenu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookStoreAPIPage {

    public WebDriver driver;
    public WebDriverWait wdwait;

    public BookStoreAPIPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }
}
