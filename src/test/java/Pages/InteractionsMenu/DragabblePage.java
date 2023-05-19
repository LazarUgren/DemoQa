package Pages.InteractionsMenu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragabblePage {

    public WebDriver driver;
    public WebDriverWait wdwait;

    public DragabblePage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }
}
