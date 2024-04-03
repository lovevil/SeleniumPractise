package SeleniumTests;

import java.time.Duration;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Selenium_Multiwindow {

	WebDriver driver;

	@Test
	public void multiWindowTest() throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Windows.html");

		driver.manage().window().maximize();

		String parentWindow = driver.getWindowHandle();

		WebElement element = driver.findElement(By.cssSelector("button.btn-primary"));
		
        ((JavascriptExecutor)driver).executeScript("arguments[0].click()", element);

		Set<String> windows = driver.getWindowHandles();

		for (String childWindow : windows) {
			if(!parentWindow.equals(childWindow)) {
			driver.switchTo().window(childWindow);
			System.out.println(" Child window title : " + driver.getTitle());
		}}

		driver.switchTo().window(parentWindow);
		
		System.out.println("Parent window title : " + driver.getTitle());

		Thread.sleep(1000);

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
