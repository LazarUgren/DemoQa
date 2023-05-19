package Test.SideBarButtonCheck;

import BasePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestSideBarButtonCheck extends BasePage {

    @BeforeMethod
    public void setUpPage(){
        driver.manage().window().maximize();
        driver.navigate().to(HomeURL);
    }

    @Test (priority = 10)
    public void clickOnElementsButtonMenu(){
        sidebarPage.scrollTo(sidebarPage.getElements());
        sidebarPage.clickElements();
        wdwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Text Box']")));
        Assert.assertTrue(elementsPage.getTextBox().isEnabled());
    }

    @Test(priority = 20)
    public void clickOnFormsButtonMenu(){
        sidebarPage.scrollTo(sidebarPage.getForms());
        sidebarPage.clickForms();
        wdwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Practice Form']")));
        Assert.assertTrue(formsPage.getPracticeForm().isEnabled());
    }

    @Test(priority = 30)
    public void clickOnAlertsFrameAndWindowsButtonMenu(){
        sidebarPage.scrollTo(sidebarPage.getAlerts_Frame_and_Windows());
        sidebarPage.clickAlerts_Frame_and_Windows();
        wdwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Browser Windows']")));
        Assert.assertTrue(alerts_frame_and_windowsPage.getBrowserWindows().isEnabled());
    }

    @Test(priority = 40)
    public void clickOnWidgetsButtonMenu(){
        sidebarPage.scrollTo(sidebarPage.getWidgets());
        sidebarPage.clickWidgets();
        wdwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Accordian']")));
        Assert.assertTrue(widgetsPage.getAccordian().isEnabled());
    }

    @Test(priority = 50)
    public void clickOnInteractionsButtonMenu(){
        sidebarPage.scrollTo(sidebarPage.getInteractions());
        sidebarPage.clickInteractions();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[normalize-space()='Sortable']")));
        Assert.assertTrue(interactionsPage.getSortable().isEnabled());
    }

    @Test(priority = 60)
    public void clickOnBookStoreApplication(){
        sidebarPage.scrollTo(sidebarPage.getBook_Store_Application());
        sidebarPage.clickBook_Store_Application();
        wdwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Login']")));
        Assert.assertTrue(book_store_applicationPage.getLogin().isEnabled());
    }

}
