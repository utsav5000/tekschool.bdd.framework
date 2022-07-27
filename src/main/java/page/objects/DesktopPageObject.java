package page.objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utils;

public class DesktopPageObject extends Base {
	public DesktopPageObject() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//*[@id=\"menu\"]/div[2]/ul/li[1]/a")
	private WebElement allDesktop;

	public void allDesktoptab() {
		allDesktop.click();

	}

	@FindBy(xpath = "//*[@id=\"menu\"]/div[2]/ul/li[1]/div/a")
	private WebElement showAllDesktop;

	public void showAllDesktopClick() {
		showAllDesktop.click();
	}

	@FindBy(tagName = "img")
	private List<WebElement> items;

	public List<WebElement> desktopsItems() {
		List<WebElement> itemsDesk = items;
		return itemsDesk;

	}

	@FindBy(xpath = "//*[@id=\"content\"]/div[4]/div[3]/div/div[2]/div[2]/button[1]")
	private WebElement addToCartHPlP3065;

	public void addToCartTab() {
		addToCartHPlP3065.click();
	}

	@FindBy(id = "input-quantity")
	private WebElement quanityInput;

	public void selectQuanity() {
		quanityInput.clear();
		quanityInput.sendKeys("1");
		/*
		 * This method will click on Add to cart Button once the product is ready to
		 * add.
		 */

	}

	@FindBy(id = "button-cart")
	private WebElement carButton;

	public void carButtonLCick() {
		carButton.click();
	}

	@FindBy(xpath = "//*[@id=\"product-product\"]/div[1]")
	private WebElement msgHP;

	public void msgHPconfirm() {
		System.out.println(msgHP);
		Utils.hardWait();
	}

	@FindBy(xpath = "//*[@id=\"content\"]/div[4]/div[2]/div/div[2]/div[2]/button[1]")
	private WebElement canon5D;

	public void canon5Ditem() {
		canon5D.click();

	}

	@FindBy(xpath = "//*[@id=\"input-option226\"][1]")
	private WebElement select5D;

	public void select5DclickRed() {
		select5D.click();

	}

	@FindBy(xpath = "//*[@id=\"product-product\"]/div[1]")
	private WebElement camera5DinCart;

	public void camera5DincartSucess() {
		System.out.println(camera5DinCart);
		Utils.takeScreenShot();
		Utils.hardWait();

	}

	@FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div[3]/p/a[2]")
	private WebElement review;

	public void reviewLink() {
		review.click();
	}

	@FindBy(xpath = "//*[@id=\"input-review\"]")
	private WebElement reviewInfo;

	public void writeReviewInfo() {
		reviewInfo.sendKeys("Camera is good,Camera is good,Camera is good," + "Camera is good,");
	}

	@FindBy(xpath = "//*[@id=\"form-review\"]/div[4]/div/input[1]")
	private WebElement badOrgood;

	public void goodOrbadSelect() {
		badOrgood.click();
		System.out.println("User selected bad");

	}

	@FindBy(xpath = "//*[@id=\"button-review\"]")
	private WebElement continueButon;

	public void buttonContinuew() {
		continueButon.click();
	}

	@FindBy(xpath = "//*[@id=\"form-review\"]/div[2]")
	private WebElement reviewMsg;

	public void reviewMsgshow() {
		System.out.println(reviewMsg);
		Utils.hardWait();

	}
}
