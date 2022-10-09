package com.Test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Utility.BaseClass;
import com.Utility.Library;
import com.pages.LoginPom;

public class Test_1 extends BaseClass{
	@Test
	public void Verify_Test1() {
		
		LoginPom login=PageFactory.initElements(driver,LoginPom.class);
		
		//Test Case Steps
		
		Library.isElementenabled(login.getTxt_email(),excel.getStrinData("sheet1",0,0));
		Library.isElementenabled(login.getTxt_email(),excel.getStrinData("sheet1",0,1));
        login.getBtn_login().click();
        
        //excellreader
        
       // Library.custom_sendkeys(login.getTxt_email(),excel.getStrinData("sheet1", 0, 0));
       // Library.custom_sendkeys(login.getTxt_password(),excel.getStrinData("sheet1", 0, 1));
       // Library.custom_click(login.getBtn_login());
        
        //to handle dropdown
       // Library.Handle_DropDown(null, null);
        
        //mouseHover
       // Library.MouseHover_Click_onElement(driver, null);
        
        //scroll
        //Library.scroll_toElement(driver, null);
        
		//Verify
        
		String ExpectedTitle="FaceBook";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle, ExpectedTitle);
	}

}
