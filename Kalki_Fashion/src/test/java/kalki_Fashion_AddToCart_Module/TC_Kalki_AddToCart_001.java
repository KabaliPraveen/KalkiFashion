package kalki_Fashion_AddToCart_Module;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomRepository.AddToCartBasePage;

public class TC_Kalki_AddToCart_001 extends BaseClass {
	@Test
	public  void searchBar() {
		AddToCartBasePage basePage=new AddToCartBasePage(driver);
		basePage.getKalkiSearchBar().sendKeys("sarees",Keys.ENTER);
		
	
		
		
	}

}
