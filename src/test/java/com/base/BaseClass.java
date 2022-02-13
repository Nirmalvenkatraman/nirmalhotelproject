package com.base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		

	}
	public void launchUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		
	}
	public String getCurrentUrl() {
		String url = driver.getCurrentUrl();
		return url;

	}
	public void type(WebElement e,String data) {
		e.sendKeys(data);

	}
	public void click(WebElement e) {
		e.click();
	}
	public void selectVisibleTextDropDown(WebElement e,String data) {
		Select s=new Select(e);
		s.selectByVisibleText(data);
		
	}
	public String getAttribute(WebElement e,String data) {
		String a = e.getAttribute(data);
		return a;
	}

	public String getText(WebElement e) {
		String text = e.getText();
		return text;

	}
	public void browserQuit() {
		driver.quit();
	}
}
