package com.leafTaps.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.leafTaps.testng.api.base.ProjectSpecificMethods;




public class MyHomePage extends ProjectSpecificMethods {

	public MyHomePage(RemoteWebDriver driver, ExtentTest node){
		this.driver = driver;
		this.node = node;
				
	}
//click leads
	public MyLeadsPage clickLeadLink(){
		click(locateElement("link","Leads"));
		return new MyLeadsPage(driver, node);
	}


}
