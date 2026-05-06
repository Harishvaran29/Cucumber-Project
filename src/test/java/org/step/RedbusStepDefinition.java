package org.step;

import org.sampless.New;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import reusemethod.RedbusSearch;

public class RedbusStepDefinition extends New{
	
	@Given("Open the chrome and open the Amazon home page")
	public void open_the_chrome_and_open_the_Amazon_home_page() {
	    launchbrowser();
	    openbrownser("https://www.redbus.in/");
	    Windowmaximize();
	    implicitwait();
	}
	
	@When("Choose the from location in redBus Website")
	public void choose_the_from_location_in_redBus_Website() {
		RedbusSearch rs = new RedbusSearch();
	   jsclick(rs.getFromElement());
	   sendvalue(rs.getFromElement(), "Chennai");
	   rs.getFroElement().click();
		
	}

	@When("Choose the To location in redBus Website")
	public void choose_the_To_location_in_redBus_Website() {
		RedbusSearch rs = new RedbusSearch();
		jsclick(rs.getToElement());
		sendvalue(rs.getToElement(), "Madurai");
	    //jssendkeys(rs.getToElement(), "Madurai");
	    rs.gettooElement().click();
	}

	@When("Click the search button")
	public void click_the_search_button() {
		RedbusSearch rs = new RedbusSearch();
		clickbutton(rs.getSearchElement());
	    //closepage();
	}



}
