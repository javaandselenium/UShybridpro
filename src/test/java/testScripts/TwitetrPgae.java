package testScripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.SeleniumPage;
import pomPages.SkillraryLoginPaage;
import pomPages.TakesCoursePage;

public class TwitetrPgae extends BaseClass{
	@Test
	public void tc3() throws FileNotFoundException, IOException, InterruptedException {
	SkillraryLoginPaage s=new SkillraryLoginPaage(driver);
	s.serachtextbox(pdata.getData("courseName"));
	s.serachButton();
	
	SeleniumPage s1=new SeleniumPage(driver);
	s1.corejava();
	
	TakesCoursePage t=new TakesCoursePage(driver);
	driverutilies.frames(driver);
	t.playbutton();
	Thread.sleep(10000);
	t.pausebutton();
	driverutilies.switchback(driver);
	t.twittericon();
	}

}
