package com.app;

import java.io.File;
import java.io.IOException;

import java.net.URL;
import java.util.Arrays;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class LTest {


	  private AndroidDriver driver;

	  @BeforeClass
	  public void setUp() throws InterruptedException, IOException 
	  {
	    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("platformName", "Android");
	    desiredCapabilities.setCapability("deviceName", "38013ca737288300");
	  //  desiredCapabilities.setCapability("deviceName", "192.168.149.101:5555");
	    desiredCapabilities.setCapability("appPackage", "displ.mobydocmarathi.com");
	    desiredCapabilities.setCapability("appActivity", "kdmc_kumar.Initialization.Initialize");
	   // desiredCapabilities.setCapability("norest", true);

	    URL remoteUrl = new URL("http://127.0.1.1:4723/wd/hub");

	    driver = new AndroidDriver(remoteUrl, desiredCapabilities);
	    Thread.sleep(9000);
	    sc();
	    sampleTest();
	  }

	  public void sc() throws IOException
	  {
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	    	FileUtils.copyFile(src, new File("E:\\Jenkins output\\App\\" + System.currentTimeMillis() + "-"  +".png"));

	  }
	  
	  @Test
	  public void sampleTest()
	  {
	/*    MobileElement el7 = (MobileElement) driver.findElementByAccessibilityId("KDMC");
	    el7.click();*/
	    MobileElement el8 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/txtdocname");
	    el8.sendKeys("hari");
	    MobileElement el9 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/txtpname");
	    el9.click();
	    el9.sendKeys("123");
	    MobileElement el10 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/checkBox1");
	    el10.click();
	    MobileElement el11 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/button4");
	    el11.click();
	    MobileElement el12 = (MobileElement) driver.findElementByAccessibilityId("Open drawer");
	    el12.click();
	    MobileElement el13 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/txvw_title");
	    el13.click();
	    MobileElement el14 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[6]/android.widget.LinearLayout");
	    el14.click();
	  }
	  
	  @AfterMethod
	  public void screen(ITestResult testresult1) throws IOException 
	  {
	  if(testresult1.getStatus()==ITestResult.FAILURE)
	  {
	  	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  	FileUtils.copyFile(src, new File("E:\\Jenkins output\\CMS\\" + testresult1.getName()+ "-" + Arrays.toString(testresult1.getParameters())+ ".png"));
	  	
	  }}
	  

	 /* @After
	  public void tearDown() {
	    driver.quit();
	  }
	*/
	
}
	
	
	
	/*
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("platformName", "Android");
		dc.setCapability("deviceName", "Android");
		dc.setCapability("udid", "192.168.149.101:5555");
		dc.setCapability("appPackage", "displ.mobydocmarathi.com");
		dc.setCapability("appActivity", "kdmc_kumar.Initialization.Initialize");
		driver=new AndroidDriver<WebElement>(new URL("http://127.0.1.1:4723/wd/hub"),dc);
		Thread.sleep(9000);

		driver.findElementById("displ.mobydocmarathi.com:id/txtpname").sendKeys("123");
		driver.findElementById("txtdocname").sendKeys("hari");
	
	    driver.findElementById("button4").click();
		
		Thread.sleep(3000);

	}

}*/
