package cgi.penta.testUtills;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {
	public File file;
	public Properties properties = new Properties();
	public FileInputStream fileInputStream = null;
	final static String dir = System.getProperty("user.dir");
	String basedir = "./src/com/explorer/pageLocators/";
	final String propertyfile_besedir = "./resource/propertyFile/";

	public PropertiesReader() throws IOException {
		System.out.println(dir);
		loadProperties();

	}

	public void loadProperties() throws IOException {

		// file = new File(dir +
		// "\\src\\com\\explorer\\pageLocators\\api.properties");
		// Get the inputStream
		fileInputStream = new FileInputStream(basedir + "loginPage.properties");
		// loading properties file
		properties.load(fileInputStream);

		// loading "catalog" properties
		fileInputStream = new FileInputStream(basedir + "catalog.properties");
		properties.load(fileInputStream);

		// loading "catalog" properties
		fileInputStream = new FileInputStream(basedir + "catalog.properties");
		properties.load(fileInputStream);

		// loading "catalog" properties
		fileInputStream = new FileInputStream(basedir + "catalog.properties");
		properties.load(fileInputStream);

		// loading "catalog" properties
		fileInputStream = new FileInputStream(basedir + "catalog.properties");
		properties.load(fileInputStream);

		// load the config.properties using the Properties
		fileInputStream = new FileInputStream(basedir + "config.properties");
		properties.load(fileInputStream);

	}

}
