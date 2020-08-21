package pageObjectModels;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMAdminPage {

    WebDriver driver;
    public OrangeHRMAdminPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void configuration(){
      //  driver.findElement(By.id("menu_admin_Configuration")).click();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement configuration = driver.findElement(By.id("menu_admin_Configuration"));
        js.executeScript("arguments[0].click();",configuration);
    }
    public void Module(){
     //  driver.findElement(By.id("menu_admin_viewModules")).click();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement Module = driver.findElement(By.id("menu_admin_viewModules"));
        js.executeScript("arguments[0].click();",Module);
    }
    public void Edit(){
       driver.findElement(By.id("btnSave")).click();
    }

    public void TimeModule_CheckBox(){
//        driver.findElement(By.id("moduleConfig_time")).click();


        JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement TimeModule_CheckBox = driver.findElement(By.id("moduleConfig_time"));
        js.executeScript("arguments[0].click();",TimeModule_CheckBox);
        boolean status=driver.findElement(By.id("moduleConfig_time")).isSelected();
        Assert.assertTrue(status);
    }

    public void Enable_directory(){
       // driver.findElement(By.id("moduleConfig_directory")).click();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement Enable_directory = driver.findElement(By.id("moduleConfig_directory"));
        js.executeScript("arguments[0].click();",Enable_directory);
    }

}
//    public static void clickElementbyjse(WebElement element, WebDriver driver) {  //clickElement by java Script Executor
//        JavascriptExecutor jse = ((JavascriptExecutor)driver);
//        jse.executeScript("arguments[0].click();", element );
