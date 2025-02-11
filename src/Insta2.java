import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          WebDriver driver = new ChromeDriver();
          driver.get("https://www.instagram.com/");
          driver.findElement(By.xpath("//input[@fdprocessedid='xwzilf']")).sendKeys("abhi.hbk");
          driver.findElement(By.xpath("//input[@fdprocessedid='e3b0cg']")).sendKeys("hickenbottomcr7");
          
        
	}


}
