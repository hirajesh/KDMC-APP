package com.app;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class LabTest {

	public static	AndroidDriver<WebElement> driver;
	static String dd;
		//String pname[]={"karun","mani","arun"};

	public static String pname="sathish";
	static int i;
	
		
		@Test
		public static void te() throws MalformedURLException, InterruptedException
		{
			DesiredCapabilities dc=new DesiredCapabilities();
			dc.setCapability("platformName", "Android");
			dc.setCapability("deviceName", "Android");
			dc.setCapability("udid", "192.168.149.101:5555");
			//dc.setCapability("udid", "38013ca737288300");
			dc.setCapability("appPackage", "displ.mobydocmarathi.com");
			dc.setCapability("appActivity", "kdmc_kumar.Initialization.Initialize");
			driver=new AndroidDriver<WebElement>(new URL("http://127.0.1.1:4723/wd/hub"),dc);
			Thread.sleep(9000);

			driver.findElementById("displ.mobydocmarathi.com:id/txtpname").sendKeys("123");
			driver.findElementById("txtdocname").sendKeys("hari");
		
		    driver.findElementById("button4").click();
			
			Thread.sleep(3000);
			
			System.out.println("TEST CASE : Verify LabTest Are Working Suceccessfully Or Not");
	
		}
	@Test
	public static  void testlab() throws InterruptedException
	{/*
		int e=pname.length;
		for(i=0;i<=e;i++)
		{
			System.out.println(pname[i]);*/
		
		
		driver.findElements(By.xpath("//android.widget.TextView")).get(6).click();	
		Thread.sleep(6000);
	    driver.findElement(By.id("displ.mobydocmarathi.com:id/edt")).sendKeys(pname);
        driver.findElement(By.id("title")).click();
		@SuppressWarnings("unused")
		WebDriverWait wait=new WebDriverWait(driver,50);
		driver.findElement(By.id("displ.mobydocmarathi.com:id/fab")).click();
		Thread.sleep(5000);
		driver.findElements(By.xpath("//android.widget.TextView")).get(4).click();
	    dd =	driver.findElement(By.id("acpname")).getText();
	    System.out.println(dd);
	    driver.findElement(By.id("treamentfor1")).sendKeys("FEVER");
	    driver.findElement(By.id("show_btn")).click();
	   
	    /*if(pname.equals("karun"))
	    {
	    	 driver.findElement(By.id("show_btn")).click();
	    	 BioExam();    
	    	
	    	  
	    }
	    else if(pname.equals("mani"))
	    {
	    	 driver.findElement(By.id("show_btn")).click();
	    	BioBloodurine();  	
	    	
	    }
	    else 
	    {
	    	 driver.findElement(By.id("show_btn")).click();
	    	All(); 	
	    }*/
	  
	//BioExam(); 
	//BioBloodurine();
	All(); 
	Thread.sleep(3000);
//    EESA();
    driver.findElement(By.id("diag_cancel_btn")).click(); //Submit
	Thread.sleep(7000, 20);
	driver.findElements(By.xpath("//android.widget.TextView")).get(4).click(); 
	Thread.sleep(7000, 20);
	//driver.quit();
	}

	public static void BioExam() throws InterruptedException
	{
		 //   Biochemistry
	    //---------------------------
		Thread.sleep(7000, 20);
	    driver.findElements(By.xpath("//android.widget.CheckedTextView")).get(3).click();
	    WebElement Fg= driver.findElement(By.xpath("//*[@class='android.widget.CheckBox' and @bounds='[80,456][144,556]']"));  //[80,620][144,720]
	    Fg.click();
	    driver.findElement(By.xpath("//*[@class='android.widget.CheckBox' and @bounds='[80,948][144,1048]']")).click();    // [80,866][144,966]
	    driver.findElement(By.xpath("//*[@class='android.widget.CheckBox' and @bounds='[80,1440][144,1540]']")).click();   // [80,1112][144,1212]
	    driver.findElements(By.xpath("//android.widget.CheckedTextView")).get(1).click();
	    
	    
	    //Examination of Blood
	 //---------------------------
	    
	    driver.findElements(By.xpath("//android.widget.CheckedTextView")).get(6).click(); 
	    driver.findElement(By.xpath("//*[@class='android.widget.CheckBox' and @bounds='[80,292][144,392]']")).click();
	    driver.findElements(By.xpath("//android.widget.CheckedTextView")).get(1).click();
	}
	public static void BioBloodurine() throws InterruptedException
	{
		Thread.sleep(7000, 20);
		 //   Biochemistry
	    //---------------------------
	    driver.findElements(By.xpath("//android.widget.CheckedTextView")).get(3).click();
	    WebElement Fg= driver.findElement(By.xpath("//*[@class='android.widget.CheckBox' and @bounds='[80,456][144,556]']"));  //[80,620][144,720]
	    Fg.click();
	    driver.findElement(By.xpath("//*[@class='android.widget.CheckBox' and @bounds='[80,948][144,1048]']")).click();    // [80,866][144,966]
	    driver.findElement(By.xpath("//*[@class='android.widget.CheckBox' and @bounds='[80,1440][144,1540]']")).click();   // [80,1112][144,1212]
	    driver.findElements(By.xpath("//android.widget.CheckedTextView")).get(1).click();
	    
	    
	    //Examination of Blood
	 //---------------------------
	    driver.findElements(By.xpath("//android.widget.CheckedTextView")).get(6).click(); 
	    driver.findElement(By.xpath("//*[@class='android.widget.CheckBox' and @bounds='[80,292][144,392]']")).click();
	    driver.findElements(By.xpath("//android.widget.CheckedTextView")).get(1).click();
	    
	//  URINE
	//---------------------------  
	    driver.scrollTo("URINE");
	    Thread.sleep(7000, 20);
	    driver.findElements(By.xpath("//android.widget.CheckedTextView")).get(15).click(); 
	    driver.findElement(By.xpath("//*[@class='android.widget.CheckBox' and @bounds='[80,292][144,392]']")).click();
	    driver.findElements(By.xpath("//android.widget.CheckedTextView")).get(1).click();
	    
	    driver.findElements(By.xpath("//android.widget.TextView")).get(2).click();        //SAVE
	    driver.findElement(By.id("diag_cancel_btn")).click(); //Submit
	    
	    

	}
	public static void All() throws InterruptedException
	{
		Thread.sleep(7000, 20);
		    
		    //      ANC
		    //---------------------------
		  //  driver.scrollTo("ANC FP");
		    driver.findElements(By.xpath("//android.widget.CheckedTextView")).get(1).click();
		    driver.findElement(By.xpath("//*[@class='android.widget.CheckBox' and @bounds='[80,374][1200,474]']")).click();
		    driver.findElements(By.xpath("//android.widget.CheckedTextView")).get(1).click();
		    
		    //Examination of Blood
			 //---------------------------
			   //driver.scrollTo("EXAMINATION OF BLOOD");
			 driver.findElements(By.xpath("//android.widget.CheckedTextView")).get(9).click(); 
			   driver.findElement(By.xpath("//*[@class='android.widget.CheckBox' and @bounds='[80,292][1200,392]']")).click();
			 driver.findElements(By.xpath("//android.widget.CheckedTextView")).get(1).click();
		    
		    //      HIV
		    //---------------------------
		    
		   // driver.scrollTo("HIV MARKERS");
		    driver.findElements(By.xpath("//android.widget.CheckedTextView")).get(13).click();
		    driver.findElement(By.xpath("//*[@class='android.widget.CheckBox' and @bounds='[80,610][1200,710]']")).click();
		  //  driver.findElement(By.xpath("//*[@class='android.widget.CheckBox' and @bounds='[80,692][144,792]']")).click();
		  //  driver.findElement(By.xpath("//*[@class='android.widget.CheckBox' and @bounds='[80,774][144,874]']")).click();
		    driver.findElements(By.xpath("//android.widget.CheckedTextView")).get(13).click();
		    
		    
		    
		    //      STOOL
		    //---------------------------
		   driver.executeScript("window.scrollBy(0,100)","");
		    driver.scrollTo("STOOL");
		    driver.findElements(By.xpath("//android.widget.CheckedTextView")).get(23).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//*[@class='android.widget.CheckBox' and @bounds='[80,292][1200,392]']")).click();
		    driver.findElements(By.xpath("//android.widget.CheckedTextView")).get(22).click();
		    
		 //  URINE
		//---------------------------   
		    
		    driver.findElements(By.xpath("//android.widget.CheckedTextView")).get(27).click(); 
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//*[@class='android.widget.CheckBox' and @bounds='[80,292][1200,392]']")).click();
		    driver.findElements(By.xpath("//android.widget.CheckedTextView")).get(1).click();
		    driver.findElements(By.xpath("//android.widget.TextView")).get(27).click();        //SAVE
		  //  driver.findElement(By.id("diag_cancel_btn")).click(); //Submit
	}
public static void EESA() throws InterruptedException
{
	// Scan
	// ========

	driver.scrollTo("Scan Name");
	driver.findElement(By.id("scan_spinner")).click();
	driver.findElement(By.xpath("//*[@class='android.widget.TextView' and @index='2']")).click();
	driver.findElement(By.id("scanfor_btn")).click();

	// X-Ray
	// ========
	Thread.sleep(2000);
    driver.scrollTo("X-Ray For");
	driver.findElement(By.id("multiAutoCompleteTextView1")).sendKeys("HAND");
	driver.findElement(By.id("Button01")).click();

	// ECG
	// ========
	driver.scrollToExact("ECG");
	driver.findElement(By.id("checkBox1")).click();

	// EEG
	// ========
	driver.findElement(By.id("checkBox3")).click();

	// EEG
	// ========
	driver.scrollTo("Angiogram");
	driver.findElement(By.id("checkBox5")).click();         // Brain
	// driver.findElement(By.id("checkBox4")).click();      //Coronary
	// driver.findElement(By.id("checkBox6")).click();      //Upper Limb
	// driver.findElement(By.id("checkBox7")).click();      //Lower Limb
	// driver.findElement(By.id("checkBox8")).click();      //Mesentric
	//driver.findElement(By.id("diag_cancel_btn")).click();   // Submit
	// driver.findElement(By.id("imgbSubmit")).click();     //Cancel
	// driver.findElement(By.id("imgbSubmit")).click();     
	// driver.findElement(By.id("btn_skip")).click();       //Skip
	Thread.sleep(3000);
	//driver.findElement(By.id("confirm_button")).click();
	//driver.findElement(By.id("scrlButton01")).click();
	// driver.findElement(By.xpath("//*[@class='android.widget.TextView' and @index='0']")); //Preview PDF
	// driver.findElement(By.xpath("//*[@class='android.widget.TextView' and @index='1']")); //Email PDF
	// driver.findElement(By.xpath("//*[@class='android.widget.TextView' and @index='3']")); //Continue to prescription
	//driver.findElement(By.xpath("//*[@class='android.widget.TextView' and @index='3']"));  // Close
	// driver.findElements(By.xpath("//android.widget.TextView")).get(4).click();
	// Thread.sleep(8000);

}

@AfterMethod
public void screen(ITestResult testresult1) throws IOException 
{
if(testresult1.getStatus()==ITestResult.FAILURE)
{
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("E:\\Jenkins output\\APP1\\" + testresult1.getName()+ "-" + Arrays.toString(testresult1.getParameters())+ ".png"));
	
}}


	}



