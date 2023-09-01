package tek.capstone.framework.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import tek.capstone.framework.pages.POMFactory;
import tek.capstone.framework.utilities.CommonUtility;

public class MultipleWindowsSteps extends CommonUtility{
	POMFactory pomFactory = new POMFactory(); 
	@Given("User is on retial website homepage")
	public void userIsOnRetialWebsiteHomepage() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("User click on Test Selenium link")
	public void userClickOnTestSeleniumLink() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("User verify {string} page")
	public void userVerifyPage(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("User verify Remove element is added to the page")
	public void userVerifyRemoveElementIsAddedToThePage() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
