package SeleniumTests;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class Selenium_ExtentReport implements ITestListener {
	
	ExtentReports report;
	ExtentSparkReporter reporter;
	ExtentTest test;

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
		test = report.createTest(result.getName());
		test.log(Status.PASS, MarkupHelper.createLabel(result.getName() + " Passed ", ExtentColor.GREEN));
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		test = report.createTest(result.getName());
		test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " Failed ", ExtentColor.RED));
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		test = report.createTest(result.getName());
		test.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + " Skipped ", ExtentColor.YELLOW));
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
		reporter = new ExtentSparkReporter(".//resources/extentreport.html");
		report = new ExtentReports();
		report.attachReporter(reporter);
		
		reporter.config().setDocumentTitle("Dummy Testing");
		reporter.config().setTheme(Theme.DARK);
		
		report.setSystemInfo("Tester", "Shubham");
		report.setSystemInfo("OS", System.getProperty("os.name"));

		
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		report.flush();

	}
	
	
	

}
