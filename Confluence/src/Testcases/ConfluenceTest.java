package Testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.ConfluencePage;


public class ConfluenceTest extends Baseclass
{

	@BeforeTest
	public void pretest() throws InterruptedException { 
	    Thread.sleep(10000);
	}
	
	@Test
	public static void Test1() throws IOException, InterruptedException
	{
		String user2=getObject("user1");
	    ConfluencePage nv=new ConfluencePage(driver);
        nv.lockicon().click();
        nv.dropdown().click();
        nv.dropdown2().click();
        nv.usersearch().sendKeys(user2);
        nv.userpicker(user2).click();
        nv.addbutton().click();
        nv.applybutton().click();
        Thread.sleep(10000);
        nv.lockicon().click();
        nv.dropdown().click();
        nv.dropdown2().click();
        Assert.assertTrue(nv.finduser(user2).isDisplayed());
        nv.dropdown().click();
        nv.dropdown3().click();
        Assert.assertTrue(nv.finduser(user2).isDisplayed());
        nv.removebutton(user2).click();
        nv.applybutton().click();
	}
	

	@Test
	public static void Test2() throws IOException, InterruptedException
	{
		String user2=getObject("user1");
	    ConfluencePage nv=new ConfluencePage(driver);
        nv.lockicon().click();
        nv.dropdown().click();
        nv.dropdown2().click();
        nv.removebutton(user2).click();
        nv.applybutton().click();
        Thread.sleep(10000);
        nv.lockicon().click();
        nv.dropdown().click();
        nv.dropdown2().click();
        Assert.assertNull(nv.finduser(user2).isDisplayed());
        nv.dropdown().click();
        nv.dropdown3().click();
        Assert.assertNull(nv.finduser(user2).isDisplayed());
        nv.cancelbutton().click();

	}
	
	@Test
	public static void Test3() throws IOException, InterruptedException
	{
		String user2=getObject("user1");
	    ConfluencePage nv=new ConfluencePage(driver);
        nv.lockicon().click();
        nv.dropdown().click();
        nv.dropdown3().click();
        nv.usersearch().sendKeys(user2);
        nv.userpicker(user2).click();
        nv.addbutton().click();
        nv.applybutton().click();
        Thread.sleep(10000);
        nv.lockicon().click();
        nv.dropdown().click();
        nv.dropdown2().click();
        Assert.assertTrue(nv.finduser(user2).isDisplayed());
        nv.dropdown().click();
        nv.dropdown3().click();
        Assert.assertTrue(nv.finduser(user2).isDisplayed());
        nv.cancelbutton().click();
	}
	
	@Test
	public static void Test4() throws IOException, InterruptedException
	{
		String user2=getObject("user1");
	    ConfluencePage nv=new ConfluencePage(driver);
        nv.lockicon().click();
        nv.dropdown().click();
        nv.dropdown3().click();
        nv.userdropdown(user2).click();
        nv.userdropdown1(user2).click();    
        nv.dropdown().click();
        nv.dropdown2().click();
        Assert.assertNull(nv.finduser(user2).isDisplayed());
        nv.cancelbutton().click();
	}
	

	@Test
	public static void Test5() throws IOException, InterruptedException
	{
		String user2=getObject("user1");
	    ConfluencePage nv=new ConfluencePage(driver);
        nv.lockicon().click();
        nv.dropdown().click();
        nv.dropdown3().click();
        nv.removebutton(user2).click();
        nv.applybutton().click();
        Thread.sleep(10000);
        nv.lockicon().click();
        nv.dropdown().click();
        nv.dropdown2().click();
        Assert.assertNull(nv.finduser(user2).isDisplayed());
        nv.dropdown().click();
        nv.dropdown3().click();
        Assert.assertNull(nv.finduser(user2).isDisplayed());
        nv.removebutton(user2).click();
        nv.applybutton().click();
	}

//Defect/Bug
	
	@Test
	public static void Test6() throws IOException, InterruptedException
	{
		String user2=getObject("user1");
	    ConfluencePage nv=new ConfluencePage(driver);
        nv.lockicon().click();
        nv.dropdown().click();
        nv.dropdown2().click();
        nv.usersearch().sendKeys(user2);
        nv.userpicker(user2).click();
        nv.dropdown().click();
        nv.dropdown3().click();
        nv.subdropdown().click();
        nv.subdropview1().click();
        nv.dropdown().click();
        nv.dropdown2().click();
        nv.addbutton().click();
        Assert.assertTrue(nv.finduser(user2).isDisplayed());
        nv.dropdown().click();
        nv.dropdown3().click(); 
        nv.removebutton(user2).click();
        nv.applybutton().click();
	}
	
//Defect/Bug
	
	@Test
	public static void Test7() throws IOException, InterruptedException
	{
		String user2=getObject("user1");
	    ConfluencePage nv=new ConfluencePage(driver);
        nv.lockicon().click();
        nv.dropdown().click();
        nv.dropdown2().click();
        nv.usersearch().sendKeys(user2);
        nv.userpicker(user2).click();
        nv.userremove().click();
        nv.usersearch().sendKeys(user2);
        nv.userpicker(user2).click();

	}
	
	       
        
}
