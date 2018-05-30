package com.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature/Test.feature"
		,glue={"com.cucumber"},
		tags= {"@tag1"}
		)
 

public class TestRunner {

}
