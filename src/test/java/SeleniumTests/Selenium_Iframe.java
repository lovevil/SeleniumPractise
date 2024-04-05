package SeleniumTests;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Selenium_Iframe {
	
	WebDriver driver;

	@Test
	public void iframeTestOne() throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://webdriveruniversity.com/IFrame/index.html");

		driver.manage().window().maximize();

		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//a[text()=\"Our Products\"]")).click();
		
		WebElement footer = driver.findElement(By.xpath("//p[text()=\"Copyright © www.GianniBruno.com\"]"));

		Assert.assertTrue(footer.isDisplayed());
		
		Thread.sleep(1000);

	}

	
	@Test
	public void iframeTestTwo() throws InterruptedException {		

		driver = new ChromeDriver();

		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");

		driver.manage().window().maximize();
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@name=\"globalSqa\"]"));

		driver.switchTo().frame(frame);
		
		WebElement frameElement = driver.findElement(By.xpath("//span[text()='Trainings']"));
		
		frameElement.click();
		
		driver.switchTo().defaultContent();
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement heading = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title=\"Demo Testing Site\"]")));
		
		WebElement heading = driver.findElement(By.xpath("//a[@title=\"Demo Testing Site\"]"));

//		heading.click();
		
		Assert.assertTrue(heading.isDisplayed());
			
		Thread.sleep(1000);

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
