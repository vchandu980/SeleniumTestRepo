package pagesources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBookLandingPage {
	WebDriver driver;
	public FaceBookLandingPage(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(css="input[id='email']")
	WebElement emailTextField;
	
	public WebElement getEmailField(){
		return this.emailTextField;
	}
}
