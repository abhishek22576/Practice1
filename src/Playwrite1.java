import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TakeScreenshot;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Playwrite1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(src,new File("C:\\Users\\mynam\\AppData"));
		
		//driver.navigate().to("https://www.instagram.com/");
		//driver.navigate().back();
		//Assert.assertTrue(driver.findElement(By.xpath("//input[@placeholder='Enter Your Email']")).click());
		//driver.findElement(By.xpath("//input[@placeholder='Enter Your Email']")).sendKeys("abhishek.singh3@mail.vinove.com");
		//Assert.assertEquals(System.out.println(driver.findElement(By.xpath("//input[@placeholder='Enter Your Email']")).getText()), "Enter Your Email");
		//System.out.println(driver.findElement(By.xpath("//input[@placeholder='Enter Your Email']")).getText());
		//Assert.assertFalse(driver.findElement(By.xpath("//input[@placeholder='Enter Your Email']")).sendKeys("abhishek.singh3@mail.vinove.com"));
		//driver.navigate().forward();
		//driver.findElement(By.className("go-to-reg")).click();
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//input[@placeholder='Enter Full Name']")).sendKeys("abhishek");
		//driver.findElement(By.xpath("//input[@placeholder='Enter Your Email']")).sendKeys("abhisheksinghkashyap@gmail.com");
		//driver.findElement(By.xpath("//input[@placeholder='Phone No']")).sendKeys("7871687901");

	}

}
