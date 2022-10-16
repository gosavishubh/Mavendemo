package Maven_Wgroup.Maven_Wgroup;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	
	public WebDriver driver;
	
	@FindBy(xpath = "//*[@name='username']")
	public WebElement username;
	
	@FindBy(xpath = "//*[@name='password']")
	public WebElement password;
	
	@FindBy(xpath = "//*[@type='submit']")
	public WebElement login_button;

	
	public LoginPage(WebDriver driver)
	{
		
		this.driver = driver;
		
		PageFactory.initElements(driver,this);
		
	}

	
	public void enterCredentials()
	{
		
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		username.sendKeys("Admin");
		
		password.sendKeys("admin123");
		
	}
	
	
	public void clickOnLogin() 
	{
	
		login_button.click();
		
	}


}
