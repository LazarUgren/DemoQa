package Pages.InteractionsMenu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectablePage {

    public WebDriver driver;
    public WebDriverWait wdwait;

    public SelectablePage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }
}
