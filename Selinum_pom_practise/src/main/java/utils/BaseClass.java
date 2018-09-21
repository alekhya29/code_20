package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BaseClass {
	
	WebDriver driver;
	public WebDriver launchapp()
	{
		Reading_configproperties_file Reading_configproperties_file_obj = new Reading_configproperties_file();
		
		String url = Reading_configproperties_file_obj.readWriteConfig("appurl");
		String browser = Reading_configproperties_file_obj.readWriteConfig("browser");
		if(browser.equals("chrome")) {
		System.getProperty("webdriver.chrome.driver","src\\test\\resources\\drivers\\chromedriver.exe" );
		 driver = new ChromeDriver();
		}
		 else if (browser.equals("firefox"))
		 {
		 System.getProperty("webdriver.gecko.driver","src\\test\\resources\\drivers\\geckodriver.exe" );
		 driver = new FirefoxDriver();
		 }
		 else if (browser.endsWith("ie"))
		 {
			 System.getProperty("webdriver.ie.driver","src\\test\\resources\\drivers\\IEDriverServer.exe" );
			DesiredCapabilities capab = DesiredCapabilities.internetExplorer();
			capab.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true); 
			driver = new InternetExplorerDriver(capab);
		 }
		
		
		driver.get(url);
		
		
		
		
		return driver;
		
		
		
		
	}	
	
	
	

}
