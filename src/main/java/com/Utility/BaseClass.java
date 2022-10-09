package com.Utility;

import java.time.Duration;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	//Browser open
	
	public static WebDriver driver;
	public static ExcelDataProvider excel;
	public static ConfigDataProvider config;
	
	@Parameters({"BrowserName"})
    @BeforeSuite
    public void BS_initialization() throws Exception {
		
		 excel=new ExcelDataProvider();
		 config=new ConfigDataProvider();

	}
	@BeforeMethod
	public static void BrowserOpen(String BrowserName ) {
		
		if(BrowserName.equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();
		    driver=new ChromeDriver();
		    
		}
		
		else if(BrowserName.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
		    driver=new EdgeDriver();
		}
		
		else if(BrowserName.equalsIgnoreCase("FireFox")) {
			WebDriverManager.firefoxdriver().setup();
		    driver=new FirefoxDriver();
		}
		
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.get(config.getBaseUrl());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
		
	@AfterMethod
	public void tearDown() {
		
			driver.quit();
	
		}
	}


