package MavenSeleniumTestProject.seleniumProject;

import java.lang.reflect.InvocationTargetException;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import pagesources.FaceBookLandingPage;
import resources.base;

public class Module extends base {
	
	
	static FaceBookLandingPage fbpage;
//	public static void run(WebDriver driver) throws InterruptedException{
//		fbpage =new  FaceBookLandingPage(driver);
//		driver.navigate().to("https://www.facebook.com");
//		Thread.sleep(5000);
//		wbType(fbpage.getEmailField(),"vchandu980");
//		
//		
//	}
	public void run(WebDriver driver,Logger log) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException{
		this.driver = driver;
		this.log = log;
		fbpage = new  FaceBookLandingPage(driver);
		mainrun();
		
		
	}
	
	public void mainrun()throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException{
		this.driver = driver;
		wbopenurl("https://www.facebook.com");
		wbType(fbpage.getEmailField(),"vchandu980");
	}

}
