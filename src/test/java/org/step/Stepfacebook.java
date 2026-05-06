package org.step;

import org.sampless.New;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import reusemethod.FacebookLoginpage;

public class Stepfacebook extends New{
	
		@Given("Open chrome and launch the facebook page")
		public void open_chrome_and_launch_the_facebook_page() {
		    launchbrowser();
		    openbrownser("https://www.facebook.com/");
		}

		@Given("Maximixe the page")
		public void maximixe_the_page() {
		    Windowmaximize();  
			waitimplicit();
		}

		@When("Pass the value in emal and password field")
		public void pass_the_value_in_emal_and_password_field() {
			FacebookLoginpage fb = new FacebookLoginpage();
			jssendkeys(fb.getEmailElement(), "dftyui@hgmail.com");
			sendvalue(fb.getPasswordElement(), "DFGH%^&");
		}

		@When("Click the login button")
		public void click_the_login_button() {
			FacebookLoginpage fb = new FacebookLoginpage();
			clickbutton(fb.getLoginbuttonElement());
		}

		@Then("Close the browser")
		public void close_the_browser() {
			closetab();  
		}
}
