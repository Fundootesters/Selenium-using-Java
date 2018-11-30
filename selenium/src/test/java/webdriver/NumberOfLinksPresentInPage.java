package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NumberOfLinksPresentInPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/amba.moolya/Desktop/API Testing/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.linkedin.com");

		driver.manage().window().maximize();

		Thread.sleep(1000);
	
		List<WebElement> allLikns = driver.findElements(By.xpath("//a"));
		
		//allLikns.size();
		
		System.out.println("Total no of links: "+ allLikns.size());
		
		for(int i=1; i<allLikns.size(); i++) {
			System.out.println("All Links "+ allLikns.get(i).getText());
		}

	}

}
