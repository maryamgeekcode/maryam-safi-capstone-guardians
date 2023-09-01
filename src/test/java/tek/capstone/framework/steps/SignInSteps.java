package tek.capstone.framework.steps;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.framework.pages.POMFactory;
import tek.capstone.framework.utilities.CommonUtility;


public class SignInSteps extends CommonUtility{
	POMFactory pomFactory = new POMFactory(); 
	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
	    Assert.assertTrue(pomFactory.homePage().tekSchoolLogo.isDisplayed());
	    logger.info("user is on homepage successfully and logo is displayed"); 
	}
	@When("User click on Sign in option")
	public void userClickOnSignInOption(){
		clickElementWithJS(pomFactory.signInPage().signInBtn); 
		logger.info("Login button was clicked");
	}
	@When("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String email, String password) {
		sendText(pomFactory.signInPage().emialInput,email); 
		sendText(pomFactory.signInPage().passwordInput,password);
		logger.info("email and password were entered");
	 
	}
	@When("User click on login button")
	public void userClickOnLoginButton() {
		clickElementWithJS(pomFactory.signInPage().loginButton);
		logger.info("login button was clicked");
	   
	}
	@Then("User should be logged in into Account")
	public void userShouldBeLoggedInIntoAccount() {
		Assert.assertTrue(pomFactory.signInPage().loggoutButton.isDisplayed());
	   logger.info("logout button is displayed and user is logged in");
	}
	// register
	   
	@When("User click on Create New Account button")
	public void userClickOnCreateNewAccountButton() {
		 click(pomFactory.signInPage().newAccountBtn);
		 logger.info("sign up button is clicked");
	}
	@When("User enter {string} and {string} and {string} and {string}")
	public void userEnterAndAndAnd(String name, String email, String password, String confirmPassword) {
		sendText(pomFactory.signInPage().nameInput,name);
		sendText(pomFactory.signInPage().emailField,email);
		sendText(pomFactory.signInPage().passwordField,password);
		sendText(pomFactory.signInPage().confirmPassword,confirmPassword);
		logger.info("needed data is entered");
	}
	@When("User click on SignUp button")
	public void userClickOnSignUpButton() {
	    click(pomFactory.signInPage().signUpBtn);
	    logger.info("sign up button is clicked");
	}
	@Then("User should be logged into account page")
	public void userShouldBeLoggedIntoAccountPage() {
	   Assert.assertTrue(pomFactory.signInPage().profileImg.isDisplayed());
	   logger.info("your profile is displayed");
	}
}
