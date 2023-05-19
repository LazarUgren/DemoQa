package Test.SideBarButtonCheck.ElementsMenu;

import BasePage.BasePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class BrokenLinksImagesTest extends BasePage {

    @BeforeMethod
    public void setUpPage(){
        driver.manage().window().maximize();
        driver.navigate().to(HomeURL);
    }

    /*
    @Test(priority = 10)
    public void locatorChech() throws InterruptedException {
        goToBrokenLinksImages();
        Thread.sleep(500);
        sidebarPage.scrollTo(brokenLinks_imagesPage.getBrokenImage());
        Thread.sleep(2000);
        brokenLinks_imagesPage.clickOnValidLinkButton();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(1000);
        brokenLinks_imagesPage.clickOnBrokenLinkButton();
        Thread.sleep(2000);
    }

     */

    @Test(priority = 20)
    public void validImageTest(){
        goToBrokenLinksImages();
        sidebarPage.scrollTo(brokenLinks_imagesPage.getNaslov());
        Assert.assertTrue(brokenLinks_imagesPage.getValidImage().isDisplayed());
    }

    @Test(priority = 30)
    public void brokenImageTest() throws IOException {
        goToBrokenLinksImages();
        sidebarPage.scrollTo(brokenLinks_imagesPage.getValidImage());
        //Assert.assertFalse(brokenLinks_imagesPage.getBrokenImage().isDisplayed());
        //__________Ovo je nacin da dodjem do status code http i pogledam da li je 200 ili nije

        String imageSrc = brokenLinks_imagesPage.getBrokenImage().getAttribute("src");
        System.out.println(imageSrc);

        URL url = new URL(imageSrc);
        URLConnection urlConnection = url.openConnection();
        HttpURLConnection httpURLConnection = (HttpURLConnection) urlConnection;
        httpURLConnection.setConnectTimeout(5000);
        httpURLConnection.connect();

        if (httpURLConnection.getResponseCode() == 200){
            System.out.println(imageSrc + " >> " + httpURLConnection.getResponseCode() + " >> " + httpURLConnection.getResponseMessage());
        }
        else {
            System.err.println(imageSrc + " >> " + httpURLConnection.getResponseCode() + " >> " + httpURLConnection.getResponseMessage());
        }

        httpURLConnection.disconnect();

        //brokenLinks_imagesPage.getBrokenImage().getSize();
        System.out.println(brokenLinks_imagesPage.getBrokenImage().getSize());


    }

    @Test(priority = 40)
    public void testValidLinkButton(){
        goToBrokenLinksImages();
        sidebarPage.scrollTo(brokenLinks_imagesPage.getValidImage());
        brokenLinks_imagesPage.clickOnValidLinkButton();
        wdwait.until(ExpectedConditions.urlToBe("https://demoqa.com/"));
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://demoqa.com/";
        Assert.assertEquals(actualURL, expectedURL, "actual/expected URL are not the same");
    }

    @Test(priority = 50)
    public void testBrokenLinkButton(){
        goToBrokenLinksImages();
        sidebarPage.scrollTo(brokenLinks_imagesPage.getValidImage());
        brokenLinks_imagesPage.clickOnBrokenLinkButton();
        wdwait.until(ExpectedConditions.urlToBe("http://the-internet.herokuapp.com/status_codes/500"));
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "http://the-internet.herokuapp.com/status_codes/500";
        Assert.assertEquals(actualURL, expectedURL, "actual/expected URL are not the same");

    }

    //--------------------------------------------------------------

    public void goToBrokenLinksImages(){
        sidebarPage.clickElements();
        wdwait.until(ExpectedConditions.elementToBeClickable(elementsPage.getBrokenLinks_Images()));
        sidebarPage.scrollTo(elementsPage.getBrokenLinks_Images());
        elementsPage.clickBrokenLinks_Images();
    }

}
