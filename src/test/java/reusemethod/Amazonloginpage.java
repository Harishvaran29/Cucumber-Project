package reusemethod;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sampless.New;

public class Amazonloginpage extends New {
	
	public Amazonloginpage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//div[@id='nav-link-accountList']")
	private WebElement signinElement;
	
	@FindBy(xpath = "//input[@type='email']")
	private WebElement emailfieldElement;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement continuebuttonElement;
	
	public WebElement getSigninElement() {
		return signinElement;
	}

	public WebElement getEmailfieldElement() {
		return emailfieldElement;
	}

	public WebElement getContinuebuttonElement() {
		return continuebuttonElement;
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
