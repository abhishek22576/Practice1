import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Practicecalender {

	public static void main(String[] args) {
		
		String monthnumber = "7";
		String date = "15";
		String year = "2027";
		String[] expectedvalue= {monthnumber,date,year};
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.findElement(By.xpath("//input[@autocomplete='off'][3]")).click();
        driver.findElement(By.xpath("//button[@style='flex-grow: 1;']/span")).click();
        driver.findElement(By.xpath("//button[@style='flex-grow: 1;']/span")).click();
        driver.findElement(By.xpath("//button[@style='flex: 0 0 33.3333%; overflow: hidden; margin-inline-end: 0px;'][7]")).click();
        driver.findElement(By.cssSelector("abbr[aria-label='July 2027']")).click();
        driver.findElement(By.cssSelector("abbr[aria-label='July 15, 2027']")).click();
        List<WebElement> d1=driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
        
        for(int i=0;i<d1.size();i++)
        {
        	System.out.println(d1.get(i).getAttribute("value"));
        	Assert.assertEquals(d1.get(i).getAttribute("value"), expectedvalue[i]);
        }
        //driver.close();
        
	}

}
