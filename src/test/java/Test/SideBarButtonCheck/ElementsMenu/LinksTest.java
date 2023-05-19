package Test.SideBarButtonCheck.ElementsMenu;

import BasePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class LinksTest extends BasePage {

    @BeforeMethod
    public void setUpPage(){
        driver.manage().window().maximize();
        driver.navigate().to(HomeURL);
    }

    /*
    @Test(priority = 10)
    public void locatorCheck() throws InterruptedException {
        goToLinks();
        Thread.sleep(500);
        sidebarPage.scrollTo(linksPage.getSecondHead());
        linksPage.clickOnCreated();
        Thread.sleep(2000);
        linksPage.clickOnNoContent();
        Thread.sleep(2000);
        linksPage.clickOnMoved();
        Thread.sleep(2000);
        linksPage.clickOnBadRequest();
        Thread.sleep(2000);
        linksPage.clickOnUnauthorized();
        Thread.sleep(2000);
        linksPage.clickOnForbidden();
        Thread.sleep(2000);
        linksPage.clickOnNotFound();
        Thread.sleep(2000);
        sidebarPage.scrollTo(linksPage.getFirstHead());
        Thread.sleep(500);
        linksPage.clickOnHome();
        Thread.sleep(2000);
        linksPage.clickOnHomeXLink();
        Thread.sleep(2000);
    }

     */

    @Test(priority = 20)
    public void clcikCreated(){
        goToLinks();
        sidebarPage.scrollTo(linksPage.getSecondHead());
        linksPage.clickOnCreated();
        wdwait.until(ExpectedConditions.textToBe(By.id("linkResponse"), "Link has responded with staus 201 and status text Created"));
        responseMessageAssert(1,0);
    }

    @Test(priority = 30)
    public void clickNoContent() {
        goToLinks();
        sidebarPage.scrollTo(linksPage.getFirstHead());
        linksPage.clickOnNoContent();
        wdwait.until(ExpectedConditions.textToBe(By.id("linkResponse"), "Link has responded with staus 204 and status text No Content"));
        responseMessageAssert(2,0);
    }

    @Test(priority = 40)
    public void clcikMoved(){
        goToLinks();
        sidebarPage.scrollTo(linksPage.getFirstHead());
        linksPage.clickOnMoved();
        wdwait.until(ExpectedConditions.textToBe(By.id("linkResponse"), "Link has responded with staus 301 and status text Moved Permanently"));
        responseMessageAssert(3,0);
    }

    @Test(priority = 50)
    public void clickBadRequest(){
        goToLinks();
        sidebarPage.scrollTo(linksPage.getFirstHead());
        linksPage.clickOnBadRequest();
        wdwait.until(ExpectedConditions.textToBe(By.id("linkResponse"), "Link has responded with staus 400 and status text Bad Request"));
        responseMessageAssert(4,0);
    }

    @Test(priority = 60)
    public void clickUnauthorized(){
        goToLinks();
        sidebarPage.scrollTo(linksPage.getFirstHead());
        linksPage.clickOnUnauthorized();
        wdwait.until(ExpectedConditions.textToBe(By.id("linkResponse"), "Link has responded with staus 401 and status text Unauthorized"));
        responseMessageAssert(5,0);
    }

    @Test(priority = 70)
    public void clickForbidden(){
        goToLinks();
        sidebarPage.scrollTo(linksPage.getFirstHead());
        linksPage.clickOnForbidden();
        wdwait.until(ExpectedConditions.textToBe(By.id("linkResponse"), "Link has responded with staus 403 and status text Forbidden"));
        responseMessageAssert(6,0);
    }

    @Test(priority = 80)
    public void clickNotFound(){
        goToLinks();
        sidebarPage.scrollTo(linksPage.getFirstHead());
        linksPage.clickOnNotFound();
        wdwait.until(ExpectedConditions.textToBe(By.id("linkResponse"), "Link has responded with staus 404 and status text Not Found"));
        responseMessageAssert(7,0);
    }

    @Test (priority = 90)
    public void clickHome(){
        goToLinks();
        sidebarPage.scrollTo(linksPage.getFirstHead());
        linksPage.clickOnHome();
        AssertAndBackToPreviousTab(1,1);
    }

    @Test(priority = 100)
    public void clickHomeX(){
        goToLinks();
        sidebarPage.scrollTo(linksPage.getFirstHead());
        linksPage.clickOnHomeXLink();
        AssertAndBackToPreviousTab(2,1);
    }

//--------------------------
    public void goToLinks(){
        sidebarPage.clickElements();
        wdwait.until(ExpectedConditions.elementToBeClickable(elementsPage.getRadioButton()));
        sidebarPage.scrollTo(elementsPage.getRadioButton());
        wdwait.until(ExpectedConditions.elementToBeClickable(elementsPage.getLinks()));
        elementsPage.clickLinks();
    }

    public void responseMessageAssert(int a, int b){
        String actual = linksPage.getLinkResponse().getText();
        String expected = excelReader.getStringData("LinksData",a,b);
        Assert.assertEquals(actual,expected,"the messages are not the same");
    }

    public void AssertAndBackToPreviousTab(int a, int b){
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        String actual = driver.getCurrentUrl();
        String expected = excelReader.getStringData("LinksData",a,b);
        Assert.assertEquals(actual,expected,"actual/expected url are different");
        driver.close();
        driver.switchTo().window(tabs.get(0));
        }


    }

