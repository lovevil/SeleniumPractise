package SeleniumTests;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Selenium_Scroll {
	
	WebDriver driver;

	 public static void scrollWindow(WebDriver driver, int x, int y) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(" + x + "," + y + ")");
	    }
	 
	@Test
	public void scrollTest() throws IOException, InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://www.browserstack.com/guide/handle-multiple-windows-in-selenium");
		
		driver.manage().window().maximize();

		((JavascriptExecutor)driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
        Thread.sleep(1000);

		((JavascriptExecutor)driver).executeScript("window.scrollTo(0, -(document.body.scrollHeight))");

//        scrollWindow(driver, 0, 500);
        
        Thread.sleep(1000);

        

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}


}
