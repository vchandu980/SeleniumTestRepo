package MavenSeleniumTestProject.seleniumProject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pagesources.MMTLandingPage;
import resources.DriverManger;
import resources.base;


public class TestCases extends base{
	MMTLandingPage mmt;
	
	
	@BeforeClass
	public void configurationsSetup() throws IOException{
		driver = DriverManger.getDriver();
		log=LogManager.getLogger(base.class.getName());
		
		mmt = new MMTLandingPage(driver);
	}
	
	@Test
	public void MMTTest1() throws IOException{
		
		
		
		wbopenurl("https://www.makemytrip.com");
		wbClick(mmt.LoginSignupButton());
		wbScreenShot();
		
	}
	
	
	
	@AfterClass
	public void tearDown(){
		System.out.println("flushed");
		System.out.println("New change i for checking github usage");
		driver.quit();
	}
}
