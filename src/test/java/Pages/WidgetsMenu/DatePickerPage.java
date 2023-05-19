package Pages.WidgetsMenu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DatePickerPage {

    public WebDriver driver;
    public WebDriverWait wdwait;

    public DatePickerPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }
}
