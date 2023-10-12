package GenericLibrary;

import java.util.Set;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities {
	
	//1.Handling Dropdowns
	public void dropDowns(WebElement ele,String text) {
		Select s=new Select(ele);
		s.selectByVisibleText(text);
	}
	
	//2.Right Click
	public void rightClick(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.contextClick(ele).perform();
	}
	
	//3.Double Click
	public void doubleClick(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.doubleClick(ele).perform();
	}
	
	//4.Mouse Hovering
	public void mouseHover(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
	}
	
	//5.Drag and Drop
	public void dragAndDrop(WebDriver driver,WebElement ele1,WebElement ele2) {
		Actions a=new Actions(driver);
		a.dragAndDrop(ele1,ele2).perform();
	}
	
	//6.Alert Popup
	public void alertAccept(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	//7.Child Browser
	public void childBrowser(WebDriver driver) {
		Set<String> child = driver.getWindowHandles();
		for(String b:child) {
			driver.switchTo().window(b);
		}
	}
	
	//8.Scrolling using getLocation()
	public void scrollWithCoordinates(WebDriver driver,WebElement ele,int x,int y) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.ScrollBy("+x+","+y+")");
	}
	
	//9.Scrolling using WebElement
	public void scrollWithoutCoordinates(WebDriver driver,WebElement ele) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",ele);
	}
	
	//10.Clicking using JavaScriptExecutor
	public void clickUsingJavaScriptExecutor(WebDriver driver,WebElement ele) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",ele);
	}

}
