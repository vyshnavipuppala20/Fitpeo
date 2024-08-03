package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class configuration {
	public String getProperties() throws IOException {
		
		Properties property= new Properties();
		InputStream in= new FileInputStream("configFiles/configFile.properties");
		property.load(in);
		String Url=property.getProperty("FitpeoHomepage");
		System.out.println(Url);
		return Url;
	}
	
	
	
}
