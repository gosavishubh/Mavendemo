package extent_report_class;

import org.testng.ITestContext;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Maven_Wgroup.Maven_Wgroup.BaseTest;

public class ListenerClass extends BaseTest implements ITestListener
{
	
public static ExtentTest test;
	
	ExtentReports extent = ExtentReportGen.extentReportGenerator();

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("Test Started : "+result.getName());
		
		test = extent.createTest(result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("Test Case Passed : "+result.getName());
		
		test.log(Status.PASS, result.getName()+" Test Case Passed ");
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		System.out.println("Test Case Failed : "+result.getName());
		
		test.fail(result.getThrowable());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Case Skipped : "+result.getName());
		
		test.log(Status.SKIP, result.getName()+" Test Case is Skipped ");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result)
	{
		
	}

	@Override
	public void onStart(ITestContext context) 
	{
		System.out.println("Test Started : "+context.getName());
		
	}

	@Override
	public void onFinish(ITestContext context) 
	{
        System.out.println("Test Finished : "+context.getName());
		
		extent.flush();
	}

	
	

	
	
	
	
	

}
