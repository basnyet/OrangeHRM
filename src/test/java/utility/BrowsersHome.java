package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import stepDefinations.BaseClass;

public class BrowsersHome {

    WebDriver driver;


    String browser;

    public BrowsersHome(WebDriver driver) {
        this.driver = driver;
        //this.browser= browser;
       // PageFactory.initElements(driver,this);

        //PageFactory.initElements(browser,this);
    }


    public void browsers() {

        if (browser.equalsIgnoreCase("Chrome")) {
            System.setProperty(PathStore.BROWSER_NAME_C, PathStore.CHROME_DRIVER_PATH);
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            System.setProperty(PathStore.BROWSER_NAME_G, PathStore.GECKO_DRIVER_PATH);
            driver = new FirefoxDriver();
        } else browser.equalsIgnoreCase("IE");
        {
            System.setProperty(PathStore.BROWSER_NAME_I, PathStore.IE_PATH);
            driver = new InternetExplorerDriver();

        }
    }

}




