import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Day4_Assignment {

    @Test
    public void Day4_assig() throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.instagram.com/");
       // 1. Create the object reference of takesScreenshot.
        // assign the current drive to it.
// hang
        TakesScreenshot ts =(TakesScreenshot) driver;

        //2.call the method getScreenshotAs()
        File scrFile = ts.getScreenshotAs(OutputType.FILE);

        //3. copy this file object into real image file

        FileUtils.copyFile(scrFile,new File("D:\\All codes\\5Day\\Ss\\IMG.png"));

    }
}
