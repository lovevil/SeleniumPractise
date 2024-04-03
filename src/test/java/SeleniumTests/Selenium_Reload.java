package SeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium_Reload {
	
	@Test
	public void reloadBrowserTestUsingRefresh() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		
		Thread.sleep(500);
		
		driver.navigate().refresh();
		
		Thread.sleep(500);
		
		driver.navigate().to(driver.getCurrentUrl());

		Thread.sleep(500);

		driver.quit();
		
	}
	
	@Test
	public void reloadBrowserTestUsingGetCurrentURL() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		
		Thread.sleep(500);
		
		driver.get(driver.getCurrentUrl());
		
		Thread.sleep(500);

		driver.quit();
		
	}
	
	@Test
	public void reloadBrowserTestUsingSendKeys() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//textarea[@aria-label=\"Search\"]")).sendKeys(Keys.F5);
		
		Thread.sleep(500);

		driver.quit();
		
	}
	

}
