import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver; // Required for Firefox
import org.testng.Assert; // For verification

public class OrangeHrm {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//span[text()='Buzz']")).click();
        String myPost = "Testing Selenium Automation 2026";
        Thread.sleep(20000);
        driver.findElement(By.xpath("//textarea[contains(@class,'buzz-post-input')]")).sendKeys(myPost);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.navigate().refresh();
		WebElement textbox = driver.findElement(By.xpath("(//p[@class='oxd-text oxd-text--p orangehrm-buzz-post-body-text'])[1]"));
		System.out.println("Post Verified:"+ driver.findElement(By.xpath("(//p[@class='oxd-text oxd-text--p orangehrm-buzz-post-body-text'])[1]")).isDisplayed());
		String actualText = textbox.getText();
		
		if(actualText.equals(myPost)){
			System.out.println("Post Verified Successfully");
		}else {
			System.out.println("Not verified");
		}
        driver.quit();
    }
}