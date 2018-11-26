package com.app;

	import java.net.MalformedURLException;
	import java.net.URL;
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.remote.DesiredCapabilities;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.Test;
	import io.appium.java_client.MobileElement;
	import io.appium.java_client.android.AndroidDriver;

	public class OutpatientFlow {


		 static AndroidDriver<MobileElement> driver;
	     String wait;
	     String dd,pname="arun";
	  //   String nname[]=new String[]{"Ragu","Raja","Kumar","bala"};
		WebElement dd1; 
	     
		@Test
		public void inscci() throws MalformedURLException, InterruptedException 
		{

			
			
		
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability("platformName", "Android");
			cap.setCapability("browserName", "Android");
			cap.setCapability("deviceName", "Android");
		    cap.setCapability("deviceName", "38013ca737288300");
			//cap.setCapability("udid", "192.168.70.101:5555");
			cap.setCapability("appPackage", "displ.mobydocmarathi.com");
			cap.setCapability("appActivity", "kdmc_kumar.Initialization.Initialize");
			driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
			
			//    LOGIN
			//================
			
			driver.findElementById("txtpname").sendKeys("123");
			driver.findElementById("txtdocname").sendKeys("bala777");
		    driver.findElementById("button4").click();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		  }

		
		@SuppressWarnings("unused")
		@Test(description = "open Mypatients insert data")
		public void patdata() throws MalformedURLException, InterruptedException 
		{
			
			System.out.println("TEST CASE : Verify OutPatient Flow Are Working Suceccessfully Or Not");
			
			// MY PATIENTS
			//--------------

			
		     	driver.findElements(By.xpath("//android.widget.TextView")).get(6).click();	
				//driver.findElement(By.xpath("//*[@class='android.widget.FrameLayout' and @bounds='[830,883][1192,1162]']")).click();
				Thread.sleep(2000);
				driver.findElement(By.id("displ.mobydocmarathi.com:id/edt")).sendKeys(pname);
				driver.findElement(By.id("title")).click();
				WebDriverWait wait=new WebDriverWait(driver,50);
				driver.findElement(By.id("displ.mobydocmarathi.com:id/fab")).click();
				Thread.sleep(5000);
				driver.findElements(By.xpath("//android.widget.TextView")).get(1).click();
			    dd =	driver.findElement(By.id("acpname")).getText();
			    System.out.println(dd);
				driver.findElement(By.id("Button05")).click();
				driver.findElement(By.id("imgbtprvmedhis")).click();
				driver.findElement(By.xpath("//*[@class='android.widget.CheckedTextView' and @index='1']")).click();
				driver.findElement(By.xpath("//*[@class='android.widget.CheckedTextView' and @index='3']")).click();
				driver.findElement(By.xpath("//*[@class='android.widget.CheckedTextView' and @index='4']")).click();
				driver.findElement(By.xpath("//*[@class='android.widget.CheckedTextView' and @index='5']")).click();
				driver.findElement(By.id("button1")).click();

				// Hereditary Diseases
				// ************************
				driver.scrollTo("Hereditary Diseases");
				driver.findElement(By.id("Button04")).click();
				driver.findElement(By.id("herediseas")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@class='android.widget.CheckedTextView' and @index='1']")).click();
				driver.findElement(By.xpath("//*[@class='android.widget.CheckedTextView' and @index='2']")).click();
				driver.findElement(By.xpath("//*[@class='android.widget.CheckedTextView' and @index='3']")).click();
				driver.findElement(By.id("button1")).click();
				// driver.findElement(By.id("button2")).click();

				// Personal History
				// ************************

				driver.scrollToExact("Personal History");
				driver.findElement(By.id("Button06")).click();
				driver.findElement(By.id("spinner2")).click();
				driver.scrollToExact("10 Pack Year");
				driver.findElement(By.xpath("//*[@class='android.widget.TextView' and @index='10']")).click();
				driver.findElement(By.id("spinner3")).click();
				driver.findElement(By.xpath("//*[@class='android.widget.TextView' and @index='1']")).click();

				driver.findElement(By.id("autoCompleteTextView1")).click();
				driver.findElement(By.xpath("//*[@class='android.widget.TextView' and @index='1']")).click();

				driver.findElement(By.id("radioButton1")).click();
				driver.findElement(By.id("RadioButton02")).click();

				// Family Medical History
				// ************************

				driver.scrollToExact("Family Medical History");
				driver.findElement(By.id("button11")).click();
				driver.findElement(By.id("spinner1")).click();
				driver.findElement(By.xpath("//*[@class='android.widget.TextView' and @index='1']")).click();
				driver.findElement(By.id("Button03")).click();
				driver.findElement(By.xpath("//*[@class='android.widget.CheckedTextView' and @index='2']")).click();
				driver.findElement(By.id("button1")).click();

				// Allergies
				// ************************

				driver.scrollTo("Allergies");
				driver.findElement(By.id("button22")).click();
				driver.findElement(By.id("imgbtallrg")).click();
				driver.findElement(By.xpath("//*[@class='android.widget.CheckedTextView' and @index='4']")).click();
				driver.findElement(By.id("button1")).click();
				driver.findElement(By.id("button2")).click();
				Thread.sleep(2000); 
				driver.findElement(By.id("confirm_button")).click();

				// CASE NOTES
				// =======================

				driver.findElement(By.id("treatmentfor")).sendKeys("Fever");
				driver.findElement(By.id("ddtxtdiagnosis")).sendKeys("Viral Fever");
				driver.findElement(By.id("ddtxtweight")).sendKeys("85");
				driver.findElement(By.id("heightedtxt")).sendKeys("165");
				driver.findElement(By.id("ddtxttemp")).sendKeys("102");
				driver.findElement(By.id("ddtxtbp")).sendKeys("130");
				driver.findElement(By.id("ddtxtbp1")).sendKeys("85");

				// General Examination
				// ---------------------

				driver.findElement(By.id("button22")).click();
				driver.scrollTo("Cardio Vascular System");
				driver.findElement(By.id("switch_anaemicyn1")).click();
				driver.findElement(By.id("switch_limbphantomyn1")).click();
				driver.findElement(By.id("checkBox17")).click();
				driver.findElement(By.id("checkBox18")).click();

				// CardioVascular Systems
				// -----------------------
				driver.scrollTo("Cardio Vascular System");
				driver.findElement(By.id("button11")).click();
				driver.findElement(By.id("checkBox5")).click();
				driver.findElement(By.id("checkBox6")).click();
				driver.findElement(By.id("checkBox7")).click();
				driver.findElement(By.id("switch_pericardialrub")).click();
				driver.findElement(By.id("editText33")).sendKeys("76");

				// Respiratory System
				// -----------------------
				driver.scrollTo("Respiratory System");
				driver.findElement(By.id("button33")).click();
				driver.scrollTo("Respiratory System");
				driver.findElement(By.id("spinner1")).click();
				driver.findElement(By.xpath("//*[@class='android.widget.TextView' and @index='2']")).click();
				driver.findElement(By.id("spinner2")).click();
				driver.findElement(By.xpath("//*[@class='android.widget.TextView' and @index='2']")).click();
				driver.findElement(By.id("checkBox8")).click();
				driver.findElement(By.id("checkBox11")).click();
				driver.findElement(By.id("checkBox12")).click();
				driver.findElement(By.id("spinner6")).click();
				driver.findElement(By.xpath("//*[@class='android.widget.TextView' and @index='1']")).click();
				driver.findElement(By.id("editText1")).sendKeys("76");
				driver.findElement(By.id("autoCompleteTextView9")).sendKeys("92");

				// Renal System
				// -----------------------
				driver.scrollTo("Renal System");
				driver.findElement(By.id("button1")).click();
				driver.findElement(By.id("spinner16")).click();
				driver.findElement(By.xpath("//*[@class='android.widget.TextView' and @index='2']")).click();
				driver.findElement(By.id("switch_oliguria1")).click();
				driver.findElement(By.id("switch_nocturia1")).click();

				// Endocrine System
				// -----------------------
				driver.scrollTo("Endocrine System");
				driver.findElement(By.id("button2")).click();
				driver.findElement(By.id("button3")).click();
				driver.findElement(By.xpath("//*[@class='android.widget.CheckedTextView' and @index='1']")).click();
				driver.findElement(By.xpath("//*[@class='android.widget.CheckedTextView' and @index='2']")).click();
				driver.findElement(By.xpath("//*[@class='android.widget.CheckedTextView' and @index='3']")).click();
				driver.findElement(By.id("button1")).click();
				driver.findElement(By.id("diag_cancel_btn")).click();
				// driver.findElement(By.id("diag_next_btn")).click();
				// driver.findElement(By.id("diag_next_btn")).click();
				Thread.sleep(2000);
				driver.findElement(By.id("confirm_button")).click();

				// INVESTIGATIONS
				// ----------------------
				
				//TEST
			  //========
				
				driver.findElement(By.id("show_btn")).click();
			    driver.findElements(By.xpath("//android.widget.CheckedTextView")).get(3).click();
			    WebElement Fg= driver.findElement(By.xpath("//*[@class='android.widget.CheckBox' and @bounds='[80,456][1200,556]']")); //[80,620][1200,720] ammonia
			    Fg.click();
			    driver.findElement(By.xpath("//*[@class='android.widget.CheckBox' and @bounds='[80,948][1200,1048]']")).click(); //[80,292][1200,392] Acid phospate
			    driver.findElement(By.xpath("//*[@class='android.widget.CheckBox' and @bounds='[80,1358][1200,1458]']")).click(); //[80,1440][1200,1540] cholestrol
			    driver.findElement(By.xpath("//*[@class='android.widget.CheckBox' and @bounds='[80,1112][1200,1212]']")).click(); //[80,1604][1200,1704] Copper
			  //  driver.findElements(By.xpath("//android.widget.TextView")).get(2).click();
			    All();
				
				
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
				driver.findElement(By.id("diag_cancel_btn")).click();   // Submit
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
				 driver.findElements(By.xpath("//android.widget.TextView")).get(4).click();
				 Thread.sleep(8000);

				//Prescription
			//===================
				 
				// driver.findElements(By.xpath("//android.widget.FrameLayout")).get(4).click();
				 //driver.findElements(By.xpath("//android.widget.TextView")).get(4).click(); 
				 driver.findElement(By.xpath("//*[@class='android.widget.FrameLayout' and @bounds='[830,883][1192,1162]' or @bounds='[830,973][1192,1252]']")).click();
				 Thread.sleep(2000);
				//driver.findElement(By.id("acpname")).sendKeys(dd);
				
				driver.findElement(By.id("displ.mobydocmarathi.com:id/edt")).sendKeys(pname);
				driver.findElement(By.id("title")).click();
				WebDriverWait wait1=new WebDriverWait(driver,50);
				driver.findElement(By.id("displ.mobydocmarathi.com:id/fab")).click();
				Thread.sleep(5000);
				driver.findElements(By.xpath("//android.widget.TextView")).get(4).click();
				driver.findElementById("displ.mobydocmarathi.com:id/MultiAutoCompleteTextView1").sendKeys("FEVER");    //Symptoms
				driver.findElementById("displ.mobydocmarathi.com:id/AutoCompleteTextView1").sendKeys("VIRAL FEVER");   //Provisinoal Diagnosis
			//	driver.findElementById("displ.mobydocmarathi.com:id/amt").click();                                     //Medicine Template
				driver.scrollTo("Intake");
				driver.findElementById("displ.mobydocmarathi.com:id/mpmedicinename").sendKeys("CALPOL-500mg");         //Medicines
				Thread.sleep(2000);
				driver.findElementById("displ.mobydocmarathi.com:id/checkBox5").click();                               //All
				driver.findElementById("displ.mobydocmarathi.com:id/checkBox3").click();                               //Evening
				driver.findElementById("displ.mobydocmarathi.com:id/radioButton1").click();                            //After Food
				driver.findElement(By.id("mpspnrduration")).click();                                                   //Duration
				driver.findElement(By.xpath("//*[@class='android.widget.TextView' and @index='3']")).click();          //Select Days
				driver.findElement(By.id("imgclear")).click();                                                         //Add
				/*driver.findElementById("displ.mobydocmarathi.com:id/mpmedicinename").sendKeys("RABBY-20mg");
				driver.findElementById("displ.mobydocmarathi.com:id/checkBox5").click();                               //All
				driver.findElementById("displ.mobydocmarathi.com:id/checkBox3").click();                               //Evening
				driver.findElementById("displ.mobydocmarathi.com:id/radioButton1").click();                            //After Food
				driver.findElement(By.id("mpspnrduration")).click();                                                   //Duration
				driver.findElement(By.xpath("//*[@class='android.widget.TextView' and @index='3']")).click();          //Select Days
				driver.findElement(By.id("imgclear")).click();                                                         //Add
				driver.findElementById("displ.mobydocmarathi.com:id/mpmedicinename").sendKeys("VOMIKIND-2mg");
				driver.findElementById("displ.mobydocmarathi.com:id/checkBox5").click();                               //All
				driver.findElementById("displ.mobydocmarathi.com:id/checkBox3").click();                               //Evening
				driver.findElementById("RadioButton01").click();                            //After Food
				driver.findElement(By.id("mpspnrduration")).click();                                                   //Duration
				driver.findElement(By.xpath("//*[@class='android.widget.TextView' and @index='3']")).click();          //Select Days
				driver.findElement(By.id("imgclear")).click();                                                         //Add
				driver.findElementById("displ.mobydocmarathi.com:id/mpmedicinename").sendKeys("vitamin c");
				driver.findElementById("displ.mobydocmarathi.com:id/checkBox3").click();                               //Evening
				driver.findElementById("displ.mobydocmarathi.com:id/checkBox5").click();                                //All
				driver.findElementById("displ.mobydocmarathi.com:id/radioButton1").click();                            //After Food
				driver.findElement(By.id("mpspnrduration")).click();                                                   //Duration
				driver.findElement(By.xpath("//*[@class='android.widget.TextView' and @index='3']")).click();          //Select Days
				driver.findElement(By.id("imgclear")).click();                                                         //Add
				*///or
				//driver.findElementById("displ.mobydocmarathi.com:id/mpmedicinename").sendKeys("VOMIZ-4mg");
				
			//	 Prescription 
			//---------------------------------------
				/*driver.findElementById("displ.mobydocmarathi.com:id/checkBox1").click();                               //Morning
				driver.findElementById("displ.mobydocmarathi.com:id/checkBox2").click();                               //Afternoon
				driver.findElementById("displ.mobydocmarathi.com:id/checkBox3").click();                               //Evening
				driver.findElementById("displ.mobydocmarathi.com:id/checkBox4").click();                               //Night
				//driver.findElementById("displ.mobydocmarathi.com:id/checkBox5").click();                               //All
				driver.findElementById("displ.mobydocmarathi.com:id/radioButton1").click();                            //After Food
				driver.findElementById("RadioButton01").click();                                                       //Before Food
				driver.findElementById("displ.mobydocmarathi.com:id/radioButton2").click();                            //With Food            
				driver.findElement(By.id("mpspnrduration")).click();                                                   //Duration
				driver.findElement(By.xpath("//*[@class='android.widget.TextView' and @index='3']")).click();          //Select Days
				driver.findElement(By.id("imgclear")).click();                                                         //Add
				driver.findElement(By.id("save_template")).click();                                                    //Save Medicine Template
	*/			
				//Diet Restriction 
			//---------------------------------------
				/*driver.scrollTo("Choose Instruction");
				driver.findElement(By.id("adivespnr")).click();                                                        //Select Advice
				driver.findElement(By.xpath("//*[@class='android.widget.TextView' and @index='2']")).click();          //Choose data
				driver.findElement(By.xpath("//*[@class='android.widget.CheckedTextView' and @index='2']")).click();   //Choose diet
				driver.findElement(By.id("Button01")).click();                                                       */  //Add
				
				//DIET TO FOLLOW
			//-------------------------
				
				driver.scrollToExact("Diet to follow");
				//driver.findElement(By.id("checkBox6")).click();                                                         //Diabetic diet
				//driver.findElement(By.id("checkBox7")).click();                                                         //Diabetic Renal diet
				driver.findElement(By.id("checkBox8")).click();                                                         //Low cholesterol/Cardiac diet
				//driver.findElement(By.id("checkBox9")).click();                                                         //Hypertensive diet
				//driver.findElement(By.id("checkBox10")).click();                                                        //Diet for patients on warfarin
				driver.scrollToExact("Remarks");
				driver.findElementById("noofdays").sendKeys("3");                                                       //Next Visitdays
				driver.findElementById("remarks_medipre").sendKeys("Intake Medicines Properly");                        //Remarks
				Thread.sleep(4000);
				driver.findElement(By.id("imgbSubmit")).click();
				driver.findElement(By.id("displ.mobydocmarathi.com:id/diag_cancel_btn")).click();                                                   //Submit
				//driver.findElement(By.id("displ.mobydocmarathi.com:id/diag_cancel_btn")).click();   
			//	driver.findElement(By.id("imgbSubmit")).click();                                                        //Cancel
				Thread.sleep(3000);
				driver.findElementsByXPath("android.widget.TextView").get(2).click();
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
		
		
		}
		

