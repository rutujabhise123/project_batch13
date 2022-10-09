package com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtendReportGenerator {
	
	//ExtentTest
	//ExtentReports
	//ExtentSparkReporter
	
	public static ExtentReports extent;
	
	public static ExtentReports getReports() {
		
		String reportspath="C:\\Users\\Rutuja Bhise\\eclipse-workspace\\Framework_Batch_13\\Reports\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(reportspath);
		reporter.config().setDocumentTitle("Automation Test Report");
		reporter.config().setReportName("Batch 13 Automation Test Reports");
		reporter.config().setTheme(Theme.DARK);
		
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(reporter);
		
		extent.setSystemInfo("Automation Tool","Selenium");
		extent.setSystemInfo("O.S", "Windows");
		extent.setSystemInfo("QA", "Rutuja");
        return extent;
		
		
	}

}
