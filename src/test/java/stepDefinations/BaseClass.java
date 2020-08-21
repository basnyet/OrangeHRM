package stepDefinations;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import pageObjectModels.*;
import utility.BrowsersHome;


public class BaseClass {
    public static WebDriver driver;

    public AddEmployeePage employeePage;
    public OrangeHRMPage oHRM;
    public BrowsersHome brow;
    public UploadFilePage fileUpload;
    public OrangeHRMAdminPage adminPage;
    public EmploymentPageForSelectObject eps;


    public static String randomString() {
        String generatedString = RandomStringUtils.randomAlphabetic(5);
        return generatedString;

    }
}