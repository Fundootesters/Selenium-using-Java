package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/amba.moolya/Desktop/API Testing/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Dropdown')]")).click();
		Select select = new Select(driver.findElement(By.id("dropdown")));
		//select.selectByVisibleText("Option 1");
		//select.selectByIndex(1);
		select.selectByValue("2");
		
	}

}
