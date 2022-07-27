package stepDefinitions;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.DesktopPageObject;
import page.objects.LaptopNotebookPageObject;

public class LaptopStepDef extends Base {
	LaptopNotebookPageObject laptopNoteBook = new LaptopNotebookPageObject();

	@When("User click on Laptop &NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
		laptopNoteBook.laptopAndNoteBook();
		logger.info("user clicked on the laptop and note book tab");
	}

	@When("User clickon Show all Laptop & NoteBook option")
	public void user_clickon_show_all_laptop_note_book_option() {
		laptopNoteBook.optionLaptopAndNoteBookClick();
		logger.info("user clicked on show all laptop and note book option");
	}

	@When("User click on MacBook  item")
	public void user_click_on_mac_book_item() {
		laptopNoteBook.macBookItemClick();
		logger.info("user clicked on the macbook Item");
	}

	@Then("User should see a message ‘Success: You have added MacBook to your shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_mac_book_to_your_shopping_cart() {
		laptopNoteBook.macBookAdded();
		logger.info("macBook added msg showen");
	}

	@Then("User should see {string} item\\(s)'{double}'showed to the cart")
	public void user_should_see_item_s_showed_to_the_cart(String string, Double double1) {
		laptopNoteBook.alertMsg();
		logger.info("alert Msg shown");
	}

	@Then("User click on cart option")
	public void user_click_on_cart_option() {
		laptopNoteBook.clickOnCartOption();
		logger.info("user clicked on cart option");
	}

	@Then("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
		laptopNoteBook.clickXButton();
		logger.info("user clicked on X red button");

	}

	@Then("item should be removed and cart should show {int} item\\(s)")
	public void item_should_be_removed_and_cart_should_show_item_s(Integer int1) {
		laptopNoteBook.cartUpdatedShow();
		logger.info("cart updated message");
	}

@When("User click on product comparison icon on ‘MacBook’")
public void user_click_on_product_comparison_icon_on_mac_book() {
    laptopNoteBook.compareMacbookclick();
    logger.info("user clicekd to macbook");
}
@When("User click on product comparison icon on ‘MacBook Air")
public void user_click_on_product_comparison_icon_on_mac_book_air() {
    laptopNoteBook.compareMacBookAirClick();
    logger.info("User cliecked to macbook air");
}
@Then("User should see a message ‘Success: You have added MacBook Air to your product comparison!’")
public void user_should_see_a_message_success_you_have_added_mac_book_air_to_your_product_comparison() {
    laptopNoteBook.macBookCompareText();
    logger.info("user saw the message");
}
@Then("User click on Product comparison link")
public void user_click_on_product_comparison_link() {
    laptopNoteBook.compareLinkClick();
    logger.info("user cliekc to comparelink");
}
@Then("User should see Product Comparison Chart")
public void user_should_see_product_comparison_chart() {
    laptopNoteBook.comparisonChart();
    logger.info("User clicked to comaprision chart and it was displayed");
    
}


@When("User click on heart icon to add ‘Sony VaIO’ laptop to wish list")
public void user_click_on_heart_icon_to_add_sony_va_io_laptop_to_wish_list() {
    laptopNoteBook.sonyClick();
    logger.info("User clicked on the wishList");
}
@Then("User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!’")
public void user_should_get_a_message_you_must_login_or_create_an_account_to_save_sony_vaio_to_your_wish_list() {
   laptopNoteBook.givenMsgALert();
   logger.info("user given msg is displayed");
}

@When("User click on ‘MacBook Pro’ item")
public void user_click_on_mac_book_pro_item() {
    laptopNoteBook.macBookPricklink();
    logger.info("user clikced on macbook pro");
}

@Then("User should see  ‘${double}’ price tag is present on UI.")
public void user_should_see_$_price_tag_is_present_on_ui(Double priceTagAmount) {
    laptopNoteBook.showPriceTag();
    logger.info("validate Information On UI");
}





}
