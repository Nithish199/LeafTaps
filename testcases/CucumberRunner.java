package com.leafTaps.testcases;

import com.leafTaps.testng.api.base.ProjectSpecificMethods;

import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features="src/main/java/features", glue="com.leafTaps.pages", monochrome=true)
public class CucumberRunner extends ProjectSpecificMethods {

}
