import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class India9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         WebDriver driver=new ChromeDriver();
         driver.get("https://groww.in/");
        WebElement l1= driver.findElement(By.id("globalSearch23"));
        String txt=l1.getAttribute("placeholder");
        System.out.println(txt);
	}

}
