import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Adaptitadm {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\mynam\\Documents\\chromedriver.exe");
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://app.workstatus.io/auth/login");
        //driver.findElement(By.id("emailInput")).sendKeys("9910");
        driver.findElement(By.xpath("//input[@id='input-3']")).sendKeys("abhishek.singh3@mail.vinove.com");
        driver.findElement(By.xpath("//input[@id='input-5']")).sendKeys("abhishek@123#");
        //driver.findElement(By.xpath("")).click();
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//path[@stroke='currentColor']")).click();
        
        
       // driver.manage().timeouts().
        //driver.findElement(By.id("menuFeature4")).click();
        //driver.navigate().refresh();
        
       
        
        //driver.findElement(By.cssSelector("input[placeholder='Enter Your Email']")).sendKeys("abhishek.singh3@mail.vinove.com");
       // driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys("abhishek@123#");
       // driver.findElement(By.xpath("//svg[@xmlns='http://www.w3.org/2000/svg']")).click();
       // driver.findElement(By.id("checkbox-7")).click();
       // driver.findElement(By.className("v-btn")).click();
        //driver.findElement(By.xpath("//button[@type='submit']")).click();
        //driver.findElement(By.xpath("//button[@class='v-btn']")).click();
        //driver.findElement(By.xpath("//button[@type='submit']")).click();
       // driver.findElement(By.className("go-to-reg")).click();  
       // driver.get("https://app.workstatus.io/auth/register");
       // driver.findElement(By.id("input-115")).sendKeys("Rajeshwar");
        //driver.findElement(By.id("input-117")).sendKeys("abhishek.tilauta@gmail.com");
        
	}

}
