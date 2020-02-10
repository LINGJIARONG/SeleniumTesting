package javahaha.version.selenum.JIa;

import org.ini4j.Ini;
import org.ini4j.InvalidFileFormatException;
import org.ini4j.Profile.Section;
import org.junit.*;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import kotlin.sequences.SequenceScope;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List; 

/**
 * Unit test for simple App.
 */
public class AppTest{
	static Selenium_Test t;
	static Ini pro ;
	
    @BeforeClass
    public static void setUpBeforClass(){
    	System.out.println("seting up");
    	try {
			t = new Selenium_Test();
			pro = new Ini(new File("configuration.ini"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
System.out.println("?????");	
}
    }
    
    @AfterClass
    public static void destroyAfterClass() {
    	System.out.println("closing web driver");
    	t.close();

    }
    
    
    

    @Test
    public void test_signup(){

		WebDriver wd= t.getDriver();
		Section sc= pro.get("signup"); 
		for(String s :sc.keySet()) {
			if(s.contains("user_passwordWrong")) {
				t.openDriver(pro.get("url").get("url_signup"));
				String pwd_key=s.replace("user", "pwd");
				String pwd = sc.get(pwd_key);
				String fname_key=s.replace("user", "fname");
				String fname = sc.get(fname_key);
				String lname_key=s.replace("user", "lname");
				String lname = sc.get(lname_key);
				String email_key=s.replace("user", "email");
				String email = sc.get(email_key);
				String experience_key=s.replace("user", "experience");
				String experience = sc.get(experience_key);
				String qualification_key=s.replace("user", "qualification");
				String qualification = sc.get(qualification_key);
				
				WebElement we= wd.findElement(By.id("usr1"));
		    	we.sendKeys(sc.get(s));
		    	we = wd.findElement(By.id("pwd1"));
		    	we.sendKeys(pwd);
		    	
		    	we = wd.findElement(By.id("email1"));
		    	we.sendKeys(email);
		    	we = wd.findElement(By.id("fname1"));
		    	we.sendKeys(fname);
		    	we = wd.findElement(By.id("lname1"));
		    	we.sendKeys(lname);
		    	we = wd.findElement(By.id("qual"));
		    	we.sendKeys(qualification);
		    	we = wd.findElement(By.id("exp"));
		    	we.sendKeys(experience);
		    	we = wd.findElement(By.id("pwd1"));
		    	we.sendKeys(pwd);
		    	we = wd.findElement(By.xpath("//*[@id=\"home\"]/div/div[1]/article/div[9]/div/label/input"));
		    	we.click();
		    	we = wd.findElement(By.id("registerp"));
		    	we.click();
		    	try {
					Thread.sleep(30);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    	Alert al=wd.switchTo().alert();
		    	String s1=al.getText();
		    	System.out.println(s1);
		    	assertTrue(s1.indexOf("at least")!=-1);
		    	al.accept();
		    	try {
					Thread.sleep(30);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			else if(s.contains("user_emailWrong")) {
				t.openDriver(pro.get("url").get("url_signup"));
				String pwd_key=s.replace("user", "pwd");
				String pwd = sc.get(pwd_key);
				String fname_key=s.replace("user", "fname");
				String fname = sc.get(fname_key);
				String lname_key=s.replace("user", "lname");
				String lname = sc.get(lname_key);
				String email_key=s.replace("user", "email");
				String email = sc.get(email_key);
				String experience_key=s.replace("user", "experience");
				String experience = sc.get(experience_key);
				String qualification_key=s.replace("user", "qualification");
				String qualification = sc.get(qualification_key);
				
				WebElement we= wd.findElement(By.id("usr1"));
		    	we.sendKeys(sc.get(s));
		    	we = wd.findElement(By.id("pwd1"));
		    	we.sendKeys(pwd);
		    	
		    	we = wd.findElement(By.id("email1"));
		    	we.sendKeys(email);
		    	we = wd.findElement(By.id("fname1"));
		    	we.sendKeys(fname);
		    	we = wd.findElement(By.id("lname1"));
		    	we.sendKeys(lname);
		    	we = wd.findElement(By.id("qual"));
		    	we.sendKeys(qualification);
		    	we = wd.findElement(By.id("exp"));
		    	we.sendKeys(experience);
		    
		    	we = wd.findElement(By.xpath("//*[@id=\"home\"]/div/div[1]/article/div[9]/div/label/input"));
		    	we.click();
		    	we = wd.findElement(By.id("registerp"));
		    	we.click();
		    	try {
					Thread.sleep(30);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    	Alert al=wd.switchTo().alert();
		    	String s1=al.getText();
		    	System.out.println(s1);
		    	assertTrue(s1.indexOf("format")!=-1);
		    	al.accept();
		    	try {
					Thread.sleep(30);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			else if(s.contains("user_exist")) {
				t.openDriver(pro.get("url").get("url_signup"));
				String pwd_key=s.replace("user", "pwd");
				String pwd = sc.get(pwd_key);
				String fname_key=s.replace("user", "fname");
				String fname = sc.get(fname_key);
				String lname_key=s.replace("user", "lname");
				String lname = sc.get(lname_key);
				String email_key=s.replace("user", "email");
				String email = sc.get(email_key);
				String experience_key=s.replace("user", "experience");
				String experience = sc.get(experience_key);
				String qualification_key=s.replace("user", "qualification");
				String qualification = sc.get(qualification_key);
				
				WebElement we= wd.findElement(By.id("usr1"));
		    	we.sendKeys(sc.get(s));
		    	we = wd.findElement(By.id("pwd1"));
		    	we.sendKeys(pwd);
		    	
		    	we = wd.findElement(By.id("email1"));
		    	we.sendKeys(email);
		    	we = wd.findElement(By.id("fname1"));
		    	we.sendKeys(fname);
		    	we = wd.findElement(By.id("lname1"));
		    	we.sendKeys(lname);
		    	we = wd.findElement(By.id("qual"));
		    	we.sendKeys(qualification);
		    	we = wd.findElement(By.id("exp"));
		    	we.sendKeys(experience);
		    
		    	we = wd.findElement(By.xpath("//*[@id=\"home\"]/div/div[1]/article/div[9]/div/label/input"));
		    	we.click();
		    	we = wd.findElement(By.id("registerp"));
		    	we.click();
		    	try {
					Thread.sleep(30);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    	Alert al=wd.switchTo().alert();
		    	String s1=al.getText();
		    	System.out.println(s1);
		    	assertTrue(s1.indexOf("username")!=-1);
		    	al.accept();
		    	try {
					Thread.sleep(30);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
    }
    
    
    
    @Test
    public void test_Login() throws InvalidFileFormatException, IOException{
    	//t.openDriver(t.getUrl("url"));
    	
    	
		//Preferences prefs = new IniPreferences(pro);
 	
		WebDriver wd= t.getDriver();
		Section sc= pro.get("users"); 
		for(String s :sc.keySet()) {
			if(s.contains("user_wrongpassword")) {
				t.openDriver(pro.get("url").get("url_login"));
				String pwd_key=s.replace("user", "pwd");
				String pwd = sc.get(pwd_key);
				WebElement we= wd.findElement(By.id("usr"));
		    	we.sendKeys(sc.get(s));
		    	we = wd.findElement(By.id("pwd"));
		    	we.sendKeys(pwd);
		    	we = wd.findElement(By.id("submit_login"));
		    	we.click();
		    	try {
					Thread.sleep(30);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    	Alert al=wd.switchTo().alert();
		    	String s1=al.getText();
		    	System.out.println(s1);
		    	assertTrue(s1.startsWith("password"));
		    	al.accept();
		    	try {
					Thread.sleep(30);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else if(s.contains("user_wrongusername")) {
				t.openDriver(pro.get("url").get("url_login"));
				String pwd_key=s.replace("user_", "pwd_");
				String pwd = sc.get(pwd_key);
				WebElement we= wd.findElement(By.id("usr"));
		    	we.sendKeys(sc.get(s));
		    	we = wd.findElement(By.id("pwd"));
		    	we.sendKeys(pwd);
		    	we = wd.findElement(By.id("submit_login"));
		    	we.click();
		    	//System.out.println("user"+sc.get(s)+"pwd"+pwd);
		    	try {
					Thread.sleep(30);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    	Alert al=wd.switchTo().alert();
		    	String s1=al.getText();
		    	System.out.println(s1);
		    	assertTrue(s1.startsWith("username"));
		    	al.accept();
		    	try {
					Thread.sleep(30);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

    }

    

  

}
