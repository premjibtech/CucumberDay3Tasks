package com.test.cucum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddTariffScenarioOutline {
	
	static WebDriver driver;

	@Given("user in telecom homepage")
	public void user_in_telecom_homepage() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\CucumberDemoProject\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/");
	    driver.manage().window().maximize();
	    WebElement Trariffclk = driver.findElement(By.xpath("//a[text()='Add Tariff Plan']"));
		  Trariffclk.click();

	    	}

	@Given("need to click add Tariff button")
	public void need_to_click_add_Tariff_button() {
		WebElement Trariffclk = driver.findElement(By.xpath("//a[text()='Add Tariff Plan']"));
		  Trariffclk.click();
	    	}

	@When("need to fill all the details{string},{string},{string},{string},{string},{string},{string}")
	public void need_to_fill_all_the_details(String s1, String s2, String s3, String s4, String s5, String s6, String s7) {
		driver.findElement(By.xpath("//input[@id='rental1']")).sendKeys(s1);
		driver.findElement(By.id("local_minutes")).sendKeys(s2);
		driver.findElement(By.id("inter_minutes")).sendKeys(s3);
		driver.findElement(By.id("sms_pack")).sendKeys(s4);
		driver.findElement(By.id("minutes_charges")).sendKeys(s5);
		driver.findElement(By.id("inter_charges")).sendKeys(s6);
		driver.findElement(By.id("sms_charges")).sendKeys(s7);
		
	}

	@When("need to click submit Button")
	public void need_to_click_submit_Button() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();

	    	}

	@Then("user should see the successfully compeletion Page")
	public void user_should_see_the_successfully_compeletion_Page() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='button']")).click();
		driver.quit();	
	
	}

	
}
