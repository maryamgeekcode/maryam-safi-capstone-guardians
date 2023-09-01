package tek.capstone.framework.pages;

import tek.capstone.framework.base.BaseSetup;

public class POMFactory extends BaseSetup{
	
	private RetailHomePage homePage;
	private SignInPage signInPage; 
	private RetailAccountPage accountPage; 
	private RetailOrderPage orderPage; 
	private MultipleWindowsPage multipleWindowsPage;
	
    public POMFactory() {
    	this.homePage = new RetailHomePage();
    	this.signInPage = new SignInPage();
    	this.accountPage= new RetailAccountPage();
    	this.orderPage= new RetailOrderPage(); 
    	this.multipleWindowsPage = new MultipleWindowsPage();
    }
    public RetailHomePage homePage() {
        return this.homePage;
    }
    public SignInPage signInPage() {
    	return this.signInPage; 
    }
    public RetailAccountPage accountPage() {
    	return this.accountPage;
    }
    public RetailOrderPage orderPage() {
    	return this.orderPage; 
    }
	public MultipleWindowsPage multipleWindowsPage() {
		return this.multipleWindowsPage;
	}
}
