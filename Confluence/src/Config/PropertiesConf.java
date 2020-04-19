package Config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesConf {

	static Properties prop;
	
	public static void loadData() throws IOException {
		 prop = new Properties();
		FileInputStream data=new FileInputStream(System.getProperty("user.dir")+"\\src\\Config\\Variablesfile.properties");
		prop.load(data);
	}
	
	public static String getObject(String Data) throws IOException {
		loadData();
		String data = prop.getProperty(Data);
		return data;
	}
	
}
