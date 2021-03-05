package com.crm.autodesk.organizationtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.comcast.objectrepositoryutility.Login;

/**
 * 
 * @author Deepak
 *
 */
public class CreateOrganization {

	@Test
	public void createOrgtest() throws Throwable {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:8888");
		
		Login lp = new Login(driver);

		      lp.loginToAPP("admin", "admin");
		   
		
	}




}

