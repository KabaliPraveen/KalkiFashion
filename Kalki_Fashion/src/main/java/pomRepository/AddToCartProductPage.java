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
	@FindBy(xpath="//div[@id='option-blouse styles']//div[contains(@id,options)]")
	private WebElement blouseStyle;
	
	public WebElement getBlouseStyle() {
		return blouseStyle;
	}

	@FindBy(xpath="(//select[contains(@id,'options')])[2]")
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

	@FindBy(xpath="(//select[contains(@id,'options')])[3]")
	private WebElement selectSleevelength;
	}

		
	


