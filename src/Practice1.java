import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("abhishek");
		driver.findElement(By.name("email")).sendKeys("abhishek.singh1@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("1qaz1234@Cr7");
		driver.findElement(By.id("exampleCheck1")).click();
		System.out.println(driver.findElement(By.className("form-check-label")).getText());
		driver.findElement(By.id("exampleFormControlSelect1")).click();
		//Thread.sleep(3000);
		driver.findElement(By.id("inlineRadio2")).click();
		driver.findElement(By.name("bday")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("btn")).click();
		System.out.println(driver.findElement(By.className("alert")).getText());
		driver.findElement(By.className("close")).click();
		
	}

}

