import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         WebDriver driver = new ChromeDriver();
         driver.get("https://rahulshettyacademy.com/loginpagePractise/");
         driver.manage().window().maximize();
         driver.findElement(By.className("blinkingText")).click();
         Set<String> window = driver.getWindowHandles();
         Iterator<String> it =window.iterator();
         String parentid=it.next();
         String childid=it.next();
         driver.switchTo().window(childid);
         System.out.println(driver.findElement(By.cssSelector("p.im-para.red")).getText());
         driver.findElement(By.cssSelector("p.im-para.red")).getText();
         String emailid = driver.findElement(By.cssSelector("p.im-para.red")).getText().split("@")[1].split(" ")[0];
         driver.switchTo().window(parentid);
         driver.findElement(By.id("username")).sendKeys(emailid);
	}

}
