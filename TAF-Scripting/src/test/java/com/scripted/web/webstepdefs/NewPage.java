package com.scripted.web.webstepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import com.scripted.web.BrowserDriver;
import com.scripted.web.WebHandlers;
import com.scripted.web.WebWaitHelper;

public class NewPage {

	private WebDriver driver;
	
	public NewPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(id = "store-search-input")
	private WebElement input_q;
	@FindBy(xpath = "//*[@id=\"store-details-pane\"]/div/button")
	private WebElement setasmyStore;
	@FindBy(xpath = "//div[@objectspyxpath='objectspy']")
	private WebElement div_vC;
	@FindBy(xpath = "//mct-img[@mi-src='https://cdn.savemart.com/site/made-to-order/fried_chicken.jpeg']//div[@class='mct-img']")
	private WebElement div_Kk;
	@FindBy(xpath = "//*[@id='templater_column_cards_60_img_link_1']/mct-img/div")
	private WebElement madetoorder;
	@FindBy(xpath = " //*[@id='templater_column_cards_59_img_link_1']/mct-img/div")
	private WebElement friedChicken;

	@FindBy(xpath = "//span[normalize-space()='Select Options1234']")
	private WebElement span_SelectOptions;

	@FindBy(xpath = "//a[@aria-label='Shop']//span[contains(text(),'Shop')]")
	private WebElement span_aoShop;

	/////////// Hobbs.com//////////////////////////////////

	@FindBy(xpath = "//span[normalize-space()='New In12']")
	private WebElement span_mSNewIn;
	@FindBy(xpath = "//button[contains(text(),'Add to Bag')]")
	private WebElement button_nLAddtoBag;
	@FindBy(xpath = "//a[normalize-space()='View Bag & Checkout']")
	private WebElement a_BRViewBagChecko;
	@FindBy(xpath = "//div[@class='container-fluid porceleinBg py-6 allSale d-none d-md-block']//a[@class='blackLink saleLink mr-4'][normalize-space()='New In Coats & Jackets']")
	private WebElement a_RNNewInCoatsJac;
	@FindBy(xpath = "//div[@class='checkout-and-applepay']//a[@role='button'][normalize-space()='Checkout Securely']")
	private WebElement a_NHCheckoutSecur;

	
	
	@FindBy(id = "onetrust-accept-btn-handler")
	private WebElement acceptcookies;
	@FindBy(xpath = "//*[@id='product-search-results']/div[2]/div[3]/div/div[2]/div[1]/div/div/div[2]/div[2]/div/a")
	private WebElement selectFirstProduct;
	@FindBy(xpath = "//div[@class='row no-gutters product-detail__attributes-accordion']/div/div[2]/div[2]/div/div[1]/p/span")
	private WebElement selectSize;
	@FindBy(xpath = "//span[@class='minicart-quantity']")
	private WebElement minicartqty;
	@FindBy(xpath = "//button[@class='btn btn-block btn-secondary']")
	private WebElement continueSecurely;
	@FindBy(id = "login-form-email")
	private WebElement email;
	@FindBy(id = "//a[contains(text(),'Checkout as guest')]")
	private WebElement Checkout_as_guest;
	@FindBy(xpath = "//div[@class='checkout-and-applepay']//a[@role='button'][normalize-space()='Checkout Securely']123")
	private WebElement CheckoutSecur;
	
	

	public void select_product() throws InterruptedException {
		waitforsec(2000);
		WebHandlers.clickByJsExecutor(acceptcookies);
		waitforsec(3000);
		WebHandlers.clickByJsExecutor(span_mSNewIn);
		waitforsec(3000);
		WebHandlers.clickByJsExecutor(a_RNNewInCoatsJac);
		waitforsec(8000);
		JavascriptExecutor yu = (JavascriptExecutor) driver;
		yu.executeScript("arguments[0].scrollIntoView(true);", selectFirstProduct);
		WebHandlers.clickByJsExecutor(selectFirstProduct);	
		waitforsec(5000);
		WebHandlers.scrollBy(0, 250);
		WebHandlers.clickByJsExecutor(selectSize);
	}
	
	public void add_producttotheCart() throws InterruptedException {
		JavascriptExecutor yu = (JavascriptExecutor) driver;
		waitforsec(5000);
		WebHandlers.clickByJsExecutor(button_nLAddtoBag);
		waitforsec(5000);
		WebHandlers.clickByJsExecutor(minicartqty);
		waitforsec(5000);
		WebHandlers.scrollBy(0, 250);
		waitforsec(1000);
		WebHandlers.clickByJsExecutor(CheckoutSecur);
		
	}

	public void forpayment() throws InterruptedException {
		waitforsec(5000);
		WebHandlers.click(continueSecurely);
		waitforsec(5000);
		WebHandlers.enterText(email, "test@test.com");
		waitforsec(5000);
		WebHandlers.click(Checkout_as_guest);
		waitforsec(3000);
	}
	

	public void select_shop() throws InterruptedException {

		WebHandlers.click(span_aoShop);
		Thread.sleep(7000);
		WebHandlers.click(madetoorder);
		Thread.sleep(7000);
		WebHandlers.click(friedChicken);
		Thread.sleep(7000);
		WebHandlers.scrollBy(0, 400);
		WebHandlers.clickByJsExecutor(span_SelectOptions);

	}
	
	public void waitforsec(long hours) throws InterruptedException {
		Thread.sleep(hours);
	}
}
