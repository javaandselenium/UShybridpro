package testScripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.SkillraryDemoApp;
import pomPages.SkillraryLoginPaage;
import pomPages.TestingPage;

public class Facebook extends BaseClass{
	@Test
	public void tc2() throws FileNotFoundException, IOException {
		SkillraryLoginPaage s=new SkillraryLoginPaage(driver);
		s.gearsbutton();
		s.skillrarydemoapp();
		
		SkillraryDemoApp sd=new SkillraryDemoApp(driver);
		driverutilies.switchTabs(driver);
		driverutilies.dropDown(sd.getTestingdd(),pdata.getData("dropdownValue"));
	
	
		TestingPage t=new TestingPage(driver);
		driverutilies.dragdrop(driver,t.getSeleniumcourse(),t.getCart());
		Point loc = t.getFacebook().getLocation();
		int x=loc.getX();
        int y=loc.getY();		
		driverutilies.scrollbar(driver, x, y);
		t.facebookicon();
	
	}

}
