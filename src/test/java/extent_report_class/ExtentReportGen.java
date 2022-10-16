package extent_report_class;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGen 
{
	
	
	static ExtentReports extent;
	
	
	public static ExtentReports extentReportGenerator()
	{
		
		
		String path = System.getProperty("user.dir") + "//ExtentReport//Maven_Demo_Report.html";
		
		
		ExtentHtmlReporter reporter=new ExtentHtmlReporter(path);
		
		reporter.config().setTheme(Theme.STANDARD);
		
		reporter.config().setReportName("Maven_Demo_Report");
		
		extent = new ExtentReports();
		
		extent.attachReporter(reporter);
		
		extent.setSystemInfo("Project Name : ", "Maven_Demo");

		extent.setSystemInfo("Environment : ", "SIT");
		
		extent.setSystemInfo("Created By ", "Group W");
		
		return extent;
		
	}
	
	
	

}