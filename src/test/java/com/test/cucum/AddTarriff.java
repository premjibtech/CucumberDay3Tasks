package com.test.cucum;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddTarriff {
	
	static WebDriver driver;

	@Given("click add tariff butTon")
	public void click_add_tariff_butTon() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\CucumberDemoProject\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/");
	    driver.manage().window().maximize();
	    WebElement Trariffclk = driver.findElement(By.xpath("//a[text()='Add Tariff Plan']"));
		  Trariffclk.click();
	    //throw new cucumber.api.PendingException();
	}

	@When("fill all the detaills")
	public void fill_all_the_detaills(io.cucumber.datatable.DataTable addTariff) {
		List<String> add = addTariff.asList(String.class);
		driver.findElement(By.xpath("//input[@id='rental1']")).sendKeys(add.get(0));
		driver.findElement(By.id("local_minutes")).sendKeys(add.get(1));
		driver.findElement(By.id("inter_minutes")).sendKeys(add.get(2));
		driver.findElement(By.id("sms_pack")).sendKeys(add.get(3));
		driver.findElement(By.id("minutes_charges")).sendKeys(add.get(4));
		driver.findElement(By.id("inter_charges")).sendKeys(add.get(5));
		driver.findElement(By.id("sms_charges")).sendKeys(add.get(6));
		
		//throw new cucumber.api.PendingException();
	}

	@When("click submit buttton")
	public void click_submit_buttton() {
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
		 }

	@Then("user should see the succcessfully compeletion page")
	public void user_should_see_the_succcessfully_compeletion_page() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='button']")).click();    
	}


}