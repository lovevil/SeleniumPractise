package SeleniumTests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ExplicitWait {

	WebDriver driver;

	@Test
	public void explicitWait() {

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

		WebElement iframe = driver.findElement(By.cssSelector("iframe.demo-frame"));

		driver.switchTo().frame(iframe);

		WebElement draggable = driver.findElement(By.xpath("//ul[@id=\"gallery\"]//following::img"));

		WebElement droppable = driver.findElement(By.cssSelector("div#trash"));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		wait.until(ExpectedConditions.elementToBeClickable(draggable));

		Actions action = new Actions(driver);

		action.clickAndHold(draggable).moveToElement(droppable).build().perform();

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
