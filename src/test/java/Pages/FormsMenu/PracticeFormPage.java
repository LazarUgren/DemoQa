package Pages.FormsMenu;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class PracticeFormPage {

    public WebDriver driver;
    public WebDriverWait wdwait;

    WebElement naslov;
    //---
    WebElement firstNameTextBox;
    WebElement lastNameTextBox;
    WebElement emailTextBox;
    List<WebElement> genderButton;
    WebElement mobileTextBox;//10 digits
    //000
    WebElement calendar;
    //Na dole radim lokatore kalendara
    WebElement previousMonthCalButton;
    WebElement nextMonthCalButton;
    WebElement monthAndYearTextCal;
    WebElement monthDropDownMenuCal;
    WebElement yearDropDownMenuCal;
    //000
    //ovde ide subjects/ trebas da odaberes opciju iz dropdown menu koja je nestajajuca
    //000
    //OVDE IDE HOBI
    //000
    WebElement uploadPictureButton;
    WebElement currentAddressTextBox;
    //000
    //OVDE IDE STATE I CITY DROPDOWN MENU
    WebElement subminButton;


    public PracticeFormPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getNaslov() {
        return driver.findElement(By.xpath("//div[@class='main-header']"));
    }

    public WebElement getFirstNameTextBox() {
        //return driver.findElement(By.xpath("//input[@id='firstName']"));
        return driver.findElement(By.cssSelector("#firstName"));
    }

    public WebElement getLastNameTextBox() {
        return driver.findElement(By.xpath("//input[@id='lastName']"));
    }

    public WebElement getEmailTextBox() {
        return driver.findElement(By.xpath("//input[@id='userEmail']"));
    }

    public List<WebElement> getGenderButton() {
        return driver.findElements(By.xpath("//div[@class='custom-control custom-radio custom-control-inline']"));
    }
    public WebElement getMobileTextBox() {
        return driver.findElement(By.xpath("//input[@id='userNumber']"));
    }

    public WebElement getCalendar() {
        return driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
        //return driver.findElement(By.xpath("//div[@class='react-datepicker__input-container']"));
    }

    public WebElement getPreviousMonthCalButton() {
        return driver.findElement(By.xpath("//button[@class='react-datepicker__navigation react-datepicker__navigation--previous']"));
    }

    public WebElement getNextMonthCalButton() {
        return driver.findElement(By.xpath("//button[@class='react-datepicker__navigation react-datepicker__navigation--next']"));
    }

    public WebElement getMonthAndYearTextCal() {
        return driver.findElement(By.xpath("//div[@class='react-datepicker__current-month react-datepicker__current-month--hasYearDropdown react-datepicker__current-month--hasMonthDropdown']"));
    }

    public WebElement getMonthDropDownMenuCal() {
        return driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
    }

    public WebElement getYearDropDownMenuCal() {
        return driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
    }

    public WebElement getCurrentAddressTextBox() {
        return driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
    }



    //---------------

    public void enterFirstName(String name){
        this.getFirstNameTextBox().clear();
        this.getFirstNameTextBox().sendKeys(name);
        //this.getFirstNameTextBox().sendKeys(Keys.ENTER);
    }

    public void enterLastName(String lastName){
        this.getLastNameTextBox().clear();
        this.getLastNameTextBox().sendKeys(lastName);
        //this.getLastNameTextBox().sendKeys(Keys.ENTER);
    }

    public void enterEmail(String email){
        this.getEmailTextBox().clear();
        this.getEmailTextBox().sendKeys(email);
    }

    public void clickGenderButton(int a){
        this.getGenderButton().get(a).click();
    }

    public void enterMobileNumber(String number){
        this.getMobileTextBox().clear();
        this.getMobileTextBox().sendKeys(number);
    }
    public void openCalendar(){
        this.getCalendar().click();
    }
    public void clickOnNextMonthButtonCal(){
        this.getNextMonthCalButton().click();
    }
    public void clickOnPreviousMonthButtonCal(){
        this.getPreviousMonthCalButton().click();
    }

    public void monthAndYearCalText(){
        String a = this.getMonthAndYearTextCal().getText();
        System.out.println(a);
    }

    public void clickOnMonthDropDownMenuCal(){
        this.getMonthDropDownMenuCal().click();
    }
    public void clickOnYearDropDownMenuCal(){
        this.getYearDropDownMenuCal().click();
    }

    public void sendKeysToMonthDropDownMenu(String month){
        this.getMonthDropDownMenuCal().sendKeys(month);
    }

    public void sendKeysToYearDropDownMenu(String year){
        this.getYearDropDownMenuCal().sendKeys(year);
    }

    public void selectMonthFromDropDownMenuCal(String month){
        Select selectMonth = new Select(this.getMonthDropDownMenuCal());
        selectMonth.selectByVisibleText(month);
    }

    public void selectYearFromDropDownMenuCal(String year){
        Select selectYear = new Select(this.getYearDropDownMenuCal());
        selectYear.selectByVisibleText(year);
    }


}
