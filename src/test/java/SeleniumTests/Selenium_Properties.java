package SeleniumTests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Selenium_Properties {

	WebDriver driver;

	Properties property;

	String url = "/Users/shubhamsaini/eclipse-workspace/SeleniumPractise/resources/data.properties";

	public Properties readProperty(String file) throws IOException {

		property = new Properties();

		FileInputStream fis = new FileInputStream(new File(file));

		property.load(fis);

		return property;

	}
	
	public Properties writeProperty(String key , String value , String file) throws IOException {

		property = new Properties();

		FileOutputStream fos = new FileOutputStream(new File(file));

		property.setProperty(key, value);
		
		property.store(fos, null);

		return property;

	}

	@Test
	public void propertiesTest() throws IOException {

		driver = new ChromeDriver();

		property = readProperty(url);

		System.out.println(property.getProperty("url"));

		driver.get(property.getProperty("url"));

		driver.manage().window().maximize();

		System.out.println(driver.getTitle());
		
		writeProperty("pageurl" , driver.getCurrentUrl() , url);

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
