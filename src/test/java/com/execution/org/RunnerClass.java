package com.execution.org;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Ajay\\eclipse-workspace2\\FacebookLoginPage\\src\\FeatureFile",
					glue="com.stepDefinition.com", monochrome=true, plugin= {"html:reports/LoginPage.html", "json:reports/Login.json"})



public class RunnerClass {
	
}
