package page.objects;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utils;

public class RetailPageObject extends Base {
	public RetailPageObject() {
		

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"logo\"]/h1/a")
	private WebElement homePage;

	public void homePage() {
		Utils.hardWait();
	}

	@FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")
	private WebElement account;

	public void ClickOnAccount() {
		account.click();
	}

	@FindBy(xpath = "//a[text()='Login']")
	private WebElement login;

	public void ClickOnLogin() {
		login.click();
	}

	@FindBy(xpath = "//*[@id=\"input-email\"]")
	private WebElement enterEmail;

	public void enterEmailAddress() {
		enterEmail.sendKeys("utsav@gmail.com");

	}

	@FindBy(xpath = "//*[@id=\"input-password\"]")
	private WebElement enterPassword;

	public void enterPassword() {
		enterPassword.sendKeys("12345");
	}

	@FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div/form/input")
	private WebElement pressLogin;

	public void pressLoginButton() {
		Utils.hardWait();
		pressLogin.click();
	}

	@FindBy(xpath = "//*[@id=\"content\"]/h2[1]")
	private WebElement myAccount;

	public void myAccountDash() {
		Utils.hardWait();
		myAccount.click();
	}

	@FindBy(xpath = "//*[@id=\"content\"]/ul[3]/li/a")
	private WebElement registerForAffilateAccount;

	public void affilateAccount() {
		registerForAffilateAccount.click();
	}

	@FindBy(xpath = "//*[@id=\"input-company\"]")
	private WebElement company;

	public void companyName() {
		company.sendKeys("EverestLLC");

	}

	@FindBy(xpath = "//*[@id=\"input-website\"]")
	private WebElement webSite;

	public void webSiteEnter() {

		webSite.sendKeys("www.nepal.com");

	}

	@FindBy(xpath = "//*[@id=\"input-tax\"]")
	private WebElement taxId;

	public void taxIdNumber() {
		taxId.sendKeys("12345");

	}
//	@FindBy(xpath="//*[@id=\"content\"]/form/fieldset[2]/div[2]/div/div[1]/label/input")
//	private WebElement paymentMethod;
//	public void clickOnPaymentMethod() {
//		paymentMethod.click();

	@FindBy(xpath = "//*[@id=\"input-cheque\"]")
	private WebElement chequeName;

	public void enterChequeName() {
		chequeName.sendKeys("money");
		Utils.hardWait();
	}

	@FindBy(xpath = "//*[@id=\"content\"]/form/div/div/input[1]")
	private WebElement aboutUs;

	public void clickOnAboutUs() {
		aboutUs.click();
	}

	@FindBy(xpath = "//*[@id=\"content\"]/form/div/div/input[2]")
	private WebElement continueButton;

	public void clickOnContinueButton() {
		continueButton.click();

	}

	@FindBy(xpath = "//*[@id=\"account-account\"]/div[1]")
	private WebElement sucessMessage;

	public void displaySucessMessage() {
		System.out.println(sucessMessage);// *[@id="account-account"]/div[1]);
	}

	@FindBy(xpath = "//*[@id=\"content\"]/ul[3]/li[1]/a")
	private WebElement affiliateInfo;

	public void editAffiliateInfo() {
		affiliateInfo.click();

	}

	@FindBy(xpath = "//*[@id=\"content\"]/form/fieldset[2]/div[2]/div/div[3]/label/input")
	private WebElement bankTransferButton;

	public void clickOnBankTransferradioButton() {
		bankTransferButton.click();
	}

	@FindBy(xpath = "//*[@id=\"input-bank-name\"]")
	private WebElement bankName;

	public void enterBankName() {
		bankName.sendKeys("BOFA");
	}

	@FindBy(xpath = "//*[@id=\"input-bank-branch-number\"]")
	private WebElement abaNumber;

	public void enterabaNumber() {
		abaNumber.sendKeys("012345");

	}

	@FindBy(xpath = "//*[@id=\"input-bank-swift-code\"]")
	private WebElement swiftCode;

	public void enterSwiftCode() {
		swiftCode.sendKeys("23456");
	}

	@FindBy(xpath = "//*[@id=\"input-bank-account-name\"]")
	private WebElement AccountName;

	public void enterAccountName() {
		AccountName.sendKeys("tek-user");
	}

	@FindBy(xpath = "//*[@id=\"input-bank-account-number\"]")
	private WebElement accountNumber;

	public void enterAccountNumber() {
		accountNumber.sendKeys("12345");
}
	
	@FindBy(xpath="//*[@id=\"content\"]/form/div/div/input")
	private WebElement buttonContinue;
	public void buttonContinueClick() {
		buttonContinue.click();
	}
	
	@FindBy(xpath="//*[@id=\"account-account\"]/div[1]")
	private WebElement sucessMsg;
	public void displaySucessMsg() {
		System.out.println(sucessMsg);
	}
	@FindBy(xpath="//*[@id=\"content\"]/ul[1]/li[1]/a")
	private WebElement accountInformantion;
	public void accountInfoEdit1() {
		accountInformantion.click();
	}
	@FindBy(xpath="//*[@id=\"input-firstname\"]")
	private WebElement firstName;
	public void firstNameEdit() {
		firstName.sendKeys("Utsav");
	}

	@FindBy(xpath="//*[@id=\"input-lastname\"]")
	private WebElement lastName;
	public void lastNameEdit() {
		lastName.sendKeys("Man vaidya");
	}
	@FindBy(xpath="//*[@id=\"input-email\"]")
	private WebElement emailAddressEdit;
	public void updateEmailAddress() {
		emailAddressEdit.sendKeys("vaidyautsav01@gmail.com");
	}
	@FindBy(xpath="//*[@id=\"input-telephone\"]")
	private WebElement telephone;
	public void telephoneNumber() {
		telephone.sendKeys("1234567");
		
	}
	
	@FindBy(xpath="//*[@id=\"content\"]/form/div/div[2]/input")
	private WebElement buttonClickContinue;
	public void pressContinue() {
		buttonClickContinue.click();
	}
	@FindBy(xpath="//*[@id=\"account-account\"]/div[1]")
	private WebElement msgSucess;
	public void msgSucessPress() {
		System.out.println(msgSucess);
		Utils.takeScreenShot();
	
	}
	
}


