package tek.capstone.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup{
	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}
@FindBy(id="accountLink")
public WebElement accountBtn;
@FindBy(id="nameInput")
public WebElement personalName;
@FindBy(id="personalPhoneInput")
public WebElement personalPhone;
@FindBy(id="personalUpdateBtn")
public WebElement updateBtn;
@FindBy(xpath="//div[text()='Personal Information Updated Successfully']")
public WebElement infoUpdated;
//add payment 
@FindBy(xpath= "//p[text()='Add a payment method']")
public WebElement addPaymentBtn;
@FindBy(id= "cardNumberInput")
public WebElement cardNumberInput;
@FindBy(id="nameOnCardInput")
public WebElement nameOnCard;
@FindBy(id="expirationMonthInput")
public WebElement expireationMonth;
@FindBy(id="expirationYearInput")
public WebElement expirationYear;
@FindBy(id="securityCodeInput")
public WebElement codeInput;
@FindBy(id="paymentSubmitBtn")
public WebElement SubmitBtn;
@FindBy(xpath="//div[text()='Payment Method added sucessfully']")
public WebElement paymentAdded;

//Card added 
@FindBy(xpath="//button[text()='Edit']")
public WebElement editBtn;
@FindBy(id="cardNumberInput")
public WebElement newCardNumber;
@FindBy(id="paymentSubmitBtn")
public WebElement resubmitPaymentInfo;
@FindBy(xpath="//div[text()='Payment Method updated Successfully']")
public WebElement updatedSuccessfully;

//remove card
@FindBy(xpath="//button[text()='remove']")
public WebElement removeCard;

//add address
@FindBy(xpath= "//div[starts-with(@class='account__address-new')]")
public WebElement addAddressBtn;
@FindBy(id="countryDropdown")
public WebElement countryDropDownOption;
@FindBy(id="fullNameInput")
public WebElement addressName;
@FindBy(id="phoneNumberInput")
public WebElement addressPhone;
@FindBy(id="streetInput")
public WebElement addressStreet;
@FindBy(id="apartmentInput")
public WebElement apartmentApt;
@FindBy(id="cityInput")
public WebElement addressCity;
@FindBy(name= "state")
public WebElement addressState;
@FindBy(id="zipCodeInput")
public WebElement addressZip;
@FindBy(id="addressBtn")
public WebElement AddressNewBtn;
@FindBy(xpath="//div[text()='Address Added Successfully']")
public WebElement addressAdded;

//edit address 
@FindBy(xpath= "//div[contains(@class,'account__address-btn')]")
public WebElement editAddressBtn;
@FindBy(id="streetInput")
public WebElement editaddressStreet;
@FindBy(id="addressBtn")
public WebElement updateAddressBtn;

//remove address 
@FindBy(xpath= "//button[text()='Remove']")
public WebElement removeAddressBtn;


}
