package cgi.penta.testUtills;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {
	public File file;
	final static Properties properties = new Properties();
	public static FileInputStream fileInputStream = null;
	final static String dir = System.getProperty("user.dir");
	static String basedir = "./src/cgi/penta/pageLocaters/";
	final static String propertyfile_besedir = "./resource/propertyFile/";

	public PropertiesReader() {
		System.out.println(dir);
	}

	public Properties loadProperties() {
		try {
			// load the config.properties using the Properties
			fileInputStream = new FileInputStream(propertyfile_besedir + "config.properties");
			properties.load(fileInputStream);

			// loading "loginPage" properties
			fileInputStream = new FileInputStream(basedir + "loginPage.properties");
			properties.load(fileInputStream);
			

		} catch (IOException e) {
			e.getMessage();
		}
		return properties;
	}

}
