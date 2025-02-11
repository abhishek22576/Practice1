
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Adapt3 {

    public static void main(String[] args) {
        // Set the path to ChromeDriver executable
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\mynam\\path\\to\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
       // try {
            // Maximize browser window
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            driver.manage().window().maximize();

            // Navigate to the URL
            driver.get("https://edu-adminweb.adaptit.com/");

            // Perform login
            driver.findElement(By.xpath("//input[@placeholder='Type']")).sendKeys("4001166");
            driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys("12345");
            driver.findElement(By.xpath("//button[@id='signInButton']")).click();

            // Wait for the element to be clickable and click it
            //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            //WebElement menuFeature = wait.until(ExpectedConditions.elementToBeClickable(By.id("menuFeature4")));
            //menuFeature.click();

        //} catch (Exception e) {
            // Print any exceptions for debugging
           // e.printStackTrace();
       // } finally {
            // Ensure the driver quits, closing the browser
           //// if (driver != null) {
              //  driver.quit();
          
        
    }
}