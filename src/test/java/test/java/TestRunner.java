package test.java;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/addNewUser.feature", glue="com.lifecare",
tags="@wipp")//, format = {"pretty", "html:target/cucumber"})

public class TestRunner {

}
