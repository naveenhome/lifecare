package test.java;

import java.util.concurrent.TimeUnit;

import junit.framework.TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserSteps extends TestCase{
	private WebDriver driver;
	private String baseUrl;
	
	@Given("^user click on \"([^\"]*)\" on home page$")
	public void user_click_on_on_home_page(String arg1) throws Throwable {
	    driver = new FirefoxDriver();
		baseUrl = "http://localhost:3000/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseUrl + "/users");
		driver.findElement(By.linkText("New User")).click();
	}

	@Given("^Enter \"([^\"]*)\" as first Name, \"([^\"]*)\" as Last name and \"([^\"]*)\" as email$")
	public void Enter_as_first_Name_as_Last_name_and_as_email(String arg1, String arg2, String arg3) throws Throwable {
		driver.findElement(By.id("user_first_name")).clear();
		driver.findElement(By.id("user_first_name")).sendKeys(arg1);
		driver.findElement(By.id("user_last_name")).clear();
		driver.findElement(By.id("user_last_name")).sendKeys(arg2);
		driver.findElement(By.id("user_email")).clear();
		driver.findElement(By.id("user_email")).sendKeys(arg3);
	}

	@When("^click on button \"([^\"]*)\"$")
	public void click_on_button(String arg1) throws Throwable {
		driver.findElement(By.name("commit")).click();
	}

	@Then("^System display message on top \"([^\"]*)\"$")
	public void System_display_message_on_top(String arg1) throws Throwable {
	    String result = driver.findElement(By.xpath(".//*[@id='notice']")).getText();
	    assertEquals(arg1, result);
	    driver.close();
	    
	}


}
