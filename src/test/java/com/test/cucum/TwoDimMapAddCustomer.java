package com.test.cucum;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TwoDimMapAddCustomer {

	static WebDriver driver;

	
	@Given("User to telecom Homepage")
	public void user_to_telecom_Homepage() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\CucumberDemoProject\\driver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("http://demo.guru99.com/telecom/");
		    driver.manage().window().maximize();
	}

	@Given("user to click on Add Customer button")
	public void user_to_click_on_Add_Customer_button() {
		WebElement addCustomerClick = driver.findElement(By.xpath("//a[text()='Add Customer']"));
		addCustomerClick.click();
}

	@When("user to fill all personal details")
	public void user_to_fill_all_personal_details(io.cucumber.datatable.DataTable addcus) {
		List<Map<String,String>> add = addcus.asMaps(String.class,String.class);
		driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys(add.get(0).get("Fname"));
		driver.findElement(By.id("lname")).sendKeys(add.get(0).get("Lname"));
		driver.findElement(By.id("email")).sendKeys(add.get(1).get("Email"));
		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys(add.get(0).get("Address"));
		driver.findElement(By.id("telephoneno")).sendKeys(add.get(2).get("Mobile"));
		}

	@When("user to click on submit button")
	public void user_to_click_on_submit_button() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
  }

	@Then("user to see the customer ID is generated")
	public void user_to_see_the_customer_ID_is_generated() {
		Assert.assertTrue(driver.findElement(By.xpath("//td[@align='center']//h3")).isDisplayed());
		WebElement custId = driver.findElement(By.xpath("//td[@align='center']//h3"));
		String text = custId.getAttribute("value");
		System.out.println(text);
    	}


}
