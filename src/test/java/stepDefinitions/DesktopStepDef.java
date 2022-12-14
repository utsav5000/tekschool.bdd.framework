package stepDefinitions;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.DesktopPageObject;

public class DesktopStepDef extends Base {
	DesktopPageObject desktopPage = new DesktopPageObject();

	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {
		desktopPage.allDesktoptab();
		logger.info("user clicked on the  desktop tab ");
	}

	@When("User click on Show all desktops")
	public void user_click_on_show_all_desktops() {
		desktopPage.showAllDesktopClick();
		logger.info("User clicked on the desktop element");

	}

	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() {
		desktopPage.desktopsItems();
		logger.info("All the items imgage is being showen");
	}

	@When("User click  ADD TO CART option on HP LP3065item")
	public void user_click_add_to_cart_option_on_hp_lp3065item() {
		desktopPage.addToCartTab();
		logger.info("User click on the addToCartHPlP3065");
	}

	@When("User select quantity {int}")
	public void user_select_quantity(int int1) {
		desktopPage.selectQuanity();
		logger.info("user selected quanity" );
	}

	@When("User click add to Cart button")
	public void user_click_add_to_cart_button() {
		desktopPage.carButtonLCick();
		logger.info("user added the item to the cart");
	}

	@Then("User should see a message {string}")
	public void user_should_see_a_message(String string) {
		desktopPage.msgHPconfirm();
		logger.info("Confirm HP LP3065item is shown in the item");

	}

	@When("User click  ADD TO CART option on Canon EOS 5Ditem")
	public void user_click_add_to_cart_option_on_canon_eos_5ditem() {
		desktopPage.canon5Ditem();
		logger.info("User clicked on add to cart item");
	}

	@When("User select color from dropdown Red")
	public void user_select_color_from_dropdown_red() {
		desktopPage.select5DclickRed();
		logger.info("user selected red color according to the scenario");
	}

	@Then("User should see a message ???Success: You have added Canon EOS 5D to your shopping cart!???")
	public void user_should_see_a_message_success_you_have_added_canon_eos_5d_to_your_shopping_cart() {
		desktopPage.camera5DincartSucess();
		logger.info("user should selected item in the card");
	}

	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() {
		desktopPage.reviewLink();
		logger.info("user clicked on to review link");
	}

	@When("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(DataTable dataTable) {
		desktopPage.goodOrbadSelect();
		logger.info("User wrote the review");
		desktopPage.goodOrbadSelect();
		logger.info("User selected the bad or good radio");
		
		
	}

@When("user click on Continue button")
public void user_click_on_continue_button() {
   desktopPage.buttonContinuew();
   logger.info("user clicked on continue button");
}


	@Then("User should see a message with ???Thank you for your review. It has been submitted to the webmaster for approval.???")
	public void user_should_see_a_message_with_thank_you_for_your_review_it_has_been_submitted_to_the_webmaster_for_approval() {
		desktopPage.reviewMsgshow();
		logger.info("user reviewd msg shown adn submitted");
	}

}
