package utility;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class ScreenShot {

    WebDriver driver;

    public ScreenShot(WebDriver driver){
        this.driver=driver;
    }



    public static void Capture(WebDriver driver, String FileName) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);//take a screen shot and store it as a file format

        FileUtils.copyFile(src,new File("./ScreenShot/"+FileName+".png"));
                                                            // ./it will indicate the direct to the ScreenShot
    }
}
