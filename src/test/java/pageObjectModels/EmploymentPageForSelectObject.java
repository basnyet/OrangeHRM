package pageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EmploymentPageForSelectObject {
    WebDriver driver;
public EmploymentPageForSelectObject( WebDriver driver){
    this.driver=driver;
    PageFactory.initElements(driver,this);
}

    public void EmployeeName(){
        driver.findElement(By.xpath("//input[@id=\"empsearch_employee_name_empName\"]")).sendKeys("kerry daung");
    }
    public void EmployeeID(){
        driver.findElement(By.xpath("//input[@id=\"empsearch_id\"]")).sendKeys("152630");
    }

    public void eMStatus() {
//      WebElement eMStatus= driver.findElement(By.xpath("//select[@id=\"empsearch_employee_status\"]"));
//      Select select = new Select(eMStatus);
//      select.selectByVisibleText("Full-Time Permanent");
        //or
     driver.findElement(By.xpath("//option[text()='Full-Time Permanent']")).click();
        //or
//        JavascriptExecutor js = (JavascriptExecutor)driver;
//        WebElement eMStatus=
//        driver.findElement(By.xpath("//option[text()='Full-Time Permanent']"));
//        js.executeScript("arguments[0].click();",eMStatus);


    }

    public void include(){
//    WebElement include = driver.findElement(By.xpath("//select[@id=\"empsearch_sub_unit\"]"));
//    Select select = new Select(include);
//    select.selectByIndex(2);

               //or
       driver.findElement(By.xpath("//option[text()='Past Employees Only']")).click();

    }
    public void SVName(){
        driver.findElement(By.xpath("//input[@id=\"empsearch_supervisor_name\"]")).sendKeys("dusttn");
    }

    public void jobTitle(){
    WebElement jobTitle = driver.findElement(By.xpath("//select[@id=\"empsearch_job_title\"]"));
    Select select= new Select(jobTitle);
    select.selectByVisibleText("HR Manager");
               //or
        //  driver.findElement(By.xpath("//option[text()='HR Manager']")).click();
    }

    public void Sunit(){
          WebElement subUnit= driver.findElement(By.xpath("//select[@id=\"empsearch_sub_unit\"]"));
        Select select = new Select(subUnit);
        select.selectByVisibleText("Administration");
            //or
       // driver.findElement(By.xpath("//option[text()='Administration']")).click();


    }
    public void search(){
        driver.findElement(By.xpath("//input[@id=\"searchBtn\"]")).click();
    }
    public void eList(){
        driver.findElement(By.xpath("//a[text()='Employee List']")).click();
    }

}
