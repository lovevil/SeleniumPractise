package SeleniumTests;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Selenium_Checkbox_Dropdown {

	WebDriver driver;

	@Test
	public void dropdownTest() throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

		driver.manage().window().maximize();

		WebElement dropdown = driver.findElement(By.xpath("//select[@id=\"dropdowm-menu-1\"]"));

		Select select = new Select(dropdown);

		select.selectByIndex(1);

		Thread.sleep(300);
		
		select.selectByValue("sql");

		Thread.sleep(300);

		select.selectByVisibleText("Python");

		Thread.sleep(1000);

	}
	
	@Test
	public void checkboxTest() throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

		driver.manage().window().maximize();
		
		Thread.sleep(400);
		
		WebElement option1 = driver.findElement(By.xpath("//input[@value=\"option-1\"]"));

		option1.click();
		
		Assert.assertTrue(option1.isSelected());
		
		Thread.sleep(400);

		driver.findElement(By.xpath("//input[@value=\"option-1\"]")).click();
		
		Thread.sleep(400);

		driver.findElement(By.xpath("//input[@value=\"option-3\"]")).click();

		Thread.sleep(1000);

	}
	
	@Test
	public void radioButtonTest() throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

		driver.manage().window().maximize();
		
		Thread.sleep(400);
		
		WebElement option1 = driver.findElement(By.xpath("//input[@value=\"green\"]"));

		option1.click();
		
		System.out.println(option1.isSelected());
		
		Thread.sleep(400);

		driver.findElement(By.xpath("//input[@value=\"yellow\"]")).click();
		
		Thread.sleep(400);

		driver.findElement(By.xpath("//input[@value=\"purple\"]")).click();

		Thread.sleep(1000);

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
