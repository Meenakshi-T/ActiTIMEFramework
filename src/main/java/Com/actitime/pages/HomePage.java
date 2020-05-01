package Com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	@FindBy(xpath="//div[text()='Tasks']") private WebElement Tasks;
	@FindBy (xpath="//div[text()='Reports']") private WebElement Reports;
	@FindBy (xpath="//div[text()='Users']") private WebElement Users;
	@FindBy (xpath="//a[text()='Logout']") private WebElement Logout;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnTasks()
	{
		Tasks.click();
	}
	public void clickOnReports()
	{
		Reports.click();
	}
	public void clickOnUsers()
	{
		Users.click();
	}
	public void logout()
	{
		Logout.click();
	}
	

}
