import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.IOException;
import java.util.List;


public class ScreenshotExample {
    public static void main(String[] args) {
        // Set the path to your WebDriver executable
        
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.manage().window().maximize();
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
        for(int i=0;i<products.size();i++)
        {
        	String name = products.get(i).getText();
        	if(name.contains("Beetroot"))
        	{
        		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
        		break;
        	}
        }
        
        //driver.findElement(By.xpath("//img[@alt='Login']")).click();
        //driver.findElement(By.className("r4vIwl")).sendKeys("7042323678");
        //driver.findElement(By.className("QqFHMw")).click();
        
    }
}
