import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javastream4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         WebDriver driver = new ChromeDriver();
         driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
         driver.findElement(By.xpath("//tr/th[1]")).click();
        List<WebElement> l1= driver.findElements(By.xpath("//tr/td[1]"));
        
         l1.stream().map(s->s.getText()).sorted().collect(Collectors.toList()).forEach(s->System.out.println(s));
        
        l1.stream().filter(s->s.getText().contains("Beans")).map(s->getPrice()).collect(Collectors.toList());
         	}

	private static Object getPrice(WebElement s) {
		// TODO Auto-generated method stub
		return null;
	}

}
