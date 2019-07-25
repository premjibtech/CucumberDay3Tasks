package com.test.cucum;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OneDimMap {
	
	static WebDriver driver;

	@Given("User in telecom Homepage")
	public void user_in_telecom_Homepage() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\CucumberDemoProject\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/");
	    driver.manage().window().maximize();
	  	}

	@Given("user click on Add Customer button")
	public void user_click_on_Add_Customer_button() {
		WebElement addCustomerClick = driver.findElement(By.xpath("//a[text()='Add Customer']"));
		addCustomerClick.click();
	}

	@When("user need to fill all personal details")
	public void user_need_to_fill_all_personal_details(io.cucumber.datatable.DataTable cusDetails) {
		Map<String, String> cusMap = cusDetails.asMap(String.class, String.class);
		driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys(cusMap.get("Fname"));
		driver.findElement(By.id("lname")).sendKeys(cusMap.get("Lname"));
		driver.findElement(By.id("email")).sendKeys(cusMap.get("Email"));
		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys(cusMap.get("Address"));
		driver.findElement(By.id("telephoneno")).sendKeys(cusMap.get("Mobile"));
	}

	@When("user need to click on submit button")
	public void user_need_to_click_on_submit_button() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("user should see the customer ID is generated")
	public void user_should_see_the_customer_ID_is_generated() {
		Assert.assertTrue(driver.findElement(By.xpath("//td[@align='center']//h3")).isDisplayed());
		WebElement cusId = driver.findElement(By.xpath("//td[@align='center']//h3"));
		String text = cusId.getAttribute("value");
		System.out.println(text);
		driver.quit();
		
	}



}
