package kalki_Fashion_SignIn_Module;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import genericLibrary.ReadData;
import pomRepository.BasePage;
import pomRepository.LoginPage;

import org.testng.Assert;
import org.testng.Reporter;

/***
 * SignIn_Page_086Test: verify that user is able to signin or not.
 * 
 * @author Rohit
 * 
 * @throws Exception
 */

public class SignIn_Page_086Test extends BaseClass {

	@Test(groups = "Functional")
	public void signin() throws Exception {

		// Step 1: Go on Homepage...
		BasePage basepage = new BasePage(driver);
		Thread.sleep(1000);
		Assert.assertEquals(driver.getTitle(), ReadData.fromPropertyFile("expectedTitle"),
				"You are not landed on KalkiFashion");

		// Step 2: Click on Sigup link...
		basepage.getKalkiFashionSignupLink().click();

		LoginPage loginpage = new LoginPage(driver);
		// Step 3: Enter valid email id...
		loginpage.getEmailIdTextField().sendKeys(ReadData.fromPropertyFile("email"));

		// Step 4: click on Singin button...
		loginpage.getSiginButton().click();

		// Step 5: Enter valid password in password textfield...
		loginpage.getPwdTextfield().sendKeys(ReadData.fromPropertyFile("password"));

		// Step 6: click on sigin button...
		loginpage.getSiginButton().click();

		Reporter.log("User Siggned in succesfully...", true);
	}
}