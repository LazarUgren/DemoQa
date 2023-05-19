package Pages.Alerts_Frame_and_WindowsMenu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ModalDialogsPage {

    public WebDriver driver;
    public WebDriverWait wdwait;

    public ModalDialogsPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }
}
