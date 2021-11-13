package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import com.relevantcodes.extentreports.LogStatus;

import pages.HomePage;
import pages.LoginPage;

public class TC001Login extends BaseClass {

	
	
	@Test
	public void verifyLogin() {
	
		test.log(LogStatus.INFO, "verifyLogin Test started");
		app_logs.info("verifuLogin test started");
		HomePage hp = new HomePage(driver);
		
		hp.doClickSingInbtn();
		
		LoginPage lp=new LoginPage(driver);
		
		lp.doLogin("username", "password");
		
		String actual = driver.getTitle();
		String expected="Zero -Account Summary";
		
		Assert.assertEquals(actual, expected);
		
		
				
	}
	
	
}
