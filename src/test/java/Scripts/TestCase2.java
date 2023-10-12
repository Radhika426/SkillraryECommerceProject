package Scripts;

import org.testng.annotations.Test;
import GenericLibrary.BaseClass;
import POM.InvoicePage;
import POM.SkillraryDemoAppPage;
import POM.SkillraryHomePage;

public class TestCase2 extends BaseClass{
	
	@Test
	public void tc2() {
		SkillraryHomePage hp=new SkillraryHomePage(driver);
		SkillraryDemoAppPage demo=new SkillraryDemoAppPage(driver);
		InvoicePage ip=new InvoicePage(driver);
		hp.clickGearsLink();
		hp.SkillraryDemoAppLinK();
		utilities.childBrowser(driver);
		demo.feedbackLink();
		ip.invoiceButton();
	}

}
