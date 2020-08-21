package pageObjectModels;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import sun.security.krb5.internal.KdcErrException;

public class AddEmployeePage {

    WebDriver driver;
    public AddEmployeePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    public void Type_UserName(){
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
    }
    public void Type_password(){
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
    }
    public void Click_PIM(){
        driver.findElement(By.id("menu_pim_viewPimModule")).click();
    }
    public void Click_AddEmployee(){
        driver.findElement(By.id("menu_pim_addEmployee")).click();
    }
    public void Type_FirstName(){
      driver.findElement(By.id("firstName")).sendKeys("John");
    }
    public void Type_LastName(){
        driver.findElement(By.id("lastName")).sendKeys("Janarthan");
    }
    public void Type_MiddleName(){
        driver.findElement(By.id("middleName")).sendKeys("janur");
    }
    public void get_InnerID(){
        driver.findElement(By.id("employeeId")).getAttribute("value");
        Assert.assertTrue("value", true);
    }
    public void Click_Login(){
        driver.findElement(By.id("btnLogin")).click();
    }

    public void Password(){
        driver.findElement(By.id("user_password")).sendKeys("Abc152207");
    }
    public void Re_Password(){
        driver.findElement(By.id("re_password")).sendKeys("Abc152207");
    }

    String UserName;

    public void setUserName(String yahoo) {
        UserName = yahoo;
        driver.findElement(By.id("user_name")).sendKeys(yahoo);
    }

    public void Click_Save(){
        driver.findElement(By.id("btnSave")).click();
    }

}
