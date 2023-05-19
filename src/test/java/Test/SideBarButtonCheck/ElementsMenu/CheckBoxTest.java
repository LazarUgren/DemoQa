package Test.SideBarButtonCheck.ElementsMenu;

import BasePage.BasePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class CheckBoxTest extends BasePage {

    @BeforeMethod
    public void setUpPage(){
        driver.manage().window().maximize();
        driver.navigate().to(HomeURL);
    }

/*
    @Test(priority = 10)
    public void locatorCheck(){
        goToCheckBox();
        checkBoxPage.clickExpandAllButton();
        checkBoxPage.clickCollapseAllButton();
        checkBoxPage.clickOnHome();
        checkBoxPage.clickOnHome();
        checkBoxPage.clickExpandAllButton();
        //otvorio sam sve i proveravam jedno po jedno
        checkBoxPage.clickOnHome();
        checkBoxPage.clickOnHome();
        sidebarPage.scrollTo(checkBoxPage.getCommands());
        checkBoxPage.clickOnCommands();
        checkBoxPage.clickOnNotes();
        checkBoxPage.clickOnDesktop();
        // sad proveravam dokumenta
        sidebarPage.scrollTo(checkBoxPage.getGeneral());
        checkBoxPage.clickOnGeneral();
        checkBoxPage.clickOnClassified();
        checkBoxPage.clickOnPrivate();
        checkBoxPage.clickOnPublic();
        checkBoxPage.clickOnOffice();
        sidebarPage.scrollTo(checkBoxPage.getVeu());
        checkBoxPage.clickOnVeu();
        checkBoxPage.clickOnAngular();
        checkBoxPage.clickOnReact();
        checkBoxPage.clickOnWorkSpase();
        sidebarPage.scrollTo(checkBoxPage.getExcelFileDoc());
        // Provera download
        checkBoxPage.clickOnExcelFileDoc();
        checkBoxPage.clickOnWordFileDoc();
        checkBoxPage.clickOnDownloads();
        sidebarPage.scrollTo(checkBoxPage.getCollapseAllButton());
        checkBoxPage.clickCollapseAllButton();
    }

    @Test (priority = 20)
    public void locatorCheck2(){
        goToCheckBox();
        checkBoxPage.clickOnHomeExpandButton();
        checkBoxPage.clickOnDownloadsExpandButton();
        sidebarPage.scrollTo(checkBoxPage.getDocuments());
        checkBoxPage.clickOnDocumentsExpandButton();
        checkBoxPage.clickOnOfficeExpandButton();
        checkBoxPage.clickOnWorkSpaceExpandButton();
    }

    @Test(priority = 30)
    public void locatorCheck3(){
        goToCheckBox();
        checkBoxPage.clickExpandAllButton();
        sidebarPage.scrollTo(checkBoxPage.getWorkSpase());
        checkBoxPage.clickOnDownloadsCollapseButton();
        checkBoxPage.clickOnOfficeCollapseButton();
        checkBoxPage.clickOnWorkSpaceCollapseButton();
        checkBoxPage.clickOnDocumentsCollapseButton();
        sidebarPage.scrollTo(checkBoxPage.getHome());
        checkBoxPage.clickOnDesktopCollapseButton();
        checkBoxPage.clickOnHomeCollapseButton();
    }

 */

    @Test(priority = 40)
    public void expandAll(){
        goToCheckBox();
        wdwait.until(ExpectedConditions.elementToBeClickable(checkBoxPage.getExpandAllButton()));
        checkBoxPage.clickExpandAllButton();
        Assert.assertTrue(checkBoxPage.getWordFileDoc().isDisplayed());
        Assert.assertTrue(checkBoxPage.getGeneral().isDisplayed());
        Assert.assertTrue(checkBoxPage.getVeu().isDisplayed());
        Assert.assertTrue(checkBoxPage.getNotes().isDisplayed());
    }

    @Test(priority = 50)
    public void selectAll(){
        goToCheckBox();
        checkBoxPage.clickExpandAllButton();
        sidebarPage.scrollTo(checkBoxPage.getHome());
        boolean isDisplayed = checkBoxPage.getHome().isDisplayed();
        if (isDisplayed == true){
            checkBoxPage.clickOnHome();
        }
        Assert.assertTrue(checkBoxPage.getSelectHome().isEnabled());
        Assert.assertTrue(checkBoxPage.getSelectHome().isSelected());

        Assert.assertTrue(checkBoxPage.getSelectNotes().isEnabled());
        Assert.assertTrue(checkBoxPage.getSelectNotes().isSelected());

        Assert.assertTrue(checkBoxPage.getSelectReact().isEnabled());
        Assert.assertTrue(checkBoxPage.getSelectReact().isSelected());

        Assert.assertTrue(checkBoxPage.getSelectPublic().isEnabled());
        Assert.assertTrue(checkBoxPage.getSelectPublic().isSelected());

        Assert.assertTrue(checkBoxPage.getSelectWordFileDoc().isEnabled());
        Assert.assertTrue(checkBoxPage.getSelectWordFileDoc().isSelected());
    }

    @Test(priority = 60)
    public void expandHome(){
        goToCheckBox();
        wdwait.until(ExpectedConditions.elementToBeClickable(checkBoxPage.getHomeExpandButton()));
        checkBoxPage.clickOnHomeExpandButton();

        Assert.assertTrue(checkBoxPage.getDesktop().isDisplayed());
        Assert.assertTrue(checkBoxPage.getDocuments().isDisplayed());
    }

    @Test(priority = 70)
    public void expandDownloads(){
        goToCheckBox();
        wdwait.until(ExpectedConditions.elementToBeClickable(checkBoxPage.getHomeExpandButton()));
        checkBoxPage.clickOnHomeExpandButton();
        sidebarPage.scrollTo(checkBoxPage.getHome());
        checkBoxPage.clickOnDownloadsExpandButton();

        Assert.assertTrue(checkBoxPage.getWordFileDoc().isDisplayed());
        Assert.assertTrue(checkBoxPage.getExcelFileDoc().isDisplayed());
    }

    @Test(priority = 80)
    public void expandDocuments(){
        goToCheckBox();
        wdwait.until(ExpectedConditions.elementToBeClickable(checkBoxPage.getHomeExpandButton()));
        checkBoxPage.clickOnHomeExpandButton();
        sidebarPage.scrollTo(checkBoxPage.getHome());
        checkBoxPage.clickOnDocumentsExpandButton();

        Assert.assertTrue(checkBoxPage.getWorkSpase().isDisplayed());
        Assert.assertTrue(checkBoxPage.getOffice().isDisplayed());
    }

    @Test(priority = 90)
    public void expandDesktop(){
        goToCheckBox();
        checkBoxPage.clickOnHomeExpandButton();
        wdwait.until(ExpectedConditions.elementToBeClickable(checkBoxPage.getDesktop()));
        sidebarPage.scrollTo(checkBoxPage.getDesktop());
        checkBoxPage.clickOnDesktopExpandButton();

        Assert.assertTrue(checkBoxPage.getNotes().isDisplayed());
        Assert.assertTrue(checkBoxPage.getCommands().isDisplayed());
    }

    @Test(priority = 100)
    public void expandOffice(){
        goToCheckBox();
        wdwait.until(ExpectedConditions.elementToBeClickable(checkBoxPage.getHomeExpandButton()));
        checkBoxPage.clickOnHomeExpandButton();
        wdwait.until(ExpectedConditions.visibilityOf(checkBoxPage.getDocuments()));
        checkBoxPage.clickOnDocumentsExpandButton();
        wdwait.until(ExpectedConditions.visibilityOf(checkBoxPage.getOffice()));
        sidebarPage.scrollTo(checkBoxPage.getOffice());
        wdwait.until(ExpectedConditions.elementToBeClickable(checkBoxPage.getOfficeExpandButton()));
        checkBoxPage.clickOnOfficeExpandButton();

        Assert.assertTrue(checkBoxPage.getPublic().isDisplayed());
        Assert.assertTrue(checkBoxPage.getPrivate().isDisplayed());
    }

    @Test(priority = 110)
    public void expandWorkSpace(){
        goToCheckBox();
        wdwait.until(ExpectedConditions.elementToBeClickable(checkBoxPage.getHomeExpandButton()));
        checkBoxPage.clickOnHomeExpandButton();
        wdwait.until(ExpectedConditions.visibilityOf(checkBoxPage.getDocuments()));
        checkBoxPage.clickOnDocumentsExpandButton();
        wdwait.until(ExpectedConditions.visibilityOf(checkBoxPage.getWorkSpaceExpandButton()));
        checkBoxPage.clickOnWorkSpaceExpandButton();
        sidebarPage.scrollTo(checkBoxPage.getWorkSpase());

        Assert.assertTrue(checkBoxPage.getReact().isDisplayed());
        Assert.assertTrue(checkBoxPage.getAngular().isDisplayed());
        Assert.assertTrue(checkBoxPage.getVeu().isDisplayed());
    }

    @Test (priority = 120)
    public void selectHome(){
        goToCheckBox();
        wdwait.until(ExpectedConditions.elementToBeClickable(checkBoxPage.getExpandAllButton()));
        checkBoxPage.clickExpandAllButton();
        sidebarPage.scrollTo(checkBoxPage.getHome());
        checkBoxPage.clickOnHome();
        String actual = checkBoxPage.getResultText().getText();
        String expected = excelReader.getStringData("CheckBoxData", 1, 0);
        Assert.assertTrue(actual.contains(expected));
        Assert.assertTrue(checkBoxPage.getSelectNotes().isSelected());
    }

    @Test(priority = 130)
    public void selectDownloads(){
        goToCheckBox();
        wdwait.until(ExpectedConditions.elementToBeClickable(checkBoxPage.getExpandAllButton()));
        checkBoxPage.clickExpandAllButton();
        sidebarPage.scrollTo(checkBoxPage.getGeneral());
        checkBoxPage.clickOnDownloads();
        String actual = checkBoxPage.getResultText().getText();
        String expected = excelReader.getStringData("CheckBoxData", 1, 1);
        Assert.assertEquals(actual, expected);
        Assert.assertTrue(checkBoxPage.getSelectExcelFileDoc().isSelected());
        Assert.assertTrue(checkBoxPage.getSelectExcelFileDoc().isSelected());
    }

    @Test(priority = 140)
    public void selectWordFileDoc(){
        goToCheckBox();
        wdwait.until(ExpectedConditions.elementToBeClickable(checkBoxPage.getHomeExpandButton()));
        checkBoxPage.clickOnHomeExpandButton();
        sidebarPage.scrollTo(checkBoxPage.getHome());
        wdwait.until(ExpectedConditions.visibilityOf(checkBoxPage.getDownloads()));
        checkBoxPage.clickOnDownloadsExpandButton();
        checkBoxPage.clickOnWordFileDoc();
        String actual = checkBoxPage.getResultText().getText();
        String expected = excelReader.getStringData("CheckBoxData", 1,2);
        Assert.assertEquals(actual,expected);
        Assert.assertTrue(checkBoxPage.getSelectWordFileDoc().isSelected());
        Assert.assertTrue(checkBoxPage.getSelectDownloads().isEnabled());
        Assert.assertTrue(checkBoxPage.getHome().isDisplayed());
    }

    @Test(priority = 150)
    public void selectExcelFileDoc(){
        goToCheckBox();
        wdwait.until(ExpectedConditions.elementToBeClickable(checkBoxPage.getHomeExpandButton()));
        checkBoxPage.clickOnHomeExpandButton();
        sidebarPage.scrollTo(checkBoxPage.getHome());
        checkBoxPage.clickOnDownloadsExpandButton();
        checkBoxPage.clickOnExcelFileDoc();
        String actual = checkBoxPage.getResultText().getText();
        String expected = excelReader.getStringData("CheckBoxData",1,3);
        Assert.assertEquals(actual,expected);
        Assert.assertTrue(checkBoxPage.getSelectExcelFileDoc().isSelected());
        Assert.assertTrue(checkBoxPage.getDownloads().isEnabled());
        Assert.assertTrue(checkBoxPage.getHome().isDisplayed());
    }

    @Test(priority = 160)
    public void selectDocuments(){
        goToCheckBox();
        wdwait.until(ExpectedConditions.elementToBeClickable(checkBoxPage.getHomeExpandButton()));
        checkBoxPage.clickOnHomeExpandButton();
        sidebarPage.scrollTo(checkBoxPage.getHome());
        checkBoxPage.clickOnDocumentsExpandButton();
        checkBoxPage.clickOnDocuments();
        textCompareAssert(1,4);
        Assert.assertTrue(checkBoxPage.getSelectWorkSpace().isSelected());
        Assert.assertTrue(checkBoxPage.getSelectOffice().isSelected());
    }

    @Test(priority = 170)
    public void selectOffice(){
        goToHome();
        checkBoxPage.clickOnDocumentsExpandButton();
        checkBoxPage.clickOnOfficeExpandButton();
        checkBoxPage.clickOnOffice();
        textCompareAssert(1,5);
        Assert.assertTrue(checkBoxPage.getSelectPublic().isSelected());
        Assert.assertTrue(checkBoxPage.getSelectPrivate().isSelected());
        Assert.assertTrue(checkBoxPage.getSelectGeneral().isSelected());
        Assert.assertTrue(checkBoxPage.getSelectClassified().isSelected());
        Assert.assertTrue(checkBoxPage.getSelectOffice().isSelected());
    }

    @Test(priority = 180)
    public void selectGeneral(){
        goToHome();
        checkBoxPage.clickOnDocumentsExpandButton();
        checkBoxPage.clickOnOfficeExpandButton();
        checkBoxPage.clickOnGeneral();
        textCompareAssert(1,6);
        Assert.assertTrue(checkBoxPage.getSelectGeneral().isSelected());
        Assert.assertTrue(checkBoxPage.getOffice().isEnabled());
    }

    @Test(priority = 190)
    public void selectClassified(){
        goToHome();
        checkBoxPage.clickOnDocumentsExpandButton();
        checkBoxPage.clickOnOfficeExpandButton();
        checkBoxPage.clickOnClassified();
        textCompareAssert(1,7);
        Assert.assertTrue(checkBoxPage.getSelectClassified().isSelected());
        Assert.assertFalse(checkBoxPage.getSelectPublic().isSelected());
        //Assert.assertFalse(checkBoxPage.getSelectVeu().isDisplayed());
        Assert.assertFalse(checkBoxPage.getSelectWorkSpace().isSelected());
    }

    @Test(priority = 200)
    public void selectPrivate(){
        goToHome();
        checkBoxPage.clickOnDocumentsExpandButton();
        checkBoxPage.clickOnOfficeExpandButton();
        checkBoxPage.clickOnPrivate();
        textCompareAssert(1,8);
        Assert.assertTrue(checkBoxPage.getSelectPrivate().isSelected());
        Assert.assertFalse(checkBoxPage.getSelectPublic().isSelected());
    }

    @Test(priority = 210)
    public void selectPublic(){
        goToHome();
        checkBoxPage.clickOnDocumentsExpandButton();
        checkBoxPage.clickOnOfficeExpandButton();
        checkBoxPage.clickOnPublic();
        textCompareAssert(1,9);
        Assert.assertTrue(checkBoxPage.getSelectPublic().isSelected());
        Assert.assertFalse(checkBoxPage.getSelectGeneral().isSelected());
    }

    @Test(priority = 220)
    public void selectWorkSpace(){
        goToHome();
        checkBoxPage.clickOnDocumentsExpandButton();
        checkBoxPage.clickOnWorkSpaceExpandButton();
        checkBoxPage.clickOnWorkSpase();
        textCompareAssert(1,10);
        Assert.assertTrue(checkBoxPage.getSelectVeu().isSelected());
        Assert.assertTrue(checkBoxPage.getSelectAngular().isSelected());
        Assert.assertTrue(checkBoxPage.getSelectReact().isSelected());
        Assert.assertFalse(checkBoxPage.getSelectDownloads().isSelected());
    }

    @Test(priority = 230)
    public void selectVeu(){
        goToHome();
        checkBoxPage.clickOnDocumentsExpandButton();
        checkBoxPage.clickOnWorkSpaceExpandButton();
        checkBoxPage.clickOnVeu();
        textCompareAssert(1,11);
        Assert.assertTrue(checkBoxPage.getSelectVeu().isSelected());
        Assert.assertFalse(checkBoxPage.getSelectAngular().isSelected());
        Assert.assertFalse(checkBoxPage.getSelectReact().isSelected());
    }

    @Test(priority = 240)
    public void selectAngular(){
        goToHome();
        checkBoxPage.clickOnDocumentsExpandButton();
        checkBoxPage.clickOnWorkSpaceExpandButton();
        checkBoxPage.clickOnAngular();
        textCompareAssert(1,12);
        Assert.assertFalse(checkBoxPage.getSelectVeu().isSelected());
        Assert.assertTrue(checkBoxPage.getSelectAngular().isSelected());
        Assert.assertFalse(checkBoxPage.getSelectReact().isSelected());
    }

    @Test(priority = 250)
    public void selectReact(){
        goToHome();
        checkBoxPage.clickOnDocumentsExpandButton();
        checkBoxPage.clickOnWorkSpaceExpandButton();
        checkBoxPage.clickOnReact();
        textCompareAssert(1,13);
        Assert.assertFalse(checkBoxPage.getSelectVeu().isSelected());
        Assert.assertFalse(checkBoxPage.getSelectAngular().isSelected());
        Assert.assertTrue(checkBoxPage.getSelectReact().isSelected());
    }

    @Test(priority = 260)
    public void selectDesktop(){
        goToHome();
        checkBoxPage.clickOnDesktopExpandButton();
        checkBoxPage.clickOnDesktop();
        textCompareAssert(1,14);
        Assert.assertTrue(checkBoxPage.getSelectNotes().isSelected());
        Assert.assertTrue(checkBoxPage.getSelectCommands().isSelected());
    }

    @Test(priority = 270)
    public void selectCommands(){
        goToHome();
        checkBoxPage.clickOnDesktopExpandButton();
        checkBoxPage.clickOnCommands();
        textCompareAssert(1,15);
        Assert.assertTrue(checkBoxPage.getSelectCommands().isSelected());
        Assert.assertFalse(checkBoxPage.getSelectNotes().isSelected());
    }

    @Test(priority = 280)
    public void selectNotes(){
        goToHome();
        checkBoxPage.clickOnDesktopExpandButton();
        checkBoxPage.clickOnNotes();
        textCompareAssert(1,16);
        Assert.assertTrue(checkBoxPage.getSelectNotes().isSelected());
        Assert.assertFalse(checkBoxPage.getSelectCommands().isSelected());
    }



    //--------------------------------

    public void goToCheckBox(){
        //wdwait.until(ExpectedConditions.elementToBeClickable(sidebarPage.getElements()));
        sidebarPage.clickElements();
        wdwait.until(ExpectedConditions.visibilityOf(elementsPage.getCheckBox()));
        elementsPage.clickCheckBox();
        wdwait.until(ExpectedConditions.visibilityOf(checkBoxPage.getHome()));
    }

    public void textCompareAssert(int a, int b){
        String actual = checkBoxPage.getResultText().getText();
        String expected = excelReader.getStringData("CheckBoxData",a,b);
        Assert.assertEquals(actual,expected);
    }

    public void goToHome(){
        goToCheckBox();
        checkBoxPage.clickOnHomeExpandButton();
        sidebarPage.scrollTo(checkBoxPage.getHome());
    }


}
