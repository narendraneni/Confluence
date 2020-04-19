package Testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import Config.PropertiesConf;
import Pages.ConfluencePage;

public class Baseclass extends PropertiesConf {

	static WebDriver driver;
	
	@BeforeSuite
	public void startsession () throws IOException {
		
        System.setProperty("webdriver.chrome.driver", "G:\\training\\CD\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get(getObject("pageurl"));
        ConfluencePage nv=new ConfluencePage(driver);
		nv.useremail().sendKeys(getObject("useremail"));
        nv.userlogin().click();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        nv.userpass().sendKeys(getObject("userpass"));
        nv.userlogin().click();
	}
/*	
	@AfterSuite
	public void driverclose() {
		driver.close();
		}
	*/	
}
