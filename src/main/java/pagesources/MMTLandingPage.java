package pagesources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MMTLandingPage {
	WebDriver driver;
	
	public MMTLandingPage(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath="//li[@data-cy='account']")
	WebElement LoginSignupButton;
	
	@FindBy(css="input[id='username']")
	WebElement UserNameField;
	
	@FindBy(xpath="//span[contains(text(),'Continue')]")
	WebElement ContinueButton;
	
	@FindBy(css="input[type='password']")
	WebElement PasswordField;
	
	@FindBy(xpath="//button[@data-cy='login']")
	WebElement LoginButton;
	
	
	public WebElement LoginSignupButton(){
		return LoginSignupButton;
	}
	
	public WebElement UserNameField(){
		return UserNameField;
	}
	
	public WebElement PasswordField(){
		return PasswordField;
	}
	
	public WebElement LoginButton(){
		return LoginButton;
	}
	
	public WebElement ContinueButton(){
		return ContinueButton;
	}
	
	
}
