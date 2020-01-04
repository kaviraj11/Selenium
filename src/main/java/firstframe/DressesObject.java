package firstframe;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DressesObject extends BasePage {
	
	@FindBy(xpath = "(//a[@title='Dresses'])[2]")
	private WebElement dresses;
	
	
	@FindBy(xpath = "(//a[contains(@href,'size-s')])[1]")
	private WebElement small;
	
	@FindBy(xpath = "//a[contains(@href,'size-m')]")
	private WebElement medium;
	
	@FindBy(xpath = "(//a[contains(@href,'size-l')]")
	private WebElement large;
	
	
	public DressesObject() {
		PageFactory.initElements(driver, this);
		
	}
	
	public WebElement getdressestab() {
		return dresses;
	}
	
	public WebElement getsmall() {
		return small;
	}
	
	public WebElement getmedium() {
		return medium;
	}
	
	public WebElement getlarge() {
		return large;
	}
	
	

}
