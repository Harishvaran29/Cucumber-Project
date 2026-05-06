package org.step;

import org.sampless.New;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import reusemethod.Amazonloginpage;

public class StepDefinition extends New{

	@Given("Open the chrome and openn the Amazon home page")
	public void open_the_chrome_and_openn_the_Amazon_home_page() {
	    launchbrowser();
	    openbrownser("https://www.amazon.in/ref=nav_logo");
	    implicitwait();
	}

	@Given("Maximize the page")
	public void maximize_the_page() {
	    Windowmaximize();
	}

	@When("Enter the email in email field")
	public void enter_the_email_in_email_field() {
		Amazonloginpage ai = new Amazonloginpage();
		clickbutton(ai.getSigninElement());
		sendvalue(ai.getEmailfieldElement(), "harishvaran@gmail.com");
		clickbutton(ai.getContinuebuttonElement());
	}

	@Then("Close the chrome browser")
	public void close_the_chrome_browser() {
	    closepage();
	}
	


}
