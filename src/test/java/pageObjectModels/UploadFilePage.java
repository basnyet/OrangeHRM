package pageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class UploadFilePage {

    WebDriver driver;

    public UploadFilePage( WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }

    public void Click_Configuration(){

        driver.findElement(By.id("menu_pim_Configuration")).click();

    }
    public void Click_ImportData(){

        driver.findElement(By.id("menu_admin_pimCsvImport")).click();
    }
    public void Choose_File(){
        driver.findElement(By.id("pimCsvImport_csvFile"))
                .sendKeys("C:\\Users\\basny_gg\\OneDrive\\Documents\\importData (1).csv");
    }
    public void Click_Upload(){
        driver.findElement(By.id("btnSave")).click();
    }
}
