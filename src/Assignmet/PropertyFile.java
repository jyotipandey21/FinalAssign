package Assignmet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;


public class PropertyFile {
	
public static String doesFileExits(String a) throws Exception {
	String path=".\\Data\\Credentials.prop";
	try
	{ 
	 Properties prop=new Properties();
	FileInputStream input=new FileInputStream(path);
			prop.load(input);
			
			return prop.getProperty(a);

	}
	catch(FileNotFoundException e) {
		System.out.println("file not found");
	return null;

	}
}
	
	
	
	
	
	
	
	
	
	
	
	

}
