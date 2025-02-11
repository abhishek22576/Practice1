import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        System.out.println(driver.findElements(By.tagName("a")).size());
        driver.findElement(By.xpath("//div[@id='gf-BIG']"));
       
       WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
        System.out.println(footerdriver.findElements(By.tagName("a")).size());
        WebElement subdriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td/ul"));
        System.out.println(subdriver.findElements(By.tagName("a")).size());
        //subdriver.findElement(By.xpath("//a[@href='http://www.restapitutorial.com/']")).click();
        for(int i=1;i<subdriver.findElements(By.tagName("a")).size();i++)
        	
        {
        	String clickseperatelink=Keys.chord(Keys.CONTROL,Keys.ENTER);
        	subdriver.findElements(By.tagName("a")).get(i).sendKeys(clickseperatelink);
        	Thread.sleep(9000);
        }
        	Set<String> s1 = driver.getWindowHandles();
        	Iterator<String> it= s1.iterator();
        
        	
        	while(it.hasNext()) 
        	{
        		driver.switchTo().window(it.next());
        		System.out.println(driver.getTitle());
       
        	}
        	
        	
        }
        
	
	}


