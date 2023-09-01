package tek.capstone.framework.steps;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.framework.pages.POMFactory;
import tek.capstone.framework.utilities.CommonUtility;
import tek.capstone.framework.utilities.DataGenerator;

public class RetailAccountSteps extends CommonUtility{
	POMFactory pomFactory = new POMFactory();
	
	@When("User click on Account option")
	public void userClickOnAccountOption() {
	    clickElementWithJS(pomFactory.accountPage().accountBtn);
	    logger.info("Account button was clicked");  
	}
	@When("User update Name {string} and Phone ‘{int}’")
	public void userUpdateNameAndPhone(String Name, String Phone) {
	   sendText(pomFactory.accountPage().personalName,Name);
	   clearTextUsingSendKeys(pomFactory.accountPage().personalPhone);
	   sendText(pomFactory.accountPage().personalPhone,Phone);
	   logger.info("Name and phone values have been eneter successfully");
	    
	}
	@When("User click on Update button")
	public void userClickOnUpdateButton() {
	    clickElementWithJS(pomFactory.accountPage().updateBtn);
	    logger.info("Update button was clicked");
	}
	    
	@Then("user profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
		waitTillPresence(pomFactory.accountPage().infoUpdated);
		String expectedMessage= "Personal Information Updated Successfully";
		String actualMessage= pomFactory.accountPage().infoUpdated.getText();
		Assert.assertEquals(expectedMessage,actualMessage); 
		logger.info("Update button was shown successfully");	
	    
	}
	//add payment 
	@When("User click on Add a payment method link")
	public void userClickOnAddAPaymentMethodLink() {
	    clickElementWithJS(pomFactory.accountPage().addPaymentBtn);
	    logger.info("Payment button was clicked");
	    
	}
	@When("User fill Debit or credit card information")
	public void userFillDebitOrCreditCardInformation(DataTable dataTable) {
		List<Map<String, String>> paymentInfo = dataTable.asMaps(String.class,String.class);
		sendText(pomFactory.accountPage().cardNumberInput,paymentInfo.get(0).get("cardNumber"));
		sendText(pomFactory.accountPage().nameOnCard,paymentInfo.get(0).get("nameOnCard"));
		selectByVisibleText(pomFactory.accountPage().expireationMonth,paymentInfo.get(0).get("expirationMonth"));
		selectByVisibleText(pomFactory.accountPage().expirationYear,paymentInfo.get(0).get("expirationYear"));
	    sendText(pomFactory.accountPage().codeInput,paymentInfo.get(0).get("securityCode"));
	    logger.info("Debit card information was added");
	    
	}
	@When("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
	    clickElementWithJS(pomFactory.accountPage().SubmitBtn);
	    logger.info("payment added button was clicked");
	}
	@Then("a message should be displayed [String]")
	public void aMessageShouldBeDisplayedPaymentMethodAddedSuccessfully(String expectedMessage) {
		if(expectedMessage.contains("Payment Method added")) {
			waitTillPresence(pomFactory.accountPage().paymentAdded);
			Assert.assertEquals(expectedMessage,pomFactory.accountPage().paymentAdded.getText());
			logger.info("Expected Message: " + expectedMessage);
		}
		
	}
	//edit payment 
	@When("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSection() {
	    clickElementWithJS(pomFactory.accountPage().editBtn);
	    logger.info("Edit button was clicked");
	}
	@When("user edit information with below data")
	public void userEditInformationWithBelowData(DataTable dataTable) {
		List<Map<String, String>> paymentInfo = dataTable.asMaps(String.class,String.class);
		clearTextUsingSendKeys(pomFactory.accountPage().cardNumberInput);
		sendText(pomFactory.accountPage().cardNumberInput,paymentInfo.get(0).get("cardNumber"));
		logger.info("Information was updated");
	}
	@When("user click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {
	    clickElementWithJS(pomFactory.accountPage().resubmitPaymentInfo);
	    logger.info("Update button was clicked");
	}
	@Then("a message should be displayed ‘Payment Method updated Successfully’")
	public void aMessageShouldBeDisplayedPaymentMethodUpdatedSuccessfully(String expectedMessage) {
		if(expectedMessage.contains("Payment Method updated")) {
			waitTillPresence(pomFactory.accountPage().updatedSuccessfully);
			Assert.assertEquals(expectedMessage,pomFactory.accountPage().updatedSuccessfully.getText());
			logger.info("Expected Message: " + expectedMessage);	
	}else if(expectedMessage.contains("Address added")) {
		waitTillPresence(pomFactory.accountPage().addressAdded);
		Assert.assertEquals(expectedMessage,pomFactory.accountPage().addressAdded.getText());
		logger.info("Expected Message: " + expectedMessage);
	} else if(expectedMessage.contains("Address Updated")) {
		waitTillPresence(pomFactory.accountPage().updateAddressBtn);
		Assert.assertEquals(expectedMessage,pomFactory.accountPage().updateAddressBtn.getText());
		logger.info("New address was updated");
	} 
		
	}
	//remove card
	@When("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() {
	    click(pomFactory.accountPage().removeCard);
	    logger.info("Remove card button was clicked");
	} 
	@Then("payment details should be removed")
	public void paymentDetailsShouldBeRemoved() {
	    logger.info("payment was removed");
	    
	}
	// add address
	
	@When("User click on Add address option")
	public void userClickOnAddAddressOption() {
	    clickElementWithJS(pomFactory.accountPage().addAddressBtn);
	    logger.info("address button clicked");
	}
	@When("user fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable dataTable) {
		List<Map<String,String>> addressInfo = dataTable.asMaps(String.class, String.class);
		selectByVisibleText(pomFactory.accountPage().countryDropDownOption,
				DataGenerator.addressGenerator(addressInfo.get(0).get("country")));
		sendText(pomFactory.accountPage().addressName,
				DataGenerator.addressGenerator(addressInfo.get(0).get("fullName")));
		sendText(pomFactory.accountPage().addressPhone,
				DataGenerator.addressGenerator(addressInfo.get(0).get("phoneNumber")));
		sendText(pomFactory.accountPage().addressStreet,
				DataGenerator.addressGenerator(addressInfo.get(0).get("stAddress")));
		sendText(pomFactory.accountPage().apartmentApt,
				DataGenerator.addressGenerator(addressInfo.get(0).get("aptValue")));
		sendText(pomFactory.accountPage().addressCity,
				DataGenerator.addressGenerator(addressInfo.get(0).get("cityValue")));
		sendText(pomFactory.accountPage().addressState,
				DataGenerator.addressGenerator(addressInfo.get(0).get("stateValue")));
		sendText(pomFactory.accountPage().addressZip,
				DataGenerator.addressGenerator(addressInfo.get(0).get("zipCodeValue")));
		logger.info("Address was added");
}
	@When("User click Add Your Address button")
	public void userClickAddYourAddressButton() {
	    clickElementWithJS(pomFactory.accountPage().AddressNewBtn);
	    logger.info("Added updated button was clicked");
	}
	@Then("a message should be displayed ‘Address Added Successfully’")
	public void aMessageShouldBeDisplayedAddressAddedSuccessfully(String expectedMessage) {
		
}
	// edit address
	@When("User click on edit address option")
	public void userClickOnEditAddressOption() {
	    clickElementWithJS(pomFactory.accountPage().editAddressBtn);
	    logger.info("address edit button was clicked");
	}
	@When("User click update Your Address button")
	public void userClickUpdateYourAddressButton() {
		 clickElementWithJS(pomFactory.accountPage().updateAddressBtn);
		 logger.info("update address button was clicked");
	}
	@Then("a message should be displayed ‘Address Updated Successfully’")
	public void aMessageShouldBeDisplayedAddressUpdatedSuccessfully() {
	}
	// remove address 
	@When("User click on remove option of Address section")
	public void userClickOnRemoveOptionOfAddressSection() {
	    clickElementWithJS(pomFactory.accountPage().removeAddressBtn);
	    logger.info("Remove address button was clicked");
	}
	@Then("Address details should be removed")
	public void addressDetailsShouldBeRemoved() {
	 
	}
}
