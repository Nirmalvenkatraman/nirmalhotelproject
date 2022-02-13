package com.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	public static void generateJvmReport(String jsonFile) {
	//mention report location
		File f =new File(System.getProperty("user.dir")+"\\src\\test\\resources\\AdactinHotelReport");
	//Set configuration
		Configuration con =new Configuration(f, "adactin hotel WebApplication");
	//add classification
		con.addClassifications("Platform name","Windows");
		con.addClassifications("platform version","10");
		con.addClassifications("Sprint no", "50");
		con.addClassifications("Build no", "FcW12365");
		con.addClassifications("UserStory no", "TC_007");
		
	List<String>jsonFiles=new ArrayList<String>();
	jsonFiles.add(jsonFile);
	
	//generate report
		ReportBuilder rb =new ReportBuilder(jsonFiles, con);
		rb.generateReports();

	}

}
