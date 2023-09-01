package tek.capstone.framework.steps;
import java.util.List;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.framework.pages.POMFactory;
import tek.capstone.framework.utilities.CommonUtility;


public class RetailHomeSteps extends CommonUtility{
	
POMFactory pomFactory = new POMFactory(); 
	@Given("User is on the retial home page")
	public void userIsOnTheRetialHomePage() {
		Assert.assertTrue(pomFactory.homePage().tekSchoolLogo.isDisplayed());
		logger.info("tekSchool  logo is displayed");
		
	}
	@When("User click on All section")
	public void userClickOnAllSection() {
		clickElementWithJS(pomFactory.homePage().sideBar);
		logger.info("side bar drop down was clicked");
	    
	}
	@Then("below options are present in Shop by Department sidebar")
	public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable dataTable) {
		List<List<String>> shopByDepartment = dataTable.asLists(String.class); 
		for(int i= 0; i < shopByDepartment.get(0).size(); i++) {
			Assert.assertTrue(isElementDisplayed(getDriver().findElement
					(By.xpath("//div[@class='modal__content h-screen w-80 ']//span[text()='"+shopByDepartment.get(i)+"']"))));
			logger.info("All Elements are displayed"); 			
		}  
}
	@When("User on {string}")
	public void userOn(String department) {
		List<WebElement> departments =pomFactory.homePage().sideBarOptions;
		for(int i =0; i < departments.size();i++) {
			if(departments.get(i).getText().equalsIgnoreCase(department)) {
				departments.get(i).click();
				break;
			}
		}
	    
	}
	@Then("below options are present in department")
	public void belowOptionsArePresentInDepartment(DataTable dataTable) {
		List<List<String>> departmentOptions = dataTable.asLists(String.class);
		List<WebElement> allOptions = pomFactory.homePage().SideBarAllOptions;
		
		for(int i=0 ; i < departmentOptions.get(0).size(); i++) {
			for(WebElement elements : allOptions) {
				
				if(elements.getText().equalsIgnoreCase(departmentOptions.get(0).get(i))) {
					Assert.assertTrue(elements.isDisplayed());
					logger.info("the option " + elements.getText() + "is present");
				}
			}
		}
	   
	}
}
