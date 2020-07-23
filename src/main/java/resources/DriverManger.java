package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DriverManger {
	
	public static WebDriver driver;
	
	public static Properties readProperties() throws IOException{
		String cwd = System.getProperty("user.dir");
		String propfile = cwd+"\\src\\main\\java\\configurations\\config.properties";
		
		FileInputStream fis = new FileInputStream(new File(propfile));
		Properties p = new Properties();
		p.load(fis);
		return p;
	}
	
	
	public static WebDriver getDriver() throws IOException{
		Properties p = readProperties();
		String browser = p.getProperty("browser");
		
		if(browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver","C:\\Users\\chandrasekhar\\Eclipse Selenium wokspace\\selenium drivers\\chromedriver.exe");
			System.out.println("initialized");
			driver = new ChromeDriver();
		}
		
			
		return driver;
		
		
	}

}
