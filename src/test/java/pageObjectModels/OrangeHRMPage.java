package pageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class OrangeHRMPage {
    WebDriver driver;

    public OrangeHRMPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = ("txtUsername"))
    WebElement User_Name;

    public WebElement getUser_Name() {
        return User_Name;
    }


    @FindBy(id = ("txtPassword"))
    WebElement Password;

    public WebElement getPassword() {
        return Password;
    }

    @FindBy(id = ("btnLogin"))
    WebElement Login;

    public WebElement getLogin() {
        return Login;
    }

//--------------------Nationalities Page-------------------------------------------------------------------------------

    public void Admin() {
        driver.findElement(By.id("menu_admin_viewAdminModule")).click();
    }
    public void Nationalities(){
        driver.findElement(By.id("menu_admin_nationality")).click();
    }
    public void Click_NepaleseBox(){ driver.findElement(By.xpath("//a[text()='Nepalese']")).click();}
    public void Click_AmericanBox(){driver.findElement(By.xpath("//a[text()='American']")).click(); }
    public void Click_Zimbabwean(){
        driver.findElement(By.id("ohrmList_chkSelectRecord_193")).click();
    }
    public void Click_JapaneseBox(){
        driver.findElement(By.xpath("//input[@id=\"ohrmList_chkSelectRecord_91\"]")).click();
    }
    public void Click_Add(){driver.findElement(By.xpath("//input[@id=\"btnAdd\"]")).click(); }
    public void Select_Nationality(){
        driver.findElement(By.id("nationality_name")).sendKeys("American");
    }
    public void Click_cancel(){
        driver.findElement(By.id("btnCancel")).click();
    }
    public static void generateAlert(WebDriver driver, String massage) {//generateAlert
        driver.findElement(By.id("nationality_name"));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("alert("+massage+")");
    }
    public static void drawBorder(String element, WebDriver driver) {//draw border
        driver.findElement(By.id("btnSave"));
        JavascriptExecutor jse = ((JavascriptExecutor)driver);
        jse.executeScript("arguments[0].style.border='3px solid red'", element);
    }
    public static void scrollPagedown(WebDriver driver) {                         //Scroll Page down
        JavascriptExecutor jse = ((JavascriptExecutor)driver);
        jse.executeScript("window.scrollTo(0,4500)");
    }
    public static void scrollPageup(WebDriver driver) {                         //Scroll Page up
        JavascriptExecutor jse =(JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,-45000)");
    }
    public static void scrollbottomofThePage(WebDriver driver) {                         //Scroll bottom of the page
        JavascriptExecutor jse =(JavascriptExecutor)driver;
        jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }

    String CanadianBox;
    public static void scrollIntoView(WebDriver driver, String  element) {//Scroll Page down in particular element


       // driver.findElement(By.id("ohrmList_chkSelectRecord_35"));
        driver.findElement(By.id("ohrmList_chkSelectRecord_35")).click();
//        JavascriptExecutor jse = (JavascriptExecutor)driver;
//        jse.executeScript("arguments[0].scrollIntoView(true);",element);
    }



}