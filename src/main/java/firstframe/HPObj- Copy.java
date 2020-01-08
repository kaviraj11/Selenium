package firstframe;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObject extends BasePage {
	
	@FindBy(xpath = "//a[@title='Women']")
	private WebElement women;
	
	@FindBy(xpath = "(//a[@title='Dresses'])[2]")
	private WebElement dresses;

	@FindBy(xpath = "(//a[@title='T-shirts'])[2]")
	private WebElement tshirt;
	
	@FindBy(xpath="//input[@id='newsletter-input']")
	private WebElement Newsletter;
	
	@FindBy(xpath="//button[@name='submitNewsletter']")
	private WebElement Newsletterbtn;
	
	@FindBy(xpath="//p[@class='alert alert-success']")
	private WebElement Displaysubscription;
	
	public HomePageObject() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getwomentab() {
		return women;
		}
	public WebElement getdressestab() {
		return dresses;
		}
	public WebElement gettshirttab() {
		return tshirt;
	}
	public WebElement subscribenewsletter() {
		return Newsletter;
	}
	
	public WebElement Newsletterbtn() {
		return Newsletterbtn;
	}
	public WebElement Displaysub() {
		return Displaysubscription;
	}
	
	



	}




