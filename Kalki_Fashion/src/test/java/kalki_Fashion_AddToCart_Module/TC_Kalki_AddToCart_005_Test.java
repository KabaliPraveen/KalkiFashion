package kalki_Fashion_AddToCart_Module;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import genericLibrary.BaseClass;
import pomRepository.AddToCartBasePage;
import pomRepository.AddToCartProductPage;

public class TC_Kalki_AddToCart_005_Test extends BaseClass {
	@Test(groups="Functional")
	public void selectSize() throws Exception {
	String ExpectedText="Alert subscription has been saved";
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
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	try {
	driver.findElement(By.xpath("//span[text()='Padding Required ?']")).click();

	}
	catch(Exception e) {
		js.executeScript("window.scrollBy(0,200);");
	}
	//Assert.assertEquals(driver.getTitle(), expectedPageTitle,"saree not displayed");
	//Reporter.log("expected Saree is displayed",true);
	
	Thread.sleep(1000);
	products.getStitch().click();
	Thread.sleep(1000);
	products.getSize().click();
	Thread.sleep(1000);
	
	//driver.quit();
	}
	

}
