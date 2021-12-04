package com.leafTaps.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafTaps.pages.FindLeadPopPage;
import com.leafTaps.pages.LoginPage;
import com.leafTaps.testng.api.base.ProjectSpecificMethods;



public class TC007_MergeLead extends ProjectSpecificMethods {

	@BeforeTest
	public void setValues(){
		testCaseName = "TC007_MergeLead";
		testDescription = "Merge two Lead on LeafTaps";
		nodes = "Leads";
		dataSheetName = "TC007";
		category = "Regression";
		authors = "Hari";		
	}

	@Test(dataProvider = "fetchData")
	public void mergeLead(String uName, String pwd,String f_LeadName,String l_LeadName, String errorMsg){
		String fromLeadId = 
			new LoginPage(driver, node)
				.enterUserName(uName)
				.enterPassword(pwd)
				.clickLogin()
				.clickCRMSFA()
				.clickLeadLink()
				.clickMergeLead()
				.clickFromLeadLookup()
				.enterFirstName( f_LeadName)
				.clickFindleadsButton()
				.getFirstResultingLead();
			new FindLeadPopPage(driver, node)
				.clickResultingLeads()
				.clickToLeadLookup()
				.enterFirstName( l_LeadName)
				.clickFindleadsButton()
				.clickResultingLeads()
				.clickMergeButton()
				.clickFindLead()
				.enterLeadId(fromLeadId)
				.clickFindleadsButton()
				.verifyErrorMsg(errorMsg);

	}


}










