import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		// TODO Auto-generated method stub
		///System.setProperty("webdriver.chrome.driver", "C:\\Users\\mynam\\Documents.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.getTitle();
		driver.get("https://www.proprofs.com/quiz-school/login.php");
		driver.findElement(By.id("username")).sendKeys("mynameisabhishek575@gmail.com");
		driver.findElement(By.id("password")).sendKeys("1qaz1234cr7");
		driver.findElement(By.className("btn_class")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("btn_class")).click();
		driver.findElement(By.cssSelector("a[title='My Quizzes']")).click();
		driver.findElement(By.className("btn_class")).click();
		//driver.findElement(By.className("template_main_heading")).click();
		//driver.close();
	
	}

}

