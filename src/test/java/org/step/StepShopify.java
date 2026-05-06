package org.step;

import org.sampless.New;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepShopify extends New{
	

@Given("Open chrome and launch url")
public void open_chrome_and_launch_url() {
    launchbrowser();
    openbrownser("https://www.shopify.com/in/blog/best-ecommerce-sites");
}

@Given("Maximize the page and add waits")
public void maximize_the_page_and_add_waits() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@When("Click the login in shopify site")
public void click_the_login_in_shopify_site() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@When("Pass the email and click the login")
public void pass_the_email_and_click_the_login() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

}
