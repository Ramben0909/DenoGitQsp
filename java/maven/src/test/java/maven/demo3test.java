package maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demo3test {

	public void sample2Test(){
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
	}


}
