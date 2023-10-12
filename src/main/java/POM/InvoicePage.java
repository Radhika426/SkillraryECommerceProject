package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvoicePage {
	
	//Declaration
	@FindBy(xpath = "//input[@name='downloadInvoice']")
	private WebElement invoiceBtn;
	
	//Initialization
	public InvoicePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization(Business Libraries)
	public void invoiceButton() {
		invoiceBtn.click();
	}

}
