package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPaage {
@FindBy(xpath="//a[text()=' GEARS ']")
private WebElement gearsbtn;

@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
private WebElement skillrarydemo;


@FindBy(name="q")
private WebElement serachtb;

@FindBy(xpath="//input[@value='go']")
private WebElement serachbtn;

public SkillraryLoginPaage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

public void serachtextbox(String coursename) {
	serachtb.sendKeys(coursename);
}

public void serachButton() {
	serachbtn.click();
}

public void gearsbutton() {
	gearsbtn.click();
}

public void skillrarydemoapp() {
	skillrarydemo.click();
}
}
