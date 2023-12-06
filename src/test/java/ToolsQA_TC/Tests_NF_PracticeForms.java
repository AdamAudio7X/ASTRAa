package ToolsQA_TC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import ToolsQA_Pages.Pages_PracticeForm;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Tests_NF_PracticeForms {


	@Test()
	public void Test_PracticeForm_01()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\webdrivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("https://demoqa.com/automation-practice-form");
		
		Pages_PracticeForm practiceForm = new Pages_PracticeForm(driver);
		practiceForm.Pop("Bob", "Bell");
	}
	
	
	@Test()
	public void Test_PracticeForm_02()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\webdrivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://demoqa.com/automation-practice-form");
		
		Pages_PracticeForm practiceForm = new Pages_PracticeForm(driver);
		practiceForm.Pop("Peter", "Klim");
	}
	
	@Test
	public void Test_PracticeForm_03()
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		Pages_PracticeForm practiceForm = new Pages_PracticeForm(driver);
		practiceForm.Pop("Mark", "Klim");
	}
}
