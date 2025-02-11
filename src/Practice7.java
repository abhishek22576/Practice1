import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Practice7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   ChromeOptions c1= new ChromeOptions();
		   c1.setAcceptInsecureCerts(true);
		   
           WebDriver driver = new ChromeDriver(c1);
           driver.get("https://expired.badssl.com/");
           System.out.println(driver.getTitle());
	}

}
