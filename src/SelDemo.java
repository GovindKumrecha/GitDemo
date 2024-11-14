import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelDemo {
    public static void main(String[] arg){
        WebDriver driver =  new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://facebook.com");
        System.out.println(driver.getTitle());
    }

}
