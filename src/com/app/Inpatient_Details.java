package com.app;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Inpatient_Details {
	
	
	AndroidDriver<MobileElement> driver;
	
/*@Test	
public void INP() {


}
	*/
@Test
public void inpdetails() throws InterruptedException, MalformedURLException 
{

	DesiredCapabilities in = new DesiredCapabilities();
	in.setCapability("deviceName", "Android");     
	in.setCapability("udid", "emulator-5554");//emulator-5554 //38013ca737288300
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
	Thread.sleep(5000);
	MobileElement el3 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/button_go");
	el3.click();
	MobileElement el4 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/txtpname");
	el4.sendKeys("123456");
	MobileElement el5 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/txtdocname");
	el5.sendKeys("hari");
	Thread.sleep(3000);
	MobileElement el6 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/button4");
	el6.click();
	Thread.sleep(3000);
	MobileElement el7 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[10]/android.widget.TextView");
	el7.click();
	MobileElement el8 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/edittext_search");
	el8.sendKeys("ramesh");
	MobileElement el9 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/pid");
	el9.click();
	Thread.sleep(3000);
	(new TouchAction(driver)).tap(753, 1197).perform();

	MobileElement addinp = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
	addinp.click();
	Thread.sleep(1000);
	MobileElement el12 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/arrow_inpatient_chart");
	el12.click();
	Thread.sleep(1000);
	MobileElement el13 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/edittext_inaptientchart_bpsytolic");
	el13.sendKeys("128");
	Thread.sleep(1000);
	MobileElement el14 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/edittext_inaptientchart_bpdiastolic");
	el14.sendKeys("80");
	Thread.sleep(1000);
	
	MobileElement el15 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/edittext_inaptientchart_pulseperminute");
	el15.sendKeys("72");
	Thread.sleep(1000);
	MobileElement el16 = (MobileElement) driver.findElementById("android:id/text1");
	el16.click();
	Thread.sleep(1000);
	MobileElement el17 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.TextView[5]");
	el17.click();
	Thread.sleep(1000);
	MobileElement el18 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/edittext_inaptientchart_resp");
	el18.click();
	Thread.sleep(1000);
	el18.sendKeys("76");
	MobileElement el19 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/edittext_inaptientchart_spo2");
	el19.sendKeys("91");
	Thread.sleep(1000);
	MobileElement el20 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/edittext_inaptientchart_drugorder");
	el20.sendKeys("Take Tablet Before Food");
	Thread.sleep(1000);
	MobileElement el21 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/edittext_inaptientchart_nursing_instruction");
	el21.sendKeys("Monitor BP For Every 1 Hour");
	Thread.sleep(1000);
	MobileElement el22 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/edittext_inaptientchart_oral");
	el22.sendKeys("25");
	Thread.sleep(1000);
	MobileElement el23 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/edittext_inaptientchart_fluids");
	el23.sendKeys("35");
	Thread.sleep(1000);
	MobileElement el24 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/edittext_inaptientchart_rvles");
	el24.sendKeys("45");
	Thread.sleep(1000);
	MobileElement el25 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/edittext_inaptientchart_motion");
	el25.sendKeys("65");
	Thread.sleep(1000);
	MobileElement el26 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/edittext_inaptientchart_urine");
	el26.sendKeys("75");
	Thread.sleep(1000);
	MobileElement el27 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/button_inaptientchart_save");
	el27.click();
	Thread.sleep(1000);
	MobileElement el28 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/bt_close_yes");
	el28.click();
	Thread.sleep(1000);
	MobileElement el29 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/arrow_diabetic_chart");
	el29.click();
	Thread.sleep(1000);
	MobileElement el30 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/edittext_diabetichart_speciali_instruction");
	el30.sendKeys("Special Instruction");
	Thread.sleep(1000);
	MobileElement el31 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/autoCompleteTextView_diabetichart_urine_sugar");
	el31.sendKeys("50");
	Thread.sleep(1000);
	MobileElement el32 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/edittext_diabetichart_lente");
	el32.sendKeys("25");
	Thread.sleep(1000);
	MobileElement el33 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/edittext_diabetichart_insulin_plain");
	el33.sendKeys("45");
	Thread.sleep(1000);
	MobileElement el34 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/edittext_diabetichart_blood_sugar");
	el34.sendKeys("35");
	Thread.sleep(1000);
	MobileElement el35 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/edittext_diabetichart_ketone_bodies");
	el35.sendKeys("75");
	Thread.sleep(1000);
	MobileElement el36 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/button_diabetichart_save");
	el36.click();
	Thread.sleep(1000);
	MobileElement el37 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/bt_close_yes");
	el37.click();
	Thread.sleep(1000);
	MobileElement el38 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/arrow_temperature_chart");
	el38.click();
	Thread.sleep(1000);
	MobileElement el39 = (MobileElement) driver.findElementById("android:id/text1");
	el39.click();
	Thread.sleep(1000);
	MobileElement el40 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.TextView[6]");
	el40.click();
	Thread.sleep(1000);
	MobileElement el41 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/button_temperaturechart_save");
	el41.click();
	Thread.sleep(1000);
	MobileElement el42 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/bt_close_yes");
	el42.click();
	MobileElement el43 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/arrow_surgery_record");
	el43.click();
	MobileElement el44 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/edittext_surgery_preoperative_diagnosis");
	el44.sendKeys("Stomache");
	MobileElement el45 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/editext_surgery_operativenotes");
	el45.sendKeys("Opration");
	MobileElement el46 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/edittext_surgery_position");
	el46.sendKeys("Left");
	MobileElement el47 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/edittext_surgery_procedure");
	el47.sendKeys("Surgery");
	MobileElement el48 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/edittext_surgery_closure");
	el48.sendKeys("Right");
	MobileElement el49 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/edittext_surgery_postoperative_diagnosis");
	el49.sendKeys("Normal");
	MobileElement el50 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/edittext_surgery_surgeon");
	el50.sendKeys("Nirmal");
	MobileElement el51 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/edittext_surgery_anaesthetist");
	el51.sendKeys("Malini");
	MobileElement el52 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/edittext_surgery_asst");
	el52.sendKeys("Nithya");
	MobileElement el53 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/edittext_surgery_blood_loss");
	el53.sendKeys("No blood Loss");
	MobileElement el54 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/edittext_surgery_histo_pathological");
	el54.sendKeys("Fever");
	MobileElement el55 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/edittext_surgery_post_op_instruction");
	el55.sendKeys("Normal");
	MobileElement el56 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/button_surgery_save");
	el56.click();
	MobileElement el57 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/bt_close_yes");
	el57.click();
	MobileElement el58 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/arrow_medicalcase_record");
	el58.click();
	MobileElement el59 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[4]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.Spinner[1]/android.widget.CheckedTextView");
	el59.click();
	MobileElement el60 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.CheckedTextView[2]");
	el60.click();
	MobileElement el61 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/edittext_medicalcase_record_student");
	el61.sendKeys("Guru");
	MobileElement el62 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/autocomplete_medicalcase_provisional_diagnosis");
	el62.click();
	el62.sendKeys("Stomache");
	MobileElement el63 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/edittext_medicalcase_final_diagnosis");
	el63.sendKeys("Appendix");
	MobileElement el64 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.Spinner[2]/android.widget.CheckedTextView");
	el64.click();
	MobileElement el65 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.CheckedTextView[3]");
	el65.click();
	MobileElement el66 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/edittext_medicalcase_clinicalnotes");
	el66.sendKeys("Walking");
	MobileElement el67 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/edittext_medicalcase_treatement_and_diet");
	el67.sendKeys("Low Cholestrol Food");
	MobileElement el68 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/button_medicalcase_add");
	el68.click();
	MobileElement el69 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/button_medicalcase_save");
	el69.click();
	MobileElement el70 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/bt_close_yes");
	el70.click();
	MobileElement el71 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/toolbar_back");
	el71.click();
	/*MobileElement el72 = (MobileElement) driver.findElementByAccessibilityId(" MEDICAL PRESCRIPTION");
	el72.click();
	MobileElement el73 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/toolbar_back");
	el73.click();
	MobileElement el74 = (MobileElement) driver.findElementByAccessibilityId("Input Oral");
	el74.click();*/
	/*MobileElement el75 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]");
	el75.click();
	MobileElement el76 = (MobileElement) driver.findElementById("android:id/text1");
	el76.click();*/
	MobileElement el77 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
	el77.click();
	MobileElement el78 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/edt_breakfast");
	el78.sendKeys("idly");
	MobileElement el79 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]");
	el79.click();
	MobileElement el80 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/add_button_img");
	el80.click();
	MobileElement el81 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]");
	el81.click();
	MobileElement el82 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/submit_datas");
	el82.click();
	MobileElement el83 = (MobileElement) driver.findElementById("android:id/button1");
	el83.click();
	MobileElement el84 = (MobileElement) driver.findElementById("displ.mobydocmarathi.com:id/toolbar_back");
	el84.click();
}


}
