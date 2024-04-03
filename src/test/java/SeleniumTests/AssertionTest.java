package SeleniumTests;

import org.junit.Assert;
import org.testng.annotations.Test;

public class AssertionTest {

	String actual = "shubham";
	String expected = "shubham";

	@Test(priority = 0)
	public void testone() {
		System.out.println("Test one");
		

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
