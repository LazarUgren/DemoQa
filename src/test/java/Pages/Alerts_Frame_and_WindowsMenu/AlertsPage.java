package Pages.Alerts_Frame_and_WindowsMenu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsPage {

    public WebDriver driver;
    public WebDriverWait wdwait;

    public AlertsPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }
}
