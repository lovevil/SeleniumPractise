package SeleniumTests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium_ShadowDom {

	@Test
	public void testShadowDom() {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("chrome://downloads/");
		
		WebElement element = (WebElement)((JavascriptExecutor)driver).executeScript("return document.querySelector('downloads-manager').shadowRoot.querySelector('downloads-toolbar').shadowRoot.querySelector('cr-toolbar').shadowRoot.querySelector('cr-toolbar-search-field').shadowRoot.querySelector('div#content input#searchInput')");
		
//		String script = "arguments[0].value='shubham';";
		
		String script = "arguments[0].setAttribute('value' , 'shubham')";

		
		((JavascriptExecutor)driver).executeScript(script, element);
		
//		driver.quit();
		
		
	}
	
}
