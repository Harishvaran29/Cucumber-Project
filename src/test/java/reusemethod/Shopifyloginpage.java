package reusemethod;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sampless.New;

public class Shopifyloginpage extends New{
	
	public Shopifyloginpage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//a[text()='Log in'])[1]")
	private WebElement loginbuttonElement;
	
	@FindBy(xpath = "//input[@type='email']")
	private WebElement emailfieldElement;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement continuebuttonElement;
	
	@FindBy(xpath = "//a[@class='ui-button ui-button--link arrow-link']")
	private WebElement newuserbuttonElement;
	
	
	
	
	
	
	

}
