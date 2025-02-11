import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		// TODO Auto-generated method stub
		///System.setProperty("webdriver.chrome.driver", "C:\\Users\\mynam\\Documents.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("abhisheksinghkashyap@gmail.com");
		driver.findElement(By.cssSelector("input[data-testid='royal_email']")).sendKeys("abhisheksinghkashyap@gmail.com");
		driver.findElement(By.className("_9npi")).sendKeys("hickenbottomcr7");
		driver.findElement(By.name("login")).click();
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().refresh();
		//driver.findElement(By.linkText("Forgotten password?")).click();
		//driver.findElement(By.xpath("//input[@placeholder='Email address or mobile number']")).sendKeys("9354614046");
	}

}
