package com.cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login {
	public WebDriver driver;
	
	@Before
	public void start()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\naman\\Downloads\\geckodriver.exe"); 
		//System.setProperty("webdriver.Chrome.driver", "C:\\Users\\naman\\Downloads\\chromedriver.exe"); 
		
		//System.setProperty("webdriver.gecko.driver", "D:\\\\ToolsQA\\trunk\\Library\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		//WebDriver driver = new ChromeDriver();
		System.out.println("started");
		driver.get("https://www.flipkart.com/");
	}
	@Given("^I want to write a step with precondition$")
	public void i_want_to_write_a_step_with_precondition() {
		System.out.println("i_want_to_write_a_step_with_precondition");
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@And("^some other precondition$")
	public void some_other_precondition()  {
		System.out.println("some_other_precondition");
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("^I complete action$")
	public void i_complete_action()  {
		System.out.println("i_complete_action");
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@And("^some other action$")
	public void some_other_action()  {
		System.out.println(" some_other_action");
	    // Write code here that turns the phrase above into concrete actions
	  
	}

	@And("^yet another action$")
	public void yet_another_action() {
		System.out.println("yet_another_action");
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^I validate the outcomes$")
	public void i_validate_the_outcomes()  {
		System.out.println("i_validate_the_outcomes");
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@And("^check more outcomes$")
	public void check_more_outcomes()  {
		System.out.println(" check_more_outcomes");
	    // Write code here that turns the phrase above into concrete actions
	   
	}
	
	@After
	public void end()
	{
		System.out.println("end");
	}

}
