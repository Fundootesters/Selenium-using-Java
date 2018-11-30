package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class clearData {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/amba.moolya/Desktop/API Testing/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");

		
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("fun doo testers");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='txtUsername']")).clear();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("admin");

	}

}
