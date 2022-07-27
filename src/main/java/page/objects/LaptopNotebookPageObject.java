package page.objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utils;

public class LaptopNotebookPageObject extends Base {

	public LaptopNotebookPageObject() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"menu\"]/div[2]/ul/li[2]/a")
	private WebElement laptopAndNoteBookTab;

	public void laptopAndNoteBook() {
		laptopAndNoteBookTab.click();
	}

	@FindBy(xpath = "//*[@id=\"menu\"]/div[2]/ul/li[2]/div/a")
	private WebElement optionLaptopAndNoteBook;

	public void optionLaptopAndNoteBookClick() {
		optionLaptopAndNoteBook.click();
	}

	@FindBy(xpath = "//*[@id=\"content\"]/div[4]/div[2]/div/div[2]/div[1]/h4/a")
	private WebElement macBookItem;

	public void macBookItemClick() {
		macBookItem.click();

	}

	@FindBy(xpath = "//*[@id=\"product-product\"]/div[1]")
	private WebElement macbookAdded;

	public void macBookAdded() {
		macbookAdded.getText();

	}

	@FindBy(xpath = "//*[@id=\"cart-total\"]")
	private WebElement itemShown;

	public void alertMsg() {
		String string = "1";
		double double1 = 602.00;

		itemShown.getText();

	}

	@FindBy(xpath = "//*[@id=\"cart\"]/button")
	private WebElement cartOption;

	public void clickOnCartOption() {
		cartOption.click();
	}

	@FindBy(xpath = "//*[@id=\"cart\"]/ul/li[1]/table/tbody/tr/td[5]/button")
	private WebElement xRedButton;

	public void clickXButton() {
		xRedButton.click();

	}

	@FindBy(xpath = "//*[@id=\"cart-total\"]")
	private WebElement cartUpdate;

	public void cartUpdatedShow() {
		Integer int1 = 0;

		cartUpdate.getText();

	}

	@FindBy(xpath = "//*[@id=\"content\"]/div[4]/div[2]/div/div[2]/div[2]/button[3]")

	private WebElement compareMacbook;

	public void compareMacbookclick() {

		compareMacbook.click();

	}

	@FindBy(xpath = "//*[@id=\"content\"]/div[4]/div[3]/div/div[2]/div[2]/button[3]")
	private WebElement compareMacBookAir;

	public void compareMacBookAirClick() {
		compareMacBookAir.click();
	}

	@FindBy(xpath = "//*[@id=\"product-category\"]/div[1]")
	private WebElement macBookCompare;

	public void macBookCompareText() {
		macBookCompare.getText();

	}

	@FindBy(xpath="//*[@id=\"product-category\"]/div[1]/a[2]")
	 private WebElement compareLink;
	public void compareLinkClick() {
		compareLink.click();
	}

	

	@FindBy(xpath = "//*[@id=\"content\"]/table/tbody[1]")
	private List<WebElement> chart;

	public List<WebElement> comparisonChart() {
		List<WebElement> productCharted = chart;
		return productCharted;

	}
	@FindBy(xpath="//*[@id=\"content\"]/div[4]/div[5]/div/div[2]/div[2]/button[2]")
	private WebElement sony;
	public void sonyClick() {
		sony.click();
		
		
	}
	@FindBy(xpath="//*[@id=\"product-category\"]/div[1]")
	private WebElement msgAlert;
	public void givenMsgALert() {
		msgAlert.isDisplayed();
		
	}
	@FindBy(xpath="//*[@id=\"content\"]/div[4]/div[4]/div/div[2]/div[1]/h4/a")
	private WebElement macBookPro;
	public void macBookPricklink() {
		macBookPro.click();
	}
	@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/ul[2]/li[1]/h2")
	private WebElement priceTag;
	public void  showPriceTag() {
		double   priceTagAmount=2000.00;
		 boolean priceTagAmounts = priceTag.isDisplayed();
		 
		
		
		if (priceTagAmounts) {
			priceTag.getText();
			
			
			
		} else {
	System.out.println("Not given");

		}
	}
}
