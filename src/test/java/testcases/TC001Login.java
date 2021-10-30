package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import com.relevantcodes.extentreports.LogStatus;

import pages.HomePage;
import pages.LoginPage;

public class TC001Login extends BaseClass {
	
	HomePage hp;
	LoginPage lp;
	
	
	@Test
	public void verifyLogin() {
		//Below is for extent report
		test.log(LogStatus.INFO, "Login Test started");
		//Below is for log4j logs
		app_logs.info("verify login test started");
		hp = new HomePage(driver);
		test.log(LogStatus.INFO, "Clicked Signin button");
		hp.doClick();
		lp=new LoginPage(driver);
		test.log(LogStatus.INFO, "Entered Username and Password");
		lp.doLogin("username", "password");
		String actual = driver.getTitle();
		String expected="Zero -Account Summary";
		Assert.assertEquals(actual, expected);
		app_logs.info("verify login test completed");
		test.log(LogStatus.INFO, "verify Login Test completed");
		
				
	}
	
	
}
