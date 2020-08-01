package resources;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentAventReporter;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.utils.FileUtil;


public class base {
	protected WebDriver driver;
	
	public Logger log;
	
	ThreadLocal<Logger> ThreadLogger = new ThreadLocal<Logger>();
	
	public static File imgfiledir =new File(System.getProperty("user.dir")+"//screenshots");
	
//	public void extentSetUp(){
//		report = new ExtentReports();
//		reporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"\\Extentreports\\report.html");
//		report.attachReporter(reporter);
//		String cwd = System.getProperty("user.dir");
//		String configfilepath = cwd+"\\src\\main\\java\\configurations\\avent-config.xml";
//		System.out.println(configfilepath);
//	reporter.loadXMLConfig(new File(configfilepath), false);
////		reporter.loadXMLConfig(System.getProperty("user.dir")+"\\src\\main\\java\\configurations\\avent-config.xml");
//		
//	}
		
	public void wbopenurl(String url){
		driver.get(url);
		log.debug("successfully navigated to url");
//		test.log(Status.PASS,"Successfully navigated to url");

		
	}
	
	public void wbClick(WebElement element){
		element.click();
//		test.log(Status.PASS, "clicked on element");
		log.debug("click action performed");
		
	}
	
	
	
	public void wbScreenShot() throws IOException{
		
		TakesScreenshot screenshot = ((TakesScreenshot)driver);
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFileToDirectory(src, imgfiledir);
		
	}

}
