package Test.SideBarButtonCheck.ElementsMenu;

import BasePage.BasePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebTablesTest extends BasePage {

    @BeforeMethod
    public void setUpPage(){
        driver.manage().window().maximize();
        driver.navigate().to(HomeURL);
    }
/*
    @Test(priority = 1)
    public void locatorCheck() throws InterruptedException {
        goToWebTables();
        webTablesPage.clickOnAddButton();
        webTablesPage.enterFirstNameIntoTextBox("Petra");
        webTablesPage.enterLastNameIntoTextBox("Petrovic");
        webTablesPage.enterEmailIntoTextBox("PetraPetrovic@gmail.com");
        webTablesPage.enterAgeIntoTextBox(30);
        webTablesPage.enterSalaryIntoTextBox(120000);
        webTablesPage.enterDepartmentIntoTextBox("psychiatry");
        webTablesPage.clickOnSubmitButton();
        Thread.sleep(500);
        webTablesPage.clickOnAddButton();
        Thread.sleep(500);
        webTablesPage.clickOnClouseButton();
        Thread.sleep(500);
        webTablesPage.addTextIntoSearchTextBox("Petra");
        Thread.sleep(500);
        webTablesPage.clickOnSearchButton();
        Thread.sleep(500);
    }

    @Test(priority = 5)
    public void locatorCheck2() throws InterruptedException {
        goToWebTables();
        Thread.sleep(1000);
        sidebarPage.scrollTo(webTablesPage.getAddButton());
        Thread.sleep(500);
        //System.out.println(webTablesPage.deusExMaxina(1).get(0).getText());//ova linija koda radi.
        String name = webTablesPage.pickUpInfoFromTheCell(1).get(0).getText();
        System.out.println(name);




        Thread.sleep(2000);
    }

 */

    @Test(priority = 10)
    public void doesRegistrationFormPopOutWhenYouClickOnAddButton(){
        goToWebTables();
        wdwait.until(ExpectedConditions.elementToBeClickable(webTablesPage.getAddButton()));
        webTablesPage.clickOnAddButton();
        //wdwait.until(ExpectedConditions.elementToBeClickable(webTablesPage.getSubmitButton()));
        wdwait.until(ExpectedConditions.visibilityOf(webTablesPage.getSubmitButton()));
        Assert.assertTrue(webTablesPage.getSubmitButton().isDisplayed());
        Assert.assertTrue(webTablesPage.getFirstnameTextBox().isDisplayed());
    }

    @Test(priority = 20)
    public void submitNewRegistrationFormOnTable(){
        goToWebTables();
        wdwait.until(ExpectedConditions.elementToBeClickable(webTablesPage.getAddButton()));
        webTablesPage.clickOnAddButton();
        wdwait.until(ExpectedConditions.visibilityOf(webTablesPage.getFirstnameTextBox()));
        webTablesPage.enterFirstNameIntoTextBox(excelReader.getStringData("WebTablesData",4,0));
        webTablesPage.enterLastNameIntoTextBox(excelReader.getStringData("WebTablesData",4,1));
        webTablesPage.enterEmailIntoTextBox(excelReader.getStringData("WebTablesData",4,3));
        webTablesPage.enterAgeIntoTextBox(excelReader.getIntegerData("WebTablesData",4,2));
        webTablesPage.enterSalaryIntoTextBox(excelReader.getIntegerData("WebTablesData",4,4));
        webTablesPage.enterDepartmentIntoTextBox(excelReader.getStringData("WebTablesData",4,5));
        wdwait.until(ExpectedConditions.elementToBeClickable(webTablesPage.getSubmitButton()));
        webTablesPage.clickOnSubmitButton();
        wdwait.until(ExpectedConditions.visibilityOf(webTablesPage.getAddButton()));
        String actualName = webTablesPage.pickUpInfoFromTheCell(1).get(3).getText();
        String expectedName = excelReader.getStringData("WebTablesData",4,0);
        Assert.assertEquals(actualName,expectedName,"testName: Submit New Registration Form On Table");
    }

    @Test(priority = 30)
    public void doesSearchFeatureWorks(){
        goToWebTables();
        wdwait.until(ExpectedConditions.visibilityOf(webTablesPage.getSearchTextBox()));
        webTablesPage.addTextIntoSearchTextBox(excelReader.getStringData("WebTablesData",3,5));
        cellDataAssert(6,0,3,5);
    }

    @Test(priority = 40)
    public void doesRowsDropDownMenuWorks(){
        goToWebTables();
        wdwait.until(ExpectedConditions.elementToBeClickable(webTablesPage.getRowsButtonDropMenu()));
        sidebarPage.scrollTo(elementsPage.getWebTables());
        wdwait.until(ExpectedConditions.elementToBeClickable(webTablesPage.getRowsButtonDropMenu()));
        webTablesPage.selectRowsFromRowsButtonDropMenu("5 rows");
        sidebarPage.scrollTo(webTablesPage.getAddButton());
        int actualNumber = webTablesPage.numberOfRowsFromTable();
        int expectedNumber = 5;
        Assert.assertEquals(actualNumber,expectedNumber,"TestName: doesRowsDropDownMenuWorks");
    }

    @Test(priority = 50)
    public void doesNextButtonWorks(){
        goToWebTables();
        submitNewFormToTable(4,0,4,1,4,3,4,2,4,4,4,5);
        submitNewFormToTable(5,0,5,1,5,3,5,2,5,4,5,5);
        submitNewFormToTable(6,0,6,1,6,3,6,2,6,4,6,5);
        sidebarPage.scrollTo(webTablesPage.getPage());
        wdwait.until(ExpectedConditions.elementToBeClickable(webTablesPage.getPage()));
        webTablesPage.selectRowsFromRowsButtonDropMenu("5 rows");
        wdwait.until(ExpectedConditions.elementToBeClickable(webTablesPage.getRowsButtonDropMenu()));
        sidebarPage.scrollTo(webTablesPage.getAddButton());
        wdwait.until(ExpectedConditions.elementToBeClickable(webTablesPage.getAddButton()));
        webTablesPage.clickOnNextButton();
        Assert.assertFalse(webTablesPage.getNextButton().isEnabled());
        Assert.assertTrue(webTablesPage.getPreviousButton().isEnabled());
    }

    @Test(priority = 60)
    public void doesPreviousButtonWorks(){
        goToWebTables();
        submitNewFormToTable(4,0,4,1,4,3,4,2,4,4,4,5);
        submitNewFormToTable(5,0,5,1,5,3,5,2,5,4,5,5);
        submitNewFormToTable(6,0,6,1,6,3,6,2,6,4,6,5);
        sidebarPage.scrollTo(webTablesPage.getPage());
        wdwait.until(ExpectedConditions.elementToBeClickable(webTablesPage.getRowsButtonDropMenu()));
        webTablesPage.selectRowsFromRowsButtonDropMenu("5 rows");
        wdwait.until(ExpectedConditions.elementToBeClickable(webTablesPage.getRowsButtonDropMenu()));
        sidebarPage.scrollTo(webTablesPage.getAddButton());
        wdwait.until(ExpectedConditions.elementToBeClickable(webTablesPage.getAddButton()));
        webTablesPage.clickOnNextButton();
        wdwait.until(ExpectedConditions.visibilityOf(webTablesPage.getPreviousButton()));
        webTablesPage.clickOnPreviousButton();
        Assert.assertTrue(webTablesPage.getNextButton().isEnabled());
        Assert.assertFalse(webTablesPage.getPreviousButton().isEnabled());
    }

    @Test(priority = 70)
    public void doesPageChangeWorksWhenYouInputPageNumber(){
        goToWebTables();
        submitNewFormToTable(4,0,4,1,4,3,4,2,4,4,4,5);
        submitNewFormToTable(5,0,5,1,5,3,5,2,5,4,5,5);
        submitNewFormToTable(6,0,6,1,6,3,6,2,6,4,6,5);
        sidebarPage.scrollTo(webTablesPage.getPage());
        wdwait.until(ExpectedConditions.elementToBeClickable(webTablesPage.getRowsButtonDropMenu()));
        webTablesPage.selectRowsFromRowsButtonDropMenu("5 rows");
        wdwait.until(ExpectedConditions.elementToBeClickable(webTablesPage.getRowsButtonDropMenu()));
        sidebarPage.scrollTo(webTablesPage.getAddButton());
        wdwait.until(ExpectedConditions.elementToBeClickable(webTablesPage.getAddButton()));
        webTablesPage.addPageNumberIntoPage(2);
        Assert.assertFalse(webTablesPage.getNextButton().isEnabled());
        String actualPageNumber = webTablesPage.getPage().getAttribute("value");
        String expectedPageNumber = "2";
        Assert.assertEquals(actualPageNumber,expectedPageNumber);
    }

    @Test(priority = 80)
    public void doesIsTableChangesAfterUsingEditFunction(){
        goToWebTables();
        wdwait.until(ExpectedConditions.elementToBeClickable(webTablesPage.getAddButton()));
        webTablesPage.clickOnEditButton(0);
        wdwait.until(ExpectedConditions.visibilityOf(webTablesPage.getFirstnameTextBox()));
        webTablesPage.enterFirstNameIntoTextBox("Milijana");
        wdwait.until(ExpectedConditions.elementToBeClickable(webTablesPage.getSubmitButton()));
        webTablesPage.clickOnSubmitButton();
        String actualName = webTablesPage.pickUpInfoFromTheCell(1).get(0).getText();
        String expectedName = "Milijana";
        Assert.assertEquals(actualName,expectedName);
    }

    @Test(priority = 90)
    public void doesIsTableChangesAfterUsingDeleteFunction(){
        goToWebTables();
        //wdwait.until(ExpectedConditions.elementToBeClickable(webTablesPage.getAddButton()));
        //wdwait.until(ExpectedConditions.visibilityOf(webTablesPage.getAddButton()));
        webTablesPage.clickOnDeleteButton(1);
        sidebarPage.scrollTo(webTablesPage.getAddButton());
        wdwait.until(ExpectedConditions.visibilityOf(webTablesPage.getAddButton()));

        for (int i = 0; i < webTablesPage.numberOfRowsFromTable(); i++){

            String actualName = webTablesPage.pickUpInfoFromTheCell(1).get(i).getText();
            String expectedName = "Alden";
            Assert.assertNotEquals(actualName,expectedName);

            Assert.assertFalse(actualName.equals("Alden"));

        }
    }

    //----------
    public void goToWebTables(){
        wdwait.until(ExpectedConditions.visibilityOf(sidebarPage.getElements()));
        sidebarPage.clickElements();
        sidebarPage.scrollTo(elementsPage.getWebTables());
        elementsPage.clickWebTables();
    }

    public void submitNewFormToTable(int firstName1, int firstName2, int lastName1, int lastName2, int email1, int email2, int age1, int age2,
        int salary1, int salary2, int department1, int department2){
        //wdwait.until(ExpectedConditions.elementToBeClickable(webTablesPage.getAddButton()));
        wdwait.until(ExpectedConditions.visibilityOf(webTablesPage.getAddButton()));
        webTablesPage.clickOnAddButton();
        wdwait.until(ExpectedConditions.visibilityOf(webTablesPage.getFirstnameTextBox()));
        webTablesPage.enterFirstNameIntoTextBox(excelReader.getStringData("WebTablesData",firstName1,firstName2));
        webTablesPage.enterLastNameIntoTextBox(excelReader.getStringData("WebTablesData",lastName1,lastName2));
        webTablesPage.enterEmailIntoTextBox(excelReader.getStringData("WebTablesData",email1,email2));
        webTablesPage.enterAgeIntoTextBox(excelReader.getIntegerData("WebTablesData",age1,age2));
        webTablesPage.enterSalaryIntoTextBox(excelReader.getIntegerData("WebTablesData",salary1,salary2));
        webTablesPage.enterDepartmentIntoTextBox(excelReader.getStringData("WebTablesData",department1,department2));
        wdwait.until(ExpectedConditions.elementToBeClickable(webTablesPage.getSubmitButton()));
        webTablesPage.clickOnSubmitButton();
        wdwait.until(ExpectedConditions.elementToBeClickable(webTablesPage.getAddButton()));
    }

    public void cellDataAssert(int hederTitle, int cellColumn, int excellRowN, int excellCellN){
        String actualName = webTablesPage.pickUpInfoFromTheCell(hederTitle).get(cellColumn).getText();
        String expectedName = excelReader.getStringData("WebTablesData",excellRowN,excellCellN);
        Assert.assertEquals(actualName,expectedName,"CellDataAssert, The cells values are not the same");
    }
}
