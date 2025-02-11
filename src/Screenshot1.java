import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class Screenshot1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
          WebDriver driver = new ChromeDriver();
          driver.manage().window().maximize();
          //driver.manage().deleteAllCookies();
          driver.get("https://www.instagram.com/");
          //Thread.sleep(3000);
          //driver.navigate().refresh();
         File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         FileUtils.copyFile(src,new File("C:\\Users\\mynam\\screenshot.png"));
	}

}
