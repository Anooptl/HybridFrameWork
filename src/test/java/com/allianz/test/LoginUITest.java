package com.allianz.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.allianz.base.AutomationWrapper;

public class LoginUITest extends AutomationWrapper {
	
	
	
	@Test (priority = 1, invocationCount = 2)
	public void titleTest()
	{
		
		String ActualTitle = driver.getTitle();
	System.out.println(ActualTitle) ;	
		
	}
	
	@Test (priority = 2) 
	
	public void discriptionTest()
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.openemr.io/b/openemr/index.php");
		String ActualTitle = driver.getTitle();
	System.out.println(ActualTitle) ;	
		
	}

}
