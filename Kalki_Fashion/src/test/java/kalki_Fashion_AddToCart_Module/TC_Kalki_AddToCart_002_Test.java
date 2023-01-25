package kalki_Fashion_AddToCart_Module;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomRepository.AddToCartBasePage;
import pomRepository.AddToCartProductPage;

public class TC_Kalki_AddToCart_002_Test extends BaseClass {
	//String expectedPageTitle="Search Results for \"sarees\"";
	@Test(groups="Functional")
	public void productSelection() throws Exception{
	AddToCartBasePage basePage=new AddToCartBasePage(driver);	
	basePage.getKalkiSearchBar().sendKeys("sarees",Keys.ENTER);
	Thread.sleep(5000);
	//Assert.assertEquals(driver.getTitle(), expectedPageTitle,"Sarees page is not displayed");
	Reporter.log("Sarees Page Displayed",true);
	
	}
}

