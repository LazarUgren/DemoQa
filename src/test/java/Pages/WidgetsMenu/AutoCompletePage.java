package Pages.WidgetsMenu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoCompletePage {

    public WebDriver driver;
    public WebDriverWait wdwait;

    public AutoCompletePage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }
}
