package com.stepdefinition;


import java.util.concurrent.TimeUnit;

import com.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;





public class HooksClass extends BaseClass {
	
	@Before
	public void beforeExecution() {
		launchBrowser();
		launchUrl("http://adactinhotelapp.com/");
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		

	}
	@After
	public void afterExecution() {
		browserQuit();
		
	}

}
