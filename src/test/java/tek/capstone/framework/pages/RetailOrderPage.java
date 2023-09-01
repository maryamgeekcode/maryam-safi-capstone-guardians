package tek.capstone.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.framework.base.BaseSetup;

public class RetailOrderPage extends BaseSetup{
public RetailOrderPage() {

PageFactory.initElements(getDriver(), this); 
}
@FindBy(id="search")
public WebElement searchDropDown;
@FindBy(xpath="//option[text()='Smart Home']")
public WebElement smartHomeOption;
@FindBy(id="searchInput")
public WebElement searchBar;
@FindBy(id="searchBtn")
public WebElement searchBtn;
@FindBy(xpath="//img[starts-with(@alt, 'Kasa Outdoor Smart Plug')]")
public WebElement kasaProduct;
@FindBy(xpath= "//select(starts-with(@class,'product_select')]")
public WebElement productSelection;
@FindBy(id="addToCartBtn")
public WebElement addToCartBtn;
@FindBy(xpath="//span[@id='CartQuantity']")
public WebElement cartQuantity;



// order number 2
@FindBy(xpath= "//img[starts-with(@alt,'Apex Legends')]")
public WebElement apexLegends;
@FindBy(id="cartBtn")
public WebElement cartButton;
@FindBy(id="proceedBtn")
public WebElement checkout;
@FindBy(id="placeOrderBtn")
public WebElement placeOrder;
@FindBy(xpath= "/div[text()='Order Placed Successfully']")
public WebElement orderPlaceMsg;

//cancle order 
@FindBy(id="orderLink")
public WebElement orderLink;
@FindBy(xpath= "//div[@class='order']//descendant::p[7]")
public List<WebElement> listOfOrders;
@FindBy(xpath= "//button[text()='Cancel The Order']")
public List<WebElement> cancleTheOrderButton; 
@FindBy(id="cancelBtn")
public WebElement cancleOrder;
@FindBy(xpath= "//select[@id='reasonInput']")
public WebElement reasonToCancle;
@FindBy(xpath ="//button[@id='orderSubmitBtn']")
public WebElement cancelOrderButton;
@FindBy(xpath="//div[@class='cancel__confirm-message']") 
public WebElement cancleOrderMsg;

// return order 
@FindBy(xpath= "//p[@class='order__header-btn']")
public WebElement OrderNumberOneOntheList;
@FindBy(xpath= "//*[@id='returnBtn']")
public WebElement returnOrderBtn;
@FindBy(id="reasonInput")
public WebElement listOfReturnReason;
@FindBy(id="dropOffInput")
public WebElement dropOffOptions;
@FindBy(id="orderSubmitBtn")
public WebElement submitReturnOrder;
@FindBy(xpath = "//div[@class='return__confirm-card ']")
public WebElement orderReturnMessg; 

//review
@FindBy(xpath= "//div[@class='order']")
public WebElement firstOrderOntheList;
@FindBy(xpath= "//button[@class='order__item-btn']") 
public WebElement reviewButton;

@FindBy(xpath="//input[@id='headlineInput']") 
public WebElement headlineInput;

@FindBy(xpath="//textarea[@name='comment']") 
public WebElement commentInput;

@FindBy(xpath="//button[@id='reviewSubmitBtn']") 
public WebElement addReviewButton;

@FindBy(xpath="//div[text()='Your review was added successfully']") 
public WebElement reviewAddedSuccessMsg;

}
