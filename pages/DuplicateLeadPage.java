package com.leafTaps.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.leafTaps.testng.api.base.ProjectSpecificMethods;



public class DuplicateLeadPage extends ProjectSpecificMethods {


	public DuplicateLeadPage(RemoteWebDriver driver, ExtentTest node){
		this.driver = driver;
		this.node = node;
			
	}


	
	public ViewLeadPage clickCreateLeadDublicate(){
		click(locateElement("class","smallSubmit"));
		return new ViewLeadPage(driver, node);
	}
}
