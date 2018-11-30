package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sizeOfButton {
	//Write a code to print size of button
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "/Users/amba.moolya/Desktop/API Testing/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://in.linkedin.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		WebElement element = driver.findElement(By.id("login-submit"));
		System.out.println("Getting the web element of Login Button");
		
		Dimension size = element.getSize();
		
		System.out.println("Button Height is :  "+ size.getHeight());
		System.out.println("Button Width is :  "+ size.getWidth());
		
		driver.quit();

	}

}
