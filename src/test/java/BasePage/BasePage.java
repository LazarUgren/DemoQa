package BasePage;

import Pages.Alerts_Frame_and_WindowsMenu.*;
import Pages.BookStoreApplicationMenu.BookStoreAPIPage;
import Pages.BookStoreApplicationMenu.BookStorePage;
import Pages.BookStoreApplicationMenu.LoginPage;
import Pages.BookStoreApplicationMenu.ProfilePage;
import Pages.ElementsMenu.*;
import Pages.FormsMenu.PracticeFormPage;
import Pages.InteractionsMenu.*;
import Pages.SideBarMenu.*;
import Pages.SidebarPage;
import Pages.WidgetsMenu.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;


public class BasePage {

    public WebDriver driver;
    public WebDriverWait wdwait;
    public Actions act;
    public ExcelReader excelReader;
    public String HomeURL;
    public SidebarPage sidebarPage;
    public ElementsPage elementsPage;
    public FormsPage formsPage;
    public Alerts_Frame_and_WindowsPage alerts_frame_and_windowsPage;
    public WidgetsPage widgetsPage;
    public InteractionsPage interactionsPage;
    public Book_Store_ApplicationPage book_store_applicationPage;
    //------------------
    // ElementsMenu
    public TextBoxPage textBoxPage;
    public CheckBoxPage checkBoxPage;
    public RadioButtonPage radioButtonPage;
    public WebTablesPage webTablesPage;
    public ButtonsPage buttonsPage;
    public LinksPage linksPage;
    public BrokenLinks_ImagesPage brokenLinks_imagesPage;
    public UploadAndDownloadPage uploadAndDownloadPage;
    public DynamicPropertiesPage dynamicPropertiesPage;
    //-------------
    // Forms Menu
    public PracticeFormPage practiceFormPage;
    //-----------------
    // Alerts, Frame & Windows Menu
    public BrowserWindowsPage browserWindowsPage;
    public AlertsPage alertsPage;
    public FramesPage framesPage;
    public NestedFramesPage nestedFramesPage;
    public ModalDialogsPage modalDialogsPage;
    //-----------------
    // Widgets Menu
    public AccordianPage accordianPage;
    public AutoCompletePage autoCompletePage;
    public DatePickerPage datePickerPage;
    public SliderPage sliderPage;
    public ProgressBarPage progressBarPage;
    public TabsPage tabsPage;
    public ToolTipsPage toolTipsPage;
    public MenuPage menuPage;
    public SelectMenuPage selectMenuPage;
    //-----------------
    // Interactions Menu
    public SortablePage sortablePage;
    public SelectablePage selectablePage;
    public ResizablePage resizablePage;
    public DroppablePage droppablePage;
    public DragabblePage dragabblePage;
    //--------------
    // Book Store Application Menu
    public LoginPage loginPage;
    public BookStorePage bookStorePage;
    public ProfilePage profilePage;
    public BookStoreAPIPage bookStoreAPIPage;


    @BeforeClass
    public void setUp() throws IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        //Ovo je za downlodovanje u mom direktorijumu koji ja odredjujem
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("download.default_directory", "C:\\Users\\pc\\IdeaProjects\\DemoQa\\up-down load file\\Download\\");
        options.setExperimentalOption("prefs", prefs);
        //000000000000000000000

        driver = new ChromeDriver(options);
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        act = new Actions(driver);
        excelReader = new ExcelReader("C:\\Users\\pc\\IdeaProjects\\DemoQa\\DemoQa.xlsx");
        HomeURL = excelReader.getStringData("HomeURL",1,0);
        sidebarPage = new SidebarPage(driver, wdwait);
        elementsPage = new ElementsPage(driver,wdwait);
        formsPage = new FormsPage(driver, wdwait);
        alerts_frame_and_windowsPage = new Alerts_Frame_and_WindowsPage(driver, wdwait);
        widgetsPage = new WidgetsPage(driver,wdwait);
        interactionsPage = new InteractionsPage(driver, wdwait);
        book_store_applicationPage = new Book_Store_ApplicationPage(driver,wdwait);
        //ElementsMenu
        textBoxPage = new TextBoxPage(driver,wdwait);
        checkBoxPage = new CheckBoxPage(driver, wdwait);
        radioButtonPage = new RadioButtonPage(driver, wdwait);
        webTablesPage = new WebTablesPage(driver, wdwait);
        buttonsPage = new ButtonsPage(driver, wdwait, act);
        linksPage = new LinksPage(driver, wdwait);
        brokenLinks_imagesPage = new BrokenLinks_ImagesPage(driver,wdwait);
        uploadAndDownloadPage = new UploadAndDownloadPage(driver, wdwait);
        dynamicPropertiesPage = new DynamicPropertiesPage(driver, wdwait);
        //FormsMenu
        practiceFormPage = new PracticeFormPage(driver, wdwait);
        //Alerts,Frame&WindowsMenu
        browserWindowsPage = new BrowserWindowsPage(driver, wdwait);
        alertsPage = new AlertsPage(driver, wdwait);
        framesPage = new FramesPage(driver, wdwait);
        nestedFramesPage = new NestedFramesPage(driver, wdwait);
        modalDialogsPage = new ModalDialogsPage(driver, wdwait);
        //WidgetsMenu
        accordianPage = new AccordianPage(driver, wdwait);
        autoCompletePage = new AutoCompletePage(driver,wdwait);
        datePickerPage = new DatePickerPage(driver,wdwait);
        sliderPage = new SliderPage(driver,wdwait);
        progressBarPage = new ProgressBarPage(driver,wdwait);
        tabsPage = new TabsPage(driver,wdwait);
        toolTipsPage = new ToolTipsPage(driver, wdwait);
        menuPage = new MenuPage(driver,wdwait);
        selectMenuPage = new SelectMenuPage(driver,wdwait);
        //InteractionsMenu
        sortablePage = new SortablePage(driver,wdwait);
        selectablePage = new SelectablePage(driver,wdwait);
        resizablePage = new ResizablePage(driver,wdwait);
        droppablePage = new DroppablePage(driver,wdwait);
        dragabblePage = new DragabblePage(driver,wdwait);
        //BookStoreApplicationMenu
        loginPage = new LoginPage(driver,wdwait);
        bookStorePage = new BookStorePage(driver,wdwait);
        profilePage = new ProfilePage(driver,wdwait);
        bookStoreAPIPage = new BookStoreAPIPage(driver,wdwait);

    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.manage().deleteAllCookies();
        driver.close();
        driver.quit();
    }


}
