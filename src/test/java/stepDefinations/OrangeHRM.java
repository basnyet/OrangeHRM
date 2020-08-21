package stepDefinations;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjectModels.*;
import utility.PathStore;
import utility.ScreenShot;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class OrangeHRM extends BaseClass{
   WebDriver driver;



   @Given("User lunch browser")
   public void user_lunch_browser() {


        System.setProperty(PathStore.BROWSER_NAME_C,PathStore.CHROME_DRIVER_PATH);
        driver = new ChromeDriver();

     driver.manage().deleteAllCookies();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

     driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

        employeePage = new AddEmployeePage(driver);
        oHRM =new OrangeHRMPage(driver);
        fileUpload = new UploadFilePage(driver);
        adminPage =new OrangeHRMAdminPage(driver);
        eps=new EmploymentPageForSelectObject(driver);


    }

    @When("User open URL")
    public void user_open_URL() {
      driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @Then("The page title should be OrangeHRM")
    public void the_page_title_should_be_OrangeHRM() throws IOException {
       boolean status = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img")).isDisplayed();
        Assert.assertTrue(status);
     ScreenShot.Capture(driver,"Page Title");
    }

    @Then("Close The browser")
    public void close_The_browser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
    //-----------------------next Scenario-------------------------------------------------------------

    @When("User open URL as {string}")
    public void user_open_URL_as(String URL) {
        driver.get("https://opensource-demo.orangehrmlive.com/");

    }

    @Then("User enter user name as {string} and password as {string}")
    public void user_enter_user_name_as_and_password_as(String Admin, String admin123) throws InterruptedException, IOException {

     Thread.sleep(2000);
     employeePage.Type_UserName();
     employeePage.Type_password();
     ScreenShot.Capture(driver,"Login Page");

    }

    @Then("user click login button to log in the page")
    public void user_click_login_button_to_log_in_the_page() {

     employeePage.Click_Login();

    }

    @Then("The page title should be {string}")
    public void the_page_title_should_be(String OrangeHRM) throws InterruptedException {

     Thread.sleep(2000);
     boolean status = driver.findElement(By.xpath("//img[@width=\"283\"]")).isDisplayed();
     Assert.assertTrue(status);


    }

    @Then("User click PIM button to see other options")
    public void user_click_PIM_button_to_see_other_options() {

     employeePage.Click_PIM();

    }

    @Then("User click Add Employee options")
    public void user_click_Add_Employee_options() throws InterruptedException {

     Thread.sleep(2000);
     employeePage.Click_AddEmployee();

    }

    @Then("User type First, middle and last Name")
    public void user_type_First_middle_and_last_Name() throws InterruptedException {

     Thread.sleep(2000);

     employeePage.Type_FirstName();
     employeePage.Type_MiddleName();
     employeePage.Type_LastName();

    }

    @Then("User get inner text from Employee ID box")
    public void user_get_inner_text_from_Employee_ID_box() throws InterruptedException {

     Thread.sleep(2000);
     employeePage.get_InnerID();

    }

    @Then("User verify login Details isDisplayed or not")
    public void user_verify_login_Details_isDisplayed_or_not() throws InterruptedException {

     Thread.sleep(2000);


     driver.findElement(By.id("chkLogin"));
     boolean status =  driver.findElement(By.id("chkLogin")).isSelected();
     Assert.assertFalse(status);

     Thread.sleep(2000);
     driver.findElement(By.id("chkLogin")).click();
     boolean status1 =  driver.findElement(By.id("chkLogin")).isSelected();
     Assert.assertTrue(status1);

     Thread.sleep(2000);
     boolean status2 = driver.findElement(By.id("status")).isDisplayed();
     Assert.assertTrue(status2);

     Thread.sleep(2000);
     driver.findElement(By.id("chkLogin")).click();
     boolean status3 = driver.findElement(By.id("status")).isDisplayed();
     Assert.assertFalse(status3);

     Thread.sleep(2000);
     boolean status4 = driver.findElement(By.id("user_name")).isEnabled();
     Assert.assertTrue(status4);



    }

    @Then("User select login Details check box")
    public void user_select_login_Details_check_box() throws InterruptedException {

     Thread.sleep(2000);
     driver.findElement(By.id("chkLogin")).click();
     boolean status = driver.findElement(By.id("chkLogin")).isSelected();
     Assert.assertTrue(status);


    }

    @Then("User verify login Details isSelected or not")
    public void user_verify_login_Details_isSelected_or_not() throws InterruptedException {

     Thread.sleep(2000);
        driver.findElement(By.id("chkLogin"));
     boolean status = driver.findElement(By.id("chkLogin")).isSelected();
     Assert.assertTrue(status);

    }

    @Then("If displayed User create new user name and password")
    public void if_displayed_User_create_new_user_name_and_password() throws InterruptedException {
     Thread.sleep(2000);
     WebElement CheckBox =  driver.findElement(By.id("chkLogin"));

     if(CheckBox.equals(driver.findElement(By.id("chkLogin")))){
      driver.findElement(By.id("chkLogin"));
     }else
       (driver.findElement(By.id("chkLogin"))).isDisplayed();

     Thread.sleep(2000);
     String userName = randomString() + "@yahoo.com";
     employeePage.setUserName(userName);

     Thread.sleep(2000);
     employeePage.Password();
     Thread.sleep(2000);
     employeePage.Re_Password();

    }

    @Then("User click Save button")
    public void user_click_Save_button() throws InterruptedException, IOException {
     Thread.sleep(2000);
     employeePage.Click_Save();
     ScreenShot.Capture(driver,"Save Conformation");

    }
    //-------------------Scenario Nationalities-------------------------------------------------------------------------

 @Then("User enter {string}  and {string}")
 public void user_enter_and(String Username, String Password) throws InterruptedException {

  Thread.sleep(2000);
  employeePage.Type_UserName();
  employeePage.Type_password();
 }

 @Then("User click Admin button")
 public void user_click_Admin_button() throws InterruptedException {

  Thread.sleep(2000);
     oHRM.Admin();


 }

 @Then("User Click Nationalities")
 public void user_Click_Nationalities() throws InterruptedException {
   Thread.sleep(2000);
     oHRM.Nationalities();

}

 @Then("User choose different kind of Nationalities and verify")
 public void user_choose_different_kind_of_Nationalities_and_verify() throws InterruptedException {

  Thread.sleep(2000);
  oHRM.Click_Zimbabwean();

  Thread.sleep(2000);
  oHRM.Click_NepaleseBox();

    Thread.sleep(2000);
  oHRM.Click_AmericanBox();

  Thread.sleep(2000);
  oHRM.Click_JapaneseBox();

  Thread.sleep(2000);
  //oHRM.Click_Add();

  Thread.sleep(2000);
  oHRM.Select_Nationality();

  Thread.sleep(2000);
  oHRM.Click_cancel();

  Thread.sleep(2000);
  oHRM.Click_Add();

  Thread.sleep(2000);
  OrangeHRMPage.scrollPagedown(driver);
  Thread.sleep(2000);
  OrangeHRMPage.scrollPageup(driver);
  Thread.sleep(2000);
  OrangeHRMPage.scrollbottomofThePage(driver);
  OrangeHRMPage.scrollIntoView(driver,"CanadianBox");

 }
//----------------------------File Upload-----------------------------------------------------------------------

 @Then("User go to the configuration")
 public void user_go_to_the_configuration() {
  fileUpload.Click_Configuration();
 }

 @Then("User click Data Imoport")
 public void user_click_Data_Imoport() throws InterruptedException, IOException {
  Thread.sleep(2000);
    fileUpload.Click_ImportData();
  ScreenShot.Capture(driver,"File Upload");

 }

 @Then("User verify the page is Enable or not")
 public void user_verify_the_page_is_Enable_or_not() throws InterruptedException {
  Thread.sleep(2000);

  boolean status = driver.findElement(By.id("btnSave")).isEnabled();
    Assert.assertTrue(status);


 }
 @Then("User choose file")
 public void user_choose_file() throws InterruptedException, IOException {
  Thread.sleep(2000);
  fileUpload.Choose_File();
  ScreenShot.Capture(driver,"File Name");

 }


 @Then("User upload the file")
 public void user_upload_the_file() throws InterruptedException, IOException {
  Thread.sleep(2000);
    fileUpload.Click_Upload();
  ScreenShot.Capture(driver,"Upload File");
 }
 //------------------Use JavaScriptExecutor-------------------------------------------------------------------------
 @Then("User choose to the configuration")
 public void user_choose_to_the_configuration() throws InterruptedException {
  Thread.sleep(2000);
    adminPage.configuration();

 }

 @Then("user click module")
 public void user_click_module() throws InterruptedException {
  Thread.sleep(2000);
    adminPage.Module();
  Thread.sleep(2000);
   // adminPage.Edit();

 }

 @Then("User Click Enable time modules Check Box")
 public void user_Click_Enable_time_modules_Check_Box() throws InterruptedException {
  Thread.sleep(2000);
    adminPage.TimeModule_CheckBox();

 }

 @Then("User Click Enable Directory module")
 public void user_Click_Enable_Directory_module() throws InterruptedException {
  Thread.sleep(2000);
    adminPage.Enable_directory();

 }
 //===========================Select Method and other for Select object================================

 @Then("User click Employee List")
 public void user_click_Employee_List() throws InterruptedException {
  Thread.sleep(2000);
    eps.eList();

 }

 @Then("User Type User Name and ID")
 public void user_Type_User_Name_and_ID() throws InterruptedException {
  Thread.sleep(2000);
    eps.EmployeeName();
  Thread.sleep(2000);
    eps.EmployeeID();

 }

 @Then("User Select Employeement Status")
 public void user_Select_Employeement_Status() throws InterruptedException {

  Thread.sleep(2000);
   eps.eMStatus();

 }

 @Then("User Select Include")
 public void user_Select_Include() throws InterruptedException {
  Thread.sleep(2000);
   eps.include();

 }

 @Then("User Type SuperVisor Name")
 public void user_Type_SuperVisor_Name() throws InterruptedException {
  Thread.sleep(2000);
    eps.SVName();
 }

 @Then("User Select Job Title")
 public void user_Select_Job_Title() throws InterruptedException {
  Thread.sleep(2000);
    eps.jobTitle();
 }

 @Then("User Select Sub Unit")
 public void user_Select_Sub_Unit() throws InterruptedException {
  Thread.sleep(2000);
    eps.Sunit();
 }

 @Then("User Click Search button")
 public void user_Click_Search_button() throws InterruptedException {
  Thread.sleep(2000);
    eps.search();

 }




}