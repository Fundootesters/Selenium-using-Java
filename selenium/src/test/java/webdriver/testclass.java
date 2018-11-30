package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testclass {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "/Users/amba.moolya/Desktop/API Testing/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		//<input name="txtUsername" id="txtUsername" type="text">
		//input[@name='txtUsername']
		
		//Entring data into text box
		
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("admin");
		System.out.println("Entered UN");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		System.out.println("Enter PW");
		
		Thread.sleep(2000);
		//Clicking on the element
		driver.findElement(By.id("btnLogin")).click();
		System.out.println("Click on Login");
		
		Thread.sleep(2000);
		
		//Close the browser
		
		driver.close();
		
	
		
		
	}

}
