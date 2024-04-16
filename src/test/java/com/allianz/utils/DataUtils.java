package com.allianz.utils;

import org.testng.annotations.DataProvider;

public class DataUtils {
	
	@DataProvider
	 public Object[][] validLoginData()
	 
	 {
		Object[][] data =new Object[2][3];
		
		data[0][0] = "Admin";
		data[0][1] = "admin123";
		data[0][2] = "Dashboard";
		
		data[1][0] = "Saul";
		data[1][1] = "Saul123";
		data[1][2] = "Invalid credentials";
		
				
		return data;
		
	 }	

	@DataProvider
	 public Object[][] invalidLoginData()
	 
	 {
		Object[][] data =new Object[2][3];
		
		data[0][0] = "John";
		data[0][1] = "John123";
		data[0][2] = "Invalid credentials";
		
		data[1][0] = "Saul";
		data[1][1] = "Saul123";
		data[1][2] = "Invalid credentials";
		
				
		return data;
		
	 }	


}
