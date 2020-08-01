package resources;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportTest {
	public static ExtentReports report;
	
	public static ExtentReports getExtentReport(){
		
		ExtentHtmlReporter reporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"//Extentreports//report.html");
		
		String cwd = System.getProperty("user.dir");
		String configfilepath = cwd+"//src//main//java//configurations//avent-config.xml";
//		System.out.println(configfilepath);
	reporter.loadXMLConfig(new File(configfilepath), false);
	report = new ExtentReports();
	report.attachReporter(reporter);
	return report;
	}

}
