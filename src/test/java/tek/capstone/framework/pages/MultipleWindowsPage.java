package tek.capstone.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.framework.base.BaseSetup;

public class MultipleWindowsPage extends BaseSetup{
	public MultipleWindowsPage() {
		PageFactory.initElements(getDriver(), this);
	}
	@FindBy(xpath = "//a[text()= 'Test Selenium']")
	public WebElement testSelenium;
	@FindBy(id="addBtn")
	public WebElement addNewElementBtn;
	@FindBy(xpath= "//p[text() = 'Add or Remove Elements']")
	public WebElement addOrRemoveTitle;
	@FindBy(xpath= "//button[text()='Remove']")
	public WebElement verifyRemove;

}
