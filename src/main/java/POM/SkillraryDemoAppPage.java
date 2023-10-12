package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoAppPage {
	
	//Declaration
	@FindBy(id = "course")
	private WebElement courseLink;
	
	@FindBy(linkText = "FEEDBACK")
	private WebElement feedback;
	
	/*@FindBy(name="addresstype")
	private WebElement selectCategoryDd;*/
	
	@FindBy(xpath = "//select[@name='addresstype']")
	private WebElement selectCategoryDd;
	
	//Initialization
	public SkillraryDemoAppPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//Utilization(Getter Methods)
	public WebElement getCourseLink() {
		return courseLink;
	}
	
	public WebElement getSelectCategoryDd() {
		return selectCategoryDd;
	}

	//Business Libraries
	public void feedbackLink() {
		feedback.click();
	}
}
