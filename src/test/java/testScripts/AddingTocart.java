package testScripts;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.Addtocart;
import pomPages.SkillraryDemoApp;
import pomPages.SkillraryLoginPaage;

public class AddingTocart extends BaseClass {
	@Test
	public void tc1() {
	SkillraryLoginPaage s=new SkillraryLoginPaage(driver);
	s.gearsbutton();
	s.skillrarydemoapp();
	
	SkillraryDemoApp sd=new SkillraryDemoApp(driver);
	driverutilies.switchTabs(driver);
	driverutilies.mouseHover(driver,sd.getCoursebtn());
	sd.seleniumtariing();
	
	Addtocart a=new Addtocart(driver);
	driverutilies.doubleClick(driver,a.getAdd());
	a.addtocartbtn();
	driverutilies.alertPopup(driver);
	
	
	
	}

}
