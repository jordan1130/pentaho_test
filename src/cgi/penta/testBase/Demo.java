package cgi.penta.testBase;

import java.io.File;

public class TestBase extends Utills{
	
	public static Properties Repository = new Properties();
	public File f;
	public FileInputStream FI;
	public Xls_Reader Data;
	
	
	
	public void init() throws IOException{
		loadPropertiesFile();
		selectBrowser(Repository.getProperty("browser"));
		impliciteWait(30);
		driver.get(Repository.getProperty("url"));
	}
	
	
	public void loadPropertiesFile() throws IOException {
		f = new File(System.getProperty("user.dir")+"\\src\\cgi.penta\\config\\config.properties");
		FI = new FileInputStream(f);
		Repository.load(FI);
		
		f = new File(System.getProperty("user.dir")+"\\src\\cgi.penta\\pageLocators\\loginpage.properties");
		FI = new FileInputStream(f);
		Repository.load(FI);
		
		f = new File(System.getProperty("user.dir")+"\\src\\cgi.penta\\pageLocators\\reportsPage.properties");
		FI = new FileInputStream(f);
		Repository.load(FI);
		
		f = new File(System.getProperty("user.dir")+"\\src\\cgi.penta\\pageLocators\\timeTracks.properties");
		FI = new FileInputStream(f);
		Repository.load(FI);
		
		f = new File(System.getProperty("user.dir")+"\\src\\cgi.penta\\pageLocators\\taskPage.properties");
		FI = new FileInputStream(f);
		Repository.load(FI);
		
		/*f = new File(System.getProperty("user.dir")+"\\src\\Config\\AppText.properties");
		FI = new FileInputStream(f);
		AppText.load(FI);	*/	
		
	} 

}
