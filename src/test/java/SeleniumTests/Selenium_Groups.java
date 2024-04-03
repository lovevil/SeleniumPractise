package SeleniumTests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.SkipException;
import org.testng.annotations.Test;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Selenium_Groups {
	
	WebDriver driver;
	
	@Test(groups = "regression")
	public void testRegression() {
		
		System.out.println("This is regression test");
		
	}
	
	@Test(groups = "sanity")
	public void testSanity() {
//		Assert.assertTrue(false);
		System.out.println("This is sanity test");
		
	}
	
	@Test(groups = "smoke")
	public void testSmoke() {
		
		System.out.println("This is smoke test");
		throw new SkipException("manually skipped");
		
	}
	
	@Test(groups = {"regression" , "sanity"} , dependsOnMethods = {"testRegression"})
	public void testRegression_Sanity() {
		
		System.out.println("This is regression and sanity test");
		
	}
	
	@Test(groups = {"regression" , "smoke"})
	public void testRegression_Smoke() {
		
		System.out.println("This is regression and smoke test");
		
	}
	
	@Test(groups = {"smoke" , "sanity"})
	public void testSmoke_Sanity() {
		
		System.out.println("This is smoke and sanity test");
		
	}
	
	@Test(groups = {"regression" , "smoke" , "sanity"})
	public void testRegression_Smoke_Sanity() {
		
		System.out.println("This is regression and smoke and sanity test");
		
	}

}
