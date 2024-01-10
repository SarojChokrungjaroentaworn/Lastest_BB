package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class ShoppingCartPage {

	public ShoppingCartPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

	@FindBy(xpath = "//button[@id='top-cart-btn-checkout']")
	public WebElement proceedCheckOut;

	@FindBy(xpath = "//a[@title='Remove item']")
	public WebElement trash;

	@FindBy(xpath = "//button[@class='action-primary action-accept']")
	public WebElement okToDeleteItem;
	
	@FindBy(xpath = "//footer[@class='modal-footer']/button[2]")
	public WebElement okToDeleteItem2;
	
	
	
	@FindBy(xpath = "//footer[@class='modal-footer']/button[2]")
	public WebElement deleteItem;

	@FindBy(xpath = "//a[@class='action viewcart']")
	public WebElement viewAndEditCart;

	@FindBy(xpath = "//table[@id='shopping-cart-table']/tbody[1]")
	public WebElement firstItemInCart;
	
	@FindBy(xpath = "//strong[@class='subtitle empty']")
	public WebElement emptyCart;
	
	@FindBy(xpath = "//div[@class='minicart-items-wrapper']/ol/li[1]//input[1]")
	public WebElement qtyBoxFirstItem;
	
	@FindBy(xpath = "//button[@title='Update']")
	public WebElement updateButton;
	
	@FindBy(xpath = "//input[@class='input-text qty']")
	public WebElement QTYBoxInviewAndEditcart;
	
	@FindBy(xpath = "//button[@title='Update Shopping Cart']")
	public WebElement updateShoppingCart;
	
	@FindBy(xpath = "//td[@class='col subtotal']")
	public WebElement subTotal;
	
	@FindBy(xpath = "//div[@class='new-address-popup']/button")
	public WebElement addNewAddress;
	
//	@FindBy(xpath = "//input[@data-role='cart-item-qty']")
//	public WebElement qtyTextBox;
	
	@FindBy(xpath = "//div[@class='details-qty qty']/input")
	public WebElement qtyTextBox;
	
	@FindBy(xpath = "//td[@class='col qty']//input")
	public WebElement qtyTextboxInShoppingcart;
	
	@FindBy(xpath = "//table[@id='shopping-cart-table']/tbody")
	public List<WebElement> itemList;
	
	@FindBy(xpath = "//table[@id='shopping-cart-table']/tbody[1]//a[@title='Remove item']")
	public WebElement deleteFirstItem;
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
