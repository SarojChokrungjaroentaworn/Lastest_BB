package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class HotSellerPage {

	public HotSellerPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

	@FindBy(xpath = "//ol[@class='product-items widget-product-grid']/li//strong[@class='product-item-name']/a")
	public List<WebElement> hotSellerWidgetList;

	@FindBy(xpath = "//ol[@class='product-items widget-product-grid']/li[1]/div/a")
	public WebElement radiantTee;

}
