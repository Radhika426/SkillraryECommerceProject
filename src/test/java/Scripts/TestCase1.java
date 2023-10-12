package Scripts;

import org.testng.annotations.Test;
import GenericLibrary.BaseClass;
import POM.SkillraryDemoAppPage;
import POM.SkillraryHomePage;
import POM.TestingPage;

public class TestCase1 extends BaseClass {
	
	@Test
	public void tc1() throws Throwable {
		SkillraryHomePage hp=new SkillraryHomePage(driver);
		SkillraryDemoAppPage ds=new SkillraryDemoAppPage(driver);
		TestingPage tp=new TestingPage(driver);
		hp.clickGearsLink();
		hp.SkillraryDemoAppLinK();
		utilities.dropDowns(ds.getSelectCategoryDd(),pdata.getPropertyFile("coursedd"));
	    utilities.scrollWithoutCoordinates(driver, tp.getFbIcon());
	    tp.facebookIconLink();
	}

}
