package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkbox {
	
	//https://the-internet.herokuapp.com/
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/amba.moolya/Desktop/API Testing/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Checkboxes')]")).click();
		
		WebElement element = driver.findElement(By.xpath("//form[@id='checkboxes']//input[2]"));
		Thread.sleep(2000);
		
		if(element.isSelected()) {
			System.out.println("Check is selected");
		}else {
			System.out.println("checkbox is not selected");
		}
		
		driver.close();
	
		
	}

}
