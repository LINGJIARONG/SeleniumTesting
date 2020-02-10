package javahaha.version.selenum.JIa;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;
import java.util.prefs.Preferences;

import org.ini4j.Ini;
import org.ini4j.IniPreferences;
import org.ini4j.Profile.Section;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium_Test {
	
	private WebDriver driver;
	private Properties p ;

		//InputStream in = ClassLoader.getSystemResourceAsStream("src/main/java/javahaha.version.selenum.JIa.config.ini");
	public Selenium_Test() throws IOException {
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200","--ignore-certificate-errors"); 
		driver =new ChromeDriver();
		//driver =new ChromeDriver(options);
		p =new Properties();
		InputStream in = new BufferedInputStream(new FileInputStream(new File("config.ini")));
		p.load(in);
	}
	public String getUrl(String key) {
		return p.getProperty(key);
		
	}
	public void openDriver(String url){
		//System.setProperty("webdriver.chrome.driver", "X://chromedriver.exe");
		driver.get(url);
	}
	public void close() {
		driver.close();
	}
	
	public void get_element(String id) {
		driver.findElement(By.id(id));
	}
	public WebDriver getDriver() {
		return driver;
		
	}
	
	

}
