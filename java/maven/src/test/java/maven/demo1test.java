package maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demo1test {

	public void sample1Test(){
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
	}

}
