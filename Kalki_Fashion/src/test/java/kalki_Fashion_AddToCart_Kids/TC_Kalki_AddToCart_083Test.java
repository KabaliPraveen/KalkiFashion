package kalki_Fashion_AddToCart_Kids;

import java.util.Set;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import genericLibrary.ReadData;
import pomRepository.BasePage;
import pomRepository.KidsPage;

/***
 * TC_Kalki_AddToCart_083Test: Verify user is able is click on the select size
 * option on product list page.
 * 
 * @author Rohit
 * 
 * @throws InterruptedException
 */

public class TC_Kalki_AddToCart_083Test extends BaseClass {

	@Test(groups = "Functional")
	public void clickOnimageDescription() throws InterruptedException {
		// Step 1: Go on Homepage...
		BasePage basepage = new BasePage(driver);
		Thread.sleep(1000);
		Assert.assertEquals(driver.getTitle(), ReadData.fromPropertyFile("expectedTitle"),
				"You are not landed on KalkiFashion");
		String parentPageWinID = driver.getWindowHandle();

		// Step 2: Navigating on kids module page...
		basepage.getKalkiFashionKidsLink().click();

		// Step 3: Selection of product...
		KidsPage kidspage = new KidsPage(driver);
		js.executeScript("arguments[0].scrollIntoView(true)", kidspage.getProductionSelection());
		kidspage.getProductSelection().click();
		Set<String> childPageWinID = driver.getWindowHandles();
		childPageWinID.remove(parentPageWinID);
		for (String WinID : childPageWinID) {
			driver.switchTo().window(WinID);
		}

		try {
			// Step 4: Scrolling and Selection of the element.
			explicitWait.until(ExpectedConditions.elementToBeClickable(kidspage.getAddToCartButton()));
			js.executeScript("arguments[0].scrollIntoView(false)", kidspage.getSelectSizeIcon());
			Thread.sleep(1000);
			kidspage.getSelectSizeIcon().click();
			Assert.assertEquals(kidspage.getSelectSizeIcon().getCssValue("color"),
					ReadData.fromPropertyFile("selectSizeColor"), "Size selection is unsuccessful");

			Reporter.log("Size selection successful", true);
		} catch (Exception e) {
		}
	}
}