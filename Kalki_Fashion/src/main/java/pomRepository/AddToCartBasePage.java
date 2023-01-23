package pomRepository;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartBasePage {
	public AddToCartBasePage(WebDriver driver){
		PageFactory.initElements( driver,this);
	}
	@FindBy(id="search-input")
	private WebElement kalkiSearchBar;
	
	@FindBy(xpath="//a[@id=\"menu-cart-icon\"]/*[name()='svg']")
	private WebElement kalkiAddToCart;

	public WebElement getKalkiSearchBar() {
		return kalkiSearchBar;
	}
	
	
	
	}



