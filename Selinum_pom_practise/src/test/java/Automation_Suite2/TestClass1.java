package Automation_Suite2;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import utils.BaseClass;
import utils.Reading_configproperties_file;

public class TestClass1 extends BaseClass {
  
	
	@Test
  public void C1M1(){
		
		WebDriver driver = launchapp();
		LandingPage LandingPage_obj = new LandingPage(driver);
		LandingPage_obj.Register_link.click();
		
}
	
	
	

	
	
}
