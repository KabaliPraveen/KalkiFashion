package pomRepository;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartProductPage {
	public AddToCartProductPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//div[text()='US 8']")
	private WebElement kalkiSize; 
	
	public WebElement getKalkiSize() {
		return kalkiSize;
	}

	@FindBy(xpath="(//div[@class='products-list']/.//div[@class='product'])[1]")
	private WebElement Product;
	
	public WebElement getProduct() {
		return Product;
	}
	@FindBy(xpath="(//div[@class='options-list nested'])[1]")
	private WebElement coverFront;

	public WebElement getCoverFront() {
		return coverFront;
	}
	@FindBy(xpath="(//input[@type='email'])[2]")
	private WebElement email;

	public WebElement getEmail() {
		return email;
	}
	@FindBy(xpath = "//span[text()='Alert subscription has been saved.']")
	private WebElement text;

	public WebElement getText() {
		return text;
	}
	@FindBy(xpath="//div[text()='US 2']")
	private WebElement size;

	public WebElement getSize() {
		return size;
	}
	@FindBy(xpath="//div[text()='Stitched']")
	private WebElement stitch;

	public WebElement getStitch() {
		return stitch;
	}
	@FindBy(xpath="(//div[@class='options-list nested'])[1]")
	private WebElement paddingstyle;

	public WebElement getPaddingstyle() {
		return paddingstyle;
	}
	@FindBy(xpath = "//div[@id='option-padding required ?']//div[contains(@id,'options')]")
	private WebElement padSelecting;
	
	public WebElement getPadSelecting() {
		return padSelecting;
	}
	@FindBy(xpath = "//span[text()='Padding Required ?']/../..//option[contains(text(),'No')]")
	private WebElement selectpad;

	public WebElement getSelectpad() {
		return selectpad;
	}
	@FindBy(xpath="//div[@id='option-blouse styles']//div//div[contains(@id,options)]")
	private WebElement blouseStyle;
	
	public WebElement getBlouseStyle() {
		return blouseStyle;
	}

	@FindBy(xpath="//span[text()='Blouse Styles']/../..//option[contains(text(),'ROUND NECKLINE WITH IN CUT ')]")
	private WebElement selectBlouse;

	public WebElement getSelectBlouse() {
		return selectBlouse;
	}
	@FindBy(xpath ="//div[@id='option-sleeves length (inch)']//div[contains(@id,'options')]")
	private WebElement sleeveLength;
	
	public WebElement getSleeveLength() {
		return sleeveLength;
	}

	public WebElement getSelectSleevelength() {
		return selectSleevelength;
	}

	@FindBy(xpath="//span[text()='Sleeves Length (Inch)']/../..//option[contains(text(),'Sleeveless')]")
	private WebElement selectSleevelength;
	
	@FindBy(xpath="//div[@id='option-petticoat']//div[contains(@id,'options')]")
	private WebElement peticoat;

	public WebElement getPeticoat() {
		return peticoat;
	}
	@FindBy(xpath="//span[text()='Petticoat']/../..//option[contains(text(),'No, I would skip')]")
	private WebElement selectPeticoat;

	public WebElement getSelectPeticoat() {
		return selectPeticoat;
	}
	@FindBy(xpath="//button[@title='Add to Cart']")
	private WebElement addToCartButton;

	public WebElement getAddToCartButton() {
		return addToCartButton;
	}
	@FindBy(xpath="//h4[text()='Product Details']")
	private WebElement selectProductDetails;

	public WebElement getSelectProductDetails() {
		return selectProductDetails;
	}
	@FindBy(xpath ="//h4[text()='Product Details']")
	private WebElement productDetails;

	public WebElement getProductDetails() {
		return productDetails;
	}
}

	
	

		
	


