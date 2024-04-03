package SeleniumTests;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class SeleniumAlerts {
	
	WebDriver driver;
	
	

	@Test
	public void alertTest() throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://webdriveruniversity.com/Popup-Alerts/index.html");

		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[@id=\"button1\"]")).click();
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		Thread.sleep(1000);

	}
	
	@Test
	public void confirmTest() throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://webdriveruniversity.com/Popup-Alerts/index.html");

		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[@id=\"button4\"]")).click();
		
		Alert alert = driver.switchTo().alert();
				
		System.out.println(alert.getText());
		
//		alert.accept();
		
		alert.dismiss();
		
		Assert.assertTrue(driver.findElement(By.xpath("//p[@id=\"confirm-alert-text\"]")).isDisplayed());
		
		Thread.sleep(1000);

	}
	
	@Test
	public void customModalTest() throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://webdriveruniversity.com/Popup-Alerts/index.html");

		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[@id=\"button2\"]")).click();
		
		WebElement close = driver.findElement(By.xpath("//button[text()=\"Close\"]"));
	
		WebDriverWait wait = new WebDriverWait(driver,Duration.ZERO.ofSeconds(10));
		
		wait.until(ExpectedConditions.elementToBeClickable(close)).click();
		
		Thread.sleep(1000);

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
