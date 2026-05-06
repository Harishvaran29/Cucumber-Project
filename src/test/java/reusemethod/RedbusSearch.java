package reusemethod;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sampless.New;

public class RedbusSearch extends New{
	
	public RedbusSearch() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='srcinput']")
	private WebElement fromElement;
	
	@FindBy(xpath = "//input[@id='destinput']")
	private WebElement toElement;
	
	@FindBy(xpath = "//button[text()='Search buses']")
	private WebElement searchElement;
	
	@FindBy(xpath = "//div[contains(text(),'Chennai')]")
	private WebElement froElement;
	
	@FindBy(xpath = "//div[contains(text(),'Madurai')]")
	private WebElement tooElement;
	
	public WebElement gettooElement() {
		return tooElement;
	}
	
	public WebElement getFroElement() {
		return froElement;
	}

	public WebElement getFromElement() {
		return fromElement;
	}

	public WebElement getToElement() {
		return toElement;
	}

	public WebElement getSearchElement() {
		return searchElement;
	}

}
