package Com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage 
{
	@FindBy(xpath="//div[text()='Add New']") private WebElement addnewbtn;
	@FindBy(xpath="//div[text()='+ New Customer']") private WebElement newcustomer;
	@FindBy(xpath="//div[text()='+ New Project']") private WebElement newproject;
	@FindBy(xpath="//div[text()='+ New Tasks']") private WebElement newtasks;
	@FindBy(xpath="//div[text()='Import Tasks from CSV']") private WebElement importtask;
	
	public TaskPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void createcustomer()
	{
		addnewbtn.click();
		newcustomer.click();
	}
	
	public void createproject()
	{
		addnewbtn.click();
		newproject.click();
	}
	
	
	public void createtasks()
	{
		addnewbtn.click();
		newtasks.click();
	}

	public void createimporttask()
	{
		addnewbtn.click();
		importtask.click();
	}
		
}
