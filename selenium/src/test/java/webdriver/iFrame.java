package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class iFrame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/amba.moolya/Desktop/API Testing/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		//CLick on Frames
		driver.findElement(By.xpath("//a[@href='/frames']")).click();
		
		//Click on Iframe
		driver.findElement(By.xpath("//a[contains(text(),'iFrame')]")).click();
		
		driver.switchTo().frame("mce_0_ifr");
		driver.findElement(By.xpath("/body[1]")).sendKeys("Hello Nishant");
		
		Thread.sleep(2000);
		//driver.quit();

	}

}
