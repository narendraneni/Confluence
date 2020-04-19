package Pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Config.PropertiesConf;


public class ConfluencePage extends PropertiesConf
{
	WebDriver driver;

	public ConfluencePage(WebDriver driver) 
	{
		this.driver = driver;
		driver.manage().window().maximize();
	}
	By useremail=By.id("username");
	By userlogin=By.id("login-submit");
	By userpass=By.xpath("//input[@placeholder='Enter password']");
	By lockicon=By.xpath("//button[@data-test-id='restrictions.dialog.button']");
	By Rdropdown=By.xpath("//div[@data-test-id='restrictions-dialog.content-mode-select']");
	By Rdropdown1=By.xpath("//div[@data-test-id='restrictions-dialog.content-mode-select']/descendant::span[text()='Everyone can view and edit this page.']");
	By Rdropdown2=By.xpath("//div[@data-test-id='restrictions-dialog.content-mode-select']/descendant::div[contains(@id,'option-1')]");
	By Rdropdown3=By.xpath("//div[@data-test-id='restrictions-dialog.content-mode-select']/descendant::div[contains(@id,'option-2')]");
	By usersearch=By.xpath("//input[@id='react-select-restrictions.user-search-input']");
	By userremove=By.xpath("//button[@aria-label='Remove']");
	By addbutton=By.xpath("//span[text()='Add']/ancestor::button");
	By subdropdown=By.xpath("//div[@data-test-id='user-and-group-search']/following-sibling::div[1]/descendant::span[2]");
	By subdropview1=By.xpath("//div[contains(@id,'react-select')]/descendant::span[text()='Can view']");
	By subdropview2=By.xpath("//div[contains(@id,'react-select')]/descendant::span[text()='Can view and edit']");
	By applybutton=By.xpath("//span[text()='Apply']/ancestor::button");
	By cancelbutton=By.xpath("//span[text()='Cancel']/ancestor::button");

	public WebElement useremail()  { return driver.findElement(useremail);	}
	public WebElement userlogin() { return driver.findElement(userlogin);	 }
	public WebElement userpass()  { return driver.findElement(userpass);	}

	public WebElement lockicon() {	return driver.findElement(lockicon);	}
	public WebElement dropdown() {	return driver.findElement(Rdropdown);	}
	public WebElement dropdown1()	{	return driver.findElement(Rdropdown1);	}
	public WebElement dropdown2()	{	return driver.findElement(Rdropdown2);	}
	public WebElement dropdown3()	{	return driver.findElement(Rdropdown3);	}
	
	public WebElement usersearch()	{	return driver.findElement(usersearch);	}
	public WebElement applybutton()	{	return driver.findElement(applybutton);	}
	public WebElement addbutton()   {	return driver.findElement(addbutton);	}
	public WebElement userremove() 	{	return driver.findElement(userremove);	}
	public WebElement cancelbutton() {	return driver.findElement(cancelbutton);}

	public WebElement subdropdown() {	return driver.findElement(subdropdown);	}
	public WebElement subdropview1(){	return driver.findElement(subdropview1);}
	public WebElement subdropview2(){	return driver.findElement(subdropview2);}

	public WebElement userpicker(String user2)	{	
		return driver.findElement(By.xpath("//div[contains(@class,'user-picker')]/descendant::span[text()='"+user2+"']"));	}
	
	public WebElement userdropdown(String user2){
		return driver.findElement(By.xpath("//div[text()='"+user2+"']/ancestor::tr/descendant::td[2]"));}
	
	public WebElement userdropdown1(String user2){
		return driver.findElement(By.xpath("//div[text()='"+user2+"']/ancestor::tr/descendant::td[2]/descendant::span[text()='Can view']"));	}
	
	public WebElement userdropdown2(String user2){
		return driver.findElement(By.xpath("//div[text()='"+user2+"']/ancestor::tr/descendant::td[2]/descendant::span[text()='Can view and edit']"));	}
	
	public WebElement removebutton(String user2) {
		return driver.findElement(By.xpath("//div[text()='"+user2+"']/ancestor::tr/descendant::td[3]"));	}
	
	public WebElement finduser(String user2) {
			return  driver.findElement(By.xpath("//div[text()='"+user2+"']/ancestor::tr/descendant::td[1]"));
				}

	


	
}
