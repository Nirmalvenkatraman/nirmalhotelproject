package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features",glue="com.stepdefinition",dryRun=false,
plugin={"junit:src\\test\\resources\\AdactinHotelReport\\sample.xml","html:src\\test\\resources\\AdactinHotelReport",
		"json:src\\test\\resources\\AdactinHotelReport\\adactin.json"})
public class TestRunner {
	@AfterClass
	public static void afterClass() {
		JvmReport.generateJvmReport(System.getProperty("user.dir")+"\\src\\test\\resources\\AdactinHotelReport\\adactin.json");

	}

}
