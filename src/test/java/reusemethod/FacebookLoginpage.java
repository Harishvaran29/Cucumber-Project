package reusemethod;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sampless.New;

public class FacebookLoginpage extends New{
	
	public FacebookLoginpage() {
		PageFactory.initElements(driver , this);
	}
	
	public WebElement getEmailElement() {
		return emailElement;
	}

	public WebElement getPasswordElement() {
		return passwordElement;
	}

	public WebElement getLoginbuttonElement() {
		return loginbuttonElement;
	}

	@FindBy(xpath = "//input[@name='email']")
	private WebElement emailElement;
	
	@FindBy(xpath = "//input[@name='pass']")
	private WebElement passwordElement;
	
	@FindBy(xpath = "//span[text()='Log in']")
	private WebElement loginbuttonElement;	
	
	
	

}
