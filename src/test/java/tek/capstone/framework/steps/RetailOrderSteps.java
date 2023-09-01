package tek.capstone.framework.steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.framework.pages.POMFactory;
import tek.capstone.framework.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility{
	POMFactory pomFactory= new POMFactory();
	
// add item to cart 
	@When("User change the category to {string}")
	public void userChangeTheCategoryTo(String catagory) {
		selectByVisibleText(pomFactory.orderPage().searchDropDown, catagory);
		logger.info("drop down catagory was changed to smart home");   
	}
	@When("User search for an item {string}")
	public void userSearchForAnItem(String kasaPlug) {
		sendText(pomFactory.orderPage().searchBar,kasaPlug);
		logger.info("Item was searched for");
	  
	}
	@When("User click on Search icon")
	public void userClickOnSearchIcon() {
		click(pomFactory.orderPage().searchBtn);
		logger.info("search button was clicked");
	   
	}
	@When("User click on item")
	public void userClickOnItem() {
		click(pomFactory.orderPage().kasaProduct);
		logger.info("Item was selected");
	   
	}
	@When("User select quantity (String)")
	public void userSelectQuantity(String itemQuantity) {
		selectByVisibleText(pomFactory.orderPage().productSelection,itemQuantity);
		logger.info("Item quantity was selected");
	   
	}
	@When("User click add to Cart button")
	public void userClickAddToCartButton() {
		click(pomFactory.orderPage().addToCartBtn);
		logger.info("Add to cart button was clicked");
	    
	} 
	@Then("the cart icon quantity should change to {string}")
	public void theCartIconQuantityShouldChangeTo(String cartQuantity) {
		Assert.assertEquals(cartQuantity,pomFactory.orderPage().cartQuantity);
		logger.info("Cart quantity was validated");
	   
	}
	// change item in chart 
	@Then("User change the category to {string} Apex Legends")
	public void userChangeTheCategoryToApexLegends(String Electronics) {
		selectByVisibleText(pomFactory.orderPage().searchDropDown, Electronics);
		logger.info("Catagory was changed to electronics");    
	}
	@Then("User search for an item {string} Apex Legends")
	public void userSearchForAnItemApexLegends(String ApexLegends) {
		sendText(pomFactory.orderPage().searchBar, ApexLegends);
		logger.info("Apex Legends was searched for");
		
	}
	@Then("User click on Apex Legends")
	public void userClickOnApexLegends() {
		click(pomFactory.orderPage().apexLegends);
		logger.info("Apex Legends item was selected");
		
	}
	@When("User select quantity {string} Apex Legends")
	public void userSelectQuantityApexLegends(String apexLegends) {
		selectByVisibleText(pomFactory.orderPage().productSelection, apexLegends);
		logger.info("Apex Legends 5 items were selected");
	}
	@Then("User click on Cart option")
	public void userClickOnCartOption() {
		click(pomFactory.orderPage().cartButton);
	logger.info("User continues to cart");
	    
	}
	@Then("User click on Proceed to Checkout button")
	public void userClickOnProceedToCheckoutButton() {
		click(pomFactory.orderPage().checkout);
		logger.info("User placed order");
	    
	}
	@Then("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() {
		click(pomFactory.orderPage().placeOrder);
		logger.info("User clicked on place order");
	    
	}
	@Then("a message should be displayed {string}")
	public void aMessageShouldBeDisplayed(String expectedMessage) {
		if(expectedMessage.contains("Order Placed")){
				waitTillPresence(pomFactory.orderPage().orderPlaceMsg);
		Assert.assertEquals(expectedMessage, pomFactory.orderPage().orderPlaceMsg.getText()); 
		logger.info("Order Placed Successfully was shown");
	
			
			
		}
	    
	}
	@When("User click on Orders section")
	public void userClickOnOrdersSection() {
	    click(pomFactory.orderPage().orderLink);
	    logger.info("User click on cancle order option");
	}
	@When("User click on first order in list")
	public void userClickOnFirstOrderInList() {
		List<WebElement> orderList = pomFactory.orderPage().listOfOrders;
		for( int i =0 ; i < orderList.size(); i++) {
			if(orderList.get(i).getText().equalsIgnoreCase("Hide Detials")) {
				
			}else if (orderList.get(i).getText().equalsIgnoreCase("Show Details")) {
				click(pomFactory.orderPage().listOfOrders.get(i));
			}
			
		}	
	   
	}
	@When("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {
		click(pomFactory.orderPage().cancleOrder);
		logger.info("cancle button clicked");
		
	    
	}
	
	@When("User select the cancelation Reason {string}")
	public void userSelectTheCancelationReason(String cancellationReason) {
		   selectByVisibleText(pomFactory.orderPage().reasonToCancle,cancellationReason);
		   logger.info("reason to cancel was specified");
	}

	
	@When("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
	    click(pomFactory.orderPage().cancelOrderButton);
	    logger.info("order was cancled finally");
	}
	@Then("a cancelation message should be displayed ‘Your Order Has Been Cancelled")
	public void aCancelationMessageShouldBeDisplayedYourOrderHasBeenCancelled() {
		waitTillPresence(pomFactory.orderPage().cancleOrderMsg);
		Assert.assertTrue(pomFactory.orderPage().cancleOrderMsg.isDisplayed());
		logger.info("Cancle order msg was shown");
	   
	}
	//return order
	@When("User clicks on Orders section")
	public void userClicksOnOrdersSection() {
		click(pomFactory.orderPage().orderLink);
		logger.info("order list was accessed");
	    
	}
	@When("User select first order in list")
	public void userSelectFirstOrderInList() {
	    click(pomFactory.orderPage().OrderNumberOneOntheList);
	    logger.info("User access order list");
	}
	@When("User click on Return Items button")
	public void userClickOnReturnItemsButton() {
	   click(pomFactory.orderPage().returnOrderBtn);
	   logger.info("user clicks on return order button successfully");
	   
	}
	@When("User select the Return Reason {string}")
	public void userSelectTheReturnReason(String itemDamaged) {
		selectByVisibleText(pomFactory.orderPage().listOfReturnReason,itemDamaged);
		logger.info("reason for return is selected");
	    
	}
	@When("User select the drop off service {string}")
	public void userSelectTheDropOffService(String FedEx) {
		selectByVisibleText(pomFactory.orderPage().dropOffOptions,FedEx);
	    logger.info("FedEx was selected as the drop off location");
	}
	@When("User click on Return Order button")
	public void userClickOnReturnOrderButton() {
	    click(pomFactory.orderPage().submitReturnOrder);
	    
	}
	@Then("a cancelation message should be displayed {string}")
	public void aCancelationMessageShouldBeDisplayed(String string) {
	    waitTillPresence(pomFactory.orderPage().orderReturnMessg);
	    Assert.assertTrue(pomFactory.orderPage().orderReturnMessg.isDisplayed());
	    logger.info("Order is returned messages displayed successfully");
	}
	//write review 
	@When("User click on Orders button")
	public void userClickOnOrdersButton() {
		click(pomFactory.orderPage().orderLink);
		logger.info("user is orders page");
		
	    
	}
	@When("User click on first order")
	public void userClickOnFirstOrder() {
		click(pomFactory.orderPage().firstOrderOntheList);
		logger.info("user clicked on the first order on the list");
	    
	}
	@When("User click on Review button")
	public void userClickOnReviewButton() {
		click(pomFactory.orderPage().reviewButton);
		logger.info("user clicked on review button ");
	    
	}
	@When("User write Review headline {string} and {string}")
	public void userWriteReviewHeadlineAnd(String Headline, String Review) {
		Headline = "this order sucked";
		Review ="did not even worked";
		sendText(pomFactory.orderPage().headlineInput,Headline);
		sendText(pomFactory.orderPage().commentInput,Review);
		logger.info("User added review");
	   
	}
	@When("User click Add your Review button")
	public void userClickAddYourReviewButton() {
		click(pomFactory.orderPage().addReviewButton);
		logger.info(("review was added successfully"));
	    
	}
	@Then("a review message should be displayed {string}")
	public void aReviewMessageShouldBeDisplayed(String string) {
		waitTillPresence(pomFactory.orderPage().reviewAddedSuccessMsg);
		Assert.assertTrue(pomFactory.orderPage().reviewAddedSuccessMsg.isDisplayed());
		logger.info(("review addeded message shown successfully"));
	}

}
	


