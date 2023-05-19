package Test.SideBarButtonCheck.ElementsMenu;

import BasePage.BasePage;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class UploadAndDownloadTest extends BasePage {

    @BeforeMethod
    public void setUpPage(){
        driver.manage().window().maximize();
        driver.navigate().to(HomeURL);
    }

    /*
    @Test(priority = 10)
    public void locatorCheck() throws InterruptedException {
        goToUploadAndDownload();
    }

     */

    @Test(priority = 20)
    public void testDownloadOption(){
        goToUploadAndDownload();
        wdwait.until(ExpectedConditions.elementToBeClickable(uploadAndDownloadPage.getDownloadButton()));
        uploadAndDownloadPage.clickOnDownloadButton();
        File listOfFiles[] = new File("C:\\Users\\pc\\IdeaProjects\\DemoQa\\up-down load file\\Download\\").listFiles();
        Assert.assertNotNull(listOfFiles);
    }

    @Test(priority = 30)
    public void testUploadPicSample(){
        goToUploadAndDownload();
        wdwait.until(ExpectedConditions.visibilityOf(elementsPage.getUploadAndDownload()));
        uploadAndDownloadPage.clickOnSelectFileButton();
        String actual = uploadAndDownloadPage.getResponseMessage().getText();
        String expected = "C:\\fakepath\\up-down load file";
        Assert.assertEquals(actual,expected);
    }

    //--------------------------------------------------------

    public void goToUploadAndDownload(){
        sidebarPage.clickElements();
        wdwait.until(ExpectedConditions.elementToBeClickable(elementsPage.getUploadAndDownload()));
        sidebarPage.scrollTo(elementsPage.getDynamicProperties());
        wdwait.until(ExpectedConditions.elementToBeClickable(elementsPage.getUploadAndDownload()));
        elementsPage.clickUploadAndDownload();
    }


}
