package Pages.ElementsMenu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBoxPage {

    public WebDriver driver;
    public WebDriverWait wdwait;

    WebElement Picture;
    //----------
    WebElement Naslov;
    //-----------
    WebElement ExpandAllButton;
    WebElement CollapseAllButton;
    //-----------
    WebElement Home;
    WebElement Desktop;
    WebElement Notes;
    WebElement Commands;
    WebElement Documents;
    WebElement WorkSpase;
    WebElement React;
    WebElement Angular;
    WebElement Veu;
    WebElement Office;
    WebElement Public;
    WebElement Private;
    WebElement Classified;
    WebElement General;
    WebElement Downloads;
    WebElement WordFileDoc;
    WebElement ExcelFileDoc;
    //==============
    WebElement HomeExpandButton;
    WebElement DesktopExpandButton;
    WebElement DocumentsExpandButton;
    WebElement WorkSpaceExpandButton;
    WebElement OfficeExpandButton;
    WebElement DownloadsExpandButton;
    //---------------------
    WebElement HomeCollapseButton;
    WebElement DesktopCollapseButton;
    WebElement DocumentsCollapseButton;
    WebElement WorkSpaceCollapseButton;
    WebElement OfficeCollapseButton;
    WebElement DownloadsCollapseButton;
    //------------
    // result
    WebElement resultText;
    //----------
    // selectCheckBox
    WebElement selectHome;
    WebElement selectDesktop;
    WebElement selectNotes;
    WebElement selectCommands;
    WebElement selectDocuments;
    WebElement selectWorkSpace;
    WebElement selectReact;
    WebElement selectAngular;
    WebElement selectVeu;
    WebElement selectOffice;
    WebElement selectPublic;
    WebElement selectPrivate;
    WebElement selectClassified;
    WebElement selectGeneral;
    WebElement selectDownloads;
    WebElement selectWordFileDoc;
    WebElement selectExcelFileDoc;

    public CheckBoxPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getPicture() {
        return Picture;
    }

    public WebElement getNaslov() {
        return driver.findElement(By.cssSelector(".pattern-backgound.playgound-header"));
    }

    public WebElement getExpandAllButton() {
        return driver.findElement(By.cssSelector(".rct-icon.rct-icon-expand-all"));
    }

    public WebElement getCollapseAllButton() {
        return driver.findElement(By.cssSelector(".rct-icon.rct-icon-collapse-all"));
    }

    public WebElement getHome() {
        //ime foldera za stikliranje
        //return driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/label/span[3]"));
        //kucica za stikliranje
        return driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/label/span[1]"));
    }

    public WebElement getDesktop() {
        return driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/label/span[3]"));
    }

    public WebElement getNotes() {
        return driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/ol/li[1]/span/label/span[3]"));
    }

    public WebElement getCommands() {
        return driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/ol/li[2]/span/label/span[3]"));
    }

    public WebElement getDocuments() {
        return driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/span/label/span[3]"));
    }

    public WebElement getWorkSpase() {
        return driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[1]/span/label/span[3]"));
    }

    public WebElement getReact() {
        return driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[1]/ol/li[1]/span/label/span[3]"));
    }

    public WebElement getAngular() {
        return driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[1]/ol/li[2]/span/label/span[3]"));
    }

    public WebElement getVeu() {
        return driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[1]/ol/li[3]/span/label/span[3]"));
    }

    public WebElement getOffice() {
        return driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[2]/span/label/span[3]"));
    }

    public WebElement getPublic() {
        return driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[2]/ol/li[1]/span/label/span[3]"));
    }

    public WebElement getPrivate() {
        return driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[2]/ol/li[2]/span/label/span[3]"));
    }

    public WebElement getClassified() {
        return driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[2]/ol/li[3]/span/label/span[3]"));
    }

    public WebElement getGeneral() {
        return driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[2]/ol/li[4]/span/label/span[3]"));
    }

    public WebElement getDownloads() {
        return driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[3]/span/label/span[3]"));
    }

    public WebElement getWordFileDoc() {
        return driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[3]/ol/li[1]/span/label/span[3]"));
    }

    public WebElement getExcelFileDoc() {
        return driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[3]/ol/li[2]/span/label/span[3]"));
    }

    public WebElement getHomeExpandButton() {
        return driver.findElement(By.cssSelector("button[title='Toggle']"));
    }

    public WebElement getDesktopExpandButton() {
        //return driver.findElement(By.xpath("//body/div[@id='app']/div[contains(@class,'body-height')]/div[contains(@class,'container playgound-body')]/div[contains(@class,'row')]/div[contains(@class,'col-12 mt-4 col-md-6')]/div[contains(@class,'check-box-tree-wrapper')]/div[@id='tree-node']/ol/li[contains(@class,'rct-node rct-node-parent rct-node-expanded')]/ol/li[1]/span[1]/button[1]//*[name()='svg']//*[name()='path' and contains(@d,'M7.41 7.84')]"));
        return driver.findElement(By.xpath("//li[@class='rct-node rct-node-parent rct-node-expanded']//li[1]//span[1]//button[1]"));
    }

    public WebElement getDocumentsExpandButton() {
        return driver.findElement(By.xpath("//body/div[@id='app']/div[contains(@class,'body-height')]/div[contains(@class,'container playgound-body')]/div[contains(@class,'row')]/div[contains(@class,'col-12 mt-4 col-md-6')]/div[contains(@class,'check-box-tree-wrapper')]/div[@id='tree-node']/ol/li[contains(@class,'rct-node rct-node-parent rct-node-expanded')]/ol/li[2]/span[1]/button[1]//*[name()='svg']"));
    }

    public WebElement getWorkSpaceExpandButton() {
        return driver.findElement(By.xpath("//body//div[@id='app']//li[contains(@class,'rct-node rct-node-parent rct-node-expanded')]//li[contains(@class,'rct-node rct-node-parent rct-node-expanded')]//li[1]//span[1]//button[1]//*[name()='svg']"));
    }

    public WebElement getOfficeExpandButton() {
        return driver.findElement(By.xpath("//body//div[@id='app']//li[contains(@class,'rct-node rct-node-parent rct-node-expanded')]//li[contains(@class,'rct-node rct-node-parent rct-node-expanded')]//li[2]//span[1]//button[1]//*[name()='svg']"));
    }

    public WebElement getDownloadsExpandButton() {
        return driver.findElement(By.xpath("//li[3]//span[1]//button[1]//*[name()='svg']"));
    }

    public WebElement getHomeCollapseButton() {
        return driver.findElement(By.xpath("(//*[name()='svg'][@class='rct-icon rct-icon-expand-open'])[1]"));
    }

    public WebElement getDesktopCollapseButton() {
        return driver.findElement(By.xpath("(//*[name()='svg'][@class='rct-icon rct-icon-expand-open'])[2]"));
    }

    public WebElement getDocumentsCollapseButton() {
        return driver.findElement(By.xpath("(//*[name()='svg'][@class='rct-icon rct-icon-expand-open'])[3]"));
    }

    public WebElement getWorkSpaceCollapseButton() {
        return driver.findElement(By.xpath("(//*[name()='svg'][@class='rct-icon rct-icon-expand-open'])[4]"));
    }

    public WebElement getOfficeCollapseButton() {
        return driver.findElement(By.xpath("(//*[name()='svg'][@class='rct-icon rct-icon-expand-open'])[5]"));
    }

    public WebElement getDownloadsCollapseButton() {
        return driver.findElement(By.xpath("(//*[name()='svg'][@class='rct-icon rct-icon-expand-open'])[6]"));
    }

    public WebElement getResultText() {
        return driver.findElement(By.id("result"));
    }

    public WebElement getSelectHome() {
        return driver.findElement(By.xpath("//input[@id='tree-node-home']"));
    }

    public WebElement getSelectDesktop() {
        return driver.findElement(By.xpath("//input[@id='tree-node-desktop']"));
    }

    public WebElement getSelectNotes() {
        return driver.findElement(By.xpath("//input[@id='tree-node-notes']"));
    }

    public WebElement getSelectCommands() {
        return driver.findElement(By.xpath("//input[@id='tree-node-commands']"));
    }

    public WebElement getSelectDocuments() {
        return driver.findElement(By.xpath("//input[@id='tree-node-documents']"));
    }

    public WebElement getSelectWorkSpace() {
        return driver.findElement(By.xpath("//input[@id='tree-node-workspace']"));
    }

    public WebElement getSelectReact() {
        return driver.findElement(By.xpath("//input[@id='tree-node-react']"));
    }

    public WebElement getSelectAngular() {
        return driver.findElement(By.xpath("//input[@id='tree-node-angular']"));
    }

    public WebElement getSelectVeu() {
        return driver.findElement(By.xpath("//input[@id='tree-node-veu']"));
    }

    public WebElement getSelectOffice() {
        return driver.findElement(By.xpath("//input[@id='tree-node-office']"));
    }

    public WebElement getSelectPublic() {
        return driver.findElement(By.xpath("//input[@id='tree-node-public']"));
    }

    public WebElement getSelectPrivate() {
        return driver.findElement(By.xpath("//input[@id='tree-node-private']"));
    }

    public WebElement getSelectClassified() {
        return driver.findElement(By.xpath("//input[@id='tree-node-classified']"));
    }

    public WebElement getSelectGeneral() {
        return driver.findElement(By.xpath("//input[@id='tree-node-general']"));
    }

    public WebElement getSelectDownloads() {
        return driver.findElement(By.xpath("//input[@id='tree-node-downloads']"));
    }

    public WebElement getSelectWordFileDoc() {
        return driver.findElement(By.xpath("//input[@id='tree-node-wordFile']"));
    }

    public WebElement getSelectExcelFileDoc() {
        return driver.findElement(By.xpath("//input[@id='tree-node-excelFile']"));
    }
    //-------------------------------------

    public void clickExpandAllButton(){
        this.getExpandAllButton().click();
    }
    public void clickCollapseAllButton(){
        this.getCollapseAllButton().click();
    }
    public void clickOnHome(){
        this.getHome().click();
    }
    public void clickOnDesktop(){
        this.getDesktop().click();
    }
    public void clickOnNotes(){
        this.getNotes().click();
    }
    public void clickOnCommands(){
        this.getCommands().click();
    }
    public void clickOnDocuments(){
        this.getDocuments().click();
    }
    public void clickOnWorkSpase(){
        this.getWorkSpase().click();
    }
    public void clickOnReact(){
        this.getReact().click();
    }
    public void clickOnAngular(){
        this.getAngular().click();
    }
    public void clickOnVeu(){
        this.getVeu().click();
    }
    public void clickOnOffice(){
        this.getOffice().click();
    }
    public void clickOnPublic(){
        this.getPublic().click();
    }
    public void clickOnPrivate(){
        this.getPrivate().click();
    }
    public void clickOnClassified(){
        this.getClassified().click();
    }
    public void clickOnGeneral(){
        this.getGeneral().click();
    }
    public void clickOnDownloads(){
        this.getDownloads().click();
    }
    public void clickOnWordFileDoc(){
        this.getWordFileDoc().click();
    }
    public void clickOnExcelFileDoc(){
        this.getExcelFileDoc().click();
    }

    //===============
    // expandButtons

    public void clickOnHomeExpandButton(){
        this.getHomeExpandButton().click();
    }

    public void clickOnDesktopExpandButton(){
        this.getDesktopExpandButton().click();
    }

    public void clickOnDocumentsExpandButton(){
        this.getDocumentsExpandButton().click();
    }

    public void clickOnWorkSpaceExpandButton(){
        this.getWorkSpaceExpandButton().click();
    }

    public void clickOnOfficeExpandButton(){
        this.getOfficeExpandButton().click();
    }

    public void clickOnDownloadsExpandButton(){
        this.getDownloadsExpandButton().click();
    }

    //-------------------
    // Collapse Buttons

    public void clickOnHomeCollapseButton(){
        this.getHomeCollapseButton().click();
    }

    public void clickOnDesktopCollapseButton(){
        this.getDesktopCollapseButton().click();
    }

    public void clickOnDocumentsCollapseButton(){
        this.getDocumentsCollapseButton().click();
    }

    public void clickOnWorkSpaceCollapseButton(){
        this.getWorkSpaceCollapseButton().click();
    }

    public void clickOnOfficeCollapseButton(){
        this.getOfficeCollapseButton().click();
    }

    public void clickOnDownloadsCollapseButton(){
        this.getDownloadsCollapseButton().click();
    }







}
