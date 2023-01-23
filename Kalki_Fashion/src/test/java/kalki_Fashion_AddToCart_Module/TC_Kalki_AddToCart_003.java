package kalki_Fashion_AddToCart_Module;



import java.util.Set;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import genericLibrary.BaseClass;
import pomRepository.AddToCartBasePage;
import pomRepository.AddToCartProductPage;

public class TC_Kalki_AddToCart_003 extends BaseClass {
	@Test
	public void selectSize() throws InterruptedException {
		
		//String ExpectedPageTitle="Buy Champagne Gold And Blue Toned Glass Tissue Saree With Embroidery";
		String ExpectedText="Alert subscription has been saved";
		AddToCartBasePage basePage = new AddToCartBasePage(driver);
		basePage.getKalkiSearchBar().sendKeys("sarees", Keys.ENTER);

		AddToCartProductPage products = new AddToCartProductPage(driver);
		String currentid = driver.getWindowHandle();
		
		products.getProduct().click();
		
		
		/*Set<String> allIds = driver.getWindowHandles();
		allIds.remove(currentid);
		for (String id : allIds) {
			driver.switchTo().window(id);
		}
		//Assert.assertEquals(driver.getTitle(), expectedPageTitle,"saree not displayed");
		//Reporter.log("expected Saree is displayed",true);
		//products.getEmail().sendKeys("praveennm521@gmail.com");
		//products.getEmail().submit();*/
	
		Thread.sleep(4000);
		driver.quit();
		
	}
	
}
