package tek.capstone.framework.pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.framework.base.BaseSetup;
import org.openqa.selenium.WebElement;

public class SignInPage extends BaseSetup{
	public SignInPage() {
		PageFactory.initElements(getDriver(), this); 
	}
	
@FindBy(xpath ="//a[@id='signinLink']")
public WebElement signInBtn; 
@FindBy(id="email")
public WebElement emialInput;
@FindBy(id= "password")
public WebElement passwordInput; 
@FindBy(id="loginBtn")
public WebElement loginButton; 
@FindBy(id="logoutBtn")
public WebElement loggoutButton; 
@FindBy(id="newAccountBtn")
public WebElement newAccountBtn;
@FindBy(id="nameInput")
public WebElement nameInput;
@FindBy(id="emailInput")
public WebElement emailField;
@FindBy(id="passwordInput")
public WebElement passwordField;
@FindBy(id="confirmPasswordInput")
public WebElement confirmPassword;
@FindBy(id="signupBtn")
public WebElement signUpBtn;
@FindBy(id="profileImage")
public WebElement profileImg; 
}
