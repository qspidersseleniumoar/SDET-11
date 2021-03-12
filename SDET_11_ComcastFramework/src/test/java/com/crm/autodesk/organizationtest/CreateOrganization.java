package com.crm.autodesk.organizationtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.comcast.genericlib.BaseClass;
import com.crm.comcast.objectrepositoryutility.CreateNewOrganization;
import com.crm.comcast.objectrepositoryutility.Home;
import com.crm.comcast.objectrepositoryutility.Login;
import com.crm.comcast.objectrepositoryutility.OrganizationInfo;
import com.crm.comcast.objectrepositoryutility.Organizations;

/**
 * 
 * @author Deepak
 *
 */
@Listeners(com.crm.comcast.genericlib.ListenerIMP.class)
public class CreateOrganization extends BaseClass{

	@Test(groups = "smokeTest")
	public void createOrgtest() throws Throwable {

		
	 /*read test script data */ 
	 String orgNAme = elib.getExcelData("Org", 1, 2)+ jLib.generateRandomNum();

	 /*step 2 : navigate to to contacts*/ 
	  Home hp = new Home(driver);
	  hp.getOrgLnk().click();
	  
	  /*step 3 : navigate to to ORG*/ 
	  Organizations op = new Organizations(driver);
	  op.getCreateOrgImg().click();
	  
	  /*step 3 : create Org*/
	  CreateNewOrganization cno = new CreateNewOrganization(driver);
	  cno.creatOrganization(orgNAme);
	  //verify
	  OrganizationInfo oip = new OrganizationInfo(driver);
	  Assert.assertTrue(oip.getSuccessFullMsg().getText().contains(orgNAme));
		
	}

	@Test(groups = "regressionTest")
	public void createOrgtestWithIndustriesType() throws Throwable {

		
	 /*read test script data */ 
	 String orgNAme = elib.getExcelData("Org", 4, 2)+ jLib.generateRandomNum();
	 String type = elib.getExcelData("Org", 4, 3);

	 /*step 2 : navigate to to contacts*/ 
	  Home hp = new Home(driver);
	  hp.getOrgLnk().click();
	  
	  /*step 3 : navigate to to ORG*/ 
	  Organizations op = new Organizations(driver);
	  op.getCreateOrgImg().click();
	  
	  /*step 3 : create Org*/
	  CreateNewOrganization cno = new CreateNewOrganization(driver);
	  cno.creatOrganization(orgNAme, type);
	  //verify
	  OrganizationInfo oip = new OrganizationInfo(driver);
	  Assert.assertTrue(oip.getSuccessFullMsg().getText().contains(orgNAme));
		
	}


}

