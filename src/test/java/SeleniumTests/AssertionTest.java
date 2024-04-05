package SeleniumTests;

import org.junit.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionTest {

	String actual = "shubham";
	String expected = "shu7bham";
	
	SoftAssert sa = new SoftAssert();

	@Test(priority = 0)
	public void testone() {
		System.out.println("Test one");
		
		Assert.assertEquals(expected, actual);
		sa.assertAll();
		

	}

	@Test(priority = -1)
	public void testtwo() {
		System.out.println("Test second");

	}
	@Test
	public void testthree() {
		System.out.println("Test second");

	}
	@Test(priority = 1)
	public void testfour() {
		System.out.println("Test second");

	}
	@Test
	public void testfive() {
		System.out.println("Test second");

	}
}
