package ShopperWithPojo;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TakeScreenShots {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://mvnrepository.com/");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("C:\\\\Users\\\\Ritam\\\\Programming\\\\Capgemini\\\\java\\\\RestfulFul\\src\\test\\java\\shopper\\screenshot\\scheenshot_1.png");
		
		org.openqa.selenium.io.FileHandler.copy(source,target);
		driver.quit();
	}
}