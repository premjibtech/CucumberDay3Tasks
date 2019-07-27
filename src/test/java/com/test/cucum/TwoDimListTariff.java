package com.test.cucum;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TwoDimListTariff {
	static WebDriver driver;
	@Given("user in telecom homeepage")
	public void user_in_telecom_homeepage() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\CucumberDemoProject\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/");
	    driver.manage().window().maximize();

	}

	@Given("need to click add Tarifff button")
	public void need_to_click_add_Tarifff_button() {
		WebElement Trariffclk = driver.findElement(By.xpath("//a[text()='Add Tariff Plan']"));
		  Trariffclk.click();
	    }

	@When("need to fill all the deetails")
	public void need_to_fill_all_the_deetails(io.cucumber.datatable.DataTable addTariff) {
			List<List<String>> data = addTariff.asLists(String.class);
			driver.findElement(By.xpath("//input[@id='rental1']")).sendKeys(data.get(0).get(0));
			driver.findElement(By.id("local_minutes")).sendKeys(data.get(1).get(1));
			driver.findElement(By.id("inter_minutes")).sendKeys(data.get(2).get(3));
			driver.findElement(By.id("sms_pack")).sendKeys(data.get(3).get(2));
			driver.findElement(By.id("minutes_charges")).sendKeys(data.get(2).get(4));
			driver.findElement(By.id("inter_charges")).sendKeys(data.get(1).get(5));
			driver.findElement(By.id("sms_charges")).sendKeys(data.get(3).get(6));
		
	}

	@When("need to clickk submit Button")
	public void need_to_clickk_submit_Button() {
	 driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	

	@Then("user should seee the successfully compeletion Page")
	public void user_should_seee_the_successfully_compeletion_Page() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='button']")).click();    
		}



}
