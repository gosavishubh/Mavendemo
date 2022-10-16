package Maven_Wgroup.Maven_Wgroup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import io.github.bonigarcia.wdm.WebDriverManager;
public class BaseTest
{
	
	public static WebDriver driver;
	
	public LoginPage lp;
	
	
	@BeforeSuite
	public void initBrowser()
	{
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--start-maximized");
		
		driver = new ChromeDriver(options);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	}

	
	
	@BeforeClass
	public void objectCreation()
	{
		
		lp = new LoginPage(driver);
		
		
	}
	
	

}