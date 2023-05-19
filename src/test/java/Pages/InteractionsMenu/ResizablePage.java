package Pages.InteractionsMenu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ResizablePage {

    public WebDriver driver;
    public WebDriverWait wdwait;

    public ResizablePage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }
}
