package SeleniumTests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Selenium_Textfield {

	WebDriver driver;

	@Test
	public void fileUploadTest() throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://webdriveruniversity.com/To-Do-List/index.html");

		driver.manage().window().maximize();
		
		WebElement input = driver.findElement(By.xpath("//input"));
		
		input.sendKeys("hello");
		
		input.sendKeys(Keys.ENTER);

		Thread.sleep(1000);

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
