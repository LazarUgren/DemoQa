package Test.SideBarButtonCheck.FormsMenu;

import BasePage.BasePage;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticeFormTest extends BasePage {

    @BeforeMethod
    public void setUpPage(){
        driver.manage().window().maximize();
        driver.navigate().to(HomeURL);
    }

    @Test(priority = 10)
    public void locatorCheck() throws InterruptedException {
        goToPraticeForm();
        practiceFormPage.enterFirstName("Lazar");
        practiceFormPage.enterLastName("Ugrenovic");
        practiceFormPage.enterEmail("lazarUgrenovic@gmail.com");
        practiceFormPage.enterMobileNumber("1234567890");
        Thread.sleep(1000);
        String a = practiceFormPage.getFirstNameTextBox().getText();
        String b = practiceFormPage.getLastNameTextBox().getText();
        System.out.println("Ime je " + a);
        System.out.println("Prezime je " + b);
        practiceFormPage.clickGenderButton(1);
        Thread.sleep(1000);
        sidebarPage.scrollTo(practiceFormPage.getMobileTextBox());
        Thread.sleep(1000);
        practiceFormPage.openCalendar();
        Thread.sleep(1000);
        practiceFormPage.clickOnPreviousMonthButtonCal();
        Thread.sleep(1000);
        practiceFormPage.clickOnNextMonthButtonCal();
        Thread.sleep(1000);
        practiceFormPage.monthAndYearCalText();
        Thread.sleep(1000);
        practiceFormPage.clickOnMonthDropDownMenuCal();
        Thread.sleep(1000);
        practiceFormPage.clickOnYearDropDownMenuCal();
        Thread.sleep(1000);
        practiceFormPage.sendKeysToMonthDropDownMenu("June");
        Thread.sleep(1000);
        practiceFormPage.sendKeysToYearDropDownMenu("1994");
        Thread.sleep(1000);
        practiceFormPage.selectMonthFromDropDownMenuCal("August");
        Thread.sleep(1000);
        practiceFormPage.selectYearFromDropDownMenuCal("2012");
        Thread.sleep(1000);

    }
    @Test(priority = 15)
    public void locCh2() throws InterruptedException {
        goToPraticeForm();
        Thread.sleep(1000);
        practiceFormPage.clickGenderButton(0);
        Thread.sleep(1000);
        practiceFormPage.clickGenderButton(1);
        Thread.sleep(1000);
        practiceFormPage.clickGenderButton(2);
        Thread.sleep(1000);
        practiceFormPage.openCalendar();
        Thread.sleep(1000);
        practiceFormPage.clickOnPreviousMonthButtonCal();
        Thread.sleep(1000);
        practiceFormPage.clickOnNextMonthButtonCal();
        Thread.sleep(1000);
        practiceFormPage.clickOnMonthDropDownMenuCal();
        Thread.sleep(1000);
        practiceFormPage.clickOnYearDropDownMenuCal();
        Thread.sleep(1000);
        practiceFormPage.monthAndYearCalText();
        Thread.sleep(1000);
        practiceFormPage.clickOnMonthDropDownMenuCal();
        Thread.sleep(1000);
        practiceFormPage.sendKeysToMonthDropDownMenu("June");
        Thread.sleep(1000);
        practiceFormPage.clickOnYearDropDownMenuCal();
        Thread.sleep(1000);
        practiceFormPage.selectYearFromDropDownMenuCal("1994");
        Thread.sleep(1000);
    }

    @Test(priority = 20)
    public void happyFlowData(){

    }

    @Test(priority = 20)
    public void doesTheColorChangeToGreenWhenYouInsertNameInNameTextBox() throws InterruptedException {
        goToPraticeForm();
        practiceFormPage.enterFirstName(excelReader.getStringData("PracticeFormData",1,0));
        Thread.sleep(2000);
        colorAsertGreen(practiceFormPage.getFirstNameTextBox());
    }

    @Test(priority = 30)
    public void doesTheColorChangeToRedWhenYouDontInsertNameInNameTextBox() throws InterruptedException {
        goToPraticeForm();
        practiceFormPage.enterFirstName("");
        Thread.sleep(2000);
        colorAsertRed(practiceFormPage.getFirstNameTextBox());
    }

    @Test(priority = 40)
    public void doesTheColorChangeToGreenWhenYouInsertLastNameInLastNameTextBox() throws InterruptedException {
        goToPraticeForm();
        practiceFormPage.enterLastName(excelReader.getStringData("PracticeFormData",3,0));
        Thread.sleep(2000);
        colorAsertGreen(practiceFormPage.getLastNameTextBox());
    }

    @Test(priority = 50)
    public void doesTheColorChangeToRedWhenYouDontInsertLastNameInLastNameTextBox() throws InterruptedException {
        goToPraticeForm();
        practiceFormPage.enterLastName("");
        Thread.sleep(2000);
        colorAsertRed(practiceFormPage.getLastNameTextBox());
    }

    @Test(priority = 60)
    public void nameIsPresentWhenYouInsertNameInTheTextBox() throws InterruptedException {
        goToPraticeForm();
        Thread.sleep(1000);
        practiceFormPage.enterFirstName(excelReader.getStringData("PracticeFormData",1,0));
        //wdwait.until(ExpectedConditions.visibilityOf(practiceFormPage.getFirstNameTextBox()));
        Thread.sleep(2000);
        String actualName = practiceFormPage.getFirstNameTextBox().getText();
        String expectedName = excelReader.getStringData("PracticeFormData",1,0);
        //Assert.assertNotNull(practiceFormPage.getFirstNameTextBox());
        Assert.assertEquals(actualName,expectedName);
        System.out.println("uneto ime je " + actualName);
        System.out.println("ocekivano ime je " + expectedName);
        System.out.println("Sta god da je ne zanima me");
    }

    @Test
    public void proba() throws InterruptedException {
        goToPraticeForm();
        Thread.sleep(1000);
        practiceFormPage.enterLastName("popo");
        Thread.sleep(1000);
        String a = practiceFormPage.getLastNameTextBox().getText();
        System.out.println(a);
        WebElement b = driver.findElement(By.xpath("//div[@id='userName-wrapper']"));
        Thread.sleep(1000);
        String c = b.getText();
        System.out.println(c);
        Assert.assertNotNull(c);
    }




        //testiras mejl, ovde napravi listu zabranjenih posebnih znakova i provuci ih kroz listu
        //potom tu listu izvrti u petlji i probaj svaki od tih karaktera

        //I ovde testiras mejl, samo sto su neki karakteri posebni dozvoljeni, napravi sit na ekselu
        // i prelistaj to kroz petlju da vidis da li su ok

        //Ovde probaj klasicne nedostatke u email adresi da li takve varijacije prolaze,
        //dakle, eksel, lista, prelistaj kombo i to je to.

        //testiranje pola, kliknes prvo dugme i pogledas da li je kliknuto i da li je pozelenelo.

        //testiranje pola, drugo dugme isti test

        //testiranje pola, trece dugme isti test

        //testiranje telefona, probaj sa jednim brojem

        //testiranje telefona, probaj sa vise od 10 broja

        //testiranje telefona probaj sa slovima

        //testiranje telefona probaj sa posebnim karakterima ukljucujuci + na pocetku

        //Testiranje kalendara, da li predhodno dugme radi

        //testiranje kalendara, da li sledece dugme radi

        //testiranje kalendara, da li izmedju pred i narednog dugmeta stoji mesec i godina

        //testiranje kalendara, da li se datum izmedju dugmica menja nakon promene podataka

        //testiranje kalendara, da li radi padajuci meni za mesec

        //testiranje kalendara, da li radi padajuci meni za godinu

        //testiranje kalendara, ako izaberem predhodni mesec u tabeli, da li se menjaju podatci
        // na predhodni mesec



        //testiranje kalendara, ako izaberem sledeci mesec u tabeli, da li se menjaju podatci
        // na sledeci mesec

        //testiranje kalendara, biranje dana u tabeli, da  li radi.

        //da li je format dd MMM yyyy...testiranje kalendara

        //testiranje predmeta, pogledaj sta se sve nudi u padajucem meniju i napisi test
        // koji proverava da li su opcije prisutne za izbor.

        //testiranje hobija, pogledaj da li se na dugmice moze kliknuti i da li pozelene

        //testiranje fotografije, dodaj fotku i proveri da li se pojavljuje poruka pored dugmeta

        //testiranje adrese, unesi jednu adresu i dosta je jer je to uvek falicno
        //prihvata sve formate, pa cak i one nebulozne

        //testiranje drzave, pogledaj da li se moze birati

        //kada odaberem drzavu, da li se grad otkljucava

        //pogledaj da li izbor grada funkcionise

        //popuni jednom obrazac, subituj ga i pogledaj da li su unete info
        //prisutne u iskakajucem formatu podnete prijave






    //----------------------

    public void goToPraticeForm(){
        wdwait.until(ExpectedConditions.elementToBeClickable(sidebarPage.getElements()));
        sidebarPage.clickForms();
        wdwait.until(ExpectedConditions.elementToBeClickable(formsPage.getPracticeForm()));
        formsPage.clickPracticeForm();
        wdwait.until(ExpectedConditions.visibilityOf(practiceFormPage.getNaslov()));
    }

    public void colorAsertGreen(WebElement element){
        String actualColor = element.getCssValue("border-color");
        String hexBackColor = Color.fromString(actualColor).asHex();
        String expectedColor = excelReader.getStringData("PracticeFormData",1,1);
        String redAlertColor = excelReader.getStringData("PracticeFormData", 2,1);
        Assert.assertEquals(hexBackColor, expectedColor,"Colors are not the same, green problem");
        Assert.assertNotEquals(hexBackColor,redAlertColor,"Colors are not the same, green problem");
    }

    public void colorAsertRed(WebElement element){
        String actualColor = element.getCssValue("border-color");
        String hexBackColor = Color.fromString(actualColor).asHex();
        String expectedColorRed = excelReader.getStringData("PracticeFormData",2,1);
        String greenAlertColor = excelReader.getStringData("PracticeFormData", 1,1);
        Assert.assertEquals(hexBackColor,expectedColorRed, "Color are not same, red Alert");
        Assert.assertNotEquals(hexBackColor, greenAlertColor,"Color are not same, red Alert");
    }










}
