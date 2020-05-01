package Com.actitime.testscripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Com.actitime.commonutils.WebDriverUtils;
import Com.actitime.configuration.commonsetup;
import Com.actitime.pages.CreateCustomerPage;
import Com.actitime.pages.HomePage;
import Com.actitime.pages.TaskPage;

public class CreateCustomerTest extends commonsetup

{
	WebDriverUtils wt=new WebDriverUtils();

	@Test
	public void createcustmer() throws InterruptedException, EncryptedDocumentException, FileNotFoundException, IOException
	{
		
		HomePage hp=new HomePage(driver);
		Thread.sleep(3000);
		hp.clickOnTasks();
		TaskPage tp=new TaskPage(driver);
		Thread.sleep(3000);
		tp.createcustomer();
		CreateCustomerPage cp = new CreateCustomerPage(driver);
		String custname=wt.readtestdata("./src/test/resources/testcase/customerdata.xlsx","Sheet1", 3, 0);
		cp.createNewCustomer(custname);
		Thread.sleep(3000);
		
	}
	
	@Test
	public void createCustomerWithNameAndDescription() throws EncryptedDocumentException, FileNotFoundException, IOException, InterruptedException
		{
			
			HomePage hp=new HomePage(driver);
			Thread.sleep(3000);
			hp.clickOnTasks();
			TaskPage tp=new TaskPage(driver);
			Thread.sleep(3000);
			tp.createcustomer();
			CreateCustomerPage cp=new CreateCustomerPage(driver);
			Thread.sleep(3000);
			String custname=wt.readtestdata("./src/test/resources/testcase/customerdata.xlsx", "Sheet1", 2, 0);
			String desc=wt.readtestdata("./src/test/resources/testcase/customerdata.xlsx", "Sheet1", 2, 1);
			cp.createNewCustomer(custname, desc);
			Thread.sleep(3000);
		}
			
			
			
			
			
		
	}



