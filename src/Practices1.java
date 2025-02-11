import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practices1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.cssSelector("label.customradio:nth-child(2)")).click();
		WebDriverWait w =new WebDriverWait(driver, Duration.ofSeconds(3));
		w.until(ExpectedConditions.elementToBeClickable(By.id("okayBtn"))).click();
		//driver.findElement(By.cssSelector("select.form-control")).click();
		WebElement d1 = driver.findElement(By.cssSelector("select.form-control"));
		Select dropdown = new Select(d1);
		dropdown.selectByValue("consult");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
	    Thread.sleep(3000);
	    List<WebElement> products =driver.findElements(By.cssSelector("h4.card-title"));
	    
	    for(int i=0;i<products.size();i++)
	    {
	    	String name = products.get(i).getText();
	   
	    	if(name.contains("iphone X")) {
	    		driver.findElement(By.xpath("//button[@class='btn btn-info']")).get(i).click();
	    		break;
	    	}
	    }
	    

	}

}
