package com.lifecare;

import junit.framework.TestCase;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberSteps extends TestCase {

	VisitPojo visit = new VisitPojo();
	String actionButton;

	@Given("^Patient has entered correct data$")
	public void inputData() throws Throwable {
		// Express the Regexp above with the code you wish you had
		// throw new PendingException();
		visit.setdName("xyx");
		visit.setFileName("Abc.jpg");
		visit.setvDate("15/05/2016");
	}

	@When("^click on \"([^\"]*)\"$")
	public void click_on(String arg1) throws Throwable {
		// Express the Regexp above with the code you wish you had
		// throw new PendingException();
		actionButton = arg1;
	}

	@Then("^System should display \"([^\"]*)\"$")
	public void System_should_display(String arg1) throws Throwable {
		// Express the Regexp above with the code you wish you had
		// throw new PendingException();
		VisitBLL obj = new VisitBLL();
		if (actionButton.equals("Submit")) {
			assertEquals(arg1, obj.SaveData(visit));
		} else if (actionButton.equals("Reset")) {
			assertTrue(obj.ResetValue(visit));
		}
	}

	@Given("^patient is logged In$")
	public void patient_is_logged_In() throws Throwable {
		// Express the Regexp above with the code you wish you had
		throw new PendingException();
	}

	@Given("^\"([^\"]*)\" has entered doc name \"([^\"]*)\", Date as \"([^\"]*)\", time as \"([^\"]*)\" and file name is \"([^\"]*)\"$")
	public void has_entered_doc_name_Date_as_time_as_and_file_name_is(
			String arg1, String arg2, String arg3, String arg4, String arg5)
			throws Throwable {
		// Express the Regexp above with the code you wish you had
		throw new PendingException();
	}

}
