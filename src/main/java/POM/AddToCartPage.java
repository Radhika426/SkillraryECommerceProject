package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
	
	    //Declaration
		@FindBy(xpath = "//i[@class='fa fa-plus']")
		private WebElement plusIcon;
		
		@FindBy(xpath = "//button[text()=' Add to Cart']")
		private WebElement addToCart;
		
		//Initialization
		public AddToCartPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		//Utilization(Getter Methods)
		public WebElement getPlusIcon() {
			return plusIcon;
		}
		
		//Business Libraries
		public void addToCart() {
			addToCart.click();
		}

}
