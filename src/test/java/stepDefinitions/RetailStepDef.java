package stepDefinitions;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.RetailPageObject;
import utilities.Utils;

public class RetailStepDef extends Base {
	RetailPageObject retailPage = new RetailPageObject();

	@Given("User is on Retail website")
	public void user_is_on_retail_website() {
		retailPage.homePage();
		logger.info("User is on the website");

	}

	@Given("User click on MyAccount")
	public void user_click_on_my_account() {
		retailPage.ClickOnAccount();
		logger.info("user cicked on account");

	}

	@When("User click on login")
	public void user_click_on_login() {
		retailPage.ClickOnLogin();
		logger.info("User clicked on login");

	}

	@When("User enter username'userName' and password {string}")
	public void user_enter_username_user_name_and_password(String string) {
		retailPage.enterEmailAddress();
		logger.info("User enter Username");
		retailPage.enterPassword();
		logger.info("User enter Password");
	}

	@When("User click on Login button")
	public void user_click_on_login_button() {
		retailPage.pressLoginButton();
		logger.info("User clicked on login Button");

	}

	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() {
		retailPage.myAccountDash();
		logger.info("User inside the myAccountDash");
	}

	@When("User click on ‘Register for an Affiliate Account’ link")
	public void user_click_on_register_for_an_affiliate_account_link() {
		retailPage.affilateAccount();
		logger.info("User Clicked on Affilate account");
	}

	@When("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(DataTable dataTable) {
//		List<Map<String,String>>fillAffilatesInformation=dataTable.asMaps(String.class,String.class);
//		retailPage.companyName(fillAffilatesInformation.get(0).get("companyName"));
//		retailPage.webSiteEnter(fillAffilatesInformation.get(0).get("Website"));
//		retailPage.taxIdNumber(fillAffilatesInformation.get(0).get("taxIdNumber"));

		retailPage.companyName();
		logger.info("User entered company Name");
		retailPage.webSiteEnter();
		logger.info("User enetered website");
		retailPage.taxIdNumber();
		logger.info("User enetered tax id number");
		retailPage.enterChequeName();
		logger.info("User entered Payment method");

	}

	@When("User check on About us check box")
	public void user_check_on_about_us_check_box() {
		retailPage.clickOnAboutUs();
		logger.info("User clicked on the radio button about us");
	}

	@When("User click on Continue button")
	public void user_click_on_continue_button() {
		retailPage.clickOnContinueButton();
		logger.info("User clicked on continue button");
	}

	@When("User should see a success message")
	public void user_should_see_a_success_message() {
		retailPage.displaySucessMessage();
		Utils.takeScreenShot();
		logger.info("Sucess Message displayed");
	}

	@When("User click on ‘Edit your affiliate informationlink")
	public void user_click_on_edit_your_affiliate_informationlink() {
		retailPage.editAffiliateInfo();
		logger.info("User clicked on edit your affiliate infromation");
	}

	@When("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {
		retailPage.clickOnBankTransferradioButton();
		logger.info("user clicked on bank transder radio button");

	}

	@When("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(DataTable dataTable) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.
		retailPage.enterBankName();
		logger.info("User entered Bank Name");
		retailPage.enterabaNumber();
		logger.info("user entered abaNumber");
		retailPage.enterSwiftCode();
		logger.info("user entered swiftCode");
		retailPage.enterAccountName();
		logger.info("user enetered accountName");
		retailPage.enterAccountNumber();
		logger.info("User enetered account number");

	}

	@When("User click on Continue buttons")
	public void user_click_on_continue_buttons() {
		retailPage.buttonContinueClick();
		logger.info("user clicked on continuew button");
	}

	@When("User should see a success messages")
	public void user_should_see_a_success_messages() {
		retailPage.displaySucessMessage();
		Utils.hardWait();
	}

	@When("User click on ‘Edit your account information’ link")
	public void user_click_on_edit_your_account_information_link() {
		retailPage.accountInfoEdit1();
		logger.info("User click on account information");
	}

	@When("User modify below information")
	public void user_modify_below_information(DataTable dataTable) {
		retailPage.firstNameEdit();
		logger.info("user edit first name");
		retailPage.lastNameEdit();
		logger.info("Last Name Edit");
		retailPage.updateEmailAddress();
		logger.info("User email address update");
		retailPage.telephoneNumber();
		logger.info("User update cell phone number");
		

	}

	@When("User click  continue button")
	public void user_click_continue_button() {
		retailPage.buttonContinueClick();
		logger.info("user click on continue button");
	}

	@Then("User should see a message ‘Success: Your account has been successfully updated.’")
	public void user_should_see_a_message_success_your_account_has_been_successfully_updated() {
		retailPage.msgSucessPress();
		Utils.hardWait();
	}

}
