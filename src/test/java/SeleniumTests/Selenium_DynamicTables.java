package SeleniumTests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Selenium_DynamicTables {
	
	WebDriver driver;
	int sum;
	String[] arr; 
	
	@Test
	public void dynamicTableTest() throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://webdriveruniversity.com/Data-Table/index.html");

		driver.manage().window().maximize();
		
		List<WebElement> elements = driver.findElements(By.xpath("//ul[@class=\"menu\"]//following-sibling::li"));
		
		arr = new String[elements.size()];

		for(int i=0;i<elements.size();i++) {
			
			arr[i] = elements.get(i).getText();
			
		}

		for(String s:arr) {
			System.out.println(s);
		}
		
		Thread.sleep(1000);

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
