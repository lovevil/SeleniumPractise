package SeleniumTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EventsUsingActionClass {
	
	WebDriver driver;
	Actions action;
	
	@BeforeTest
	public void setUp() {
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void MouseHover() throws InterruptedException {
		
		driver.get("https://docs.katalon.com/katalon-studio/keywords/keyword-description-in-katalon-studio/web-ui-keywords/webui-mouse-over");
		
		WebElement hoverElement = driver.findElement(By.xpath("//a[text()=\"Developer docs\"]"));
		
		action = new Actions(driver);
		
		action.moveToElement(hoverElement).perform();
		
		Thread.sleep(1000);
	}
	
	
	@Test
	public void dragAndDrop() throws InterruptedException {
		
		driver.get("https://webdriveruniversity.com/Actions/index.html");
		
		WebElement sourceElement = driver.findElement(By.cssSelector("div#draggable"));
		
		WebElement destinationElement = driver.findElement(By.cssSelector("div#droppable"));

		action = new Actions(driver);
		
//		action.dragAndDrop(sourceElement, destinationElement).perform();
		
		action.clickAndHold(sourceElement).moveToElement(destinationElement).build().perform();
		
		Thread.sleep(1000);
	}
	
	@Test
	public void doubleClick() throws InterruptedException {
		
		driver.get("https://webdriveruniversity.com/Actions/index.html");
		
		WebElement element = driver.findElement(By.cssSelector("div#double-click"));
		
		System.out.println(element.getCssValue("background-color"));

		action = new Actions(driver);
		
		action.doubleClick(element).perform();
		
		System.out.println(element.getCssValue("background-color"));
	
		Thread.sleep(1000);
	}
	
	@Test
	public void clickAndHold() throws InterruptedException {
		
		driver.get("https://webdriveruniversity.com/Actions/index.html");
		
		WebElement element = driver.findElement(By.cssSelector("div#click-box"));
		
		System.out.println(element.getCssValue("background-color"));

		action = new Actions(driver);
		
		action.clickAndHold(element).perform();
		
		System.out.println(element.getCssValue("background-color"));
	
		Thread.sleep(1000);
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
