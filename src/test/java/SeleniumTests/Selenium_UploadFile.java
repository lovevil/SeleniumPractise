package SeleniumTests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Selenium_UploadFile {
	

	WebDriver driver;
	
	String expectedText = "Your file has now been uploaded!";

	@Test
	public void fileUploadTest() throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://webdriveruniversity.com/File-Upload/index.html");

		driver.manage().window().maximize();

		WebElement uploadFile = driver.findElement(By.cssSelector("input#myFile"));

		uploadFile.sendKeys("/Users/shubhamsaini/Downloads/photos/teja.jpg");
		
		WebElement submitbutton = driver.findElement(By.cssSelector("input#submit-button"));

		submitbutton.click();
		
		Alert alert = driver.switchTo().alert();
			
		String actualText = alert.getText();
		
		Assert.assertEquals(expectedText , actualText);
		
		Thread.sleep(1000);

	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}


}
