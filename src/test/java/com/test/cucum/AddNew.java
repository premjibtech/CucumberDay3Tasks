package com.test.cucum;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddNew {
	
	static WebDriver driver; 

	@Given("user in telecom home page")
	public void user_in_telecom_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\CucumberDemoProject\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/");
	    driver.manage().window().maximize();
	}

	@Given("user to click add customer button")
	public void user_to_click_add_customer_button() {
	    driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
			}

	@When("filling the personal details")
	public void filling_the_personal_details() {
	    driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.id("fname")).sendKeys("prem");
		driver.findElement(By.id("lname")).sendKeys("k");
		driver.findElement(By.id("email")).sendKeys("prem@gmail.com");
		driver.findElement(By.name("addr")).sendKeys("chennai");
		driver.findElement(By.id("telephoneno")).sendKeys("2345689634");
		}

	@When("press submit button")
	public void press_submit_button() {
	    	driver.findElement(By.xpath("//input[@type='submit']")).click();
	    }

	@Then("user should see the customer id")
	public void user_should_see_the_customer_id() {
	    //Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]"))).isDisplayed();
	    Assert.assertTrue(driver.findElement(By.xpath("//td[@align='center']//h3")).isDisplayed());
	}

	
	
}
