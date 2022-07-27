package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePageObject extends Base {
	public HomePageObject() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"form-currency\"]/div/button/span")
	private WebElement currency;

	public void currencyClick() {
		currency.click();

	}

	@FindBy(xpath = "//*[@id=\"form-currency\"]/div/ul/li[1]/button")
	private WebElement euro;

	public void euroClick() {
		euro.click();

	}

	@FindBy(xpath = "//*[@id=\"form-currency\"]/div/button/strong")
	private WebElement valueEuro;

	public void valueEuroChange() {
		valueEuro.isDisplayed();

	}

	@FindBy(xpath = "//*[@id=\"cart\"]/button")
	private WebElement shoppingCart;

	public void displayShoppingCart() {
		shoppingCart.click();
	}

	@FindBy(xpath = "//*[@id=\"cart\"]/ul/li/p")
	private WebElement cartDisplayed;

	public void cartDisplayedempty() {
		cartDisplayed.isDisplayed();

	}

}
