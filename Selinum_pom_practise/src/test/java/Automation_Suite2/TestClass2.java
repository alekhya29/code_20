package Automation_Suite2;

import org.testng.annotations.Test;

import utils.Reading_configproperties_file;

public class TestClass2 {
  @Test
  public void C21M1(){
	  try
	  {

		Reading_configproperties_file Reading_configproperties_file_obj = new Reading_configproperties_file();
				
		String url = Reading_configproperties_file_obj.readWriteConfig("appurl");
		System.out.println(url);
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
	}
		
		
  }

