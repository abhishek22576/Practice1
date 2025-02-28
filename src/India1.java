import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class India1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://app.workstatus.io/auth/login");
		driver.findElement(By.id("input-3")).sendKeys("abhishek.singh3@mail.vinove.com");
		driver.findElement(By.id("input-5")).sendKeys("abhishek@123#");
		driver.findElement(By.cssSelector("svg.v-icon")).click();
		driver.findElement(By.id("checkbox-7")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(9));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("svg.rotate-img"))).click();
		driver.findElement(By.xpath("//span[@style='margin-left: 4px;']")).click();
		

	}

}
