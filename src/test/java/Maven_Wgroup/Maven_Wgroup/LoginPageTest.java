package Maven_Wgroup.Maven_Wgroup;


import org.testng.annotations.Test;


import extent_report_class.ListenerClass;

//import extent_report_class.ListenerClass;

public class LoginPageTest extends ListenerClass
{
	
	@Test(priority = 1)
	public void checkCredentials()
	{
		
		lp.enterCredentials();
		
	}
	
	@Test(priority = 2)
	public void checkLoginButton()
	{
		
		lp.clickOnLogin();
		
		
	}

}

