package Pages.ElementsMenu;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.*;

public class WebTablesPage {

    public WebDriver driver;
    public WebDriverWait wdwait;

    WebElement Naslov;
    //----------------------
    WebElement addButton;
    WebElement searchTextBox;
    WebElement searchButton;
    //-----------------------
    // Add button window
    WebElement firstnameTextBox;
    WebElement lastnameTextBox;
    WebElement emailTextBox;
    WebElement ageTextBox;
    WebElement salaryTextBox;
    WebElement DepartmentTextBox;
    WebElement submitButton;
    WebElement clouseButton;
    //------------------------
    // Table
    WebElement previousButton;
    WebElement nextButton;
    WebElement page;
    WebElement rowsButtonDropMenu;
    List<WebElement> editButton;
    List<WebElement> deleteButton;
    //------------------------
    //Web table
    List<WebElement> tableRows;// = driver.findElements(By.xpath("//div[normalize-space()='Cierra']/parent::div/parent::div/parent::div/child::*"));
    List<WebElement> tableHederCells;// = driver.findElements(By.xpath("//div[@class='rt-thead -header']/child::*/child::*"));






    public WebTablesPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getNaslov() {
        return driver.findElement(By.xpath("//div[@class='main-header']"));
    }

    public WebElement getAddButton() {
        return driver.findElement(By.xpath("//button[@id='addNewRecordButton']"));
    }

    public WebElement getSearchTextBox() {
        return driver.findElement(By.xpath("//input[@id='searchBox']"));
    }

    public WebElement getSearchButton() {
        return driver.findElement(By.xpath("//span[@id='basic-addon2']//span"));
    }

    public WebElement getFirstnameTextBox() {
        return driver.findElement(By.xpath("//input[@id='firstName']"));
    }

    public WebElement getLastnameTextBox() {
        return driver.findElement(By.xpath("//input[@id='lastName']"));
    }

    public WebElement getEmailTextBox() {
        return driver.findElement(By.xpath("//input[@id='userEmail']"));
    }

    public WebElement getAgeTextBox() {
        return driver.findElement(By.xpath("//input[@id='age']"));
    }

    public WebElement getSalaryTextBox() {
        return driver.findElement(By.xpath("//input[@id='salary']"));
    }

    public WebElement getDepartmentTextBox() {
        return driver.findElement(By.xpath("//input[@id='department']"));
    }

    public WebElement getSubmitButton() {
        return driver.findElement(By.xpath("//button[@id='submit']"));
    }

    public WebElement getClouseButton() {
        return driver.findElement(By.xpath("//span[@aria-hidden='true']"));
    }

    public WebElement getPreviousButton() {
        return driver.findElement(By.xpath("//button[normalize-space()='Previous']"));
    }

    public WebElement getNextButton() {
        return driver.findElement(By.xpath("//button[normalize-space()='Next']"));
    }

    public WebElement getPage() {
        return driver.findElement(By.xpath("//input[@value='1']"));
    }

    public WebElement getRowsButtonDropMenu() {
        return driver.findElement(By.xpath("//select[@aria-label='rows per page']"));
    }

    public List<WebElement> getTableRows() {
        return driver.findElements(By.xpath("//div[normalize-space()='Cierra']/parent::div/parent::div/parent::div/child::*"));
    }

    public List<WebElement> getTableHederCells() {
        return driver.findElements(By.xpath("//div[@class='rt-thead -header']/child::*/child::*"));
    }

    public List<WebElement> getEditButton() {
        return driver.findElements(By.xpath("//span[contains(@id,'edit-record-')]"));
    }

    public List<WebElement> getDeleteButton() {
        return driver.findElements(By.xpath("//span[contains(@id,'delete-record-')]"));
    }

    //---------------------------

    public void clickOnAddButton(){
        this.getAddButton().click();
    }
    public void addTextIntoSearchTextBox(String input){
        this.getSearchTextBox().sendKeys(input);
    }
    public void clickOnSearchButton(){
        this.getSearchButton().click();
    }
    public void clickOnPreviousButton(){
        this.getPreviousButton().click();
    }
    public void clickOnNextButton(){
        this.getNextButton().click();
    }
    public void addPageNumberIntoPage(int x){
        this.getPage().clear();
        this.getPage().sendKeys(String.valueOf(x));
        this.getPage().sendKeys(Keys.ENTER);
    }
    public void selectRowsFromRowsButtonDropMenu(String selected){
        this.getRowsButtonDropMenu().click();
        Select select = new Select(this.getRowsButtonDropMenu());
        wdwait.until(ExpectedConditions.elementToBeClickable(this.getRowsButtonDropMenu()));
        select.selectByVisibleText(selected);
        this.getRowsButtonDropMenu().click();
    }
    public void enterFirstNameIntoTextBox(String name){
        this.getFirstnameTextBox().clear();
        this.getFirstnameTextBox().sendKeys(name);
    }
    public void enterLastNameIntoTextBox(String lastName){
        this.getLastnameTextBox().clear();
        this.getLastnameTextBox().sendKeys(lastName);
    }
    public void enterEmailIntoTextBox(String email){
        this.getEmailTextBox().clear();
        this.getEmailTextBox().sendKeys(email);
    }
    public void enterAgeIntoTextBox(int age){
        this.getAgeTextBox().clear();
        this.getAgeTextBox().sendKeys(String.valueOf(age));
    }
    public void enterSalaryIntoTextBox(int salary){
        this.getSalaryTextBox().clear();
        this.getSalaryTextBox().sendKeys(String.valueOf(salary));
    }
    public void enterDepartmentIntoTextBox(String department){
        this.getDepartmentTextBox().clear();
        this.getDepartmentTextBox().sendKeys(department);
    }
    public void clickOnSubmitButton() {
        this.getSubmitButton().click();
    }
    public void clickOnClouseButton(){
        this.getClouseButton().click();
    }
    public List<WebElement> pickUpInfoFromTheCell(int a){

        List<WebElement> columnsList = null;

        for (int i = 1; i <= this.getTableHederCells().size(); i++){

            if (a == i) {
                columnsList = driver.findElements(By.xpath("//div[@class='rt-td'][" + i + "]"));
                break;
            }

        }

        return columnsList;
    }
    public int numberOfRowsFromTable(){
        int numberOfRows = this.getTableRows().size();
        return numberOfRows;
    }


    public void clickOnEditButton(int a){
        this.getEditButton().get(a).click();
    }

    public void clickOnDeleteButton(int b){
        this.getDeleteButton().get(b).click();
    }


    /*
    Beleske:
    <table> oznaka da pocinje tabela
    <tbody> oznaka koja oznacava telo tabele
    <tr> oznaka oznacava jedan red u koloni redova
    <th> table heder, podatak koji se nalazi u celiji u jednom redu, naslov tabele
    <td> table data, podatak u jednoj celiji u tabeli.
     */

}
