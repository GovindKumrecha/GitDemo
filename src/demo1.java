import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {
    public static void main(String[] arg) throws InterruptedException {
        WebDriver driver =  new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.org/");
        driver.manage().window().maximize();

        WebElement uname = driver.findElement(By.id("login-username"));
        uname.sendKeys("admin");
        WebElement pass = driver.findElement(By.id("login-password"));
        pass.sendKeys("admin");

        WebElement btn =  driver.findElement(By.name("submit"));
        btn.click();

        Thread.sleep(3000);

        WebElement lnk = driver.findElement(By.linkText("Add Customer"));
        lnk.click();

        WebElement name =  driver.findElement(By.name("name"));
        WebElement address =  driver.findElement(By.name("address"));
        WebElement contact1 =  driver.findElement(By.name("contact1"));
        WebElement contact2 =  driver.findElement(By.name("contact2"));

        name.sendKeys("Teahyung");
        address.sendKeys("Busan");
        contact1.sendKeys("121212");
        contact2.sendKeys("232332");

        WebElement addbtn = driver.findElement(By.name("Submit"));
        addbtn.click();
    }

}
