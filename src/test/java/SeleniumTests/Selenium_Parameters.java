package SeleniumTests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Selenium_Parameters {

	WebDriver driver;

	@Test
    @Parameters({"username","password"})
	public void parametersTest(String username, String password) throws IOException, InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://practicetestautomation.com/practice-test-login/");

		driver.manage().window().maximize();

		driver.findElement(By.cssSelector("input#username")).sendKeys(username);

		driver.findElement(By.cssSelector("input#password")).sendKeys(password);

		driver.findElement(By.cssSelector("button#submit")).click();

		Thread.sleep(1000);

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
