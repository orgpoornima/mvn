package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.BeforeTest;

public class CustomerModule
	{
	@BeforeTest
	public void openBrowser()
	{
		Reporter.log("open Browser",true);
	}
	

}
