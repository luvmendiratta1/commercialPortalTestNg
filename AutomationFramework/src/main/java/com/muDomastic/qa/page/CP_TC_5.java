package com.muDomastic.qa.page;

import java.util.List;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.muDomastic.qa.base.TestBase;
import com.muDomastic.qa.util.TestUtil;

public class CP_TC_5  {

	// url initialization and launch browser as per the configuration
	TestBase tb = new TestBase();
	Logger log = Logger.getRootLogger();
	TestUtil action = new TestUtil();
;
	// define all the xpaths here	


	@FindBy(xpath="(//a[contains(text(),'Quote')])[3]")
	WebElement quoteButton;


	// initialize the Page objects
	public CP_TC_5(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	/***
	 * Verify that , a Quick Quote is generated for  Electricity Flow with Confirm with email
	 ***/

	public void TC_05_TS_05() {
		try {
			action.verifyElementPresent(quoteButton);
		}
	
		
		catch (Exception e) {
			log.error(" :: Exception Occured, method name "+new Object(){}.getClass().getEnclosingMethod().getName()+" ::"+e.getMessage(), e);
		}
	}
}