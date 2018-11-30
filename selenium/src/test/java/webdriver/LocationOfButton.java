package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocationOfButton {
	// Write a code to get a location of button
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/amba.moolya/Desktop/API Testing/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://in.linkedin.com/");

		driver.manage().window().maximize();

		Thread.sleep(1000);

		WebElement element = driver.findElement(By.id("login-submit"));
		System.out.println("Getting the web element of Login Button");

		Point p = element.getLocation();
		System.out.println("Position of X point is: " + p.getX());
		System.out.println("Position of Y point is: " + p.getY());

		driver.quit();

	}

}
