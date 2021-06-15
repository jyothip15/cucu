package salesforce.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\test\\java\\salesforce\\features" ,monochrome= true, glue = "salesforce.stepdefinitions",
plugin = {"pretty","html:src\\test\\java\\Reports\\Samplereport.html",
		"json:src\\test\\java\\Reports\\Samplereport.json",
		"rerun:src\\test\\java\\Reports\\rerun.txt"} )
public class TestNgSuiteRunner extends AbstractTestNGCucumberTests{

}
