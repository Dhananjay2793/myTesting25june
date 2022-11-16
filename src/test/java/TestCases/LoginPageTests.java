package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class LoginPageTests extends TestBase{
	
	
	@BeforeMethod
	
	public void setupp() 
	{
		initialization();
		login	=	new	LoginPage();
	}
	//Test	case	to	verify	the	login	and	label
	
	@Test
	public void verifyTitle() 
	{
		
	} 
	
	
	@AfterMethod
	public void closeBrowser() 
	{
      driver.close();
	}

}
