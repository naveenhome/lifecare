package com.lifecare;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestWorldpay {
	private WebDriver driver;
	private String baseUrl;

	@Test
	public void testWorldpay() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "http://localhost:3000/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get(baseUrl + "/users");
		driver.findElement(By.linkText("New User")).click();
		driver.findElement(By.id("user_first_name")).clear();
		driver.findElement(By.id("user_first_name")).sendKeys("Worldpay");
		driver.findElement(By.id("user_last_name")).clear();
		driver.findElement(By.id("user_last_name")).sendKeys("Test");
		driver.findElement(By.id("user_email")).clear();
		driver.findElement(By.id("user_email")).sendKeys("test@test.com");
		driver.findElement(By.name("commit")).click();
		driver.findElement(By.name("commit")).click();
	}

}
