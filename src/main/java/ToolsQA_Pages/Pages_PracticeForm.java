package ToolsQA_Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pages_PracticeForm {

	private WebDriver driver;
	
	public Pages_PracticeForm(WebDriver driver)
	{
		this.driver = driver;
	}
	
	private By FirstName = By.id("firstName");
	private By LastName = By.xpath("//input[@id='lastName']");

	public void Pop (String FirstName, String LastName)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(this.FirstName));
		
		driver.findElement(this.FirstName).clear();
		driver.findElement(this.FirstName).sendKeys(FirstName);
		
		driver.findElement(this.LastName).clear();
		driver.findElement(this.LastName).sendKeys(LastName);

	}
	
}
