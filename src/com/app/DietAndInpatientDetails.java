package com.app;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class DietAndInpatientDetails {
	
	String[] Pname={"anu","kamal","ramesh","ajay","ravi","nithiya","arun","banumathi","sathish"};
	//String Pname="ruba";
	AndroidDriver<MobileElement> driver;
	String[] Systolic={"135","125","130","140","110","115","120","125","130"};
	String[] Diastolic={"75","85","70","90","85","70","75","85","85"};
	String[] Pulse={"72","68","75","76","72","73","74","70","69"};
	String[] Temperature={"102","101","103","105","100","100","101","102","103"};
	String[] Resparatory={"72","70","76","72","75","73","74","70","72"};
	String[] SPO2={"90","91","89","93","87","92","91","90","92"};
	String[] Oral={"45","55","60","35","20","50","15","10","5"};
	String[] Fluid={"10","30","15","25","30","5","30","35","40"};
    String[] Rivel={"20","10","15","35","40","15","20","35","50"};
	String[] Motion={"35","10","10","35","30","25","10","25","45"};
	String[] Urine={"90","91","89","93","87","92","91","90","85"};
	String[] Uric={"10","30","15","25","20","5","30","45","10"};
	String[] Lente={"15","20","14","22","21","5","35","15","25"};
	String[] Insulin={"18","25","35","65","50","5","22","45","10"};
	String[] Bloosugar={"12","38","22","25","20","5","20","45","10"};
	String[] Keybody={"12","28","5","25","20","7","4","5","10"};
	static int j;
	
	
	
	   

	@Test
	public void inp() throws InterruptedException, IOException 
	{
		DesiredCapabilities in = new DesiredCapabilities();
		//in.setCapability("PlatformName", "Android");
		in.setCapability("deviceName", "Android");     
		in.setCapability("udid", "38013ca737288300");
		//in.setCapability("udid", "192.168.30.101:5555");
		in.setCapability("appPackage", "displ.mobydocmarathi.com");
		in.setCapability("appActivity", "kdmc_kumar.Initialization.Initialization"); //kdmc_kumar.Initialization.Initialize
		in.setCapability("autoAcceptAlerts", true);
		driver = new AndroidDriver(new URL("http://127.0.1.1:4723/wd/hub"), in);
		Thread.sleep(5000);
		
		MobileElement el1 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/edt_ipaddress");
		el1.clear();
		el1.sendKeys("192.168.137.55:1234");
		MobileElement el2 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/btn_yes");
		el2.click();
		MobileElement el3 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/button_go");
		el3.click();
		
		  MobileElement uname = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/txtpname");
	      uname.sendKeys("123456");
	      
	      MobileElement pword = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/txtdocname");
	      pword.sendKeys("hari");
		
		/*driver.findElementById("txtpname").sendKeys("123");
		driver.findElementById("txtdocname").sendKeys("hari");*/
	      
	      MobileElement sub = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/button4");
	      sub.click();
		//driver.findElementById("button4").click();
		Thread.sleep(4000);
		
		
		System.out.println("TEST CASE : Verify Inpatient Details Are Working Suceccessfully Or Not");
		runapp();
		    
	}
	

public void runapp() throws InterruptedException, IOException
{
try {
	Diet();
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	j++;
	Diet();
}
}


	public void Diet() throws InterruptedException, IOException 
	{

		while (driver.findElements(MobileBy.id("ok")).size() > 0)

		{
			driver.findElement(MobileBy.id("ok")).click();
		}
		
		for(j=0;j<Pname.length;j++)
		{
		driver.findElements(By.xpath("//android.widget.TextView")).get(10).click();	
		//driver.findElement(By.xpath("//*[@class='android.widget.TextView' and @bounds='[840,1402][1182,1471]' or @bounds='[840,1402][1182,1471]' or @bounds='[840,1173][1182,1242]']")).click();
        driver.findElement(By.id("displ.mobydocmarathi.com:id/edt")).sendKeys(Pname[j]);
        driver.findElement(By.id("displ.mobydocmarathi.com:id/pid")).click();
        Thread.sleep(3000);
        

      
      /*  MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout");
        el2.click();*/
        MobileElement el3 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/btn_adddtls");
        el3.click();
        MobileElement el4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]");
        el4.click();
        MobileElement el5 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/btn_Inpatient");
        el5.click();
        MobileElement el6 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/amt");
        el6.click();
        (new TouchAction(driver)).tap(514, 1176).perform();
        MobileElement el7 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/ip_bps");
        el7.sendKeys("80");
        MobileElement el8 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/ip_bpd");
        el8.sendKeys("79");
        MobileElement el9 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/ip_pulse");
        el9.sendKeys("90");
        MobileElement el10 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/ip_temp");
        el10.sendKeys("67");
        MobileElement el11 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/ip_resp");
        el11.sendKeys("55");
        MobileElement el12 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/ip_spo2");
        el12.sendKeys("44");

        MobileElement el13 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/ip_drugord");
        el13.sendKeys("test");
        MobileElement el14 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/ip_nursnginstr");
        el14.sendKeys("test");
        MobileElement el15 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/ip_oral");
        el15.sendKeys("66");
        MobileElement el16 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/ip_fluid");
        el16.sendKeys("33");
        MobileElement el17 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/ip_rives");
        el17.sendKeys("55");
        (new TouchAction(driver)).tap(617, 825).perform();
        (new TouchAction(driver)).tap(429, 1669).perform();
        el17.sendKeys("443");
        MobileElement el18 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/ip_motion");
        el18.sendKeys("3");
        MobileElement el19 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/ip_urine");
        el19.sendKeys("25");
        MobileElement el20 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/btn_submit");
        el20.click();

        
        //INPATIENT DETAILS
	//==========================
		driver.findElement(By.id("displ.mobydocmarathi.com:id/btn_adddtls")).click();
		Thread.sleep(2000);
	//	driver.findElement(By.xpath("//*[@class='android.widget.TextView' and @bounds='[52,838][1148,934]'")).click();
	//	driver.findElements(By.xpath("android.widget.TextView")).get(2).click();
		driver.findElements(By.id("text1")).get(0).click();
		
	 //Inpatient chart
	//==========================
	    driver.findElement(By.id("displ.mobydocmarathi.com:id/btn_Inpatient")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("displ.mobydocmarathi.com:id/inpattime")).click();
	    Thread.sleep(2000);
	    driver.scrollTo("2:00 AM");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@class='android.widget.TextView' and @index='5']")).click();
	    driver.findElement(By.id("displ.mobydocmarathi.com:id/ip_bps")).sendKeys(Systolic[j]);
	    driver.findElement(By.id("displ.mobydocmarathi.com:id/ip_bpd")).sendKeys(Diastolic[j]);
	    driver.findElement(By.id("displ.mobydocmarathi.com:id/ip_pulse")).sendKeys(Pulse[j]);
	    driver.findElement(By.id("displ.mobydocmarathi.com:id/ip_temp")).sendKeys(Temperature[j]);
	    Thread.sleep(2000);
	    driver.findElement(By.id("displ.mobydocmarathi.com:id/ip_resp")).sendKeys(Resparatory[j]);
	    Thread.sleep(3000);
	    driver.findElement(By.id("displ.mobydocmarathi.com:id/ip_spo2")).sendKeys(SPO2[j]);
	    Thread.sleep(3000);
	    driver.findElement(By.id("displ.mobydocmarathi.com:id/ip_drugord")).sendKeys("Take 1Tablet Before FOOD");	 
	    driver.scrollTo("Nursing Instruction");
	    driver.findElement(By.id("displ.mobydocmarathi.com:id/ip_nursnginstr")).sendKeys("Monitor BP Level Every 1hr");	 
	    driver.findElement(By.id("displ.mobydocmarathi.com:id/ip_oral")).sendKeys(Oral[j]);
	    driver.findElement(By.id("displ.mobydocmarathi.com:id/ip_fluid")).sendKeys(Fluid[j]);
	    driver.findElement(By.id("displ.mobydocmarathi.com:id/ip_rives")).sendKeys(Rivel[j]);
	    driver.findElement(By.id("displ.mobydocmarathi.com:id/ip_motion")).sendKeys(Motion[j]);
	    driver.scrollTo("Save");
	    driver.findElement(By.id("displ.mobydocmarathi.com:id/ip_urine")).sendKeys(Urine[j]);
	    Thread.sleep(2000);
	    driver.findElement(By.id("displ.mobydocmarathi.com:id/btn_submit")).click();
	    
	  //Diabetic Chart
	 //==========================
	    driver.findElement(By.id("displ.mobydocmarathi.com:id/btn_diabetic")).click();
	    driver.findElement(By.id("displ.mobydocmarathi.com:id/dc_time")).click();
	    Thread.sleep(2000);
	    driver.scrollTo("2:00 AM");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@class='android.widget.TextView' and @index='5']")).click(); 
	    driver.findElement(By.id("displ.mobydocmarathi.com:id/dc_splinstr")).sendKeys("Maintain Diet");
	    driver.findElement(By.id("displ.mobydocmarathi.com:id/dc_uric")).sendKeys(Uric[j]);
	    driver.findElement(By.id("displ.mobydocmarathi.com:id/dc_len")).sendKeys(Lente[j]);
	    driver.findElement(By.id("displ.mobydocmarathi.com:id/dc_insulin")).sendKeys(Insulin[j]);
	    driver.scrollTo("Save");
	    driver.findElement(By.id("displ.mobydocmarathi.com:id/dc_bldsugr")).sendKeys(Bloosugar[j]);
	    driver.findElement(By.id("displ.mobydocmarathi.com:id/dc_keydby")).sendKeys(Keybody[j]);
	    driver.findElement(By.id("displ.mobydocmarathi.com:id/btn_submit")).click();
	   
	 //  Temperature Chart
    //========================== 
	    driver.findElement(By.id("displ.mobydocmarathi.com:id/btn_temperaturechart")).click();
	    driver.findElement(By.id("displ.mobydocmarathi.com:id/temp_inpattime")).click();
	    driver.findElement(By.xpath("//*[@class='android.widget.TextView' and @index='2']")).click();
	    driver.findElement(By.id("displ.mobydocmarathi.com:id/temp_tempvalues")).click();
	    driver.findElement(By.xpath("//*[@class='android.widget.TextView' and @index='5']")).click(); 
	    driver.findElement(By.id("displ.mobydocmarathi.com:id/temp_visitsummary")).sendKeys("TEMPERATURE");
	    driver.findElement(By.id("displ.mobydocmarathi.com:id/btn_submit")).click(); 
	    
	/*   //  Surgery Record
	  //========================== 
	    driver.findElement(By.id("displ.mobydocmarathi.com:id/btn_surgery")).click();
	    driver.findElement(By.id("displ.mobydocmarathi.com:id/edt_sur1")).sendKeys("A");
	    driver.findElement(By.id("displ.mobydocmarathi.com:id/edt_sur2")).sendKeys("B");
	    driver.findElement(By.id("displ.mobydocmarathi.com:id/edt_sur3")).sendKeys("C");
	    driver.findElement(By.id("displ.mobydocmarathi.com:id/edt_sur4")).sendKeys("D");
	    driver.findElement(By.id("displ.mobydocmarathi.com:id/edt_sur5")).sendKeys("E");
	    driver.findElement(By.id("displ.mobydocmarathi.com:id/edt_sur6")).sendKeys("F");
	    driver.findElement(By.id("displ.mobydocmarathi.com:id/edt_sur7")).sendKeys("G");
	    driver.findElement(By.id("displ.mobydocmarathi.com:id/edt_sur8")).sendKeys("H");
	    driver.findElement(By.id("displ.mobydocmarathi.com:id/edt_sur9")).sendKeys("I");
	    driver.findElement(By.id("displ.mobydocmarathi.com:id/edt_sur10")).sendKeys("J");
	    driver.findElement(By.id("displ.mobydocmarathi.com:id/edt_sur11")).sendKeys("k");
	    driver.findElement(By.id("displ.mobydocmarathi.com:id/edt_sur12")).sendKeys("L");
	    driver.findElement(By.id("displ.mobydocmarathi.com:id/btn_submit")).click();
	    
	    
	   // Medical Case Record
	  //========================== 
	    driver.findElement(By.id("displ.mobydocmarathi.com:id/btn_medicalcase_records")).click();
	    driver.findElement(By.id("displ.mobydocmarathi.com:id/mc_under_care_sp")).click(); 
	    driver.findElement(By.xpath("//*[@class='android.widget.CheckedTextView' and @index='1']")).click();
	    driver.findElement(By.id("displ.mobydocmarathi.com:id/mc_student_et")).sendKeys("MANI");
	    Thread.sleep(2000);
	    driver.findElement(By.id("displ.mobydocmarathi.com:id/mc_provisional_edt")).sendKeys("FEVER");
	    driver.scrollTo("Final Diagnosis"); 
	    Thread.sleep(2000);
	    driver.findElement(By.id("displ.mobydocmarathi.com:id/mc_finaldiagnosis_edt")).sendKeys("VIRAL FEVER");
	    driver.findElement(By.id("displ.mobydocmarathi.com:id/mc_result_spn")).click();
	    driver.findElement(By.xpath("//*[@class='android.widget.CheckedTextView' and @index='2']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("displ.mobydocmarathi.com:id/mc_select_date")).click();
	    driver.scrollTo("2:00 AM");
	    driver.findElement(By.xpath("//*[@class='android.widget.CheckedTextView' and @index='7']")).click();
	    driver.findElement(By.id("displ.mobydocmarathi.com:id/mc_clinicalnotes_edt")).sendKeys("Normal");
	    driver.findElement(By.id("displ.mobydocmarathi.com:id/mc_treatmentdiet_edt")).sendKeys("Low Cholestrol Food");
	    driver.findElement(By.id("displ.mobydocmarathi.com:id/fab")).click();
	    driver.scrollTo("Save"); 
	    driver.findElement(By.id("displ.mobydocmarathi.com:id/mc_submit_btn")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("displ.mobydocmarathi.com:id/confirm_button")).click();
	 // driver.findElement(By.id("displ.mobydocmarathi.com:id/btn_cancel")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("displ.mobydocmarathi.com:id/ic_back")).click();
	    */
	 /*   //DIET DETAILS
		//==========================
	  
			driver.findElement(By.id("displ.mobydocmarathi.com:id/btn_adddtls")).click();
			driver.findElements(By.id("text1")).get(1).click();
			driver.findElement(By.id("displ.mobydocmarathi.com:id/spn_select_diet_new")).click();
		    driver.findElement(By.xpath("//*[@class='android.widget.CheckedTextView' and @index='1']")).click();
			driver.findElement(By.id("displ.mobydocmarathi.com:id/edt_breakfast")).sendKeys("IDlY(2Nos)");
			driver.findElement(By.id("displ.mobydocmarathi.com:id/add_button_img")).click();
			driver.findElement(By.id("displ.mobydocmarathi.com:id/submit_datas")).click();
	    */
	   
	    
	    
		}	
			//driver.findElement(By.id("displ.mobydocmarathi.com:id/btn_cancel")).click();
	}
	
	
	/*
	 Random systolic = new Random();
	    int Low = 300;
	    int High = 160;
	    int Result = systolic.nextInt(High-Low);
	    
	 
	    Random diastolic = new Random();
	    int Low1 = 120;
	    int High1 = 50;
	    int Result1 = diastolic.nextInt(High-Low);
	    
	    Random Pulse = new Random();
	    int Low2 = 120;
	    int High2 = 70;
	    int Result2 = Pulse.nextInt(High-Low);
	    
	    Random Temperature = new Random();
	    int Low3 = 98;
	    int High3 = 105;
	    int Result3 = Temperature.nextInt(High-Low) + Low;
	    
	    Random Resiparatory = new Random();
	    int Low4 = 98;
	    int High4 = 105;
	    int Result4 = Resiparatory.nextInt(High-Low) + Low;
	    
	    Random SPO2 = new Random();
	    int Low5 = 98;
	    int High5 = 105;
	    int Result5 = SPO2.nextInt(High-Low) + Low;
	    
	    Random Oral = new Random();
	    int Low6 = 10;
	    int High6 = 50;
	    int Result6 = Oral.nextInt(High-Low) + Low;
	    
	    Random Fludids = new Random();
	    int Low8 = 40;
	    int High8 = 60;
	    int Result8 = Fludids.nextInt(High-Low) + Low;
	    
	    Random Rivels = new Random();
	    int Low9 = 35;
	    int High9 = 75;
	    int Result9 = Rivels.nextInt(High-Low) + Low;
	    
	    Random Motion = new Random();
	    int Low10 = 20;
	    int High10 = 80;
	    int Result10 = Motion.nextInt(High-Low) + Low;
	    
	    Random Urine = new Random();
	    int Low11 = 60;
	    int High11 = 90;
	    int Result11 = Urine.nextInt(High-Low) + Low;
	    
	    Random uric = new Random();
	    int Low12 =30;
	    int High12 = 55;
	    int Result12 = uric.nextInt(High-Low) + Low;
	    
	    Random lente = new Random();
	    int Low13 = 45;
	    int High13 = 65;
	    int Result13 = lente.nextInt(High-Low) + Low;
	    
	    Random insulin = new Random();
	    int Low14 = 40;
	    int High14 = 75;
	    int Result14 = insulin.nextInt(High-Low) + Low;
	    
	    Random bloodsugar = new Random();
	    int Low15 = 25;
	    int High15 = 65;
	    int Result15 = bloodsugar.nextInt(High-Low) + Low;
	    
	    Random keybody = new Random();
	    int Low16 = 35;
	    int High16 = 65;
	    int Result16 = keybody.nextInt(High-Low) + Low;*/
	

    

}
