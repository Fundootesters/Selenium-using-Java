package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehover {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/amba.moolya/Desktop/API Testing/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.seleniumhq.org/");

		//driver.manage().window().maximize();

		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.xpath("//a[@title='Get Selenium']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
		
		//driver.close();
	}

}
