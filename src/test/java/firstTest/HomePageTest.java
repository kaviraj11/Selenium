package firstTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import firstframe.BasePage;
import firstframe.HomePageObject;

public class HomePageTest {

	HomePageObject homePage;
	BasePage bp;

	public HomePageTest() {
		homePage = new HomePageObject();
		bp = new BasePage();
	}

	@Test
	public void veriftabs() {
		
		Assert.assertTrue(bp.elementFound(homePage.getwomentab()), "Women tab not Displayed");
		
		Assert.assertTrue(bp.elementFound(homePage.getdressestab()), "dresses tab not Displayed");
		
		Assert.assertTrue(bp.elementFound(homePage.gettshirttab()), "tshirts tab not Displayed");
	} 
	@Test
	public void navigatepages() {
		homePage.getwomentab().click();
		Assert.assertTrue(homePage.getTitle().contains("Women"), "failed");
		
		homePage.getdressestab().click();
		Assert.assertTrue(homePage.getTitle().contains("Dresses"), "failed");
		
		homePage.gettshirttab().click();
		Assert.assertTrue(homePage.getTitle().contains("T-shirts"), "failed");
	}
	@Test
	public void subNewsLetter() {
		homePage.subscribenewsletter().sendKeys("s.kavi2@gmail.com");
		homePage.Newsletterbtn().click();
		Assert.assertTrue(bp.elementFound(homePage.Displaysub()), "Not Displayed");
	}
	
}
	
	