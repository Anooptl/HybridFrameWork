package com.allianz.test;

import org.testng.annotations.Test;

public class LoginUITest {
	
	@Test (priority = 1, invocationCount = 2)
	public void titleTest()
	{
		
	System.out.println("titleTest");	
		
	}
	
	@Test (priority = 2) 
	
	public void discriptionTest()
	{
		System.out.println("discriptionTest");
		
	}

}
