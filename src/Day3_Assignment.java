import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3_Assignment {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/login");

        WebElement uName = driver.findElement(By.id("username"));
        uName.sendKeys("tomsmith");

        WebElement uPassword = driver.findElement(By.id("password"));
        uPassword.sendKeys("SuperSecretPassword!");

//        WebElement btn = driver.findElement(By.className("radius"));  //Using class attribute.
//        btn.click();
        WebElement submitBtn = driver.findElement(By.tagName("button")); //Using HTML tag name.
        submitBtn.click();
    }

}
