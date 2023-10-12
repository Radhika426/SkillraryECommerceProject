package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryHomePage {
	
	//Declaration
	@FindBy(xpath = "//a[text()=' GEARS ']")
	private WebElement gearsLink;
	
	@FindBy(xpath = "(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillraryDemoApp;
	
	@FindBy(xpath="//input[@placeholder='Search for Courses']")
	private WebElement searchTf;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement searchIcon;
	
	@FindBy(xpath="//a[@class='close_cookies']")
	private WebElement cookies;
	
	//Intialization
	public SkillraryHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization(Business Libraries)
	public void clickGearsLink() {
		gearsLink.click();
	}
	
	public void SkillraryDemoAppLinK() {
		skillraryDemoApp.click();
	}
	
	public void searchTextfield(String data) {
		searchTf.sendKeys(data);
	}
	
	public void searchIcon() {
		searchIcon.click();
	}
	
	public void cookiesIcon() {
		cookies.click();
	}
	
}
