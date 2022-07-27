package stepDefinitions;

import org.openqa.selenium.WebElement;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.HomePageObject;

public class PageHomeStepDef extends Base {
	HomePageObject homePage = new HomePageObject();

	@When("User click on Currency")
	public void user_click_on_currency() {
		homePage.currencyClick();
		logger.info("User clicked on currency");

	}

	@When("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
		homePage.euroClick();
		logger.info("User clicked on euro");
	}

	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() {
		homePage.valueEuroChange();
		logger.info("user it is changed to euro");
	}

	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {
		homePage.displayShoppingCart();
		logger.info("User clicked on to shopping cart");
	}

	@Then("“Your shopping cart is empty!” message should display")
	public void your_shopping_cart_is_empty_message_should_display() {

		homePage.cartDisplayedempty();
		logger.info("Required msg is displayed");
	}
}
