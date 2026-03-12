package mytest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {
    public static void main(String agrs[]) throws InterruptedException {
    	
    	WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	Thread.sleep(2000);
    	driver.get("https://www.flipkart.com/");
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//span[@role='button']")).click();
    	WebElement el =driver.findElement(By.xpath("//input[contains(@class, 'nw1UBF')]"));
    	el.click();
    	Thread.sleep(2000);
    	el.sendKeys("shoes");
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//button[contains(@class,'XFwMiH')]")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//img[contains(@class, 'MZeksS')]")).click();
    	
    }
}
