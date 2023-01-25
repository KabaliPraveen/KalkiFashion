package kalki_Fashion_AddToCart_Module;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pageObjectModel.BasePage;
import pageObjectModel.productPage;
import pomRepository.AddToCartBasePage;
import pomRepository.AddToCartProductPage;

public class TC_Kalki_AddToCart_004 extends BaseClass {
	@Test
	public void sleeveLength() throws Exception {
		// String ExpectedPageTitle="Buy Midnight Blue Ready Pleated Saree In Striped
		// Sequins Fabric With A Matching Velvet Blouse Embellished In Sequins On The
		// Straps Online - Kalki Fashion";
		AddToCartBasePage basePage = new AddToCartBasePage(driver);
		basePage.getKalkiSearchBar().sendKeys("sarees", Keys.ENTER);

		AddToCartProductPage products = new AddToCartProductPage(driver);
		String currentid = driver.getWindowHandle();

		products.getProduct().click();

		Set<String> allIds = driver.getWindowHandles();
		allIds.remove(currentid);
		for (String id : allIds) {
			driver.switchTo().window(id);
		}
		// Assert.assertEquals(driver.getTitle(), ExpectedPageTitle,"saree not
		// displayed");
		// Reporter.log("expected Saree is displayed",true);
		Thread.sleep(2000);

		products.getStitch().click();
		driver.quit();
	}
}
