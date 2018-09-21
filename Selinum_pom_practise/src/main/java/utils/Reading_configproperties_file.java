package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class Reading_configproperties_file {

	
	public String readWriteConfig(String key)
	
{
		System.out.println("here");
		String value = "";
		try
		{
			Properties prop = new Properties();
			FileInputStream Filenew = new FileInputStream("src//test//resources//properties_file//config.properties"); 
			prop.load(Filenew);
		value=	prop.getProperty(key);
			
		}
		catch(Exception e)		
		{
			e.printStackTrace();
		}
		
		
		
		
		return value;
		

}
	
	
}
