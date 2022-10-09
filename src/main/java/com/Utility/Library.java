package com.Utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;

public class Library {
	
	public static ExtentTest test;
	
	//generic method for isElementenabled
	public static void isElementenabled(WebElement element,String value) {
		
		boolean value1=element.isEnabled();
		if(value1==true) {
			element.sendKeys(value);
		}
	}
	//Sendkeys generic method
	public static void custom_sendkeys(WebElement element,String value) {
		try {
		element.sendKeys(value);
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}

}
	//click generic method
	public static void custom_click(WebElement element) {
		try {
			element.click();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	//Scroll element method
	public static void scroo_toElement(WebDriver driver,WebElement element) {
		try {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()",element);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	//DropDown
	public static void Handle_DropDown(WebElement element,String value) {
		try {
		Select sel=new Select(element);
		sel.selectByVisibleText(value);
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
}
	//mouseHover
	public static void MouseHover_Click_onElement(WebDriver driver,WebElement element) {
		try {
		Actions act=new Actions(driver);
		act.moveToElement(element).click().build().perform();
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
		
	}
	//
}
