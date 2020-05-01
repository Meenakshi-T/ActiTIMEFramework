package Com.actitime.testscripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import Com.actitime.commonutils.WebDriverUtils;
import Com.actitime.configuration.commonsetup;
import Com.actitime.pages.LoginPage;


public class LoginTest extends commonsetup
{
	@Test
	public void loginTest() throws IOException, InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get(url);
		LoginPage lp =new LoginPage(driver);
		WebDriverUtils utils=new WebDriverUtils();
		String user=utils.getDataFromProperties("username");
		String pass=utils.getDataFromProperties("password");
		lp.loginOperation(user, pass);
		Thread.sleep(5000);
		
		
		
		
	}

}
