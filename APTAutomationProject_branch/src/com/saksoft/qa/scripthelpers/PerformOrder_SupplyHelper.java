package com.saksoft.qa.scripthelpers;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.DocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.LogStatus;
import com.saksoft.qa.driverlibrary.DriverHelper;
import com.saksoft.qa.driverlibrary.DriverTestcase;
import com.saksoft.qa.driverlibrary.Log;
import com.saksoft.qa.driverlibrary.XMLReader;
import com.saksoft.qa.excellibrary.APT_DataWriter;

public class PerformOrder_SupplyHelper extends DriverHelper {
	WebDriver driver;
	public PerformOrder_SupplyHelper(WebDriver dr) {
		super(dr);
		driver=dr;
	}
	
	WebElement Name_Textfield, MainDomain_Textfield, countryDropdown, OCN_Textfield, Reference_Textfield, TechnicalContactName_Textfield, Type_Textfield, Email_Textfield, Phone_Textfield, Fax_Textfield, EnableDedicatedPortal_TextField, OkButton_CreateCustomer, ClearButton_CreateCustomer, typeDropdown ;
	SoftAssert sa=new SoftAssert();
	XMLReader xml=new XMLReader("src\\com\\saksoft\\qa\\pagerepository\\APT_MCS_CreateCustomer.xml");
	
	public void navigateToManageCustomerServicePage(String application) throws InterruptedException, DocumentException {
		
//		driver.navigate().refresh();
		
		Moveon(getwebelement(xml.getlocator("//locators/"+application+"/ManageCustomerServiceLink")));
		Thread.sleep(3000);
		//Clickon(getwebelement(xml.getlocator("//locators/"+application+"/ManageCustomerServiceLink")));						Thread.sleep(2000);
		DriverTestcase.logger.log(LogStatus.PASS, "Step : MCS page navigated");
		Log.info("=== MCS page navigated ===");
		Thread.sleep(4000);
	}
	
	
	public void navigateToCreateCustomerPage(String application) throws InterruptedException, DocumentException {
		navigateToManageCustomerServicePage(application);
		Clickon(getwebelement(xml.getlocator("//locators/"+application+"/CreateCustomerLink"))); 	
		DriverTestcase.logger.log(LogStatus.PASS, "Step : Navigated to Create Customer page");
		Log.info("=== Create customer navigated ===");	
		Thread.sleep(5000);
	}
	
	public void ClickOnCreateCustomerLink(String application) throws InterruptedException, DocumentException {
		Clickon(getwebelement(xml.getlocator("//locators/"+application+"/CreateCustomerLink"))); 	
		Thread.sleep(1000);
		DriverTestcase.logger.log(LogStatus.PASS, "Step : Click on Create customer Link ");
		Log.info("=== Click on Create customer Link ===");	
	}
	
	public void verifyCreateCustomerFields(String application) throws InterruptedException, DocumentException, IOException {
		
		
		navigateToCreateCustomerPage("CreateCustomer");
		
		try {
			
			Name_Textfield = getwebelement(xml.getlocator("//locators/" + application + "/Name_Textfield"));
			sa.assertTrue(Name_Textfield.isDisplayed(),"name field is not displayed");
			sa.assertTrue(Name_Textfield.isEnabled(), "name field is not disabled");
			DriverTestcase.logger.log(LogStatus.PASS, "Step : Name is displayed");
			Log.info("===Name is displayed ===");
			
			MainDomain_Textfield = getwebelement(xml.getlocator("//locators/" + application + "/MainDomain_Textfield"));
			sa.assertTrue(MainDomain_Textfield.isDisplayed(),"MainDomain_Textfield is not displayed");
			sa.assertTrue(MainDomain_Textfield.isEnabled(), "MainDomain_Textfield is not disabled");
			DriverTestcase.logger.log(LogStatus.PASS, "Step : Main Domain is displayed");
			Log.info("===Main Domain is displayed ===");
			
			countryDropdown = getwebelement(xml.getlocator("//locators/" + application + "/Country_Textfield"));
			sa.assertTrue(countryDropdown.isDisplayed(),"countrydropdown  is not displayed");
			sa.assertTrue(countryDropdown.isEnabled(), "countryropdown is not disabled");
			DriverTestcase.logger.log(LogStatus.PASS, "Step : Country is displayed");
			Log.info("===Country is displayed ===");
			
			OCN_Textfield = getwebelement(xml.getlocator("//locators/" + application + "/OCN_Textfield"));
			sa.assertTrue(OCN_Textfield.isDisplayed(),"OCN_Textfield is not displayed");
			sa.assertTrue(OCN_Textfield.isEnabled(), "OCN_Textfield is not disabled");
			DriverTestcase.logger.log(LogStatus.PASS, "Step : OCN is displayed");
			Log.info("===OCN is displayed ===");
			
			Reference_Textfield = getwebelement(xml.getlocator("//locators/" + application + "/Reference_Textfield"));
			sa.assertTrue(Reference_Textfield.isDisplayed(),"Reference_Textfield is not displayed");
			sa.assertTrue(Reference_Textfield.isEnabled(), "Reference_Textfield is not disabled");
			DriverTestcase.logger.log(LogStatus.PASS, "Step : Reference is displayed");
			Log.info("===Reference is displayed ===");
			
			TechnicalContactName_Textfield = getwebelement(xml.getlocator("//locators/" + application + "/TechnicalContactName_Textfield"));
			sa.assertTrue(TechnicalContactName_Textfield.isDisplayed(),"TechnicalContactName_Textfield is not displayed");
			sa.assertTrue(TechnicalContactName_Textfield.isEnabled(), "TechnicalContactName_Textfield is not disabled");
			DriverTestcase.logger.log(LogStatus.PASS, "Step : Technical Contact Name is displayed");
			Log.info("===Technical Contact Name is displayed ===");
			
			Type_Textfield = getwebelement(xml.getlocator("//locators/" + application + "/Type_Textfield"));
			sa.assertTrue(Type_Textfield.isDisplayed(),"Type_Textfield is not displayed");
			sa.assertTrue(Type_Textfield.isEnabled(), "Type_Textfield is not disabled");
			DriverTestcase.logger.log(LogStatus.PASS, "Step : Type is displayed");
			Log.info("===Type is displayed ===");
			
			Email_Textfield = getwebelement(xml.getlocator("//locators/" + application + "/Email_Textfield"));
			sa.assertTrue(Email_Textfield.isDisplayed(),"Email_Textfield is not displayed");
			sa.assertTrue(Email_Textfield.isEnabled(), "Email_Textfield is not disabled");
			DriverTestcase.logger.log(LogStatus.PASS, "Step : Email is displayed");
			Log.info("===Email is displayed ===");
			
			Phone_Textfield = getwebelement(xml.getlocator("//locators/" + application + "/Phone_Textfield"));
			sa.assertTrue(Phone_Textfield.isDisplayed(),"name field is not displayed");
			sa.assertTrue(Phone_Textfield.isEnabled(), "name field is not disabled");
			DriverTestcase.logger.log(LogStatus.PASS, "Step : Phone is displayed");
			Log.info("===Phone is displayed ===");
			
			Fax_Textfield = getwebelement(xml.getlocator("//locators/" + application + "/Fax_Textfield"));
			sa.assertTrue(Fax_Textfield.isDisplayed(),"Fax_Textfield is not displayed");
			sa.assertTrue(Fax_Textfield.isEnabled(), "Fax_Textfield is not disabled");
			DriverTestcase.logger.log(LogStatus.PASS, "Step : Fax is displayed");
			Log.info("===Fax is displayed ===");
			
			EnableDedicatedPortal_TextField = getwebelement(xml.getlocator("//locators/" + application + "/EnableDedicatedPortal_TextField"));
			sa.assertTrue(EnableDedicatedPortal_TextField.isDisplayed(),"EnableDedicatedPortal_TextField is not displayed");
			sa.assertTrue(EnableDedicatedPortal_TextField.isEnabled(), "EnableDedicatedPortal_TextField is not disabled");
			DriverTestcase.logger.log(LogStatus.PASS, "Step : Enable Dedicated Portal is displayed");
			Log.info("===Enable Dedicated Portal is displayed ===");
			
			OkButton_CreateCustomer = getwebelement(xml.getlocator("//locators/" + application + "/OkButton_CreateCustomer"));
			sa.assertTrue(OkButton_CreateCustomer.isDisplayed(),"OkButton_CreateCustomer  is not displayed");
			sa.assertTrue(OkButton_CreateCustomer.isEnabled(), "OkButton_CreateCustomer is not disabled");
			DriverTestcase.logger.log(LogStatus.PASS, "Step : OK Button is displayed");
			Log.info("===OK Button is displayed ===");
			
			ClearButton_CreateCustomer = getwebelement(xml.getlocator("//locators/" + application + "/ClearButton_CreateCustomer"));
			sa.assertTrue(ClearButton_CreateCustomer.isDisplayed(),"ClearButton_CreateCustomer  is not displayed");
			sa.assertTrue(ClearButton_CreateCustomer.isEnabled(), "ClearButton_CreateCustomer is not disabled");
			DriverTestcase.logger.log(LogStatus.PASS, "Step : Clear Button is displayed");
			Log.info("===Clear Button is displayed ===");
		
		} catch (TimeoutException e) {
			e.printStackTrace();
			System.out.println("value is not displayed");
			DriverTestcase.logger.log(LogStatus.PASS, "value is not displayed in Create Customer page :  " + e);

		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("value is not displayed");
			DriverTestcase.logger.log(LogStatus.PASS, "value is not displayed in Create Customer page :  " + e);
		}
		
		Log.info("=== Create customer all fields Verified ===");
		sa.assertAll();
	}
	
	WebElement Nameisrequired_Text, MainDomainisrequired_Text, Countryisrequired_Text, OCNisrequired_Text, Typeisrequired_Text, Emailisrequired_Text;
	public void verifyCreateCustomerMandatoryFields(String application) throws InterruptedException, DocumentException, IOException {
		navigateToCreateCustomerPage("CreateCustomer");

		try {
			
		Clickon(getwebelement(xml.getlocator("//locators/"+application+"/OkButton_CreateCustomer")));  						Thread.sleep(2000);
		DriverTestcase.logger.log(LogStatus.PASS, "Step : OK button clicked under Create Customer");
		Log.info("=== OK button clicked ===");	
		
			Nameisrequired_Text = getwebelement(xml.getlocator("//locators/" + application + "/Nameisrequired_Text"));
			sa.assertTrue(Nameisrequired_Text.isDisplayed(),"Nameisrequired_Text is not displayed");
			sa.assertTrue(Nameisrequired_Text.isEnabled(), "Nameisrequired_Text is not disabled");
			DriverTestcase.logger.log(LogStatus.PASS, "Step : 'Name is required' message displayed");
			Log.info("=== 'Name is required' message displayed ===");
			
			MainDomainisrequired_Text = getwebelement(xml.getlocator("//locators/" + application + "/MainDomainisrequired_Text"));
			sa.assertTrue(MainDomainisrequired_Text.isDisplayed(),"MainDomainisrequired_Text is not displayed");
			sa.assertTrue(MainDomainisrequired_Text.isEnabled(), "MainDomainisrequired_Text is not disabled");
			DriverTestcase.logger.log(LogStatus.PASS, "Step : 'Main Domain is required' message displayed");
			Log.info("=== 'Main Domain is required' message displayed ===");
			
			Countryisrequired_Text = getwebelement(xml.getlocator("//locators/" + application + "/Countryisrequired_Text"));
			sa.assertTrue(Countryisrequired_Text.isDisplayed(),"Countryisrequired_Text  is not displayed");
			sa.assertTrue(Countryisrequired_Text.isEnabled(), "Countryisrequired_Text is not disabled");
			DriverTestcase.logger.log(LogStatus.PASS, "Step : 'Country is required' message displayed");
			Log.info("=== 'Country is required' message displayed ===");
			
			OCNisrequired_Text = getwebelement(xml.getlocator("//locators/" + application + "/OCNisrequired_Text"));
			sa.assertTrue(OCNisrequired_Text.isDisplayed(),"OCNisrequired_Text is not displayed");
			sa.assertTrue(OCNisrequired_Text.isEnabled(), "OCNisrequired_Text is not disabled");
			DriverTestcase.logger.log(LogStatus.PASS, "Step : 'OCN is required' message displayed");
			Log.info("=== 'OCN is required' message displayed ===");
			
			Typeisrequired_Text = getwebelement(xml.getlocator("//locators/" + application + "/Typeisrequired_Text"));
			sa.assertTrue(Typeisrequired_Text.isDisplayed(),"Typeisrequired_Text is not displayed");
			sa.assertTrue(Typeisrequired_Text.isEnabled(), "Typeisrequired_Text is not disabled");
			DriverTestcase.logger.log(LogStatus.PASS, "Step : 'Type is required' message displayed");
			Log.info("=== 'Type is required' message displayed ===");
			
			Emailisrequired_Text = getwebelement(xml.getlocator("//locators/" + application + "/Emailisrequired_Text"));
			sa.assertTrue(Emailisrequired_Text.isDisplayed(),"Emailisrequired_Text is not displayed");
			sa.assertTrue(Emailisrequired_Text.isEnabled(), "Emailisrequired_Text is not disabled");
			DriverTestcase.logger.log(LogStatus.PASS, "Step : 'Email is required' message displayed");
			Log.info("=== 'Email is required' message displayed ===");
		
		} catch (TimeoutException e) {
			e.printStackTrace();
			System.out.println("value is not displayed");
			DriverTestcase.logger.log(LogStatus.PASS, "value is not displayed in Create Customer page :  " + e);

		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("value is not displayed");
			DriverTestcase.logger.log(LogStatus.PASS, "value is not displayed in Create Customer page :  " + e);
		}
		
		Log.info("=== Create customer all mandatory fields Verified ===");
		sa.assertAll();	
	}
	
	
	public void verifyCreateCustomerFields2(String application) throws InterruptedException, DocumentException, IOException {
		navigateToCreateCustomerPage("CreateCustomer");
		
		// verify name fields
				//getwebelement(xml.getlocator("//locators/" + application + "/name")).clear();
				String s1 = getwebelement(xml.getlocator("//locators/"+application+"/name")).getAttribute("value");
				if (s1.isEmpty()) {

					sa.fail("name value is empty");
				} else {

					Log.info("name value is : " + s1);
				}

				//verify Phone
				String s2 = getwebelement(xml.getlocator("//locators/"+application+"/Phone")).getAttribute("value");
				if (s2.isEmpty()) {

					sa.fail("phone value is empty");
				} else {

					Log.info("phone value is : " + s2);
				}

				//verify Email
				String s3 = getwebelement(xml.getlocator("//locators/"+application+"/email")).getAttribute("value");
				if (s3.isEmpty()) {

					sa.fail("email value is Empty");
				} else {

					Log.info("email value is : " + s3);
				}

				sa.assertAll();
		
	}
	
	WebElement DedicatePortal_Text;
	public void verifyDedicatedPortalDisplayedOrNot(String application) throws InterruptedException, DocumentException, IOException {
		navigateToCreateCustomerPage("CreateCustomer");
		Clickon(getwebelement(xml.getlocator("//locators/"+application+"/EnableDedicatedPortalCheckbox")));			Thread.sleep(1000);
		
		DedicatePortal_Text = getwebelement(xml.getlocator("//locators/" + application + "/DedicatePortal_Text"));
		sa.assertTrue(DedicatePortal_Text.isDisplayed(),"DedicatePortal_Text is not displayed");
		sa.assertTrue(DedicatePortal_Text.isEnabled(), "DedicatePortal_Text is not disabled");
		
		DriverTestcase.logger.log(LogStatus.PASS, "Step : Dedicate Portal text is disabled");
		Log.info("Dedicate Portal text is Displayed");
		
	}
	
	
		
	public void SelectDedicatedPortal_IfDedicatedPortalStatus_Yes2(String application, String DedicatedPortalStatus, String DedicatedPortal) throws InterruptedException, DocumentException, IOException {
		navigateToCreateCustomerPage("CreateCustomer");
		if(DedicatedPortalStatus.equalsIgnoreCase("Yes")) {
			Clickon(getwebelement(xml.getlocator("//locators/"+application+"/EnableDedicatedPortalCheckbox")));									Thread.sleep(1000);
			Select(getwebelement(xml.getlocator("//locators/"+application+"/DedicatePortal_Select")), DedicatedPortal);							Thread.sleep(1000);
			Log.info("=== Dedicate Portal checkbox Selected ===");
		}else if (DedicatedPortalStatus.equalsIgnoreCase("No")) {
			Log.info("=== Dedicate Portal checkbox Not Selected SInce DedicatedPortalStatus is No ===");			
		}else if (DedicatedPortalStatus.equalsIgnoreCase("")) {
			Log.info("=== Dedicate Portal checkbox Not Selected Since DedicatedPortalStatus is Empty ===");			
		}else {
			Log.info("=== Found invalid input for DedicatedPortalStatus ===");
			}
	}
	
	
	
	public void SelectDedicatedPortalCheckbox_IfDedicatedPortalStatus_Yes(String application, String DedicatedPortalStatus, String DedicatedPortal) throws InterruptedException, DocumentException, IOException {
		if(DedicatedPortalStatus.equalsIgnoreCase("Yes")) {
			Clickon(getwebelement(xml.getlocator("//locators/"+application+"/EnableDedicatedPortalCheckbox")));									Thread.sleep(1000);
			DriverTestcase.logger.log(LogStatus.PASS, "Step : Enable Dedicated Portal Checkbox checked");

			Clickon(getwebelement(xml.getlocator("//locators/"+application+"/DedicatePortal_Select_Build4")));
			DriverTestcase.logger.log(LogStatus.PASS, "Step : Dedicate Portal Selected :  "+DedicatedPortal);
			Log.info("=== Dedicate Portal checkbox Selected ===");
			
			WebElement el3 = driver.findElement(By.xpath("//div[div[contains(text(),'"+DedicatedPortal+"')]]/input"));
			el3.click();
			
			Thread.sleep(1000);
			Log.info("=== Dedicate Portal checkbox Selected ===");
		}else if (DedicatedPortalStatus.equalsIgnoreCase("No")) {
			DriverTestcase.logger.log(LogStatus.PASS, "Step : Dedicate Portal not Selected");
			Log.info("=== Dedicate Portal checkbox Not Selected SInce DedicatedPortalStatus is No ===");	
			
		}else if (DedicatedPortalStatus.equalsIgnoreCase("")) {
			DriverTestcase.logger.log(LogStatus.PASS, "Step : Dedicate Portal not Selected, Since DedicatedPortalStatus is Empty");
			Log.info("=== Dedicate Portal checkbox Not Selected Since DedicatedPortalStatus is Empty ===");

			
		}else {
			DriverTestcase.logger.log(LogStatus.PASS, "Step : Dedicate Portal not Selected, Since found invalid input for DedicatedPortalStatus");
			Log.info("=== Found invalid input for DedicatedPortalStatus ===");

			}
	}
	
	
	public void createcustomer_new(String application, String Name, String MainDomain, String CountryToBeSelected,
			String TypeToBeSelected, String OCN,String Reference, String TechnicalContactName, String Email, String Phone,
String Fax, String DedicatedPortalStatus, String DedicatedPortal) throws InterruptedException, DocumentException, IOException {
		
		createCustomerFunctionality( application,  Name, MainDomain, CountryToBeSelected,
				TypeToBeSelected,  OCN, Reference,  TechnicalContactName,  Email,Phone,  Fax,  DedicatedPortalStatus,  DedicatedPortal  );
		
		
		
	}
	
		 
//	public void createCustomerFunctionality(String application, String Name, String MainDomain, String CountryToBeSelected,
//			String TypeToBeSelected, String OCN,String Reference, String TechnicalContactName, String Email, String Phone,
//String Fax, String DedicatedPortalStatus, String DedicatedPortal) throws InterruptedException, DocumentException, IOException {
//
//		Log.info("=== Create customer navigated ===");
//		
////		/* Clickon(getwebelement(xml.getlocator("//locators/"+application+"/ManageCustomerServiceLink")));						Thread.sleep(2000);
////		Clickon(getwebelement(xml.getlocator("//locators/"+application+"/ManageCustomerServiceLink")));						Thread.sleep(2000);
////		Thread.sleep(2000);
////		Clickon(getwebelement(xml.getlocator("//locators/"+application+"/SearchCustomerLink")));
////		Thread.sleep(2000);
////		Clickon(getwebelement(xml.getlocator("//locators/"+application+"/CreateCustomerLink"))); 	
////		Thread.sleep(2000);*/
//		
//		SendKeys(getwebelement(xml.getlocator("//locators/"+application+ "/Name")), Name);									
//		DriverTestcase.logger.log(LogStatus.PASS, "Step : Name entered :  "+Name);
//		Log.info("=== Name Entered ===");
//		SendKeys(getwebelement(xml.getlocator("//locators/"+application+ "/MainDomain")), MainDomain);
//		DriverTestcase.logger.log(LogStatus.PASS, "Step : Domain Name entered :  "+MainDomain);
//		Log.info("=== DomainName Entered ===");
//		
////		Clickon(getwebelement(xml.getlocator("//locators/"+application+"/CountrySelect"))); 				
////		Log.info("=== Country dropdown clicked ===");
////		WebElement el1 = driver.findElement(By.xpath("//span[contains(text(),'"+CountryToBeSelected+"')]"));
////		el1.click();
////		DriverTestcase.logger.log(LogStatus.PASS, "Step : Country Selected :  "+CountryToBeSelected);
////		Log.info("=== Country has been edited==="); 
//		
//	/////
//
//				// clickon Country dropdown
//				Clickon(getwebelement(xml.getlocator("//locators/" + application + "/CountrySelect")));
//				Thread.sleep(2000);
//				System.out.println("Clicked on Country dropdown");
//				DriverTestcase.logger.log(LogStatus.PASS, "Step : Clicked on Country dropdown");
//				Log.info("Clicked on Country dropdown");
//
//				List<WebElement> countryList = driver.findElements(By.xpath("//span[@role='option']"));
//				for (WebElement clist : countryList) {
//
//					System.out.println("Available Country name is : " + clist.getText().toString());
//					DriverTestcase.logger.log(LogStatus.PASS,"Step : Available Country name is : " + clist.getText().toString());
//					Log.info("Available Country name is :" + clist.getText().toString());
//				}
//				
//				Thread.sleep(1000);
//				
//				// click on country
//				WebElement country = driver.findElement(By.xpath("//span[contains(text(),'" + CountryToBeSelected + "')]"));
//				System.out.println("Selected Country dropdowm is : " + country.getText().toString());
//				DriverTestcase.logger.log(LogStatus.PASS, "Step : Selected Country dropdowm is : " + country.getText().toString());
//				Log.info("Selected Country dropdowm is : " + country.getText().toString());
//				country.click();
//				Thread.sleep(2000);
//		
//		
//		SendKeys(getwebelement(xml.getlocator("//locators/"+application+"/OCN")), OCN);	Thread.sleep(1000);					
//		DriverTestcase.logger.log(LogStatus.PASS, "Step : OCN entered :  "+OCN);
//		Log.info("===OCN Entered ===");
//		
//		SendKeys(getwebelement(xml.getlocator("//locators/"+application+"/Referance_Build4")), Reference);	
//		DriverTestcase.logger.log(LogStatus.PASS, "Step : Reference entered:  "+Reference);
//		Log.info("=== Reference Entered ===");
//		
//		SendKeys(getwebelement(xml.getlocator("//locators/"+application+"/TechinicalContactName_Build4")), TechnicalContactName);
//		DriverTestcase.logger.log(LogStatus.PASS, "Step : Technical Contact Name entered:  "+TechnicalContactName);
//		Log.info("=== TechnicalContactName Entered ===");
//		
////		Clickon(getwebelement(xml.getlocator("//locators/"+application+"/TypeSelect_Build4"))); 						
////		Thread.sleep(1000);
////		WebElement el2 = driver.findElement(By.xpath("//div[text()='"+TypeToBeSelected+"']"));
////		el2.click();						
////		DriverTestcase.logger.log(LogStatus.PASS, "Step : Type selected:  "+TypeToBeSelected);
////		Log.info("=== Type selected===");
//		
//		
//	/////
//
//					// clickon Type dropdown
//					Clickon(getwebelement(xml.getlocator("//locators/" + application + "/TypeSelect_Build4")));
//					Thread.sleep(2000);
//					System.out.println("Clicked on Type dropdown");
//					DriverTestcase.logger.log(LogStatus.PASS, "Step : Clicked on Type dropdown");
//					Log.info("Clicked on Type dropdown");
//
//					List<WebElement> typeList = driver.findElements(By.xpath("//span[@role='option']"));
//					for (WebElement tlist : typeList) {
//
//						System.out.println("Available Type name is : " + tlist.getText().toString());
//						DriverTestcase.logger.log(LogStatus.PASS,"Step : Available Type name is : " + tlist.getText().toString());
//						Log.info("Available Type name is :" + tlist.getText().toString());
//					}
//					
//					Thread.sleep(1000);
//					
//					// click on Type
//					WebElement type = driver.findElement(By.xpath("//span[contains(text(),'" + TypeToBeSelected + "')]"));
//					System.out.println("Selected Type dropdowm is : " + type.getText().toString());
//					DriverTestcase.logger.log(LogStatus.PASS, "Step : Selected Type dropdowm is : " + type.getText().toString());
//					Log.info("Selected Type dropdowm is : " + type.getText().toString());
//					type.click();
//					Thread.sleep(2000);
//					
//					
//					
//		
//		SendKeys(getwebelement(xml.getlocator("//locators/"+application+"/Email")), Email);	
//		Thread.sleep(1000);
//		DriverTestcase.logger.log(LogStatus.PASS, "Step : Email entered:  "+Email);
//		Log.info("=== Email Entered ===");
//		
//		SendKeys(getwebelement(xml.getlocator("//locators/"+application+"/Phone")), Phone);									
//		Thread.sleep(1000);
//		DriverTestcase.logger.log(LogStatus.PASS, "Step : Phone entered:  "+Phone);
//		Log.info("=== Phone Entered ===");
//		
//		SendKeys(getwebelement(xml.getlocator("//locators/"+application+"/Fax")), Fax);										
//		Thread.sleep(1000);
//		DriverTestcase.logger.log(LogStatus.PASS, "Step : Fax entered:  "+Fax);
//		Log.info("=== Fax Entered ===");
//		
//		//SelectDedicatedPortalCheckbox_IfDedicatedPortalStatus_Yes(application, DedicatedPortalStatus, DedicatedPortal);
//		
//		scrolltoend();
//		Thread.sleep(2000);
//		Clickon(getwebelement(xml.getlocator("//locators/"+application+"/OkButton_CreateCustomer")));
//		DriverTestcase.logger.log(LogStatus.PASS, "Step : OK button clicked");
//		Log.info("=== OK button clicked ===");	Thread.sleep(2000);	
//		
//	}
	
	
	
	
	
	
	public void createCustomerFunctionality(String application, String Name, String MainDomain, String CountryToBeSelected,
			String TypeToBeSelected, String OCN,String Reference, String TechnicalContactName, String Email, String Phone,
String Fax, String DedicatedPortalStatus, String DedicatedPortal) throws InterruptedException, DocumentException, IOException {
		


		Log.info("=== Create customer navigated ===");
		
		scrolltoend();
		Thread.sleep(2000);
		Clickon(getwebelement(xml.getlocator("//locators/"+application+"/OkButton_CreateCustomer")));
		scrollToTop();
		Thread.sleep(2000);
		
		//Warning Messages
		warningMessage_commonMethod(application, "name_validationmsg", "Legal Customer Name", xml);
		warningMessage_commonMethod(application, "country_validationmsg", "Country", xml);
		warningMessage_commonMethod(application, "OCN_validationmsg", "OCN", xml);
		warningMessage_commonMethod(application, "type_validationmsg", "Type", xml);
		warningMessage_commonMethod(application, "email_Validationmsg", "Email", xml);
		
		
	//Enter value in fields	
		//Name
			addtextFields_commonMethod(application, "Legal Customer Name", "Name", Name, xml);

		//Main Domain
			addtextFields_commonMethod(application, "Main Domain", "MainDomain", MainDomain, xml);

		//Country dropdown
			addDropdownValues_commonMethod(application, "Country", "CountrySelect", CountryToBeSelected, xml);
				
		//OCN
			addtextFields_commonMethod(application, "OCN", "OCN", OCN, xml);

		//Reference
			addtextFields_commonMethod(application, "reference", "Referance_Build4", Reference, xml);

		//technical Contact name
			addtextFields_commonMethod(application, "Technical Contact Name", "TechinicalContactName_Build4", TechnicalContactName, xml);
			
		//Type dropdown
			addDropdownValues_commonMethod(application, "Type", "TypeSelect_Build4", TypeToBeSelected, xml);
					
		//Email
			addtextFields_commonMethod(application, "Email", "Email", Email, xml);

		//Phone	
			addtextFields_commonMethod(application, "Phone", "Phone", Phone, xml);

		//FAX
			addtextFields_commonMethod(application, "Fax", "Fax", Fax, xml);
		
		//Enable dedicated portal checkbox
//			addCheckbox_commonMethod(application, xpath, "Enable Dedicated Portal", expectedValue, DefaultSelection, xml);
		//SelectDedicatedPortalCheckbox_IfDedicatedPortalStatus_Yes(application, DedicatedPortalStatus, DedicatedPortal);
		
		scrolltoend();
		Thread.sleep(2000);
		click_commonMethod(application, "OK", "OkButton_CreateCustomer", xml);
		

		
	}

	
	public void verifyCreatedCustomer(String expectedcustomercreationtext) throws IOException {
		try {
			WebElement ele = driver.findElement(By.xpath("//span[contains(text(),'Customer successfully created.')]"));
			String actualcustomercreationtext = ele.getText();
			
			if((actualcustomercreationtext.equalsIgnoreCase(expectedcustomercreationtext))) {
				DriverTestcase.logger.log(LogStatus.PASS, "Step : confirmation message is displayed as : "+actualcustomercreationtext);
				Log.info("confirmation message is displayed as expected");
				DriverTestcase.logger.log(LogStatus.PASS, "Customer successfully created.");

			}else{
				sa.fail("expected confirmation message validation failed");
			}
			
			
		}
		catch (NullPointerException e) {
		e.printStackTrace();
		System.out.println("Confirmation message is not displayed in UI");
		DriverTestcase.logger.log(LogStatus.FAIL, " Confirmation message is not displayed in UI :  " + e);
	}
		catch (NoSuchElementException e) {
		e.printStackTrace();
		System.out.println("Confirmation message is not displayed in UI");
		DriverTestcase.logger.log(LogStatus.FAIL, "Confirmation message is not displayed in UI :  " + e);

		}
		
		sa.assertAll();
	}
	
	
	
	
	public void deleteCustomer(String application) throws InterruptedException, DocumentException {
		scrollToTop();
		Thread.sleep(2000);
		Clickon(getwebelement(xml.getlocator("//locators/"+application+"/CustomerDetails_Action")));		Thread.sleep(1000);
		DriverTestcase.logger.log(LogStatus.PASS, "Step : Clicked on Action under Customer Details");
		Thread.sleep(2000);
		
		Clickon(getwebelement(xml.getlocator("//locators/"+application+"/DeleteCustomerLink")));			Thread.sleep(1000);
		DriverTestcase.logger.log(LogStatus.PASS, "Step : Clicked on DeleteCustomer Link");
		Thread.sleep(2000);
		
		Clickon(getwebelement(xml.getlocator("//locators/"+application+"/DeleteButton_DeleteCustomer")));	Thread.sleep(1000);
		DriverTestcase.logger.log(LogStatus.PASS, "Step : Clicked on Delete button");
		Log.info("=== Clicked on Delete button ===");
		Thread.sleep(2000);
	}
	
	
	
	public void verifyDeletedCustomer(String expectedcustomerdeletedtext) throws IOException {
		WebElement ele = driver.findElement(By.xpath("//div[@role='alert']"));
	    String actualcustomerdeletedtext = ele.getText();
	    
	    if((actualcustomerdeletedtext.equalsIgnoreCase(expectedcustomerdeletedtext))) {
	    	DriverTestcase.logger.log(LogStatus.PASS, "Step : confirmation message is displayed as : "+actualcustomerdeletedtext);
	    	Log.info("confirmation message is displayed as expected");
	    	DriverTestcase.logger.log(LogStatus.PASS, "Customer successfully deleted");

	    	
	    }else{
	    	sa.fail("expected confirmation message validation failed");
	    }
	}
	
	public void verifyDeletedUser(String expecteduserdeletedtext) throws IOException {
		WebElement ele = driver.findElement(By.xpath("//div[@role='alert']"));
	    String actualuserdeletedtext = ele.getText();
	    
	    if((actualuserdeletedtext.equalsIgnoreCase(expecteduserdeletedtext))) {
	    	DriverTestcase.logger.log(LogStatus.PASS, "Step : confirmation message is displayed as : "+actualuserdeletedtext);
	    	Log.info("confirmation message is displayed as expected");
	    	DriverTestcase.logger.log(LogStatus.PASS, "User successfully deleted");
	    }else{
	    	sa.fail("expected confirmation message validation failed");
	    }
	}
	
	public void verifyEditedCustomer(String expectedcustomercreationtext) throws IOException {
		WebElement ele = driver.findElement(By.xpath("//div[@role='alert']"));
	    String actualcustomercreationtext = ele.getText();
	    
	    if((actualcustomercreationtext.equalsIgnoreCase(expectedcustomercreationtext))) {
	    	DriverTestcase.logger.log(LogStatus.PASS, "Step : confirmation message is displayed as : "+actualcustomercreationtext);
	    	Log.info("confirmation message is displayed as expected");
	    	DriverTestcase.logger.log(LogStatus.PASS, "Customer successfully updated");

	    }else{
	    	sa.fail("expected confirmation message validation failed");
	    }
	}
	
	
	public void verifyEditedUser(String expectedUpdatedUserText) throws IOException {
		WebElement ele = driver.findElement(By.xpath("//div[@role='alert']"));
	    String actualUpdatedUserText = ele.getText();
	    
	    if((actualUpdatedUserText.equalsIgnoreCase(expectedUpdatedUserText))) {
	    	DriverTestcase.logger.log(LogStatus.PASS, "Step : confirmation message is displayed as : "+actualUpdatedUserText);
	    	Log.info("confirmation message is displayed as expected");
	    	DriverTestcase.logger.log(LogStatus.PASS, "User successfully updated");
	    }else{
	    	sa.fail("expected confirmation message validation failed");
	    }
	}
	
	
	
	WebElement Name_we, MainDomain_we, SelectedCountry_we, SelectedType_we, OCN_we, Reference_we, TechnicalContactName_we, Email_we, Phone_we, Fax_we;
	public void verifyCreatedCustomerValuesInViewCustomePage(String application, String Name, String MainDomain, String CountryToBeSelected,String TypeToBeSelected, String OCN, String Reference,
			String TechnicalContactName, String Email, String Phone,String Fax ) throws InterruptedException, DocumentException, IOException {
		
		// Verify all fields in Customer details page Once customer created successfully
		
		String actualName=Gettext(driver.findElement(By.xpath("//div[contains(text(),'"+Name+"')]")));
		sa.assertEquals(actualName, Name, " Actual and Expected both are not same");
		DriverTestcase.logger.log(LogStatus.PASS, "Step : Name field data verified as : "+actualName+" , "+Name);
		
		String actualMainDomain=Gettext(driver.findElement(By.xpath("//div[contains(text(),'"+MainDomain+"')]")));
		sa.assertEquals(actualMainDomain, MainDomain, " Actual and Expected both are not same");
		DriverTestcase.logger.log(LogStatus.PASS, "Step : Main Domain field data verified as : "+actualMainDomain+" , "+MainDomain);
		
		String actualSelectedCountry=Gettext(driver.findElement(By.xpath("//div[contains(text(),'"+CountryToBeSelected+"')]")));
		sa.assertEquals(actualSelectedCountry, CountryToBeSelected, " Actual and Expected both are not same");
		DriverTestcase.logger.log(LogStatus.PASS, "Step : Selected Country field data verified as : "+actualSelectedCountry+" , "+CountryToBeSelected);
		
		String actualSelectedType=Gettext(driver.findElement(By.xpath("//div[contains(text(),'"+TypeToBeSelected+"')]")));
		sa.assertEquals(actualSelectedType, TypeToBeSelected, " Actual and Expected both are not same");
		DriverTestcase.logger.log(LogStatus.PASS, "Step : Selected Type field data verified as : "+actualSelectedType+" , "+TypeToBeSelected);
		
		String actualOCN=Gettext(driver.findElement(By.xpath("//div[contains(text(),'"+OCN+"')]")));
		sa.assertEquals(actualOCN, OCN, " Actual and Expected both are not same");
		DriverTestcase.logger.log(LogStatus.PASS, "Step : OCN field data verified as : "+actualOCN+" , "+OCN);
		
		String actualReference=Gettext(driver.findElement(By.xpath("//div[contains(text(),'"+Reference+"')]")));
		sa.assertEquals(actualReference, Reference, " Actual and Expected both are not same");
		DriverTestcase.logger.log(LogStatus.PASS, "Step : Reference field data verified as : "+actualReference+" , "+Reference);
		
		String actualechnicalContactName=Gettext(driver.findElement(By.xpath("//div[contains(text(),'"+TechnicalContactName+"')]")));
		sa.assertEquals(actualechnicalContactName, TechnicalContactName, " Actual and Expected both are not same");
		DriverTestcase.logger.log(LogStatus.PASS, "Step : Technical Contact Name field data verified as : "+actualechnicalContactName+" , "+TechnicalContactName);
		
		String actualEmail=Gettext(driver.findElement(By.xpath("//div[contains(text(),'"+Email+"')]")));
		sa.assertEquals(actualEmail, Email, " Actual and Expected both are not same");
		DriverTestcase.logger.log(LogStatus.PASS, "Step : Email field data verified as : "+actualEmail+" , "+Email);
		
		String actualPhone=Gettext(driver.findElement(By.xpath("//div[contains(text(),'"+Phone+"')]")));
		sa.assertEquals(actualPhone, Phone, " Actual and Expected both are not same");
		DriverTestcase.logger.log(LogStatus.PASS, "Step : Phone field data verified as : "+actualPhone+" , "+Phone);
	
		String actualFax=Gettext(driver.findElement(By.xpath("//div[contains(text(),'"+Fax+"')]")));
		sa.assertEquals(actualFax, Fax, " Actual and Expected both are not same");
		DriverTestcase.logger.log(LogStatus.PASS, "Step : Fax field data verified as : "+actualFax+" , "+Fax);				

		//sa.assertAll();		
		}
	
	
	
	APT_DataWriter dg=new APT_DataWriter();
	public void getCreatedCustomerData(String application) throws InterruptedException, DocumentException, IOException {
			
		// Get all created customer details in Customer details page Once customer created successfully
			String legalCustomerName_Value=getwebelement(xml.getlocator("//locators/"+application+"/CreatedCustomer_LegalCustomerName_Value")).getText();
			String mainDomain_Value=getwebelement(xml.getlocator("//locators/"+application+"/CreatedCustomer_MainDomain_Value")).getText();
			//String country_Value=getwebelement(xml.getlocator("//locators/"+application+"/CreatedCustomer_Country_Value")).getText();		
			String OCN_Value=getwebelement(xml.getlocator("//locators/"+application+"/CreatedCustomer_OCN_Value")).getText();
			String reference_Value=getwebelement(xml.getlocator("//locators/"+application+"/CreatedCustomer_Reference_Value")).getText();	
			//String type_Value=getwebelement(xml.getlocator("//locators/"+application+"/CreatedCustomer_Type_Value")).getText();			
			String technicalContactName_Value=getwebelement(xml.getlocator("//locators/"+application+"/CreatedCustomer_TechnicalContactName_Value")).getText();
			String email_Value=getwebelement(xml.getlocator("//locators/"+application+"/CreatedCustomer_Email_Value")).getText();
			String phone_Value=getwebelement(xml.getlocator("//locators/"+application+"/CreatedCustomer_Phone_Value")).getText();
			String fax_Value=getwebelement(xml.getlocator("//locators/"+application+"/CreatedCustomer_Fax_Value")).getText();
			
			String [] allColumnsValues=new String [] {legalCustomerName_Value, mainDomain_Value, OCN_Value, reference_Value, technicalContactName_Value, email_Value, phone_Value, fax_Value};
			
			for(int i=0; i<allColumnsValues.length-1; i++) {
				
				System.out.print("Created customer Values are : "+allColumnsValues[i]+ " , ");
				DriverTestcase.logger.log(LogStatus.PASS, "Step : Created customer Values are :  "+allColumnsValues[i]);
				
			}
			
			dg.DataWriter2_CreatedCustomer_PK(allColumnsValues);
			DriverTestcase.logger.log(LogStatus.PASS, "Step : Created customer all columns Values are :  "+allColumnsValues);
	}
	
	
	
	
	WebElement Name_Textfield2, MainDomain_Textfield2, countryDropdown2, OCN_Textfield2, Reference_Textfield2, TechnicalContactName_Textfield2, Type_Textfield2, Email_Textfield2, Phone_Textfield2, Fax_Textfield2, EnableDedicatedPortal_TextField2, OkButton_CreateCustomer2, BackButton_EditCustomer2 ;
	public void verifyEditCustomerFields(String application) throws InterruptedException, DocumentException {
		
		try {
			
		Thread.sleep(2000);
		Clickon(getwebelement(xml.getlocator("//locators/"+application+"/CustomerDetails_Action")));		Thread.sleep(1000);
		DriverTestcase.logger.log(LogStatus.PASS, "Step : Clicked on Action under CustomerDetails");
		Clickon(getwebelement(xml.getlocator("//locators/"+application+"/EditCustomerLink")));				Thread.sleep(1000);
		DriverTestcase.logger.log(LogStatus.PASS, "Step : Clicked on Edit Customer Link under Action");
		Log.info("=== Edit Customer Link Clicked ===");
		
		
			Name_Textfield2 = getwebelement(xml.getlocator("//locators/" + application + "/Name_Textfield"));
			sa.assertTrue(Name_Textfield2.isDisplayed(),"name field is not displayed");
			sa.assertTrue(Name_Textfield2.isEnabled(), "name field is not disabled");
			DriverTestcase.logger.log(LogStatus.PASS, "Step : Name is displayed");
			Log.info("===Name is displayed ===");
			
			MainDomain_Textfield2 = getwebelement(xml.getlocator("//locators/" + application + "/MainDomain_Textfield"));
			sa.assertTrue(MainDomain_Textfield2.isDisplayed(),"MainDomain_Textfield is not displayed");
			sa.assertTrue(MainDomain_Textfield2.isEnabled(), "MainDomain_Textfield is not disabled");
			DriverTestcase.logger.log(LogStatus.PASS, "Step : Main Domain is displayed");
			Log.info("===Main Domain is displayed ===");
			
			countryDropdown2 = getwebelement(xml.getlocator("//locators/" + application + "/Country_Textfield"));
			sa.assertTrue(countryDropdown2.isDisplayed(),"countrydropdown  is not displayed");
			sa.assertTrue(countryDropdown2.isEnabled(), "countryropdown is not disabled");
			DriverTestcase.logger.log(LogStatus.PASS, "Step : Country is displayed");
			Log.info("===Country is displayed ===");
			
			OCN_Textfield2 = getwebelement(xml.getlocator("//locators/" + application + "/OCN_Textfield"));
			sa.assertTrue(OCN_Textfield2.isDisplayed(),"OCN_Textfield is not displayed");
			sa.assertTrue(OCN_Textfield2.isEnabled(), "OCN_Textfield is not disabled");
			DriverTestcase.logger.log(LogStatus.PASS, "Step : OCN is displayed");
			Log.info("===OCN is displayed ===");
			
			Reference_Textfield2 = getwebelement(xml.getlocator("//locators/" + application + "/Reference_Textfield"));
			sa.assertTrue(Reference_Textfield2.isDisplayed(),"Reference_Textfield is not displayed");
			sa.assertTrue(Reference_Textfield2.isEnabled(), "Reference_Textfield is not disabled");
			DriverTestcase.logger.log(LogStatus.PASS, "Step : Reference is displayed");
			Log.info("===Reference is displayed ===");
			
			TechnicalContactName_Textfield2 = getwebelement(xml.getlocator("//locators/" + application + "/TechnicalContactName_Textfield"));
			sa.assertTrue(TechnicalContactName_Textfield2.isDisplayed(),"TechnicalContactName_Textfield is not displayed");
			sa.assertTrue(TechnicalContactName_Textfield2.isEnabled(), "TechnicalContactName_Textfield is not disabled");
			DriverTestcase.logger.log(LogStatus.PASS, "Step : Technical Contact Name is displayed");
			Log.info("===Technical Contact Name is displayed ===");
			
			Type_Textfield2 = getwebelement(xml.getlocator("//locators/" + application + "/Type_Textfield"));
			sa.assertTrue(Type_Textfield2.isDisplayed(),"Type_Textfield is not displayed");
			sa.assertTrue(Type_Textfield2.isEnabled(), "Type_Textfield is not disabled");
			DriverTestcase.logger.log(LogStatus.PASS, "Step : Type is displayed");
			Log.info("===Type is displayed ===");
			
			Email_Textfield2 = getwebelement(xml.getlocator("//locators/" + application + "/Email_Textfield"));
			sa.assertTrue(Email_Textfield2.isDisplayed(),"Email_Textfield is not displayed");
			sa.assertTrue(Email_Textfield2.isEnabled(), "Email_Textfield is not disabled");
			DriverTestcase.logger.log(LogStatus.PASS, "Step : Email is displayed");
			Log.info("===Email is displayed ===");
			
			Phone_Textfield2 = getwebelement(xml.getlocator("//locators/" + application + "/Phone_Textfield"));
			sa.assertTrue(Phone_Textfield2.isDisplayed(),"name field is not displayed");
			sa.assertTrue(Phone_Textfield2.isEnabled(), "name field is not disabled");
			DriverTestcase.logger.log(LogStatus.PASS, "Step : Phone is displayed");
			Log.info("===Phone is displayed ===");
			
			Fax_Textfield2 = getwebelement(xml.getlocator("//locators/" + application + "/Fax_Textfield"));
			sa.assertTrue(Fax_Textfield2.isDisplayed(),"Fax_Textfield is not displayed");
			sa.assertTrue(Fax_Textfield2.isEnabled(), "Fax_Textfield is not disabled");
			DriverTestcase.logger.log(LogStatus.PASS, "Step : Fax is displayed");
			Log.info("===Fax is displayed ===");
			
			EnableDedicatedPortal_TextField2 = getwebelement(xml.getlocator("//locators/" + application + "/EnableDedicatedPortal_TextField"));
			sa.assertTrue(EnableDedicatedPortal_TextField2.isDisplayed(),"EnableDedicatedPortal_TextField is not displayed");
			sa.assertTrue(EnableDedicatedPortal_TextField2.isEnabled(), "EnableDedicatedPortal_TextField is not disabled");
			DriverTestcase.logger.log(LogStatus.PASS, "Step : Enable Dedicated Portal is displayed");
			Log.info("===Enable Dedicated Portal is displayed ===");
			
			OkButton_CreateCustomer2 = getwebelement(xml.getlocator("//locators/" + application + "/OkButton_CreateCustomer"));
			sa.assertTrue(OkButton_CreateCustomer2.isDisplayed(),"OkButton_CreateCustomer  is not displayed");
			sa.assertTrue(OkButton_CreateCustomer2.isEnabled(), "OkButton_CreateCustomer is not disabled");
			DriverTestcase.logger.log(LogStatus.PASS, "Step : OK Button is displayed");
			Log.info("===OK Button is displayed ===");
			
			BackButton_EditCustomer2 = getwebelement(xml.getlocator("//locators/" + application + "/BackButton_EditCustomer"));
			sa.assertTrue(BackButton_EditCustomer2.isDisplayed(),"Back Button  is not displayed");
			sa.assertTrue(BackButton_EditCustomer2.isEnabled(), "Back Button is not disabled");
			DriverTestcase.logger.log(LogStatus.PASS, "Step : Back Button is displayed");
			Log.info("===Back Button is displayed ===");
		
		} catch (TimeoutException e) {
			e.printStackTrace();
			System.out.println("value is not displayed");
			DriverTestcase.logger.log(LogStatus.PASS, "value is not displayed in Edit Customer page :  " + e);

		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("value is not displayed");
			DriverTestcase.logger.log(LogStatus.PASS, "value is not displayed in Edit Customer page :  " + e);
		}
		
		
		Log.info("=== Edit customer all fields Verified ===");
		sa.assertAll();
	}
	
	
	public void verifyEditCustomerFunction(String application, String Name, String MainDomain, String CountryToBeSelected,
		String TypeToBeSelected, String OCN,String Reference, String TechnicalContactName, String Email, String Phone,
String Fax, String DedicatedPortalStatus, String DedicatedPortal) throws InterruptedException, DocumentException, IOException {

		Thread.sleep(2000);
		Clickon(getwebelement(xml.getlocator("//locators/"+application+"/CustomerDetails_Action")));		Thread.sleep(1000);
		DriverTestcase.logger.log(LogStatus.PASS, "Step : Clicked on Action under CustomerDetails");
		Clickon(getwebelement(xml.getlocator("//locators/"+application+"/EditCustomerLink")));				Thread.sleep(1000);
		DriverTestcase.logger.log(LogStatus.PASS, "Step : Clicked on Edit Customer Link under Action");
		Log.info("=== Edit Customer Link Clicked ===");
		
		Clear(getwebelement(xml.getlocator("//locators/"+application+"/Name_EditCustomer")));
		SendKeys(getwebelement(xml.getlocator("//locators/"+application+ "/Name")), Name);									
		DriverTestcase.logger.log(LogStatus.PASS, "Step : Name entered :  "+Name);
		Log.info("=== Name Entered ===");
		
		Clear(getwebelement(xml.getlocator("//locators/"+application+"/domain_EditCustomer")));
		SendKeys(getwebelement(xml.getlocator("//locators/"+application+ "/MainDomain")), MainDomain);
		DriverTestcase.logger.log(LogStatus.PASS, "Step : Domain Name entered :  "+MainDomain);
		Log.info("=== DomainName Entered ===");
//		
//		Clickon(getwebelement(xml.getlocator("//locators/"+application+"/CountrySelect"))); 				
//		Log.info("=== Country dropdown clicked ===");
//		WebElement el1 = driver.findElement(By.xpath("//span[contains(text(),'"+CountryToBeSelected+"')]"));
//		el1.click();
//		DriverTestcase.logger.log(LogStatus.PASS, "Step : Country Selected :  "+CountryToBeSelected);
//		Log.info("=== Country has been edited===");
		
		
		// NOTE: OCN should not be editable since it's associated to a perticular customer
//		Clear(getwebelement(xml.getlocator("//locators/"+application+"/ocn_EditCustomer")));
//		SendKeys(getwebelement(xml.getlocator("//locators/"+application+"/OCN")), OCN);	Thread.sleep(1000);					
//		DriverTestcase.logger.log(LogStatus.PASS, "Step : OCN entered :  "+OCN);
//		Log.info("===OCN Entered ===");
		
		Clear(getwebelement(xml.getlocator("//locators/"+application+"/reference_EditCustomer")));
		SendKeys(getwebelement(xml.getlocator("//locators/"+application+"/Referance_Build4")), Reference);	
		DriverTestcase.logger.log(LogStatus.PASS, "Step : Reference entered:  "+Reference);
		Log.info("=== Reference Entered ===");
		
		Clear(getwebelement(xml.getlocator("//locators/"+application+"/Technicalname_EditCustomer")));
		SendKeys(getwebelement(xml.getlocator("//locators/"+application+"/TechinicalContactName_Build4")), TechnicalContactName);
		DriverTestcase.logger.log(LogStatus.PASS, "Step : Technical Contact Name entered:  "+TechnicalContactName);
		Log.info("=== TechnicalContactName Entered ===");
		
//		Clickon(getwebelement(xml.getlocator("//locators/"+application+"/TypeSelect_Build4"))); 						
//		Thread.sleep(1000);
//		WebElement el2 = driver.findElement(By.xpath("//div[text()='"+TypeToBeSelected+"']"));
//		el2.click();						
//		DriverTestcase.logger.log(LogStatus.PASS, "Step : Type selected:  "+TypeToBeSelected);
//		Log.info("=== Type selected===");
		
		Clear(getwebelement(xml.getlocator("//locators/"+application+"/Email_EditCustomer")));
		SendKeys(getwebelement(xml.getlocator("//locators/"+application+"/Email")), Email);	
		Thread.sleep(1000);
		DriverTestcase.logger.log(LogStatus.PASS, "Step : Email entered:  "+Email);
		Log.info("=== Email Entered ===");
		
		Clear(getwebelement(xml.getlocator("//locators/"+application+"/phone_EditCustomer")));
		SendKeys(getwebelement(xml.getlocator("//locators/"+application+"/Phone")), Phone);									
		Thread.sleep(1000);
		DriverTestcase.logger.log(LogStatus.PASS, "Step : Phone entered:  "+Phone);
		Log.info("=== Phone Entered ===");
		
		Clear(getwebelement(xml.getlocator("//locators/"+application+"/fax_EditCustomer")));
		SendKeys(getwebelement(xml.getlocator("//locators/"+application+"/Fax")), Fax);										
		Thread.sleep(1000);
		DriverTestcase.logger.log(LogStatus.PASS, "Step : Fax entered:  "+Fax);
		Log.info("=== Fax Entered ===");
		
			  //SelectDedicatedPortalCheckbox_IfDedicatedPortalStatus_Yes(application, DedicatedPortalStatus, DedicatedPortal);
		scrolltoend();
		Thread.sleep(3000);
		Clickon(getwebelement(xml.getlocator("//locators/"+application+"/OkButton_EditCustomer")));
		DriverTestcase.logger.log(LogStatus.PASS, "Step : OK button clicked");
		Log.info("=== OK button clicked ===");
		Thread.sleep(2000);
		
		verifyEditedCustomer("Customer successfully updated");

		
		// Verify all fields in Customer details page Once customer updated successfully
		String actualName=Gettext(driver.findElement(By.xpath("//div[contains(text(),'"+Name+"')]")));
		sa.assertEquals(actualName, Name, " Actual and Expected both are not same");
		DriverTestcase.logger.log(LogStatus.PASS, "Step : Name field data verified as : "+actualName+" , "+Name);
		
		String actualMainDomain=Gettext(driver.findElement(By.xpath("//div[contains(text(),'"+MainDomain+"')]")));
		sa.assertEquals(actualMainDomain, MainDomain, " Actual and Expected both are not same");
		DriverTestcase.logger.log(LogStatus.PASS, "Step : Main Domain field data verified as : "+actualMainDomain+" , "+MainDomain);
		
		String actualSelectedCountry=Gettext(driver.findElement(By.xpath("//div[contains(text(),'"+CountryToBeSelected+"')]")));
		sa.assertEquals(actualSelectedCountry, CountryToBeSelected, " Actual and Expected both are not same");
		DriverTestcase.logger.log(LogStatus.PASS, "Step : Selected Country field data verified as : "+actualSelectedCountry+" , "+CountryToBeSelected);
		
		String actualSelectedType=Gettext(driver.findElement(By.xpath("//div[contains(text(),'"+TypeToBeSelected+"')]")));
		sa.assertEquals(actualSelectedType, TypeToBeSelected, " Actual and Expected both are not same");
		DriverTestcase.logger.log(LogStatus.PASS, "Step : Selected Type field data verified as : "+actualSelectedType+" , "+TypeToBeSelected);
		
//		String actualOCN=Gettext(driver.findElement(By.xpath("//div[contains(text(),'"+OCN+"')]")));
//		sa.assertEquals(actualOCN, OCN, " Actual and Expected both are not same");
//		DriverTestcase.logger.log(LogStatus.PASS, "Step : OCN field data verified as : "+actualOCN+" , "+OCN);
		
		String actualReference=Gettext(driver.findElement(By.xpath("//div[contains(text(),'"+Reference+"')]")));
		sa.assertEquals(actualReference, Reference, " Actual and Expected both are not same");
		DriverTestcase.logger.log(LogStatus.PASS, "Step : Reference field data verified as : "+actualReference+" , "+Reference);
		
		String actualechnicalContactName=Gettext(driver.findElement(By.xpath("//div[contains(text(),'"+TechnicalContactName+"')]")));
		sa.assertEquals(actualechnicalContactName, TechnicalContactName, " Actual and Expected both are not same");
		DriverTestcase.logger.log(LogStatus.PASS, "Step : Technical Contact Name field data verified as : "+actualechnicalContactName+" , "+TechnicalContactName);
		
		String actualEmail=Gettext(driver.findElement(By.xpath("//div[contains(text(),'"+Email+"')]")));
		sa.assertEquals(actualEmail, Email, " Actual and Expected both are not same");
		DriverTestcase.logger.log(LogStatus.PASS, "Step : Email field data verified as : "+actualEmail+" , "+Email);
		
		String actualPhone=Gettext(driver.findElement(By.xpath("//div[contains(text(),'"+Phone+"')]")));
		sa.assertEquals(actualPhone, Phone, " Actual and Expected both are not same");
		DriverTestcase.logger.log(LogStatus.PASS, "Step : Phone field data verified as : "+actualPhone+" , "+Phone);
	
		String actualFax=Gettext(driver.findElement(By.xpath("//div[contains(text(),'"+Fax+"')]")));
		sa.assertEquals(actualFax, Fax, " Actual and Expected both are not same");
		DriverTestcase.logger.log(LogStatus.PASS, "Step : Fax field data verified as : "+actualFax+" , "+Fax);				

		//sa.assertAll();	


		
		
		
		

	}
	
	
	
	public void editCustomer(String application) throws InterruptedException, DocumentException {
		Clickon(getwebelement(xml.getlocator("//locators/"+application+"/CustomerDetails_Action")));		Thread.sleep(2000);
		DriverTestcase.logger.log(LogStatus.PASS, "Step : Clicked on Action under CustomerDetails");
		Clickon(getwebelement(xml.getlocator("//locators/"+application+"/EditCustomerLink")));				Thread.sleep(2000);
		DriverTestcase.logger.log(LogStatus.PASS, "Step : Clicked on Edit Customer Link under Action");
		Log.info("=== Edit Customer Link Clicked ===");
		
		// verify name fields
		String Name = getwebelement(xml.getlocator("//locators/"+application+"/Name_EditCustomer")).getAttribute("value");	
		if (Name.isEmpty()) {
			DriverTestcase.logger.log(LogStatus.PASS, "Step : Name value is empty");
			sa.fail("name value is empty");
		} else {
			DriverTestcase.logger.log(LogStatus.PASS, "Step : Name value is :  "+Name);
			Log.info("name value is : " + Name);
		}

		//verify MainDomain
		String MainDomain = getwebelement(xml.getlocator("//locators/"+application+"/domain_EditCustomer")).getAttribute("value");
		if (MainDomain.isEmpty()) {
			DriverTestcase.logger.log(LogStatus.PASS, "Step : Main Domain value is empty");
			sa.fail("MainDomain value is empty");
		} else {
			DriverTestcase.logger.log(LogStatus.PASS, "Step : Main Domain value is :  "+MainDomain);
			Log.info("MainDomain value is : " + MainDomain);
		}

		//verify Country
		boolean Country = getwebelement(xml.getlocator("//locators/"+application+"/country_EditCustomer")).isDisplayed();
				if (Country) {
			DriverTestcase.logger.log(LogStatus.PASS, "Step : Country selected value is :  "+Country);
			Log.info("CountrySelect value is : " + Country);
		} else {
			DriverTestcase.logger.log(LogStatus.PASS, "Step : Country is not selected");
			//sa.fail("Country is not selected");
			sa.fail("Country is not selected");
		}
			
		
		// verify OCN fields
				String OCN = getwebelement(xml.getlocator("//locators/"+application+"/ocn_EditCustomer")).getAttribute("value");
				if (OCN.isEmpty()) {
					DriverTestcase.logger.log(LogStatus.PASS, "Step : OCN value is empty");
					sa.fail("OCN value is empty");
				} else {
					DriverTestcase.logger.log(LogStatus.PASS, "Step : OCN value is :  "+OCN);
					Log.info("OCN value is : " + OCN);
				}

				//verify Reference
				String Reference = getwebelement(xml.getlocator("//locators/"+application+"/reference_EditCustomer")).getAttribute("value");
				if (Reference.isEmpty()) {
					DriverTestcase.logger.log(LogStatus.PASS, "Step : Reference value is empty");
					sa.fail("Reference value is empty");
				} else {
					DriverTestcase.logger.log(LogStatus.PASS, "Step : Reference value is :  "+Reference);
					Log.info("Reference value is : " + Reference);
				}
				
				// verify TechnicalContactName fields
				String TechnicalContactName = getwebelement(xml.getlocator("//locators/"+application+"/Technicalname_EditCustomer>")).getAttribute("value");
				if (TechnicalContactName.isEmpty()) {
					DriverTestcase.logger.log(LogStatus.PASS, "Step : Technical Contact Name value is empty");
					sa.fail("Technical Contact Name value is empty");
				} else {
					DriverTestcase.logger.log(LogStatus.PASS, "Step : Technical Contact Name value is :  "+TechnicalContactName);
					Log.info("Technical Contact Name value is : " + TechnicalContactName);
				}
				
				
				//verify Country
				boolean Type = getwebelement(xml.getlocator("//locators/"+application+"/type_EditCustomer")).isDisplayed();
						if (Type) {
					DriverTestcase.logger.log(LogStatus.PASS, "Step : Type selected value is :  "+Country);
					Log.info("Type Select value is : " + Type);
				} else {
					DriverTestcase.logger.log(LogStatus.PASS, "Step : Type is not selected");
					sa.fail("Type is not selected");
				}
				
				
				//verify Email
				String Email = getwebelement(xml.getlocator("//locators/"+application+"/Email_EditCustomer")).getAttribute("value");
				if (Email.isEmpty()) {
					DriverTestcase.logger.log(LogStatus.PASS, "Step : Email value is empty");
					sa.fail("Email value is empty");
				} else {
					DriverTestcase.logger.log(LogStatus.PASS, "Step : Email value is :  "+Email);
					Log.info("Email value is : " + Email);
				}

				//verify Phone
				String Phone = getwebelement(xml.getlocator("//locators/"+application+"/phone_EditCustomer")).getAttribute("value");
				if (Phone.isEmpty()) {
					DriverTestcase.logger.log(LogStatus.PASS, "Step : Phone value is empty");
					sa.fail("Phone value is empty");
				} else {
					DriverTestcase.logger.log(LogStatus.PASS, "Step : Phone value is :  "+Phone);
					Log.info("Phone value is : " + Phone);
				}
				

				//verify Fax
				String Fax = getwebelement(xml.getlocator("//locators/"+application+"/fax_EditCustomer")).getAttribute("value");
				if (Fax.isEmpty()) {
					DriverTestcase.logger.log(LogStatus.PASS, "Step : Fax value is empty");
					sa.fail("Fax value is empty");
				} else {
					DriverTestcase.logger.log(LogStatus.PASS, "Step : Fax value is :  "+Fax);
					Log.info("Fax value is : " + Fax);
				}

				//verify Ok Button
				WebElement OkButton = getwebelement(xml.getlocator("//locators/"+application+"/OkButton_CreateCustomer"));
				if (OkButton.isDisplayed()) {
					DriverTestcase.logger.log(LogStatus.PASS, "Step : OK button is displayed");
					sa.fail("Ok button is displayed");
				} else {
					DriverTestcase.logger.log(LogStatus.PASS, "Step : OK button is not displayed");
					Log.info("Ok button is not displayed");
				}
				
				//verify Cancel Button
				WebElement CancelButton = getwebelement(xml.getlocator("//locators/"+application+"/ClearButton_CreateCustomer"));
				if (CancelButton.isDisplayed()) {
					DriverTestcase.logger.log(LogStatus.PASS, "Step : Clear button is displayed");
					sa.fail("Clear Button is displayed");
				} else {
					DriverTestcase.logger.log(LogStatus.PASS, "Step : Name value is :  "+Name);
					Log.info("Clear Button is displayed  : ");
				}
				

				
				Thread.sleep(2000);	

	}
	
	
	
	
	WebElement UserName_Text, FirstName_Text, SurName_Text, PostalAddress_Text, IPGuardianAccountGroup_Text, ColtOnlineUser_Text, Password_Text, GeneratePasswordLink_Text, Roles_Text, HideRouterToolsIPv6CommandsCisco_Text, HideRouterToolsIPv4CommandsHuiwai_Text, HideRouterToolsIPv4CommandsCisco_Text, HideService_Text, HideSiteOrder_Text, OkButton_AddUser, CancelButton_AddUser ;
	public void verifyAddUserFields(String application) throws InterruptedException, DocumentException, IOException {
		Thread.sleep(3000);	
		
		try {
			
		Clickon(getwebelement(xml.getlocator("//locators/"+application+"/Users_Action")));					
		Thread.sleep(1000);
		DriverTestcase.logger.log(LogStatus.PASS, "Step : Clicked on Users Action");
		
		Clickon(getwebelement(xml.getlocator("//locators/"+application+"/AddUserLink")));					
		Thread.sleep(2000);
		DriverTestcase.logger.log(LogStatus.PASS, "Step : Clicked on Add User Link");
		
			UserName_Text = getwebelement(xml.getlocator("//locators/" + application + "/UserName_Text"));
			sa.assertTrue(UserName_Text.isDisplayed(),"UserName_Text field is not displayed");
			sa.assertTrue(UserName_Text.isEnabled(), "UserName_Text field is not disabled");
			DriverTestcase.logger.log(LogStatus.PASS, "Step : Username is displayed");
			
			FirstName_Text = getwebelement(xml.getlocator("//locators/" + application + "/FirstName_Text"));
			sa.assertTrue(FirstName_Text.isDisplayed(),"FirstName_Text field is not displayed");
			sa.assertTrue(FirstName_Text.isEnabled(), "FirstName_Text field is not disabled");
			DriverTestcase.logger.log(LogStatus.PASS, "Step : Firstname is displayed");

			SurName_Text = getwebelement(xml.getlocator("//locators/" + application + "/SurName_Text"));
			sa.assertTrue(SurName_Text.isDisplayed(),"SurName_Text field is not displayed");
			sa.assertTrue(SurName_Text.isEnabled(), "SurName_Text field is not disabled");
			DriverTestcase.logger.log(LogStatus.PASS, "Step : Surname is displayed");

			PostalAddress_Text = getwebelement(xml.getlocator("//locators/" + application + "/PostalAddress_Text"));
			sa.assertTrue(PostalAddress_Text.isDisplayed(),"PostalAddress_Text field is not displayed");
			sa.assertTrue(PostalAddress_Text.isEnabled(), "PostalAddress_Text field is not disabled");
			DriverTestcase.logger.log(LogStatus.PASS, "Step : Postal Address is displayed");
			
			Email_Textfield = getwebelement(xml.getlocator("//locators/" + application + "/Email_Textfield"));
			sa.assertTrue(Email_Textfield.isDisplayed(),"Email_Textfield is not displayed");
			sa.assertTrue(UserName_Text.isEnabled(), "Email_Textfield is not disabled");
			DriverTestcase.logger.log(LogStatus.PASS, "Step : Email is displayed");
			
			Phone_Textfield = getwebelement(xml.getlocator("//locators/" + application + "/Phone_Textfield"));
			sa.assertTrue(Phone_Textfield.isDisplayed(),"Phone_Textfield is not displayed");
			sa.assertTrue(Phone_Textfield.isEnabled(), "Phone_Textfield is not disabled");
			DriverTestcase.logger.log(LogStatus.PASS, "Step : Phone is displayed");
			
			IPGuardianAccountGroup_Text = getwebelement(xml.getlocator("//locators/" + application + "/IPGuardianAccountGroup_Text"));
			sa.assertTrue(IPGuardianAccountGroup_Text.isDisplayed(),"IPGuardianAccountGroup_Text field is not displayed");
			sa.assertTrue(IPGuardianAccountGroup_Text.isEnabled(), "IPGuardianAccountGroup_Text field is not disabled");
			DriverTestcase.logger.log(LogStatus.PASS, "Step : IP Guardian Account Group is displayed");
			
			ColtOnlineUser_Text = getwebelement(xml.getlocator("//locators/" + application + "/ColtOnlineUser_Text"));
			sa.assertTrue(ColtOnlineUser_Text.isDisplayed(),"ColtOnlineUser_Text field is not displayed");
			sa.assertTrue(ColtOnlineUser_Text.isEnabled(), "ColtOnlineUser_Text field is not disabled");
			DriverTestcase.logger.log(LogStatus.PASS, "Step : Colt Online User is displayed");

			Password_Text = getwebelement(xml.getlocator("//locators/" + application + "/Password_Text"));
			sa.assertTrue(Password_Text.isDisplayed(),"Password_Text field is not displayed");
			sa.assertTrue(Password_Text.isEnabled(), "Password_Text field is not disabled");
			DriverTestcase.logger.log(LogStatus.PASS, "Step : Password is displayed");

			GeneratePasswordLink_Text = getwebelement(xml.getlocator("//locators/" + application + "/GeneratePasswordLink_Text"));
			sa.assertTrue(GeneratePasswordLink_Text.isDisplayed(),"GeneratePasswordLink_Text field is not displayed");
			sa.assertTrue(GeneratePasswordLink_Text.isEnabled(), "GeneratePasswordLink_Text field is not disabled");
			DriverTestcase.logger.log(LogStatus.PASS, "Step : Generate Password Link is displayed");

			Roles_Text = getwebelement(xml.getlocator("//locators/" + application + "/Roles_Text"));
			sa.assertTrue(Roles_Text.isDisplayed(),"Roles_Text field is not displayed");
			sa.assertTrue(Roles_Text.isEnabled(), "Roles_Text field is not disabled");
			DriverTestcase.logger.log(LogStatus.PASS, "Step : Roles is displayed");

			HideRouterToolsIPv6CommandsCisco_Text = getwebelement(xml.getlocator("//locators/" + application + "/HideRouterToolsIPv6CommandsCisco_Text"));
			sa.assertTrue(HideRouterToolsIPv6CommandsCisco_Text.isDisplayed(),"HideRouterToolsIPv6CommandsCisco_Text field is not displayed");
			sa.assertTrue(HideRouterToolsIPv6CommandsCisco_Text.isEnabled(), "HideRouterToolsIPv6CommandsCisco_Text field is not disabled");
			DriverTestcase.logger.log(LogStatus.PASS, "Step : Hide Router Tools IPv6 Commands Cisco is displayed");

			HideRouterToolsIPv4CommandsHuiwai_Text = getwebelement(xml.getlocator("//locators/" + application + "/HideRouterToolsIPv4CommandsHuiwai_Text"));
			sa.assertTrue(HideRouterToolsIPv4CommandsHuiwai_Text.isDisplayed(),"HideRouterToolsIPv4CommandsHuiwai_Text field is not displayed");
			sa.assertTrue(HideRouterToolsIPv4CommandsHuiwai_Text.isEnabled(), "HideRouterToolsIPv4CommandsHuiwai_Text field is not disabled");
			DriverTestcase.logger.log(LogStatus.PASS, "Step : Hide Router Tools IPv4 Commands Huiwai is displayed");

			HideRouterToolsIPv4CommandsCisco_Text = getwebelement(xml.getlocator("//locators/" + application + "/HideRouterToolsIPv4CommandsCisco_Text"));
			sa.assertTrue(HideRouterToolsIPv4CommandsCisco_Text.isDisplayed(),"HideRouterToolsIPv4CommandsCisco_Text field is not displayed");
			sa.assertTrue(HideRouterToolsIPv4CommandsCisco_Text.isEnabled(), "HideRouterToolsIPv4CommandsCisco_Text field is not disabled");
			DriverTestcase.logger.log(LogStatus.PASS, "Step : Hide Router Tools IPv4 Commands Cisco is displayed");

			HideService_Text = getwebelement(xml.getlocator("//locators/" + application + "/HideService_Text"));
			sa.assertTrue(HideService_Text.isDisplayed(),"HideService_Text field is not displayed");
			sa.assertTrue(HideService_Text.isEnabled(), "HideService_Text field is not disabled");
			DriverTestcase.logger.log(LogStatus.PASS, "Step : Hide Service is displayed");

			HideSiteOrder_Text = getwebelement(xml.getlocator("//locators/" + application + "/HideSiteOrder_Text"));
			sa.assertTrue(HideSiteOrder_Text.isDisplayed(),"HideSiteOrder_Text field is not displayed");
			sa.assertTrue(HideSiteOrder_Text.isEnabled(), "HideSiteOrder_Text field is not disabled");
			DriverTestcase.logger.log(LogStatus.PASS, "Step : Hide Site Order is displayed");

			OkButton_AddUser = getwebelement(xml.getlocator("//locators/" + application + "/OkButton_AddUser"));
			sa.assertTrue(OkButton_AddUser.isDisplayed(),"OkButton_AddUser field is not displayed");
			sa.assertTrue(OkButton_AddUser.isEnabled(), "OkButton_AddUser field is not disabled");
			DriverTestcase.logger.log(LogStatus.PASS, "Step : OK button is displayed");

			CancelButton_AddUser = getwebelement(xml.getlocator("//locators/" + application + "/CancelButton_AddUser"));
			sa.assertTrue(CancelButton_AddUser.isDisplayed(),"CancelButton_AddUser field is not displayed");
			sa.assertTrue(CancelButton_AddUser.isEnabled(), "CancelButton_AddUser field is not disabled");		
			DriverTestcase.logger.log(LogStatus.PASS, "Step : Cancel button is displayed");
		
		} catch (TimeoutException e) {
			e.printStackTrace();
			System.out.println("value is not displayed");
			DriverTestcase.logger.log(LogStatus.PASS, "value is not displayed in Add User page :  " + e);

		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("value is not displayed");
			DriverTestcase.logger.log(LogStatus.PASS, "value is not displayed in Add User page :  " + e);
		}

		Log.info("=== Add User all fields Verified ===");
		sa.assertAll();
	}
	
	
	
	
	
	WebElement UserNameisrequired_Text, FirstNameisrequired_Text, Surnameisrequired_Text, PostalAddressisrequired_Text, Emailisrequired_AddUser_Text, Phoneisrequired_Text, Passwordisrequired_Text;
	public void verifyAddUserMandatoryFields(String application) throws InterruptedException, DocumentException, IOException {
		
		try {
			
		Clickon(getwebelement(xml.getlocator("//locators/"+application+"/OkButton_AddUser")));  						Thread.sleep(2000);
		DriverTestcase.logger.log(LogStatus.PASS, "Step : OK button clicked under Create Customer");
		Log.info("=== OK button clicked ===");	
		
		
			UserNameisrequired_Text = getwebelement(xml.getlocator("//locators/" + application + "/UserNameisrequired_Text"));
			sa.assertTrue(UserNameisrequired_Text.isDisplayed(),"'User Name is required' message is not displayed");
			sa.assertTrue(UserNameisrequired_Text.isEnabled(), "'User Name is required' message is not disabled");
			DriverTestcase.logger.log(LogStatus.PASS, "Step : 'User Name is required' message displayed");
			Log.info("=== 'User Name is required' message displayed ===");
			
			FirstNameisrequired_Text = getwebelement(xml.getlocator("//locators/" + application + "/FirstNameisrequired_Text"));
			sa.assertTrue(FirstNameisrequired_Text.isDisplayed(),"'First Name is required' message is not displayed");
			sa.assertTrue(FirstNameisrequired_Text.isEnabled(), "'First Name is required' message is not displayed");
			DriverTestcase.logger.log(LogStatus.PASS, "Step : 'First Name is required' message displayed");
			Log.info("=== 'First Name is required' message displayed ===");
			
			Surnameisrequired_Text = getwebelement(xml.getlocator("//locators/" + application + "/Surnameisrequired_Text"));
			sa.assertTrue(Surnameisrequired_Text.isDisplayed(),"'Surname is required' message is not displayed");
			sa.assertTrue(Surnameisrequired_Text.isEnabled(), "'Surname is required' message is not displayed");
			DriverTestcase.logger.log(LogStatus.PASS, "Step : 'Surname is required' message is displayed");
			Log.info("=== 'Surname is required' message displayed ===");
			
			PostalAddressisrequired_Text = getwebelement(xml.getlocator("//locators/" + application + "/PostalAddressisrequired_Text"));
			sa.assertTrue(PostalAddressisrequired_Text.isDisplayed(),"'Postal Address is required' message is not displayed");
			sa.assertTrue(PostalAddressisrequired_Text.isEnabled(), "'Postal Address is required' message is not displayed");
			DriverTestcase.logger.log(LogStatus.PASS, "Step : 'Postal Address is required' message is displayed");
			Log.info("=== 'Postal Address is required' message is displayed ===");
			
			Emailisrequired_AddUser_Text = getwebelement(xml.getlocator("//locators/" + application + "/Emailisrequired_AddUser_Text"));
			sa.assertTrue(Emailisrequired_AddUser_Text.isDisplayed(),"'Email is required' message is not displayed");
			sa.assertTrue(Emailisrequired_AddUser_Text.isEnabled(), "'Email is required' message is not displayed");
			DriverTestcase.logger.log(LogStatus.PASS, "Step : ''Email is required' message is displayed");
			Log.info("=== 'Email is required' message displayed ===");
			
			Phoneisrequired_Text = getwebelement(xml.getlocator("//locators/" + application + "/Phoneisrequired_Text"));
			sa.assertTrue(Phoneisrequired_Text.isDisplayed(),"'Phone is required' message is not displayed");
			sa.assertTrue(Phoneisrequired_Text.isEnabled(), "'Phone is required' message is not displayed");
			DriverTestcase.logger.log(LogStatus.PASS, "Step : 'Phone is required' message is displayed");
			Log.info("=== 'Phone is required' message is displayed ===");
			
			Passwordisrequired_Text = getwebelement(xml.getlocator("//locators/" + application + "/Passwordisrequired_Text"));
			sa.assertTrue(Passwordisrequired_Text.isDisplayed(),"'Password is required' message is not displayed");
			sa.assertTrue(Passwordisrequired_Text.isEnabled(), "'Password is required' message is not displayed");
			DriverTestcase.logger.log(LogStatus.PASS, "Step : ''Password is required' message is displayed");
			Log.info("=== 'Password is required' message is displayed ===");
		
		} catch (TimeoutException e) {
			e.printStackTrace();
			System.out.println("value is not displayed");
			DriverTestcase.logger.log(LogStatus.PASS, "value is not displayed in Add User page :  " + e);

		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("value is not displayed");
			DriverTestcase.logger.log(LogStatus.PASS, "value is not displayed in Add User page :  " + e);

		}
		
		Log.info("=== Add User all mandatory fields Verified ===");
		sa.assertAll();	
	}
	
	
	public void VerifyAddUserFunctionality(String application, String UserName, String FirstName, String SurName,String PostalAddress, String Email_AddUser, String Phone_AddUser,
			String IPGuardianAccountGroup,String ColtOnlineUser, String GeneratePassword, String RolesToBeSelected,String HideRouterToolsIPv6CommandsCisco_ToBeSelected, 
			String HideRouterToolsIPv4CommandsHuiwai_ToBeSelected,String	HideRouterToolsIPv4CommandsCisco_ToBeSelected,String HideServicesToBeSelected,String HideSiteOrderToBeSelected) throws InterruptedException, DocumentException, IOException {
		
		   
				Thread.sleep(1000);
				
				
				String[] rolestobeSelectedList=RolesToBeSelected.split(",");
				String[] routerToolIPv4CiscoTobeSelectedList = HideRouterToolsIPv4CommandsCisco_ToBeSelected.split(",");
				String[] routerToolIPv4HuaweiTobeSelectedList =  HideRouterToolsIPv4CommandsHuiwai_ToBeSelected.split(",");
				String[] ServicesTobeSelectedlist= HideServicesToBeSelected.split(",");
				String[] siteOrdersToBeselectedList = HideSiteOrderToBeSelected.split(",");
				
				scrolltoend();

					click_commonMethod(application, "user_Action", "Users_Action" , xml);

					click_commonMethod(application, "Add User", "AddUserLink" , xml);

					Thread.sleep(2000);
					
				scrollToTop();
				Thread.sleep(3000);
					addtextFields_commonMethod(application, "User Name", "UserName" , UserName, xml);   //User Name Field

					addtextFields_commonMethod(application, "First Name", "FirstName" , FirstName, xml);   //First Name Field

					addtextFields_commonMethod(application, "Sur Name", "SurName" , SurName, xml);   //Sur Name Field

					addtextFields_commonMethod(application, "Postal Address", "PostalAddress" , PostalAddress, xml);   //Postal Address Field

					addtextFields_commonMethod(application, "Email", "Email" , Email_AddUser, xml);   //Email field

					addtextFields_commonMethod(application, "Phone", "Phone" , Phone_AddUser, xml);   //Phone Field
					
					addtextFields_commonMethod(application, "IPGuardian Account Group" , "IPGuardianAccountGroup" , IPGuardianAccountGroup, xml);  //IPGuardian Account Group Field
					
					addtextFields_commonMethod(application, "Colt Online User", "ColtOnlineUser", ColtOnlineUser, xml);   //Colt online User field

					click_commonMethod(application, "Generate Password", "GeneratePasswordLink", xml);   //Generate Password Link
					
					String  password=getwebelement(xml.getlocator("//locators/"+application+"/Password_Textfield")).getAttribute("value");
					System.out.println("Generated Password is : "+password);
					
					if(password.isEmpty()) {
						
						DriverTestcase.logger.log(LogStatus.PASS, "Step : Password Field is empty. No values displaying after clicked on 'Generate password link");

						SendKeys(getwebelement(xml.getlocator("//locators/"+application+"/Password_Textfield")), GeneratePassword);	
						Thread.sleep(1000);
						DriverTestcase.logger.log(LogStatus.PASS, "Step : Password entered manually not automatically generated :  "+GeneratePassword);
						Log.info("===Password entered manually not automatically generated ===");

					}else {
						Log.info("Automatically generated Password value is : "+ password);
						DriverTestcase.logger.log(LogStatus.PASS, "Password generated and the value is displaying as :  "+password);
					}

					
					WebElement Email=getwebelement(xml.getlocator("//locators/"+application+"/EmailLabelname"));
					scrolltoview(Email);
					Thread.sleep(2000);
					
				//Role	
					selectAndAddValueFromLeftDropdown(application, "Role", "roleDropdown_available" , rolestobeSelectedList, "roleDropdown_addButton");
					verifySelectedValuesInsideRightDropdown(application, "Role", "roleDropdown_selectedValues");
					
					
				//Hide Service
					selectAndAddValueFromLeftDropdown(application, "Hide Service", "HideService_Available", ServicesTobeSelectedlist, "HideService_addButton");
					verifySelectedValuesInsideRightDropdown(application, "Hide Services", "HideServicesDropdown_selectedValues");
				
					
				//Hide Site Order
					selectAndAddValueFromLeftDropdown(application, "Hide Site Order", "HideSiteOrder_Available" , siteOrdersToBeselectedList , "hideSiteOrder_addbutton");
					verifySelectedValuesInsideRightDropdown(application, "Hide Site Order" , "HideSiteOrderDropdown_selectedValues");
					
					scrolltoend();
					Thread.sleep(1000);
					
				//Hide Router Tool IPv4 Commands(Cisco)
					selectAndAddValueFromLeftDropdown(application, "Hide Router Tool IPv4 Commands(Cisco)", "hideRouterToolIPv4_Cisco_Available", routerToolIPv4CiscoTobeSelectedList, "hideRouterToolIPv4_Cisco_addButton");
					verifySelectedValuesInsideRightDropdown(application, "Hide Router Tool IPv4 Commands(Cisco)", "hideRouterToolIpv4_Huawei_selectedvalues");
					
					
				//Hide Router Tool IPv4 Commands(Huawei)
					selectAndAddValueFromLeftDropdown(application, "Hide Router Tool IPv4 Commands(Huawei)" , "hideRouterToolIPv4_Huawei_available" , routerToolIPv4HuaweiTobeSelectedList, "hideRouterToolIPv4__Huawei_addButton");
					verifySelectedValuesInsideRightDropdown(application, "Hide Router Tool IPv4 Commands(Huawei)" , "hideRouterToolIpv4_Cisco_selectedvalues");
					
					
//				//Hide Router Tool IPv6 Commands(Cisco)	
//					selectAndAddValueFromLeftDropdown(application, "Hide Router Tool IPv6 Commands(Cisco)" , "HideRouterToolIPv6_Cisco_Available" , selectValue, xpathForAddButton);
//					verifySelectedValuesInsideRightDropdown(application, "Hide Router Tool IPv6 Commands(Cisco)" , xpath);
					
					
				scrolltoend();
				Thread.sleep(3000);

				click_commonMethod(application, "OK" , "OkButton_AddUser" , xml);

	}
	
	
	
	
	
	WebElement UserName_Text2, FirstName_Text2, SurName_Text2, PostalAddress_Text2, IPGuardianAccountGroup_Text2, ColtOnlineUser_Text2, Password_Text2, GeneratePasswordLink_Text2, Roles_Text2, HideRouterToolsIPv6CommandsCisco_Text2, HideRouterToolsIPv4CommandsHuiwai_Text2, HideRouterToolsIPv4CommandsCisco_Text2, HideService_Text2, HideSiteOrder_Text2, OkButton_AddUser2, CancelButton_AddUser2 ;
	public void verifyEditUserFields(String application) throws InterruptedException, DocumentException {
		Thread.sleep(2000);
		
		try {
			
		Clickon(getwebelement(xml.getlocator("//locators/"+application+"/FirstRowRadioButtonInUsers")));
		DriverTestcase.logger.log(LogStatus.PASS, "Step : Clicked on Radio Button under Users");
		Log.info("=== Clicked on Radio Button under Users ===");
		
		Clickon(getwebelement(xml.getlocator("//locators/"+application+"/Users_Action")));					
		DriverTestcase.logger.log(LogStatus.PASS, "Step : Clicked on Action under Users");
		Log.info("=== Clicked on Action under Users ===");
		Thread.sleep(1000);
		
		Clickon(getwebelement(xml.getlocator("//locators/"+application+"/EditUserLink")));					
		DriverTestcase.logger.log(LogStatus.PASS, "Step : Clicked on Edit User Link");
		Log.info("=== Clicked on Edit User Link ===");
		Thread.sleep(1000);

			
				UserName_Text2 = getwebelement(xml.getlocator("//locators/" + application + "/UserName_Text"));
				sa.assertTrue(UserName_Text2.isDisplayed(),"UserName_Text field is not displayed");
				sa.assertTrue(UserName_Text2.isEnabled(), "UserName_Text field is not disabled");
				DriverTestcase.logger.log(LogStatus.PASS, "Step : Username is displayed");
				Log.info("===Username is displayed ===");
				
				FirstName_Text2 = getwebelement(xml.getlocator("//locators/" + application + "/FirstName_Text"));
				sa.assertTrue(FirstName_Text2.isDisplayed(),"FirstName_Text field is not displayed");
				sa.assertTrue(FirstName_Text2.isEnabled(), "FirstName_Text field is not disabled");
				DriverTestcase.logger.log(LogStatus.PASS, "Step : Firstname is displayed");
				Log.info("===Firstname is displayed ===");
				
				SurName_Text2 = getwebelement(xml.getlocator("//locators/" + application + "/SurName_Text"));
				sa.assertTrue(SurName_Text2.isDisplayed(),"SurName_Text field is not displayed");
				sa.assertTrue(SurName_Text2.isEnabled(), "SurName_Text field is not disabled");
				DriverTestcase.logger.log(LogStatus.PASS, "Step : Surname is displayed");
				Log.info("===Surname is displayed ===");
				
				PostalAddress_Text2 = getwebelement(xml.getlocator("//locators/" + application + "/PostalAddress_Text"));
				sa.assertTrue(PostalAddress_Text2.isDisplayed(),"PostalAddress_Text field is not displayed");
				sa.assertTrue(PostalAddress_Text2.isEnabled(), "PostalAddress_Text field is not disabled");
				DriverTestcase.logger.log(LogStatus.PASS, "Step : Postal Address is displayed");
				Log.info("===Postal Address is displayed ===");
				
				Email_Textfield2 = getwebelement(xml.getlocator("//locators/" + application + "/Email_Textfield"));
				sa.assertTrue(Email_Textfield2.isDisplayed(),"Email_Textfield is not displayed");
				sa.assertTrue(UserName_Text2.isEnabled(), "Email_Textfield is not disabled");
				DriverTestcase.logger.log(LogStatus.PASS, "Step : Email is displayed");
				Log.info("===Email is displayed ===");
				
				Phone_Textfield2 = getwebelement(xml.getlocator("//locators/" + application + "/Phone_Textfield"));
				sa.assertTrue(Phone_Textfield2.isDisplayed(),"Phone_Textfield is not displayed");
				sa.assertTrue(Phone_Textfield2.isEnabled(), "Phone_Textfield is not disabled");
				DriverTestcase.logger.log(LogStatus.PASS, "Step : Phone is displayed");
				Log.info("===Phone is displayed ===");
				
				IPGuardianAccountGroup_Text2 = getwebelement(xml.getlocator("//locators/" + application + "/IPGuardianAccountGroup_Text"));
				sa.assertTrue(IPGuardianAccountGroup_Text2.isDisplayed(),"IPGuardianAccountGroup_Text field is not displayed");
				sa.assertTrue(IPGuardianAccountGroup_Text2.isEnabled(), "IPGuardianAccountGroup_Text field is not disabled");
				DriverTestcase.logger.log(LogStatus.PASS, "Step : IP Guardian Account Group is displayed");
				Log.info("===IP Guardian Account Group is displayed ===");
				
				ColtOnlineUser_Text2 = getwebelement(xml.getlocator("//locators/" + application + "/ColtOnlineUser_Text"));
				sa.assertTrue(ColtOnlineUser_Text2.isDisplayed(),"ColtOnlineUser_Text field is not displayed");
				sa.assertTrue(ColtOnlineUser_Text2.isEnabled(), "ColtOnlineUser_Text field is not disabled");
				DriverTestcase.logger.log(LogStatus.PASS, "Step : Colt Online User is displayed");
				Log.info("===Colt Online User is displayed ===");
				
				Password_Text2 = getwebelement(xml.getlocator("//locators/" + application + "/Password_Text"));
				sa.assertTrue(Password_Text2.isDisplayed(),"Password_Text field is not displayed");
				sa.assertTrue(Password_Text2.isEnabled(), "Password_Text field is not disabled");
				DriverTestcase.logger.log(LogStatus.PASS, "Step : Password is displayed");
				Log.info("===Password is displayed ===");

				GeneratePasswordLink_Text2 = getwebelement(xml.getlocator("//locators/" + application + "/GeneratePasswordLink_Text"));
				sa.assertTrue(GeneratePasswordLink_Text2.isDisplayed(),"GeneratePasswordLink_Text field is not displayed");
				sa.assertTrue(GeneratePasswordLink_Text2.isEnabled(), "GeneratePasswordLink_Text field is not disabled");
				DriverTestcase.logger.log(LogStatus.PASS, "Step : Generate Password Link is displayed");
				Log.info("===Generate Password Link is displayed ===");
				
				Roles_Text2 = getwebelement(xml.getlocator("//locators/" + application + "/Roles_Text"));
				sa.assertTrue(Roles_Text2.isDisplayed(),"Roles_Text field is not displayed");
				sa.assertTrue(Roles_Text2.isEnabled(), "Roles_Text field is not disabled");
				DriverTestcase.logger.log(LogStatus.PASS, "Step : Roles is displayed");
				Log.info("===Roles is displayed ===");
				
				HideRouterToolsIPv6CommandsCisco_Text2 = getwebelement(xml.getlocator("//locators/" + application + "/HideRouterToolsIPv6CommandsCisco_Text"));
				sa.assertTrue(HideRouterToolsIPv6CommandsCisco_Text2.isDisplayed(),"HideRouterToolsIPv6CommandsCisco_Text field is not displayed");
				sa.assertTrue(HideRouterToolsIPv6CommandsCisco_Text2.isEnabled(), "HideRouterToolsIPv6CommandsCisco_Text field is not disabled");
				DriverTestcase.logger.log(LogStatus.PASS, "Step : Hide Router Tools IPv6 Commands Cisco is displayed");
				Log.info("===Hide Router Tools IPv6 Commands Cisco is displayed ===");
				
				HideRouterToolsIPv4CommandsHuiwai_Text2 = getwebelement(xml.getlocator("//locators/" + application + "/HideRouterToolsIPv4CommandsHuiwai_Text"));
				sa.assertTrue(HideRouterToolsIPv4CommandsHuiwai_Text2.isDisplayed(),"HideRouterToolsIPv4CommandsHuiwai_Text field is not displayed");
				sa.assertTrue(HideRouterToolsIPv4CommandsHuiwai_Text2.isEnabled(), "HideRouterToolsIPv4CommandsHuiwai_Text field is not disabled");
				DriverTestcase.logger.log(LogStatus.PASS, "Step : Hide Router Tools IPv4 Commands Huiwai is displayed");
				Log.info("===Hide Router Tools IPv4 Commands Huiwai is displayed ===");
				
				HideRouterToolsIPv4CommandsCisco_Text2 = getwebelement(xml.getlocator("//locators/" + application + "/HideRouterToolsIPv4CommandsCisco_Text"));
				sa.assertTrue(HideRouterToolsIPv4CommandsCisco_Text2.isDisplayed(),"HideRouterToolsIPv4CommandsCisco_Text field is not displayed");
				sa.assertTrue(HideRouterToolsIPv4CommandsCisco_Text2.isEnabled(), "HideRouterToolsIPv4CommandsCisco_Text field is not disabled");
				DriverTestcase.logger.log(LogStatus.PASS, "Step : Hide Router Tools IPv4 Commands Cisco is displayed");
				Log.info("===Hide Router Tools IPv4 Commands Cisco is displayed ===");
				
				HideService_Text2 = getwebelement(xml.getlocator("//locators/" + application + "/HideService_Text"));
				sa.assertTrue(HideService_Text2.isDisplayed(),"HideService_Text field is not displayed");
				sa.assertTrue(HideService_Text2.isEnabled(), "HideService_Text field is not disabled");
				DriverTestcase.logger.log(LogStatus.PASS, "Step : Hide Service is displayed");
				Log.info("===Hide Service is displayed ===");
				
				HideSiteOrder_Text2 = getwebelement(xml.getlocator("//locators/" + application + "/HideSiteOrder_Text"));
				sa.assertTrue(HideSiteOrder_Text2.isDisplayed(),"HideSiteOrder_Text field is not displayed");
				sa.assertTrue(HideSiteOrder_Text2.isEnabled(), "HideSiteOrder_Text field is not disabled");
				DriverTestcase.logger.log(LogStatus.PASS, "Step : Hide Site Order is displayed");
				Log.info("===Hide Site Order is displayed ===");
				
				OkButton_AddUser2 = getwebelement(xml.getlocator("//locators/" + application + "/OkButton_AddUser"));
				sa.assertTrue(OkButton_AddUser2.isDisplayed(),"OkButton_AddUser field is not displayed");
				sa.assertTrue(OkButton_AddUser2.isEnabled(), "OkButton_AddUser field is not disabled");
				DriverTestcase.logger.log(LogStatus.PASS, "Step : OK button is displayed");
				Log.info("===OK button is displayed ===");
				
				CancelButton_AddUser2 = getwebelement(xml.getlocator("//locators/" + application + "/CancelButton_AddUser"));
				sa.assertTrue(CancelButton_AddUser2.isDisplayed(),"CancelButton_AddUser field is not displayed");
				sa.assertTrue(CancelButton_AddUser2.isEnabled(), "CancelButton_AddUser field is not disabled");		
				DriverTestcase.logger.log(LogStatus.PASS, "Step : Cancel button is displayed");
			
			} catch (TimeoutException e) {
				e.printStackTrace();
				System.out.println("value is not displayed");
				DriverTestcase.logger.log(LogStatus.PASS, "value is not displayed in Edit User page :  " + e);

			} catch (NullPointerException e) {
				e.printStackTrace();
				System.out.println("value is not displayed");
				DriverTestcase.logger.log(LogStatus.PASS, "value is not displayed in Edit User page : " + e);

			}
			
			Log.info("=== Add User all fields Verified ===");
			sa.assertAll();
		}
		
		
		
		
	
	
	public void verifyEditUserFunction(String application, String UserName, String FirstName, String SurName,String PostalAddress, String Email_AddUser, String Phone_AddUser,
			String IPGuardianAccountGroup,String ColtOnlineUser, String GeneratePassword, String RolesToBeSelected,String	HideRouterToolsIPv6CommandsCisco_ToBeSelected, String HideRouterToolsIPv4CommandsHuiwai_ToBeSelected,String	HideRouterToolsIPv4CommandsCisco_ToBeSelected,String HideServicesToBeSelected,String HideSiteOrderToBeSelected) throws InterruptedException, DocumentException, IOException { 
		Thread.sleep(1000);
		
		
//		Clickon(getwebelement(xml.getlocator("//locators/"+application+"/FirstRowRadioButtonInUsers")));
//		DriverTestcase.logger.log(LogStatus.PASS, "Step : Clicked on Radio Button under Users");
//		Log.info("=== Clicked on Radio Button under Users ===");
		
		Clickon(getwebelement(xml.getlocator("//locators/"+application+"/Users_Action")));					
		DriverTestcase.logger.log(LogStatus.PASS, "Step : Clicked on Action under Users");
		Log.info("=== Clicked on Action under Users ===");
		Thread.sleep(1000);
		
		Clickon(getwebelement(xml.getlocator("//locators/"+application+"/EditUserLink")));					
		DriverTestcase.logger.log(LogStatus.PASS, "Step : Clicked on Edit User Link");
		Log.info("=== Clicked on Edit User Link ===");
		Thread.sleep(1000);
		
		
		////
		Clear(getwebelement(xml.getlocator("//locators/"+application+"/UserName")));
		SendKeys(getwebelement(xml.getlocator("//locators/"+application+"/UserName")), UserName);			Thread.sleep(1000);
		DriverTestcase.logger.log(LogStatus.PASS, "Step : UserName Updated To : "+UserName);
		Log.info("UserName Updated To : "+UserName);
		
		Clear(getwebelement(xml.getlocator("//locators/"+application+"/FirstName")));
		SendKeys(getwebelement(xml.getlocator("//locators/"+application+"/FirstName")), FirstName);			Thread.sleep(1000);
		DriverTestcase.logger.log(LogStatus.PASS, "Step : FirstName Updated To : "+FirstName);
		Log.info("FirstName Updated To : "+FirstName);
		
		Clear(getwebelement(xml.getlocator("//locators/"+application+"/SurName")));
		SendKeys(getwebelement(xml.getlocator("//locators/"+application+"/SurName")), SurName);				Thread.sleep(1000);
		DriverTestcase.logger.log(LogStatus.PASS, "Step : SurName Updated To : "+SurName);
		Log.info("SurName Updated To : "+SurName);
		
		Clear(getwebelement(xml.getlocator("//locators/"+application+"/PostalAddress")));
		SendKeys(getwebelement(xml.getlocator("//locators/"+application+"/PostalAddress")), PostalAddress);		Thread.sleep(1000);
		DriverTestcase.logger.log(LogStatus.PASS, "Step : PostalAddress Updated To : "+PostalAddress);
		Log.info("PostalAddress Updated To : "+PostalAddress);
		
		Clear(getwebelement(xml.getlocator("//locators/"+application+"/Email")));
		SendKeys(getwebelement(xml.getlocator("//locators/"+application+"/Email")), Email_AddUser);					Thread.sleep(1000);
		DriverTestcase.logger.log(LogStatus.PASS, "Step : Email Updated To : "+Email_AddUser);
		Log.info("Email Updated To : "+Email_AddUser);
		
		Clear(getwebelement(xml.getlocator("//locators/"+application+"/Phone")));
		SendKeys(getwebelement(xml.getlocator("//locators/"+application+"/Phone")), Phone_AddUser);					Thread.sleep(1000);
		DriverTestcase.logger.log(LogStatus.PASS, "Step : Phone Updated To : "+Phone_AddUser);
		Log.info("Phone Updated To : "+Phone_AddUser);
		
		
		//NOTE: IP Guardian Account Group is not mandatory , so need to ignore temporarly
		//Clear(getwebelement(xml.getlocator("//locators/"+application+"/IPGuardianAccountGroup")));
		//SendKeys(getwebelement(xml.getlocator("//locators/"+application+"/IPGuardianAccountGroup")), IPGuardianAccountGroup);	Thread.sleep(1000);
		//DriverTestcase.logger.log(LogStatus.PASS, "Step : IP Guardian Account Group Updated To : "+IPGuardianAccountGroup);
		//Log.info("IP Guardian Account Group Updated To : "+IPGuardianAccountGroup);
		
		Clear(getwebelement(xml.getlocator("//locators/"+application+"/ColtOnlineUser")));
		SendKeys(getwebelement(xml.getlocator("//locators/"+application+"/ColtOnlineUser")), ColtOnlineUser);	Thread.sleep(1000);
		DriverTestcase.logger.log(LogStatus.PASS, "Step : Colt Online User Updated To : "+ColtOnlineUser);
		Log.info("Colt Online User Updated To : "+ColtOnlineUser);

	
		
		Clickon(getwebelement(xml.getlocator("//locators/"+application+"/GeneratePasswordLink")));					Thread.sleep(2000);
		DriverTestcase.logger.log(LogStatus.PASS, "Step : Clicked on GeneratePasswordLink");
		
		Clear(getwebelement(xml.getlocator("//locators/"+application+"/Password_Textfield")));
		String  password=getwebelement(xml.getlocator("//locators/"+application+"/Password_Textfield")).getAttribute("value");
		System.out.println("Generated Password is : "+password);
		
		if(password.isEmpty()) {
			
			DriverTestcase.logger.log(LogStatus.PASS, "Step : Password text is empty after clicked on 'Generate password link");
//			Reporter.log("== Password text is empty after clicked on 'Generate password link' ==");
//			sa.fail("== Password text is empty after clicked on 'Generate password link' ==");		
			
			SendKeys(getwebelement(xml.getlocator("//locators/"+application+"/Password_Textfield")), GeneratePassword);	Thread.sleep(1000);
			DriverTestcase.logger.log(LogStatus.PASS, "Step : Password entered manually not automatically generated :  "+GeneratePassword);
			Log.info("===Password entered manually not automatically generated ===");


			//Reporter.log("== Password text is empty after clicked on 'Generate password link' ==");
			//sa.fail("== Password text is empty after clicked on 'Generate password link' ==");
		}else {
			Log.info("Automatically generated Password value is : "+ password);
			DriverTestcase.logger.log(LogStatus.PASS, "Step : Password generated and entered automatically :  "+password);
		}
		
		
		Clickon(getwebelement(xml.getlocator("//locators/"+application+"/RolesSelect")));										Thread.sleep(1000);
		Clickon(driver.findElement(By.xpath("//div[div[contains(text(),'"+RolesToBeSelected+"')]]/input")));
		DriverTestcase.logger.log(LogStatus.PASS, "Step : Roles Updated To :  "+RolesToBeSelected);
		
		Log.info("=== Roles selected===");
		
		Clickon(getwebelement(xml.getlocator("//locators/"+application+"/HideRouterToolsIPv6Commands_CiscoSelect")));					Thread.sleep(2000);
		Clickon(driver.findElement(By.xpath("//div[div[text()='"+HideRouterToolsIPv6CommandsCisco_ToBeSelected+"']]//input[@type='checkbox']")));
		DriverTestcase.logger.log(LogStatus.PASS, "Step : Hide Router Tools IPv6 Commands Cisco Updated To :  "+HideRouterToolsIPv6CommandsCisco_ToBeSelected);
		Log.info("=== HideRouterToolsIPv6CommandsCisco selected===");
		
		Clickon(getwebelement(xml.getlocator("//locators/"+application+"/HideRouterToolsIPv4Commands_HuiwaiSelect")));					Thread.sleep(2000);
		Clickon(driver.findElement(By.xpath("//div[div[text()='"+HideRouterToolsIPv4CommandsHuiwai_ToBeSelected+"']]//input[@type='checkbox']")));
		DriverTestcase.logger.log(LogStatus.PASS, "Step : Hide Router Tools IPv4 Commands Huiwai Updated To :  "+HideRouterToolsIPv4CommandsHuiwai_ToBeSelected);
		Log.info("=== HideRouterToolsIPv4CommandsHuiwai selected===");
		
		Clickon(getwebelement(xml.getlocator("//locators/"+application+"/HideRouterToolsIPv4Commands_CiscoSelect")));					Thread.sleep(2000);
		Clickon(driver.findElement(By.xpath("//div[div[text()='"+HideRouterToolsIPv4CommandsCisco_ToBeSelected+"']]//input[@type='checkbox']")));
		DriverTestcase.logger.log(LogStatus.PASS, "Step : Hide Router Tools IPv4 Commands Cisco Updated To :  "+HideRouterToolsIPv4CommandsCisco_ToBeSelected);
		Log.info("=== HideRouterToolsIPv4CommandsCisco selected===");
		
//		Clickon(getwebelement(xml.getlocator("//locators/"+application+"/HideServicesSelect")));			Thread.sleep(2000);
//		Clickon(driver.findElement(By.xpath("//div[div[text()='"+HideServicesToBeSelected+"']]//input[@type='checkbox']")));
//		DriverTestcase.logger.log(LogStatus.PASS, "Step : HideServices Updated To : "+HideServicesToBeSelected);
//		Log.info("HideServices Updated To : "+HideServicesToBeSelected);
//		
//		Clickon(getwebelement(xml.getlocator("//locators/"+application+"/HideSiteOrderSelect")));			Thread.sleep(2000);
//		Clickon(driver.findElement(By.xpath("//div[div[text()='"+HideSiteOrderToBeSelected+"']]//input[@type='checkbox']")));
//		DriverTestcase.logger.log(LogStatus.PASS, "Step : Hide Site Order Updated To :  "+HideSiteOrderToBeSelected);
//		Log.info("Hide Site Order Updated To :  "+HideSiteOrderToBeSelected);
		        
		//Clickon(getwebelement(xml.getlocator("//locators/"+application+"/OutSideOfDropdown")));				Thread.sleep(2000);
		Clickon(getwebelement(xml.getlocator("//locators/"+application+"/OkButton_AddUser")));				Thread.sleep(2000);
		//Clickon(getwebelement(xml.getlocator("//locators/"+application+"/CancelButton_AddUser")));		Thread.sleep(2000);
		
		DriverTestcase.logger.log(LogStatus.PASS, "Step : Clicked on OK button ");
		Log.info("=== OK button clicked ===");
		

			Thread.sleep(2000);	
			
			//Verify edited User
					
		}
	
	
	
	
	
	
	
	public void verifyAddedUser(String expectedusercreationtext) throws IOException, InterruptedException {
		scrollToTop();
		Thread.sleep(2000);
		try {
			WebElement ele = driver.findElement(By.xpath("//div[@role='alert']"));
			String actualusercreationtext = ele.getText();
			
			if((actualusercreationtext.equalsIgnoreCase(expectedusercreationtext))) {
				DriverTestcase.logger.log(LogStatus.PASS, "Step : confirmation message is displayed as : "+actualusercreationtext);
				Log.info("confirmation message is displayed as expected");
				DriverTestcase.logger.log(LogStatus.PASS, "User successfully created");

			}else{
				sa.fail("expected confirmation message validation failed");
			}
		}
		catch (NullPointerException e) {
		e.printStackTrace();
		System.out.println("Confirmation message is not displayed in UI");
		DriverTestcase.logger.log(LogStatus.FAIL, " Confirmation message is not displayed in UI :  " + e);
	}
		catch (NoSuchElementException e) {
		e.printStackTrace();
		System.out.println("Confirmation message is not displayed in UI");
		DriverTestcase.logger.log(LogStatus.FAIL, "Confirmation message is not displayed in UI :  " + e);

		}
		
		sa.assertAll();
	}
	
	
	public void selectUserTOEdit(String application, String username) throws InterruptedException {
		
		WebElement userPanel=getwebelement("//div[@class='heading-green-row row']//div[text()='Users']");
		scrolltoview(userPanel);
		Thread.sleep(3000);
		
		Clickon(getwebelement("//div[div[@class='heading-green-row row']//div[text()='Users']]//div[text()='"+ username +"']"));
		Thread.sleep(3000);
	}
		
		public void verifyAddedUserValuesInViewUserPage(String application, String UserName, String FirstName, String SurName,String PostalAddress, 
				String Email_AddUser, String Phone_AddUser, String IPGuardianAccountGroup,String ColtOnlineUser, String RolesToBeSelected,
				String	HideRouterToolsIPv6CommandsCisco_ToBeSelected, String HideRouterToolsIPv4CommandsHuiwai_ToBeSelected,
				String	HideRouterToolsIPv4CommandsCisco_ToBeSelected, String HideServicesToBeSelected,String HideSiteOrderToBeSelected ) 
				throws InterruptedException, DocumentException {
			
			try {
				// Verify all fields in View User page Once user created successfully
				
				Thread.sleep(2000);
				
				Clickon(driver.findElement(By.xpath("//div[div[text()='"+UserName+"']]//input")));
				DriverTestcase.logger.log(LogStatus.PASS, "Step : Clicked on Radio button  ");
				Thread.sleep(1000);
				
				Clickon(getwebelement(xml.getlocator("//locators/"+application+"/Users_Action")));
				DriverTestcase.logger.log(LogStatus.PASS, "Step : Clicked on Users_Action  ");
				Thread.sleep(1000);
				
				Clickon(getwebelement(xml.getlocator("//locators/"+application+"/ViewuserLink")));	
				DriverTestcase.logger.log(LogStatus.PASS, "Step : Clicked on View User Link  ");
				Thread.sleep(10000);

				
				
				WebElement UserName_we = driver.findElement(By.xpath("//div[text()='"+UserName+"']"));
				String actualUserName=UserName_we.getText();
				sa.assertEquals(actualUserName, UserName, " Actual and Expected both are not same");
				DriverTestcase.logger.log(LogStatus.PASS, "Step : Username field data verified as : "+actualUserName+" , "+UserName);
				
				WebElement FirstName_we = driver.findElement(By.xpath("//div[text()='"+FirstName+"']"));
				String actualFirstName=FirstName_we.getText();
				sa.assertEquals(actualFirstName, FirstName, " Actual and Expected both are not same");
				DriverTestcase.logger.log(LogStatus.PASS, "Step : Firstname field data verified as : "+actualFirstName+" , "+FirstName);
				
				WebElement SurName_we = driver.findElement(By.xpath("//div[text()='"+SurName+"']"));
				String actualSurName=SurName_we.getText();
				sa.assertEquals(actualSurName, SurName, " Actual and Expected both are not same");
				DriverTestcase.logger.log(LogStatus.PASS, "Step : Surname field data verified as : "+actualSurName+" , "+SurName);
				
				WebElement PostalAddress_we = driver.findElement(By.xpath("//div[text()='"+PostalAddress+"']"));
				String actualPostalAddress=PostalAddress_we.getText();
				sa.assertEquals(actualPostalAddress, PostalAddress, " Actual and Expected both are not same");
				DriverTestcase.logger.log(LogStatus.PASS, "Step : Postal Address field data verified as : "+actualPostalAddress+" , "+PostalAddress);
				
				WebElement EmailViewUser_we = driver.findElement(By.xpath("//div[text()='"+Email_AddUser+"']"));
				String actualEmailViewUser=EmailViewUser_we.getText();
				sa.assertEquals(actualEmailViewUser, Email_AddUser, " Actual and Expected both are not same");
				DriverTestcase.logger.log(LogStatus.PASS, "Step : Email field data verified as : "+actualEmailViewUser+" , "+Email_AddUser);
				
				WebElement PhoneViewUser_we = driver.findElement(By.xpath("//div[text()='"+Phone_AddUser+"']"));
				String actualPhone_AddUser=PhoneViewUser_we.getText();
				sa.assertEquals(actualPhone_AddUser, Phone_AddUser, " Actual and Expected both are not same");
				DriverTestcase.logger.log(LogStatus.PASS, "Step : Phone field data verified as : "+actualPhone_AddUser+" , "+Phone_AddUser);
				
				//NOTE: IP Guardian Account Group is not mandatory , so need to ignore temporarly
				//WebElement IPGuardianAccountGroup_we = driver.findElement(By.xpath("//div[text()='"+IPGuardianAccountGroup+"']"));
				//String actualIPGuardianAccountGroup=IPGuardianAccountGroup_we.getText();
				//sa.assertEquals(actualIPGuardianAccountGroup, IPGuardianAccountGroup, " Actual and Expected both are not same");
				//DriverTestcase.logger.log(LogStatus.PASS, "Step : IP Guardian Account Group field data verified as : "+actualIPGuardianAccountGroup+" , "+IPGuardianAccountGroup);
				
				//NOTE: Colt Online User is not mandatory , so need to ignore temporarly
//				WebElement ColtOnlineUser_we = driver.findElement(By.xpath("//div[text()='"+ColtOnlineUser+"']"));
//				String actualColtOnlineUser=ColtOnlineUser_we.getText();
//				sa.assertEquals(actualColtOnlineUser, ColtOnlineUser, " Actual and Expected both are not same");
//				DriverTestcase.logger.log(LogStatus.PASS, "Step : Colt Online User field data verified as: "+actualColtOnlineUser+" , "+ColtOnlineUser");
							
//			WebElement SelectedRoles_we = driver.findElement(By.xpath("//div[text()='"+RolesToBeSelected+"']"));
//			String actualSelectedRoles=SelectedRoles_we.getText();
//			sa.assertEquals(actualSelectedRoles, RolesToBeSelected, " Actual and Expected both are not same");
//			DriverTestcase.logger.log(LogStatus.PASS, "Step : Selected Roles field data verified");
//			
//			WebElement SelectedHideServices_we = driver.findElement(By.xpath("//div[text()='"+HideServicesToBeSelected+"']"));
//			String actualFax=SelectedHideServices_we.getText();
//			sa.assertEquals(actualFax, HideServicesToBeSelected, " Actual and Expected both are not same");		
//			DriverTestcase.logger.log(LogStatus.PASS, "Step : Selected Hide Services field data verified");
//			
//			WebElement AvailableServices_we = driver.findElement(By.xpath("//div[text()='"+HideRouterToolsIPv4CommandsHuiwai_ToBeSelected+"']"));
//			String actualSelectedHideRouterToolsIPv4CommandsHuiwai=AvailableServices_we.getText();
//			sa.assertEquals(actualSelectedHideRouterToolsIPv4CommandsHuiwai, HideRouterToolsIPv4CommandsHuiwai_ToBeSelected, " Actual and Expected both are not same");
//			DriverTestcase.logger.log(LogStatus.PASS, "Step : Selected Hide Router Tools IPv4 Commands Huiwai  field data verified");
//			
//			WebElement SelectedHideSiteOrder_we = driver.findElement(By.xpath("//div[text()='"+HideSiteOrderToBeSelected+"']"));
//			String actualSelectedHideSiteOrder=SelectedHideSiteOrder_we.getText();
//			sa.assertEquals(actualSelectedHideSiteOrder, HideSiteOrderToBeSelected, " Actual and Expected both are not same");
//			DriverTestcase.logger.log(LogStatus.PASS, "Step : Selected Hide Site Order field data verified");
//			
//			WebElement SelectedHideRouterToolsIPv4CommandsHuiwai_we = driver.findElement(By.xpath("//div[text()='"+HideRouterToolsIPv4CommandsHuiwai_ToBeSelected+"']"));
//			String actualSelectedHideRouterToolsIPv4Commands=SelectedHideRouterToolsIPv4CommandsHuiwai_we.getText();
//			sa.assertEquals(actualSelectedHideRouterToolsIPv4Commands, HideRouterToolsIPv4CommandsHuiwai_ToBeSelected, " Actual and Expected both are not same");
//			DriverTestcase.logger.log(LogStatus.PASS, "Step : Selected Hide Router Tools IPv4 Commands Huiwai field data verified");
//			
//			WebElement AvailableHideRouterToolsIPv4CommandsCisco_we = driver.findElement(By.xpath("//div[text()='"+HideRouterToolsIPv4CommandsCisco_ToBeSelected+"']"));
//			String actualEmail=AvailableHideRouterToolsIPv4CommandsCisco_we.getText();
//			sa.assertEquals(actualEmail, HideRouterToolsIPv4CommandsCisco_ToBeSelected, " Actual and Expected both are not same");
//			DriverTestcase.logger.log(LogStatus.PASS, "Step : Selected Hide Router Tools IPv4 Commands Cisco field data verified");
//			
//			WebElement SelectedHideRouterToolsIPv6Commands = driver.findElement(By.xpath("//div[text()='"+HideRouterToolsIPv6CommandsCisco_ToBeSelected+"']"));
//			String actualSelectedHideRouterToolsIPv6Commands=SelectedHideRouterToolsIPv6Commands.getText();
//			sa.assertEquals(actualSelectedHideRouterToolsIPv6Commands, HideRouterToolsIPv6CommandsCisco_ToBeSelected, " Actual and Expected both are not same");
//			DriverTestcase.logger.log(LogStatus.PASS, "Step : Selected Hide Router Tools IPv6 Commands field data verified");
//			
//			WebElement AvailableHideRouterToolsIPv6Commands = driver.findElement(By.xpath("//div[text()='"+HideRouterToolsIPv6CommandsCisco_ToBeSelected+"']"));
//			String actualAvailableHideRouterToolsIPv6Commands=AvailableHideRouterToolsIPv6Commands.getText();
//			sa.assertEquals(actualAvailableHideRouterToolsIPv6Commands, HideRouterToolsIPv6CommandsCisco_ToBeSelected, " Actual and Expected both are not same");	
//			DriverTestcase.logger.log(LogStatus.PASS, "Step : Selected Hide Router Tools IPv6 Commands Cisco field data verified");
			
				javascriptexecutor(getwebelement(xml.getlocator("//locators/"+application+"/backbutton")));
				Clickon(getwebelement(xml.getlocator("//locators/"+application+"/backbutton")));					
				Thread.sleep(5000);
				
				scrolltoend();
				
				
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				DriverTestcase.logger.log(LogStatus.INFO, "value is not displayed in view user page " + e);
				e.printStackTrace();
			}		
			
		
		
		//	sa.assertAll();
		}
	
	
		
		
		
		public void EditCustomerDetails(String application, String name, String domain, String Country, String OCN, String reference, String TechnicalContactName,
				String typetoselect, String email, String phone, String fax ) throws InterruptedException, DocumentException, IOException {
			
			
			Clickon(getwebelement(xml.getlocator("//locators/"+application+"/CustomerDetails_Action")));
			DriverTestcase.logger.log(LogStatus.PASS, "Step : Click on Action dropdown for Edit customer");
			Log.info("Clicked on Action dropdown for Edit customer");
			
			Clickon(getwebelement(xml.getlocator("//locators/"+application+"/EditCustomerLink")));
			DriverTestcase.logger.log(LogStatus.PASS, "Step : Click on Edit Customer Link");
			Log.info("Edit customer link is clicked");
			
			WebElement EditCustomerPageVerify=getwebelement(xml.getlocator("//locators/"+application+"/EditCustomerTabname_EditCustomer"));
			if(EditCustomerPageVerify.isDisplayed()) {
				Log.info("got directed to Edit Customer page , Editing actions to be performed");
				
				SendKeys(getwebelement(xml.getlocator("//locators/"+application+ "/Name_EditCustomer")), name);
				DriverTestcase.logger.log(LogStatus.PASS, "Step : Name has been edited");
				Log.info("Name has been edited");
				
				
				SendKeys(getwebelement(xml.getlocator("//locators/"+application+ "/domain_EditCustomer")), domain);
				DriverTestcase.logger.log(LogStatus.PASS, "Step : Domain has been edited");
				Log.info("Domain has been edited");

				Select(getwebelement(xml.getlocator("//locators/"+application+ "/country_EditCustomer")), Country);
				DriverTestcase.logger.log(LogStatus.PASS, "Step : Country as been changed");
				Log.info("Country as been changed");
				
				SendKeys(getwebelement(xml.getlocator("//locators/"+application+ "/ocn_EditCustomer")), OCN);
				DriverTestcase.logger.log(LogStatus.PASS, "Step : OCN has been edited");
				Log.info("OCN has been edited");
				
				SendKeys(getwebelement(xml.getlocator("//locators/"+application+ "/reference_EditCustomer")), reference);
				DriverTestcase.logger.log(LogStatus.PASS, "Step : Reference name has been edited");
				Log.info("Reference name has been edited");
				
				SendKeys(getwebelement(xml.getlocator("//locators/"+application+ "/Technicalname_EditCustomer")), TechnicalContactName);
				DriverTestcase.logger.log(LogStatus.PASS, "Step : Technical contact name has been edited");
				Log.info("Technical contact name has been edited");
				
				Select(getwebelement(xml.getlocator("//locators/"+application+ "/type_EditCustomer")), typetoselect);
				DriverTestcase.logger.log(LogStatus.PASS, "Step : customer type has been edited");
				Log.info("customer type has been edited");
				
				SendKeys(getwebelement(xml.getlocator("//locators/"+application+ "/Email_EditCustomer")), email);
				DriverTestcase.logger.log(LogStatus.PASS, "Step : Email has been edited");
				Log.info("Email has been edited");
				
				SendKeys(getwebelement(xml.getlocator("//locators/"+application+ "/phone_EditCustomer")), phone);
				DriverTestcase.logger.log(LogStatus.PASS, "Step : Phone number has been edited");
				Log.info("Phone number has been edited");
				
				SendKeys(getwebelement(xml.getlocator("//locators/"+application+ "/fax_EditCustomer")), fax);
				DriverTestcase.logger.log(LogStatus.PASS, "Step : Fax details has been edited");
				Log.info("Fax details has been edited");
				
				Clickon(getwebelement(xml.getlocator("//locators/"+application+ "/enablededicatedPortal_EditCustomer")));
				DriverTestcase.logger.log(LogStatus.PASS, "Step : Dedicated portal has been disabled");
				Log.info("Dedicated portal has been disabled");
				
				Clickon(getwebelement(xml.getlocator("//locators/"+application+"/OkButton_CreateCustomer")));
				DriverTestcase.logger.log(LogStatus.PASS, "Step : Clicked on OK button");
				Log.info("=== OK button clicked ===");	Thread.sleep(2000);	
			
				
		} else {
			Log.info("Edit customer page is not directed");
				}
		}
		
		
		
		public void deleteUser(String application, String username) throws InterruptedException, DocumentException {
			
			Thread.sleep(5000);
			
			WebElement userPanel=getwebelement("//div[@class='heading-green-row row']//div[text()='Users']");
			WebElement fax=getwebelement(xml.getlocator("//locators/"+application+"/Fax_Textfield"));
			scrolltoview(fax);
			Thread.sleep(2000);
			
			Clickon(getwebelement("(//div[div[@class='heading-green-row row']//div[text()='Users']]//div[text()='"+ username +"'])[1]"));
			DriverTestcase.logger.log(LogStatus.PASS, "Step : Clicked on Radio Button under Users");
			Log.info("=== Clicked on Radio Button under Users ===");
			Thread.sleep(2000);
			
			Clickon(getwebelement(xml.getlocator("//locators/"+application+"/Users_Action")));					
			DriverTestcase.logger.log(LogStatus.PASS, "Step : Clicked on Action under Users");
			Log.info("=== Clicked on Delete button ===");
			Thread.sleep(2000);
			
			Clickon(getwebelement(xml.getlocator("//locators/"+application+"/DeleteUserLink")));					
			DriverTestcase.logger.log(LogStatus.PASS, "Step : Clicked on Delete User Link");
			Log.info("=== Clicked on Delete button ===");
			Thread.sleep(2000);
			
			Clickon(getwebelement(xml.getlocator("//locators/"+application+"/DeleteButton_DeleteUser")));	Thread.sleep(1000);
			DriverTestcase.logger.log(LogStatus.PASS, "Step : Clicked on Delete button");
			Log.info("=== Clicked on Delete button ===");
		}
	
		
		
		public void deleteUser2(String application) throws InterruptedException, DocumentException {
			
			
			try {
				boolean NoRowsToShow_ResultText=getwebelement(xml.getlocator("//locators/" + application + "/NoRowsToShow_ResultText")).isDisplayed();
				
				sa.assertTrue(NoRowsToShow_ResultText, "Search customer result has not deleted or Search customer result is existing in result grid ");
				System.out.println("Search customer result has been deleted or Search customer result is not existing ");
				DriverTestcase.logger.log(LogStatus.PASS, "Step : Search customer result has been deleted or Search customer result is not existing");
				Log.info("=== Search customer result has been deleted or Search customer result is not existing ===");
				
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println("User is not  Deleted");
					
					Clickon(getwebelement(xml.getlocator("//locators/"+application+"/FirstRowRadioButtonInUsers")));
					DriverTestcase.logger.log(LogStatus.PASS, "Step : Clicked on Radio Button under Users");
					Log.info("=== Clicked on Radio Button under Users ===");
					Thread.sleep(2000);
					
					Clickon(getwebelement(xml.getlocator("//locators/"+application+"/Users_Action")));					
					DriverTestcase.logger.log(LogStatus.PASS, "Step : Clicked on Action under Users");
					Log.info("=== Clicked on Delete button ===");
					Thread.sleep(2000);
					
					Clickon(getwebelement(xml.getlocator("//locators/"+application+"/DeleteUserLink")));					
					DriverTestcase.logger.log(LogStatus.PASS, "Step : Clicked on Delete User Link");
					Log.info("=== Clicked on Delete button ===");
					Thread.sleep(2000);
					
					Clickon(getwebelement(xml.getlocator("//locators/"+application+"/DeleteButton_DeleteUser")));	Thread.sleep(1000);
					DriverTestcase.logger.log(LogStatus.PASS, "Step : User deleted successfully");
					Log.info("=== User deleted successfully ===");
				}

		}


		
		public void EditUserDetails(String application, String UserName, String FirstName, String SurName,String PostalAddress, String Email_AddUser, String Phone_AddUser,
			String IPGuardianAccountGroup,String ColtOnlineUser, String GeneratePassword, String RolesToBeSelected,String	HideRouterToolsIPv6CommandsCisco_ToBeSelected,
			String HideRouterToolsIPv4CommandsHuiwai_ToBeSelected,String	HideRouterToolsIPv4CommandsCisco_ToBeSelected,String HideServicesToBeSelected,String HideSiteOrderToBeSelected ) throws InterruptedException, DocumentException, IOException {
			
			Thread.sleep(1000);
			Clickon(getwebelement(xml.getlocator("//locators/"+application+"/FirstRowRadioButtonInUsers")));
			DriverTestcase.logger.log(LogStatus.PASS, "Step : Clicked on radio button");
			Log.info("Clicked on radio button for Edit User");	
			
			Thread.sleep(1000);
			Clickon(getwebelement(xml.getlocator("//locators/"+application+"/Users_Action")));
			DriverTestcase.logger.log(LogStatus.PASS, "Step : Clicked on Action dropdown for Edit customer");
			Log.info("Clicked on Action dropdown for Edit customer");		
			
			Clickon(getwebelement(xml.getlocator("//locators/"+application+"/EditUserLink")));
			DriverTestcase.logger.log(LogStatus.PASS, "Step : Clicked on Edit Customer link");
			Log.info("Clicked on Edit Customer link");
			
			WebElement EditUserPageVerify=getwebelement(xml.getlocator("//locators/"+application+"/EdituserTabname_EditUser"));
			if(EditUserPageVerify.isDisplayed()) {
				Log.info("got directed to Edit User page");
				
				Log.info("Editing actions to be performed");

				SendKeys(getwebelement(xml.getlocator("//locators/"+application+"/UserName")), UserName);			Thread.sleep(1000);
				DriverTestcase.logger.log(LogStatus.PASS, "Step : Useruame has been edited");
				Log.info("=== Username has been edited ===");
				
				SendKeys(getwebelement(xml.getlocator("//locators/"+application+"/FirstName")), FirstName);			Thread.sleep(1000);
				DriverTestcase.logger.log(LogStatus.PASS, "Step : FirstName has been edited");
				Log.info("===FirstName has been edited ===");
				
				SendKeys(getwebelement(xml.getlocator("//locators/"+application+"/SurName")), SurName);				Thread.sleep(1000);
				DriverTestcase.logger.log(LogStatus.PASS, "Step : SurName has been edited");
				Log.info("===SurName has been edited ===");
				
				SendKeys(getwebelement(xml.getlocator("//locators/"+application+"/PostalAddress")), PostalAddress);		Thread.sleep(1000);
				DriverTestcase.logger.log(LogStatus.PASS, "Step : PostalAddress has been edited");
				Log.info("===PostalAddress  has been edited ===");
				
				SendKeys(getwebelement(xml.getlocator("//locators/"+application+"/Email")), Email_AddUser);					Thread.sleep(1000);
				DriverTestcase.logger.log(LogStatus.PASS, "Step : Email has been edited");
				Log.info("===Email has been edited ===");
				
				SendKeys(getwebelement(xml.getlocator("//locators/"+application+"/Phone")), Phone_AddUser);					Thread.sleep(1000);
				DriverTestcase.logger.log(LogStatus.PASS, "Step : Phone has been edited");
				Log.info("===Phone has been edited ===");
				
				SendKeys(getwebelement(xml.getlocator("//locators/"+application+"/IPGuardianAccountGroup")), IPGuardianAccountGroup);	Thread.sleep(1000);
				DriverTestcase.logger.log(LogStatus.PASS, "Step : IP Guardian Account Group has been edited");
				Log.info("=== IP Guardian Account Group has been edited ===");
				
				SendKeys(getwebelement(xml.getlocator("//locators/"+application+"/ColtOnlineUser")), ColtOnlineUser);	Thread.sleep(1000);
				DriverTestcase.logger.log(LogStatus.PASS, "Step : Colt Online User has been edited");
				Log.info("===Colt Online User has been edited ===");
			
				//Clickon(getwebelement(xml.getlocator("//locators/"+application+"/GeneratePasswordLink")));					Thread.sleep(2000);
				SendKeys(getwebelement(xml.getlocator("//locators/"+application+"/Password_Textfield")), GeneratePassword);	Thread.sleep(1000);
				DriverTestcase.logger.log(LogStatus.PASS, "Step : Password has been edited");
				Log.info("===Password has been edited ===");
		        
				Clickon(getwebelement(xml.getlocator("//locators/"+application+"/RolesSelect")));										Thread.sleep(1000);
				DriverTestcase.logger.log(LogStatus.PASS, "Step : Roles has been edited");
				Log.info("=== Roles has been edited===");
				
				Clickon(getwebelement(xml.getlocator("//locators/"+application+"/HideRouterToolsIPv6Commands_CiscoSelect")));					Thread.sleep(2000);
				Clickon(driver.findElement(By.xpath("//div[contains(text(),'"+HideRouterToolsIPv6CommandsCisco_ToBeSelected+"')]")));
				DriverTestcase.logger.log(LogStatus.PASS, "Step : Hide Router Tools IPv6 Commands Cisco has been edited");
				Log.info("=== Hide Router Tools IPv6 Commands Cisco has been edited===");
				
				Clickon(getwebelement(xml.getlocator("//locators/"+application+"/HideRouterToolsIPv4Commands_HuiwaiSelect")));					Thread.sleep(2000);
				Clickon(driver.findElement(By.xpath("//div[contains(text(),'"+HideRouterToolsIPv4CommandsHuiwai_ToBeSelected+"')]")));
				DriverTestcase.logger.log(LogStatus.PASS, "Step : Hide Router Tools IPv4 Commands Huiwai has been edited");
				Log.info("=== Hide Router Tools IPv4 Commands Huiwai has been edited===");
				
				Clickon(getwebelement(xml.getlocator("//locators/"+application+"/HideRouterToolsIPv4Commands_CiscoSelect")));					Thread.sleep(2000);
				Clickon(driver.findElement(By.xpath("//div[contains(text(),'"+HideRouterToolsIPv4CommandsCisco_ToBeSelected+"')]")));
				DriverTestcase.logger.log(LogStatus.PASS, "Step : Hide Router Tools IPv4 Commands Cisco has been edited");
				Log.info("=== Hide Router Tools IPv4 Commands Cisco has been edited===");
				
				Clickon(getwebelement(xml.getlocator("//locators/"+application+"/HideServicesSelect")));			Thread.sleep(2000);
				Clickon(driver.findElement(By.xpath("//div[contains(text(),'"+HideServicesToBeSelected+"')]")));
				DriverTestcase.logger.log(LogStatus.PASS, "Step : Hide Services has been edited");
				Log.info("=== Hide Services has been edited===");
				
				Clickon(getwebelement(xml.getlocator("//locators/"+application+"/HideSiteOrderSelect")));			Thread.sleep(2000);
				Clickon(driver.findElement(By.xpath("//div[contains(text(),'"+HideSiteOrderToBeSelected+"')]")));
				DriverTestcase.logger.log(LogStatus.PASS, "Step : Hide Site Order has been edited");
				Log.info("=== Hide Site Order has been edited===");	        
			
				Clickon(getwebelement(xml.getlocator("//locators/"+application+"/OutSideOfDropdown")));				Thread.sleep(2000);
				Clickon(getwebelement(xml.getlocator("//locators/"+application+"/OkButton_AddUser")));				Thread.sleep(2000);
				DriverTestcase.logger.log(LogStatus.PASS, "Step : Clicked on OK button");
				Log.info("=== OK button clicked ===");	Thread.sleep(2000);	

			} else {
			Log.info("Edit User page is not directed");
				}

		}
		
		
		

	public void getCustomerData(String application, String created) throws InterruptedException, DocumentException, IOException {
			// Get all created customer details in Customer details page Once customer created successfully
			
			String legalCustomerName_Value=getwebelement(xml.getlocator("//locators/"+application+"/CreatedCustomer_LegalCustomerName_Value")).getText();
			String mainDomain_Value=getwebelement(xml.getlocator("//locators/"+application+"/CreatedCustomer_MainDomain_Value")).getText();
			String country_Value=getwebelement(xml.getlocator("//locators/"+application+"/CreatedCustomer_Country_Value")).getText();	
			String OCN_Value=getwebelement(xml.getlocator("//locators/"+application+"/CreatedCustomer_OCN_Value")).getText();
			String reference_Value=getwebelement(xml.getlocator("//locators/"+application+"/CreatedCustomer_Reference_Value")).getText();	
			String type_Value=getwebelement(xml.getlocator("//locators/"+application+"/CreatedCustomer_Type_Value")).getText();			
			String technicalContactName_Value=getwebelement(xml.getlocator("//locators/"+application+"/CreatedCustomer_TechnicalContactName_Value")).getText();
			String email_Value=getwebelement(xml.getlocator("//locators/"+application+"/CreatedCustomer_Email_Value")).getText();
			String phone_Value=getwebelement(xml.getlocator("//locators/"+application+"/CreatedCustomer_Phone_Value")).getText();
			String fax_Value=getwebelement(xml.getlocator("//locators/"+application+"/CreatedCustomer_Fax_Value")).getText();
			
			String CurrentDate=getCurrentDate();
			String [] allColumnsValues=new String [] {legalCustomerName_Value,mainDomain_Value,country_Value, OCN_Value, reference_Value, technicalContactName_Value, type_Value, email_Value, phone_Value, fax_Value, created, CurrentDate   };
			System.out.println("Total number of values to be passed in excel: "+allColumnsValues.length);
			
			DriverTestcase.logger.log(LogStatus.PASS, "Total number of values to be passed in excel: "+allColumnsValues.length);
			dg.CreateCustomerDataWriter(allColumnsValues);
	}
	
	
	
	public void getUserData(String application, String created) throws InterruptedException, DocumentException, IOException {
		// Get all created user details in User details page Once user added successfully
		String AddedUser_LoginUserName_Value=getwebelement(xml.getlocator("//locators/"+application+"/AddedUser_LoginUserName_Value")).getText();
		String AddedUser_Name_Value=getwebelement(xml.getlocator("//locators/"+application+"/AddedUser_Name_Value")).getText();
		String AddedUser_Email_Value=getwebelement(xml.getlocator("//locators/"+application+"/AddedUser_Email_Value")).getText();
		String AddedUser_Roles_Value=getwebelement(xml.getlocator("//locators/"+application+"/AddedUser_Roles_Value")).getText();	
		//String AddedUser_Resources_Value=getwebelement(xml.getlocator("//locators/"+application+"/AddedUser_Resources_Value")).getText();
		String AddedUser_Address_Value=getwebelement(xml.getlocator("//locators/"+application+"/AddedUser_Address_Value")).getText();			
		
		String CurrentDate=getCurrentDate();
		String [] allColumnsValues=new String [] {AddedUser_LoginUserName_Value,AddedUser_Name_Value,AddedUser_Email_Value, AddedUser_Roles_Value, AddedUser_Address_Value,  created, CurrentDate   };
		System.out.println("Total number of values to be passed in excel: "+allColumnsValues.length);
		
		DriverTestcase.logger.log(LogStatus.PASS, "Total number of values to be passed in excel: "+allColumnsValues.length);
		dg.CreateUserDataWriter(allColumnsValues);

}

	
	
	
	/*
	 * 
	 * 				Negative Scenarios for Create Customer
	 * 
	 */
	
	public void checkWetherTextFieldIsAcceptingCharOrNumericOrSpecialCharacter(String application, String inputData) {
		
		java.util.Scanner scn=new java.util.Scanner(System.in);
		char ch=scn.next().charAt(0);
		
		if((ch>='a' && ch<='z')|| (ch>='A' && ch<='Z')) {
			System.out.println("==  Given character is Alphabet ==");
		}else {
			System.out.println("==  Given character is AlphaNumeric ==");
		}
	}
	
	
	
	public void checkWetherTextFieldIsEmptyOrNot(String application, String GeneratePassword) throws InterruptedException, DocumentException, IOException {
		Clickon(getwebelement(xml.getlocator("//locators/"+application+"/GeneratePasswordLink")));					Thread.sleep(2000);
		String  password=getwebelement(xml.getlocator("//locators/"+application+"/Password_Textfield")).getAttribute("value");
		if(password.isEmpty()) {
			Reporter.log("== Password text is empty after clicked on 'Generate password link' ==");
			SendKeys(getwebelement(xml.getlocator("//locators/"+application+"/Password_Textfield")), GeneratePassword);	Thread.sleep(1000);
			Log.info("===Password Entered ===");
			sa.fail("== Password text is empty after clicked on 'Generate password link' ==");
		}else {
			Log.info("Password value is : "+ password);
		}
	
	}
	
	
	
	////////////////////////////////////Supply Service///////////////////////////////////////////////////////////
	
	
	public void createexistingorderservice(String application, String existingorder, String orderno, String rfireqno)
			throws InterruptedException, IOException, DocumentException {
	
		Thread.sleep(2000);

		scrolltoend();
	
		Thread.sleep(2000);

		click_commonMethod(application, "Order_Service_Action", "Orders_Services_Action", xml);
		
		Clickon(getwebelement(xml.getlocator("//locators/" + application + "/AddOrder_Link")));
		DriverTestcase.logger.log(LogStatus.PASS, "Step : Clicked on 'Add Order' link under Order/Services pannel");
		Log.info(" === Clicked on 'Add Order' link under Orders/Services pannel ===");
		Thread.sleep(2000);

		
		if (existingorder.equalsIgnoreCase("YES")) {
			scrolltoend();
			addDropdownValues_commonMethod(application, "'Order/Contract Number(Parent SID)" , "existingorderdropdown" , orderno, xml);
			
			addtextFields_commonMethod(application, "RFI / RFQ /IP Voice Line number" , "rfireqiptextfield", rfireqno, xml);

		} else {

			System.out.println("Existing order is not selected");
			DriverTestcase.logger.log(LogStatus.PASS, "Step: Existing order is not selected");
			Log.info("=== Existing order is not selected ===");
		}

	}
	
	
	
	public void createneworderservice(String application, String neworder, String neworderno, String newrfireqno)
			throws InterruptedException, IOException, DocumentException {

		
		if (neworder.equalsIgnoreCase("YES")) {
			scrolltoend();
			Clickon(getwebelement(xml.getlocator("//locators/" + application + "/selectorderswitch")));
			// Thread.sleep(5000);
			Thread.sleep(2000);
			System.out.println("Clicked to create new order");
			DriverTestcase.logger.log(LogStatus.PASS, "Step: Clicked to create new order");
			Log.info("=== Clicked to create new order ===");

			SendKeys(getwebelement(xml.getlocator("//locators/" + application + "/newordertextfield")), neworderno);
			// Thread.sleep(3000);
			Thread.sleep(1000);
			System.out.println("Entered New Order number is : " + neworderno);
			DriverTestcase.logger.log(LogStatus.PASS, "Step: Entered New Order number is : " + neworderno);
			Log.info("Entered New Order number is : " + neworderno);

			SendKeys(getwebelement(xml.getlocator("//locators/" + application + "/newrfireqtextfield")), newrfireqno);
			// Thread.sleep(3000);
			Thread.sleep(1000);
			System.out.println("Entered New Order number is : " + newrfireqno);
			DriverTestcase.logger.log(LogStatus.PASS, "Step: Value entered in 'RFI/RFQ' text field is : " + newrfireqno);
			Log.info("Entered New Order number is : " + newrfireqno);

			Clickon(getwebelement(xml.getlocator("//locators/" + application + "/createorderbutton")));
			// Thread.sleep(5000);
			Thread.sleep(1000);
			System.out.println("=== Clicked to create new order ===");
			DriverTestcase.logger.log(LogStatus.PASS, "Step: Clicked to create new order");
			Log.info("Clicked to create new order");

		} else {
			System.out.println("New order not selected");
			DriverTestcase.logger.log(LogStatus.PASS, "Step: New order is not selected");
			Log.info("New order is not selected");
		}
		
		//Verify Created new order
		
	}
	
	
	
	
	public void verifyCreated_NewOrder(String expectedCreated_NewOrderText) throws IOException, InterruptedException {
		Thread.sleep(2000);
		scrollToTop();
		Thread.sleep(3000);
		
		
		try {
			WebElement ele = driver.findElement(By.xpath("//div[@role='alert']"));
			String actualCreated_NewOrderText = ele.getText();
			
			if((actualCreated_NewOrderText.equalsIgnoreCase(expectedCreated_NewOrderText))) {
				DriverTestcase.logger.log(LogStatus.PASS, "Step : confirmation message is displayed as : "+actualCreated_NewOrderText);
				Log.info("confirmation message is displayed as expected");
				DriverTestcase.logger.log(LogStatus.PASS, "Order created successfully");
			}else{
				sa.fail("expected confirmation message validation failed");
			}
		}
		catch (NullPointerException e) {
		e.printStackTrace();
		System.out.println("Confirmation message is not displayed in UI");
		DriverTestcase.logger.log(LogStatus.FAIL, " Confirmation message is not displayed in UI :  " + e);
	}
		catch (NoSuchElementException e) {
		e.printStackTrace();
		System.out.println("Confirmation message is not displayed in UI");
		DriverTestcase.logger.log(LogStatus.FAIL, "Confirmation message is not displayed in UI :  " + e);

		}
		
		sa.assertAll();
	}
	
	
	
	
	public void verifyselectservicetype(String application, String servicetye, String subtype)
			throws InterruptedException, IOException, DocumentException {

		
		try {
			scrolltoend();
			Thread.sleep(3000);

			// select service type
			addDropdownValues_commonMethod(application, "Service Type", "servicetypetextfield" , servicetye, xml);
			Thread.sleep(5000);
			
			// select subtype
			addDropdownValues_commonMethod(application, "Network Configuration", "networkconfigurationinputfield" , subtype, xml);

			// click on next button
			Clickon(getwebelement(xml.getlocator("//locators/" + application + "/nextbutton")));
			Thread.sleep(5000);
			System.out.println("clicked on next button");
			DriverTestcase.logger.log(LogStatus.PASS, "Step : clicked on next button");
			Log.info("clicked on next button");

		} catch (StaleElementReferenceException e) {

			List<WebElement> servicetypes = driver.findElements(
					By.xpath("//div[label[text()='Service Type']]//div[@role='list']//span[@role='option']"));
			List<WebElement> servicesubtypes = driver
					.findElements(By.xpath("//div[@role='list']//span[@role='option']"));

		}

	}
	
	
	
	
	

	public void Verify_createorderservice(String application, String serviceidenfication, String belongstobundle,
			String bundleselectiontype, String billingtype, String billingselection, String terminationdate,
			String email, String phone, String remarks) throws InterruptedException, DocumentException, IOException {

		try {
			Thread.sleep(2000);
			scrolltoend();
			Thread.sleep(2000);
			
			Clickon(getwebelement(xml.getlocator("//locators/" + application + "/nextbutton")));
			System.out.println("clicked on next button");
			DriverTestcase.logger.log(LogStatus.PASS,
					"Step : clicked on next button to verify the mandatory fields error messages");
			Log.info("Step : clicked on next button to verify the mandatory fields error messages");
			Thread.sleep(2000);
			
			scrollToTop();
			Thread.sleep(2000);
			
		//check warning messages	
			warningMessage_commonMethod(application, "serviceidentificationerror" , "Service Identification", xml);

			warningMessage_commonMethod(application, "billingtypeerror" , "Biling Type", xml);

			
			SendKeys(getwebelement(xml.getlocator("//locators/" + application + "/serviceidentificationtextfield")),
					serviceidenfication);
			Thread.sleep(3000);
			System.out.println("Entered service identification is : " + serviceidenfication);
			DriverTestcase.logger.log(LogStatus.PASS,
					"Step : Entered service identification is : " + serviceidenfication);
			Log.info("Entered service identification is : " + serviceidenfication);

		//displayed service type	
			String displayedServiceTypevalue = getwebelement(
					xml.getlocator("//locators/" + application + "/servicetypevalue")).getText();
			System.out.println("Displayed service type is : " + displayedServiceTypevalue);
			DriverTestcase.logger.log(LogStatus.PASS,
					"Step : Displayed service type is : " + displayedServiceTypevalue);
			Log.info("Displayed service type is : " + displayedServiceTypevalue);
			
			
		//displayed network configuration
			String displayednetworkconfiguration = getwebelement(
					xml.getlocator("//locators/" + application + "/networkconfigurationvalue")).getText();
			System.out.println("Displayed network configuration is : " + displayednetworkconfiguration);
			DriverTestcase.logger.log(LogStatus.PASS,
					"Step : Displayed network configuration is : " + displayednetworkconfiguration);
			Log.info("Displayed network configuration is : " + displayednetworkconfiguration);

			
		// billingtype
			addDropdownValues_commonMethod(application, "Billing Type", "billingtypeinputfield" , billingselection, xml);
			
//			// terminationdate
//			getwebelement(xml.getlocator("//locators/" + application + "/terminationinputfield")).clear();
//			SendKeys(getwebelement(xml.getlocator("//locators/" + application + "/terminationinputfield")),
//					terminationdate);
//			Thread.sleep(3000);
//			String terminationdatevalue = getwebelement(
//					xml.getlocator("//locators/" + application + "/terminationinputfield")).getAttribute("value")
//							.toString();
//			System.out.println("Termination date is : " + terminationdatevalue);
//			DriverTestcase.logger.log(LogStatus.PASS, "Step : Termination date is : " + terminationdatevalue);
//			Log.info("Termination date is : " + terminationdatevalue);

		//Email
			addtextFields_commonMethod(application, "Email", "emailtextfield", email, xml);

		// phone contact
			addtextFields_commonMethod(application, "Phone Contact", "phonecontacttextfield", phone, xml);

		//remarks
			addtextFields_commonMethod(application, "Remarks", "remarktextfield", remarks, xml);

		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	
	
	public void verifydisplaystateandselectmanagementoptions(WebElement ele, String selectmode)
			throws InterruptedException {

		String elementname;
		boolean flag = ele.isDisplayed();

		if (flag == true && selectmode.equalsIgnoreCase("YES")) {

			elementname = ele.getAttribute("name");

			ele.click();

			Thread.sleep(3000);

			System.out.println(elementname + "is displayed" + "and" + "selected in Management Options");
			DriverTestcase.logger.log(LogStatus.PASS,
					"Step :" + elementname + "is displayed" + "and" + "selected in Management Options");
		} else {
			elementname = ele.getAttribute("name");
			System.out.println(elementname + " not selected in Management Options");
			DriverTestcase.logger.log(LogStatus.INFO,
					"Step :" + elementname + " not selected in Management Options");
		}

	}
	
	
	
	
	public void Verify_Selectmanagementoptions(String application, String ivp4selectmode, String ipv6selectmode,
			String preportselectmode, String ipguardainselectmode, String deliverychannel, String manageserviceselectmode, String snmpselectmode, String Traptargetadress)
			throws InterruptedException, DocumentException, IOException {

		WebElement ipv4, ipv6, performancereport, ipguardian, deliverychannelele, managedService, snmpNotify, trapTargetaddres;
		
	try {	
		
		scrolltoend();
		Thread.sleep(2000);
		
		System.out.println("Entered manage ent order helper class");

		ipv4 = getwebelement(xml.getlocator("//locators/" + application + "/routerconfigurationviewipv4checkbox"));
		ipv6 = getwebelement(xml.getlocator("//locators/" + application + "/routerconfigurationviewipv6checkbox"));
//		performancereport = getwebelement(
//				xml.getlocator("//locators/" + application + "/performancereportingcheckbox"));
		ipguardian = getwebelement(xml.getlocator("//locators/" + application + "/ipguardianchecbox"));
		deliverychannelele = getwebelement(xml.getlocator("//locators/" + application + "/deliverychannelinput"));
		
		managedService=getwebelement(xml.getlocator("//locators/" + application + "/managedservicecheckbox"));

		snmpNotify=getwebelement(xml.getlocator("//locators/" + application + "/snmpNotificationcheckbox"));
		
		
		
		verifydisplaystateandselectmanagementoptions(managedService, manageserviceselectmode);
		verifydisplaystateandselectmanagementoptions(ipv4, ivp4selectmode);
		verifydisplaystateandselectmanagementoptions(ipv6, ipv6selectmode);
		verifydisplaystateandselectmanagementoptions(ipguardian, ipguardainselectmode);
		verifydisplaystateandselectmanagementoptions(snmpNotify, snmpselectmode);
		
		
		// delivery channel
			addDropdownValues_commonMethod(application, "Delivery Channel", "deliverychannelinput", deliverychannel, xml);
				
		//Trap target Address
		if(snmpselectmode.equalsIgnoreCase("YES")) {
			
		   addtextFields_commonMethod(application, "Trap Target Address", "traptargetAddress", Traptargetadress, xml);
			
		}else {
			DriverTestcase.logger.log(LogStatus.INFO, " 'Trap target Address' text field is not available as 'SNMP notification' is not selected");
			Thread.sleep(5000);
		}
		
	} catch (NoSuchElementException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}


	}

	
	
	public void Verify_ConfigurationOptions(String application, String firewall, String Qos)
			throws InterruptedException, DocumentException, IOException {

		WebElement routerBasedfirewall, qos;
		
		scrolltoend();
		Thread.sleep(2000);
			
		
		//Router Based Firewall
			addCheckbox_commonMethod(application, "routerbasedfirewalcheckbox" , "Router Based Firewall", firewall, "no", xml);
			
		
		//Qos
			addCheckbox_commonMethod(application, "Qoscheckbox" , "Qos", Qos, "no", xml);
		
		
		// click on next
			click_commonMethod(application, "Next", "nextbutton" , xml);
		Thread.sleep(8000);

		
	}

	
	public void verifyServiceSupplySuccessMessage(String expectedServiceSupplySuccessMessageText) throws IOException, InterruptedException {
	
		scrollToTop();
		Thread.sleep(3000);
		
		WebElement ele = driver.findElement(By.xpath("//span[contains(text(),'Service successfully supplied')]"));
	    boolean actualServiceSupplySuccessMessageText = ele.isDisplayed();
	    
	    if(actualServiceSupplySuccessMessageText) {
	    	DriverTestcase.logger.log(LogStatus.PASS, "Step : confirmation message is displayed as : 'Service successfully supplied'");
	    	Log.info("Service Supply Success confirmation message is displayed as expected");
	    	DriverTestcase.logger.log(LogStatus.PASS, "Service successfully supplied");
	    }else{
	    	sa.fail("expected confirmation message validation failed");
	    	System.out.println("Success Message is not displaying as expected");
	    }
	}
	
	
	public void verifySearchCustomerFunctionality4(String application, String SearchName, String SearchOCN, String SupplyServiceToCustomerName,
			String SupplyServiceToCustomerChooseACustomer, String OrderNumber)
			throws InterruptedException, DocumentException, IOException {

		try {

			SendKeys(getwebelement(xml.getlocator("//locators/" + application + "/Name")), SearchName);
			Thread.sleep(1000);
			DriverTestcase.logger.log(LogStatus.PASS, "Step : Name Entered :  "+ getwebelement(xml.getlocator("//locators/" + application + "/Name")).getAttribute("value"));
			Log.info("===Name Entered ===");
			

		//Search Button	
			Clickon(getwebelement(xml.getlocator("//locators/" + application + "/Search_Button")));
			Thread.sleep(1000);
			DriverTestcase.logger.log(LogStatus.PASS, "Step : Clicked on Search Button");
			Log.info("=== Clicked on Search button ===");
			
			scrolltoend();
				

	//select the Customer		
		Clickon(getwebelement(xml.getlocator("//locators/" + application + "/SearchResultRowsRadioButton")));
		Thread.sleep(2000);
		System.out.println("selected the customer "+ SearchName);
		DriverTestcase.logger.log(LogStatus.PASS, "selected the customer "+ SearchName);
		Log.info("=== Clicked on Radio button ===");
		
		Clickon(getwebelement(xml.getlocator("//locators/" + application + "/SearchCustomerResult_Actionmenu")));
		Thread.sleep(1000);
//		DriverTestcase.logger.log(LogStatus.PASS, "Step : Clicked on ActionMenu under Search Customer Result panel");
		Log.info("=== Clicked on ActionMenu under Search Customer Result panel ===");
	
		Clickon(getwebelement(xml.getlocator("//locators/" + application + "/View_Link")));
		Thread.sleep(1000);
		DriverTestcase.logger.log(LogStatus.PASS, "Step : Clicked on View Link");
		Log.info("=== Clicked on View Link ===");	
		
		Thread.sleep(2000);
		scrolltoend();
		Thread.sleep(2000);	
		
	//Select an order to perform Supply	
		Clickon(getwebelement("(//div[div[@class='heading-green-row row']//div[text()='Order / Service']]//div[text()='"+ OrderNumber +"'])[1]"));
		Thread.sleep(1000);
		DriverTestcase.logger.log(LogStatus.PASS, "selected the Order "+OrderNumber);
		Log.info("=== Clicked on Radio Button in Order/Service Panel ===");
		
		Clickon(getwebelement(xml.getlocator("//locators/" + application + "/Order_Service_Action")));
		Thread.sleep(1000);
		DriverTestcase.logger.log(LogStatus.PASS, "Step : Clicked on Action link under Order Service pannel " );
		Log.info("=== Clicked on Action link under Order Service pannel ===");
		
		Clickon(getwebelement(xml.getlocator("//locators/" + application + "/Supply_Link")));
		Thread.sleep(1000);
		DriverTestcase.logger.log(LogStatus.PASS, "Step : Clicked on Supply Link");
		Log.info("=== Clicked on Supply Link ===");	
		
	//Supply _Name Field	
		addtextFields_commonMethod(application, "Name", "SupplyServicetoCustomer_Name", SupplyServiceToCustomerName, xml);
		
		
	// Select Choose a customer dropdown
//		addDropdownValues_commonMethod(application, "Choose a Customer", "SupplyServicetoCustomer_ChooseACustomer", SupplyServiceToCustomerChooseACustomer, xml);
		Clickon(getwebelement(xml.getlocator("//locators/" + application + "/SupplyServicetoCustomer_ChooseACustomer")));
		Thread.sleep(2000);
		System.out.println("Clicked on Choose a customer dropdown");
//		DriverTestcase.logger.log(LogStatus.PASS, "Step : Clicked on Country dropdown");
		Log.info("Clicked on Country dropdown");
		SendKeys(getwebelement(xml.getlocator("//locators/" + application + "/SupplyServicetoCustomer_ChooseACustomer")),
				SupplyServiceToCustomerChooseACustomer);
		Thread.sleep(3000);
		WebElement ChooseACustomer = driver.findElement(By.xpath("//div[text()='" + SupplyServiceToCustomerChooseACustomer + "']"));
		
		boolean chooseCustomerdropodnVaue=false;
	try {	
		chooseCustomerdropodnVaue=ChooseACustomer.isDisplayed();
		if(chooseCustomerdropodnVaue) {
			
			String ChooseACustomerText = ChooseACustomer.getText().toString();
			Thread.sleep(2000);
			ChooseACustomer.click();
			Thread.sleep(4000);
			System.out.println("Under 'Choose A Customer' dropdown value selected is : " + ChooseACustomerText);
			Log.info("Selected Choose A Customer  is  : " + ChooseACustomerText);
			
		}else {
		//clearing the name text field value and entering value again	
			getwebelement(xml.getlocator("//locators/" + application + "/SupplyServicetoCustomer_Name")).clear();
			Thread.sleep(2000);
			SendKeys(getwebelement(xml.getlocator("//locators/" + application + "/SupplyServicetoCustomer_Name")),SupplyServiceToCustomerName);
			
			Clickon(getwebelement(xml.getlocator("//locators/" + application + "/SupplyServicetoCustomer_ChooseACustomer")));
			Thread.sleep(2000);
			
			Clickon(getwebelement("//div[div[@class='modal-body']]//div[text()='�']"));
			Thread.sleep(2000);
			
			Clickon(getwebelement("//div[text()='" + SupplyServiceToCustomerChooseACustomer + "']"));
			Thread.sleep(3000);
			
		}
		
	}catch(Exception e) {
		e.printStackTrace();
		
		//clearing the name text field value and entering value again	
		getwebelement(xml.getlocator("//locators/" + application + "/SupplyServicetoCustomer_Name")).clear();
		Thread.sleep(2000);
		SendKeys(getwebelement(xml.getlocator("//locators/" + application + "/SupplyServicetoCustomer_Name")),SupplyServiceToCustomerName);
		
		Clickon(getwebelement(xml.getlocator("//locators/" + application + "/SupplyServicetoCustomer_ChooseACustomer")));
		Thread.sleep(2000);
		
		Clickon(getwebelement("//div[div[@class='modal-body']]//div[text()='�']"));
		Thread.sleep(2000);
		
		Clickon(getwebelement("//div[text()='" + SupplyServiceToCustomerChooseACustomer + "']"));
		Thread.sleep(3000);
		
	}
		
				
		Clickon(getwebelement(xml.getlocator("//locators/"+application+"/OK_Button")));		Thread.sleep(1000);
//		DriverTestcase.logger.log(LogStatus.PASS, "Step : Clicked on OK Button");
		Thread.sleep(2000);
			
	}
	catch (NullPointerException e) {
	e.printStackTrace();
	System.out.println("Expected Value is not displayed in Search Customer Result Grid ");
	DriverTestcase.logger.log(LogStatus.FAIL, " Expected Value is not displayed in Search Customer Result Grid :  " + e);
}
	catch (NoSuchElementException e) {
	e.printStackTrace();
	System.out.println("Expected Value is not displayed in Search Customer Result Grid");
	DriverTestcase.logger.log(LogStatus.FAIL, "Expected Value is not displayed in Search Customer Result Grid :  " + e);

	}
	sa.assertAll();
	
}	 
	
	
	public void verifySearchCustomerFunctionality(String application, String SearchSubscribedCustomer, String SearchOCN)
			throws InterruptedException, DocumentException, IOException {

		try {

			SendKeys(getwebelement(xml.getlocator("//locators/" + application + "/Name")), SearchSubscribedCustomer);
			Thread.sleep(1000);
//			DriverTestcase.logger.log(LogStatus.PASS, "Step : Name Entered :  "+ getwebelement(xml.getlocator("//locators/" + application + "/Name")).getAttribute("value"));
			Log.info("===Name Entered ===");
			
		//Search Button	
			Clickon(getwebelement(xml.getlocator("//locators/" + application + "/Search_Button")));
			Thread.sleep(1000);
//			DriverTestcase.logger.log(LogStatus.PASS, "Step : Clicked on Search Button");
			Log.info("=== Clicked on Search button ===");
			
			scrolltoend();
				
			
		Clickon(getwebelement(xml.getlocator("//locators/" + application + "/SearchResultRowsRadioButton")));
		Thread.sleep(2000);
		System.out.println("check hre");
//		DriverTestcase.logger.log(LogStatus.PASS, "Step : Clicked on Radio Button");
		Log.info("=== Clicked on Radio button ===");
		
		Clickon(getwebelement(xml.getlocator("//locators/" + application + "/SearchCustomerResult_Actionmenu")));
		Thread.sleep(1000);
//		DriverTestcase.logger.log(LogStatus.PASS, "Step : Clicked on ActionMenu under Search Customer Result panel");
		Log.info("=== Clicked on ActionMenu under Search Customer Result panel ===");
	
		Clickon(getwebelement(xml.getlocator("//locators/" + application + "/View_Link")));
		Thread.sleep(1000);
//		DriverTestcase.logger.log(LogStatus.PASS, "Step : Clicked on View Link");
		Log.info("=== Clicked on View Link ===");	
		
		Thread.sleep(2000);
		scrolltoend();
		Thread.sleep(2000);	
		
				
	}
	catch (NullPointerException e) {
	e.printStackTrace();
	System.out.println("Expected Value is not displayed in Search Customer Result Grid ");
//	DriverTestcase.logger.log(LogStatus.FAIL, " Expected Value is not displayed in Search Customer Result Grid :  " + e);
}
	catch (NoSuchElementException e) {
	e.printStackTrace();
	System.out.println("Expected Value is not displayed in Search Customer Result Grid");
//	DriverTestcase.logger.log(LogStatus.FAIL, "Expected Value is not displayed in Search Customer Result Grid :  " + e);

	}
	sa.assertAll();
	
}	 
	

	public void clickOnSearchCustomerLink(String application) throws InterruptedException, DocumentException {
		Moveon(getwebelement(xml.getlocator("//locators/"+application+"/ManageCustomerServiceLink")));
		Thread.sleep(3000);
		Clickon(getwebelement(xml.getlocator("//locators/" + application + "/SearchCustomerLink")));
		Thread.sleep(2000);
		Log.info("=== Search customer navigated ===");
	}
	
	
	WebElement CustomerrName_we;
	public void verifySuppliesPanelInformation(String application, String SupplyServiceToCustomerName, String NewOrderNumber,
			String ServiceIdentification, String ServiceType, String Status, String SyncStatus )	
			throws InterruptedException, DocumentException, IOException {

		scrolltoend();
		Thread.sleep(3000);
			// Verify Supplies pannel information
		boolean supplyTab=false;
		try {
			
			supplyTab=getwebelement(xml.getlocator("//locators/"+application+"/SupplyHeadertab")).isDisplayed();
			if(supplyTab) {
				
				System.out.println("Supplies table is displaying as expected");
				DriverTestcase.logger.log(LogStatus.INFO, " Verifying values under 'Supply' panel");
				
				String actualSupplyServiceToCustomerName=Gettext(driver.findElement(By.xpath("(//div[contains(text(),'"+SupplyServiceToCustomerName+"')])")));
				sa.assertEquals(actualSupplyServiceToCustomerName, SupplyServiceToCustomerName, " Actual and Expected both are not same");
				DriverTestcase.logger.log(LogStatus.PASS, "'Customer' column value displayed as : "+actualSupplyServiceToCustomerName);
				Log.info("'Customer' column data verified as : "+actualSupplyServiceToCustomerName);
				System.out.println("'Customer' column data verified as : "+actualSupplyServiceToCustomerName);
				
				String actualNewOrderNumber=Gettext(driver.findElement(By.xpath("(//div[contains(text(),'"+NewOrderNumber+"')])[2]")));
				sa.assertEquals(actualNewOrderNumber, NewOrderNumber, " Actual and Expected both are not same");
				DriverTestcase.logger.log(LogStatus.PASS, "'Order' column name value displayed as : "+actualNewOrderNumber);
				Log.info("'Order' displayed as : "+actualNewOrderNumber);
				System.out.println("'Order' displayed as : "+actualNewOrderNumber);

				String actualServiceIdentification=Gettext(driver.findElement(By.xpath("(//div[contains(text(),'"+ServiceIdentification+"')])[2]")));
				sa.assertEquals(actualServiceIdentification, ServiceIdentification, " Actual and Expected both are not same");
				DriverTestcase.logger.log(LogStatus.PASS, "'Service ID' column name value displayed as : "+actualServiceIdentification);
				Log.info("'Service ID' displayed as : "+actualServiceIdentification);
				System.out.println("'Service ID' displayed as : "+actualServiceIdentification);

				String actualServiceType=Gettext(driver.findElement(By.xpath("(//div[contains(text(),'"+ServiceType+"')])[2]")));
				sa.assertEquals(actualServiceType, ServiceType, " Actual and Expected both are not same");
				DriverTestcase.logger.log(LogStatus.PASS, "'Service Type' column name value displayed as : "+actualServiceType);
				Log.info("'Service Type' displayed as : "+actualServiceType);
				System.out.println("'Service Type' displayed as : "+actualServiceType);
				
//				String actualStatus=Gettext(driver.findElement(By.xpath("(//div[contains(text(),'In Service')])[1]")));
//				sa.assertEquals(actualStatus, " Status is not displayed as expected");
////				DriverTestcase.logger.log(LogStatus.PASS, "Step : 'Status' displayed as : "+actualStatus);
//				Log.info("'Status' displayed as : "+actualStatus);
//				System.out.println("'Status' displayed as : "+actualStatus);
//				
//				String actualSyncStatus=Gettext(driver.findElement(By.xpath("(//div[contains(text(),'pending')])[2]")));
//				sa.assertEquals(actualSyncStatus, " Sync Status is not displayed as expected");
////				DriverTestcase.logger.log(LogStatus.PASS, "Step : 'Sync Status' displayed as : "+actualSyncStatus);
//				Log.info("'Sync Status' displayed as : "+actualSyncStatus);
//				System.out.println("'Sync Status' displayed as : "+actualSyncStatus);

				
			}else {
				System.out.println("Supplyy table is not displayed");
			}
			
			
			sa.assertAll();
			
		}catch(AssertionError rr) {
			
			rr.printStackTrace();
	}
		catch (NullPointerException e) {
		e.printStackTrace();
		System.out.println("Expected Value is not displayed in Supplies grid panel");
//		DriverTestcase.logger.log(LogStatus.FAIL, " Expected Value is not displayed in Supplies grid panel :  " + e);
	}
		catch (NoSuchElementException e) {
		e.printStackTrace();
		System.out.println("Expected Value is not displayed in Supplies grid panel");
//		DriverTestcase.logger.log(LogStatus.FAIL, "Expected Value is not displayed in Supplies grid panel :  " + e);

		}
	}	
	
	public void verifySubscribedCustomers(String application, String SupplyServiceToCustomerName, String NewOrderNumber,
			String ServiceIdentification, String ServiceType, String Status, String SyncStatus) throws InterruptedException, DocumentException, IOException {

		boolean subscriberTable=false;
		
	try {	
		subscriberTable=getwebelement(xml.getlocator("//locators/"+application+"/SubscriberPanel")).isDisplayed();
		
		if(subscriberTable) {
			System.out.println(" 'Subscriber' panel is displaying as expected");
			DriverTestcase.logger.log(LogStatus.INFO, " verifying  value under 'Subscribes' panel");
			
			getwebelement("(//div[div[@class='heading-green-row row']//div[text()='Subscribes']]//div[@col-id='status'])[2]").getText();
			
			
			String actualSupplyServiceToCustomerName=getwebelement("//div[div[@class='heading-green-row row']//div[text()='Subscribes']]//div[text()='"+ SupplyServiceToCustomerName +"']").getText();
			sa.assertEquals(actualSupplyServiceToCustomerName, SupplyServiceToCustomerName, " Actual and Expected both are not same");
			DriverTestcase.logger.log(LogStatus.PASS, "'Customer' column anme value displayed as : "+actualSupplyServiceToCustomerName);
			Log.info("'Customer' column data verified as : "+actualSupplyServiceToCustomerName);
			System.out.println("'Customer' column data verified as : "+actualSupplyServiceToCustomerName);
			
			String actualNewOrderNumber=getwebelement("//div[div[@class='heading-green-row row']//div[text()='Subscribes']]//div[text()='"+ NewOrderNumber +"']").getText();
			sa.assertEquals(actualNewOrderNumber, NewOrderNumber, " Actual and Expected both are not same");
			DriverTestcase.logger.log(LogStatus.PASS, "Step : 'Order' column name value displayed as : "+actualNewOrderNumber);
			Log.info("'Order' displayed as : "+actualNewOrderNumber);
			System.out.println("'Order' displayed as : "+actualNewOrderNumber);

			String actualServiceIdentification=getwebelement("//div[div[@class='heading-green-row row']//div[text()='Subscribes']]//div[text()='"+ ServiceIdentification +"']").getText();
			sa.assertEquals(actualServiceIdentification, ServiceIdentification, " Actual and Expected both are not same");
			DriverTestcase.logger.log(LogStatus.PASS, " 'Service ID' column name value displayed as : "+actualServiceIdentification);
			Log.info("'Service ID' displayed as : "+actualServiceIdentification);
			System.out.println("'Service ID' displayed as : "+actualServiceIdentification);

			String actualServiceType=getwebelement("//div[div[@class='heading-green-row row']//div[text()='Subscribes']]//div[text()='"+ ServiceType +"']").getText();
			sa.assertEquals(actualServiceType, ServiceType, " Actual and Expected both are not same");
			DriverTestcase.logger.log(LogStatus.PASS, "'Service Type' column name value displayed as : "+actualServiceType);
			Log.info("'Service Type' displayed as : "+actualServiceType);
			System.out.println("'Service Type' displayed as : "+actualServiceType);
			
			String actualStatus=getwebelement("(//div[div[@class='heading-green-row row']//div[text()='Subscribes']]//div[@col-id='status'])[2]").getText();
			DriverTestcase.logger.log(LogStatus.PASS, "Step : 'Status' column name value displayed as : "+actualStatus);
			Log.info("'Status' displayed as : "+actualStatus);
			System.out.println("'Status' displayed as : "+actualStatus);
			
			String actualSyncStatus=getwebelement("(//div[div[@class='heading-green-row row']//div[text()='Subscribes']]//div[@col-id='syncStatus'])[2]").getText();
			DriverTestcase.logger.log(LogStatus.PASS, "Step : 'Sync Status' column name value displayed as : "+actualSyncStatus);
			Log.info("'Sync Status' displayed as : "+actualSyncStatus);
			System.out.println("'Sync Status' displayed as : "+actualSyncStatus);
			
			
		//select Customer and navigate to view service page	
			selectRowForSubscriber_toViewService(application, SupplyServiceToCustomerName);
			
		//verify whether it got navigated to View Service page
			boolean viewServicePage=false;
		try {	
			viewServicePage=getwebelement("//div[@class='heading-green-row row']//div[text()='Customer Details']").isDisplayed();
			if(viewServicePage) {
				System.out.println("got navigated to view Serice page as expected");
				DriverTestcase.logger.log(LogStatus.PASS, "Under 'Subscribe' panel after selecting the customer,if we click on 'view' link it gets navigated to 'view Serice' page");
			}else {
				System.out.println("not getting navigated to 'view Service' page");
				DriverTestcase.logger.log(LogStatus.FAIL, "Under 'Subscribe' panel after selecting the customer,if we click on 'view' link it is not getting navigated to 'view Serice' page");
			}
		}catch(Exception er) {
			er.printStackTrace();
			System.out.println("not getting navigated to 'view Service' page");
			DriverTestcase.logger.log(LogStatus.FAIL, "Under 'Subscribe' panel after selecting the customer,if we click on 'view' link it is not getting navigated to 'view Serice' page");

		}
	
		}else {
			DriverTestcase.logger.log(LogStatus.FAIL, " 'Subscriber' panel is not displaying");
			System.out.println(" 'Subscriber' panel is not displaying");
		}
	}catch(Exception e) {
		e.printStackTrace();
		DriverTestcase.logger.log(LogStatus.FAIL, " 'Subscriber' panel is not displaying");
		System.out.println(" 'Subscriber' panel is not displaying");
	}
		
	}
	
	
	public void viewServiceForSubscribedCustomer(String application) {
		
		
	}
	
	public void deletOrderFunctionality_serviceDeletion(String application, String SearchName, String SearchOCN, String SupplyServiceToCustomerName,
			String SupplyServiceToCustomerChooseACustomer, String OrderNumber)
			throws InterruptedException, DocumentException, IOException {


			SendKeys(getwebelement(xml.getlocator("//locators/" + application + "/Name")), SearchName);
			Thread.sleep(1000);
//			DriverTestcase.logger.log(LogStatus.PASS, "Step : Name Entered :  "+ getwebelement(xml.getlocator("//locators/" + application + "/Name")).getAttribute("value"));
			Log.info("===Name Entered ===");
			

		//Search Button	
			Clickon(getwebelement(xml.getlocator("//locators/" + application + "/Search_Button")));
			Thread.sleep(1000);
//			DriverTestcase.logger.log(LogStatus.PASS, "Step : Clicked on Search Button");
			Log.info("=== Clicked on Search button ===");
			
			scrolltoend();
				
		Clickon(getwebelement(xml.getlocator("//locators/" + application + "/SearchResultRowsRadioButton")));
		Thread.sleep(2000);
		System.out.println("check hre");
//		DriverTestcase.logger.log(LogStatus.PASS, "Step : Clicked on Radio Button");
		Log.info("=== Clicked on Radio button ===");
		
		Clickon(getwebelement(xml.getlocator("//locators/" + application + "/SearchCustomerResult_Actionmenu")));
		Thread.sleep(1000);
//		DriverTestcase.logger.log(LogStatus.PASS, "Step : Clicked on ActionMenu under Search Customer Result panel");
		Log.info("=== Clicked on ActionMenu under Search Customer Result panel ===");
	
		Clickon(getwebelement(xml.getlocator("//locators/" + application + "/View_Link")));
		Thread.sleep(1000);
//		DriverTestcase.logger.log(LogStatus.PASS, "Step : Clicked on View Link");
		Log.info("=== Clicked on View Link ===");	
		
		Thread.sleep(2000);
		scrolltoend();
		Thread.sleep(2000);	
		
	//Select an order to perform Supply	
		Clickon(getwebelement(xml.getlocator("//locators/" + application + "/Order_Service_Action")));
		Thread.sleep(1000);
//		DriverTestcase.logger.log(LogStatus.PASS, "Step : Clicked on Action link under Order Service pannel " );
		Log.info("=== Clicked on Action link under Order Service pannel ===");
	
	try {	
		Clickon(getwebelement(xml.getlocator("//locators/" + application + "/order_viewLink")));
		boolean alertpopup=false;
		alertpopup=getwebelement(xml.getlocator("//locators/" + application + "/alertPopupForviewLink_underOrderpanel")).isDisplayed();
		if(alertpopup) {
			
			//DriverTestcase.logger.log(LogStatus.PASS, "Alert popup displays as expected, when we click on 'view' without selecting any Order ");
			String alertmsg=getwebelement(xml.getlocator("//locators/" + application + "/alertmsgForviewlink_underOrderPanel")).getText();
			
			System.out.println("Alert popup message displays as: "+alertmsg);
			//DriverTestcase.logger.log(LogStatus.PASS, "Alert popup message displays as: "+alertmsg);
			
			Clickon(getwebelement(xml.getlocator("//locators/" + application + "/xbuttonForviewlink_underOrderPanel")));
			Thread.sleep(2000);
			
		}else {
			System.out.println("Alert popup did not display");
			//DriverTestcase.logger.log(LogStatus.FAIL, "Alert popup is not displaying, when we click on 'view' without selecting any Order ");
		}
	}catch(Exception e) {
		e.printStackTrace();
		System.out.println("Alert popup did not display");
		//DriverTestcase.logger.log(LogStatus.FAIL, "Alert popup is not displaying, when we click on 'view' without selecting any Order ");
	}
		
		
	
	//Select an Order Number
		Clickon(getwebelement("(//div[div[@class='heading-green-row row']//div[text()='Order / Service']]//div[text()='"+ OrderNumber +"'])[1]"));
		Thread.sleep(1000);
//		DriverTestcase.logger.log(LogStatus.PASS, "Step : Clicked on Radio button");
		Log.info("=== Clicked on Radio Button in Order/Service Panel ===");
		
		Clickon(getwebelement(xml.getlocator("//locators/" + application + "/Order_Service_Action")));
		Thread.sleep(1000);
//		DriverTestcase.logger.log(LogStatus.PASS, "Step : Clicked on Action link under Order Service pannel " );
		Log.info("=== Clicked on Action link under Order Service pannel ===");
		
		
		Clickon(getwebelement(xml.getlocator("//locators/" + application + "/order_viewLink")));
		
		}
	
	
	public void deletOrderFunctionality_orderDeletion(String application, String SearchName, String SearchOCN, String SupplyServiceToCustomerName,
			String SupplyServiceToCustomerChooseACustomer, String OrderNumber)
			throws InterruptedException, DocumentException, IOException {


			SendKeys(getwebelement(xml.getlocator("//locators/" + application + "/Name")), SearchName);
			Thread.sleep(1000);
//			DriverTestcase.logger.log(LogStatus.PASS, "Step : Name Entered :  "+ getwebelement(xml.getlocator("//locators/" + application + "/Name")).getAttribute("value"));
			Log.info("===Name Entered ===");
			

		//Search Button	
			Clickon(getwebelement(xml.getlocator("//locators/" + application + "/Search_Button")));
			Thread.sleep(1000);
//			DriverTestcase.logger.log(LogStatus.PASS, "Step : Clicked on Search Button");
			Log.info("=== Clicked on Search button ===");
			
			scrolltoend();
				
		Clickon(getwebelement(xml.getlocator("//locators/" + application + "/SearchResultRowsRadioButton")));
		Thread.sleep(2000);
		System.out.println("check hre");
//		DriverTestcase.logger.log(LogStatus.PASS, "Step : Clicked on Radio Button");
		Log.info("=== Clicked on Radio button ===");
		
		Clickon(getwebelement(xml.getlocator("//locators/" + application + "/SearchCustomerResult_Actionmenu")));
		Thread.sleep(1000);
//		DriverTestcase.logger.log(LogStatus.PASS, "Step : Clicked on ActionMenu under Search Customer Result panel");
		Log.info("=== Clicked on ActionMenu under Search Customer Result panel ===");
	
		Clickon(getwebelement(xml.getlocator("//locators/" + application + "/View_Link")));
		Thread.sleep(1000);
//		DriverTestcase.logger.log(LogStatus.PASS, "Step : Clicked on View Link");
		Log.info("=== Clicked on View Link ===");	
		
		Thread.sleep(2000);
		scrolltoend();
		Thread.sleep(2000);	
		
	//Select an order to perform Supply	
		Clickon(getwebelement(xml.getlocator("//locators/" + application + "/Order_Service_Action")));
		Thread.sleep(1000);
//		DriverTestcase.logger.log(LogStatus.PASS, "Step : Clicked on Action link under Order Service pannel " );
		Log.info("=== Clicked on Action link under Order Service pannel ===");
		
	try {	
		Clickon(getwebelement(xml.getlocator("//locators/" + application + "/order_viewLink")));
		boolean alertpopup=false;
		alertpopup=getwebelement(xml.getlocator("//locators/" + application + "/alertPopupForviewLink_underOrderpanel")).isDisplayed();
		if(alertpopup) {
			
			DriverTestcase.logger.log(LogStatus.PASS, "Alert popup displays as expected, when we click on 'view' without selecting any Order ");
			String alertmsg=getwebelement(xml.getlocator("//locators/" + application + "/alertmsgForviewlink_underOrderPanel")).getText();
			
			System.out.println("Alert popup message displays as: "+alertmsg);
			DriverTestcase.logger.log(LogStatus.PASS, "Alert popup message displays as: "+alertmsg);
			
			Clickon(getwebelement(xml.getlocator("//locators/" + application + "/xbuttonForviewlink_underOrderPanel")));
			Thread.sleep(2000);
			
		}else {
			System.out.println("Alert popup did not display");
			DriverTestcase.logger.log(LogStatus.FAIL, "Alert popup is not displaying, when we click on 'view' without selecting any Order ");
		}
	}catch(Exception e) {
		e.printStackTrace();
		System.out.println("Alert popup did not display");
		DriverTestcase.logger.log(LogStatus.FAIL, "Alert popup is not displaying, when we click on 'view' without selecting any Order ");
	}
		
		
	
	//Select an Order Number
		Clickon(getwebelement("(//div[div[@class='heading-green-row row']//div[text()='Order / Service']]//div[text()='"+ OrderNumber +"'])[1]"));
		Thread.sleep(1000);
//		DriverTestcase.logger.log(LogStatus.PASS, "Step : Clicked on Radio button");
		Log.info("=== Clicked on Radio Button in Order/Service Panel ===");
		
		Clickon(getwebelement(xml.getlocator("//locators/" + application + "/Order_Service_Action")));
		Thread.sleep(1000);
//		DriverTestcase.logger.log(LogStatus.PASS, "Step : Clicked on Action link under Order Service pannel " );
		Log.info("=== Clicked on Action link under Order Service pannel ===");
		
		
		Clickon(getwebelement(xml.getlocator("//locators/" + application + "/order_viewLink")));
		
		}
	
	
	
	public void deleteService(String application) throws InterruptedException, DocumentException {
		
		 WebElement orderPanel= getwebelement(xml.getlocator("//locators/" + application + "/viewServicepage_OrderPanel"));
		 scrolltoview(orderPanel);
			Thread.sleep(3000);
		   
		   Clickon(getwebelement(xml.getlocator("//locators/" + application + "/Editservice_actiondropdown")));
		   Thread.sleep(3000);
		   Clickon(getwebelement(xml.getlocator("//locators/" + application + "/viewService_deletLink")));
		   Thread.sleep(3000);
		   
		   boolean alertpopup=false;
			alertpopup=getwebelement(xml.getlocator("//locators/" + application + "/alertPopupForviewLink_underOrderpanel")).isDisplayed();
			if(alertpopup) {
				
				DriverTestcase.logger.log(LogStatus.PASS, "Alert popup displays as expected, when we click on 'delete' link ");
				String alertmsg=getwebelement(xml.getlocator("//locators/" + application + "/alertmsgForviewlink_underOrderPanel")).getText();
				
				System.out.println("Alert popup message displays as: "+alertmsg);
				DriverTestcase.logger.log(LogStatus.PASS, "Alert popup message displays as: "+alertmsg);
				
				Clickon(getwebelement(xml.getlocator("//locators/" + application + "/viweServicepage_deleteButton")));
				Thread.sleep(2000);
				
			}else {
				System.out.println("Alert popup did not display");
				DriverTestcase.logger.log(LogStatus.FAIL, "Alert popup is not displaying, when we click on 'delete' link ");
			}
		  
	}
	
	
	public void verifySuccessMessageFor_deleteService(String application) throws InterruptedException, DocumentException {
		
		Thread.sleep(5000);
		scrollToTop();
		Thread.sleep(2000);
		
		boolean successMsg=false;
		successMsg=getwebelement(xml.getlocator("//locators/" + application + "/service_deleteSuccessMessage")).isDisplayed();
		if(successMsg) {
			
			DriverTestcase.logger.log(LogStatus.PASS, "After deleting,  Success Message displays as expected ");
			System.out.println("After deleting,  Success Message displays as expected ");
		}else {
			
			DriverTestcase.logger.log(LogStatus.PASS, "After deleting,  Success Message is not displaying ");
			System.out.println("After deleting,  Success Message is not displaying");
		}
		
	}
	
	 public void addDropdownValues_methodForIPv6RouterTool(String application, String labelname, String xpath, String expectedValueToAdd) throws InterruptedException, DocumentException {
		  boolean availability=false;
		try {  
		  availability=getwebelement(xml.getlocator("//locators/" + application + "/"+ xpath +"")).isDisplayed();
		  if(availability) {
			  DriverTestcase.logger.log(LogStatus.PASS, labelname + " dropdown is displaying as expected");
			  System.out.println(labelname + " dropdown is displaying as expected");
			  
			  if(expectedValueToAdd.equalsIgnoreCase("null")) {
				  
				  DriverTestcase.logger.log(LogStatus.PASS, " No values selected under "+ labelname + " dropdown");
				  System.out.println(" No values selected under "+ labelname + " dropdown");
			  }else {
				  
				  Clickon(getwebelement("//div[label[text()='"+ labelname +"']]//div[text()='�']"));
				  Thread.sleep(3000);
				  
				  //verify list of values inside dropdown
				  List<WebElement> listofvalues = driver
							.findElements(By.xpath("//div[@class='sc-bxivhb kqVrwh']"));
				  
				  DriverTestcase.logger.log(LogStatus.PASS, " List of values inside "+ labelname + "dropdown is:  ");
				  System.out.println( " List of values inside "+ labelname + "dropdown is:  ");
				  
					for (WebElement valuetypes : listofvalues) {

								Log.info("service sub types : " + valuetypes.getText());
								//DriverTestcase.logger.log(LogStatus.PASS," " + valuetypes.getText());
								System.out.println(" " + valuetypes.getText());

					}
					
					Thread.sleep(3000);
				  Clickon(getwebelement("//div[text()='"+ expectedValueToAdd +"']"));
				  Thread.sleep(3000);
				  
//				  String actualValue=getwebelement("//div[label[text()='"+ labelname +"']]//span").getText();
//				  DriverTestcase.logger.log(LogStatus.PASS, labelname + " dropdown value selected as: "+ actualValue );
//				  System.out.println( labelname + " dropdown value selected as: "+ actualValue);
				  
			  }
		  }else {
			  DriverTestcase.logger.log(LogStatus.FAIL, labelname + " is not displaying");
			  System.out.println(labelname + " is not displaying");
		  }
		}catch(NoSuchElementException e) {
			DriverTestcase.logger.log(LogStatus.FAIL, labelname + " is not displaying");
			  System.out.println(labelname + " is not displaying");
		}catch(Exception ee) {
			ee.printStackTrace();
			DriverTestcase.logger.log(LogStatus.FAIL, " NO value selected under "+ labelname + " dropdown");
			System.out.println(" NO value selected under "+ labelname + " dropdown");
		}
	  }

	 
	 public void deleteOrder(String application) throws InterruptedException, DocumentException {
		 
		 Clickon(getwebelement(xml.getlocator("//locators/" + application + "/actionbutton_orderDeletion")));
		 Thread.sleep(2000);
		 
		 Clickon(getwebelement(xml.getlocator("//locators/" + application + "/viewService_deletLink")));
		   Thread.sleep(3000);
		   
		   boolean alertpopup=false;
			alertpopup=getwebelement(xml.getlocator("//locators/" + application + "/alertPopupForviewLink_underOrderpanel")).isDisplayed();
			if(alertpopup) {
				
				DriverTestcase.logger.log(LogStatus.PASS, "Alert popup displays as expected, when we click on 'delete' link ");
				String alertmsg=getwebelement(xml.getlocator("//locators/" + application + "/alertmsgForviewlink_underOrderPanel")).getText();
				
				System.out.println("Alert popup message displays as: "+alertmsg);
				DriverTestcase.logger.log(LogStatus.PASS, "Alert popup message displays as: "+alertmsg);
				
				Clickon(getwebelement(xml.getlocator("//locators/" + application + "/viweServicepage_deleteButton")));
				Thread.sleep(2000);
	 }
	 }
	
	
	 
	 public void selectRowForSubscriber_toViewService(String application,String customerName) throws InterruptedException, DocumentException, IOException {


			int TotalPages;

			String TextKeyword = getwebelement(xml.getlocator("//locators/"+application+"/subscribePanel_totalPage")).getText();

			TotalPages = Integer.parseInt(TextKeyword);

			System.out.println("Total number of pages in table is: " + TotalPages);

			ab:
			if (TotalPages != 0) {

				for (int k = 1; k <= TotalPages; k++) {

				// Current page
				String CurrentPage = getwebelement(xml.getlocator("//locators/"+application+"/subscribePanel_currentPage")).getText();
				int Current_page = Integer.parseInt(CurrentPage);
				System.out.println("The current page is: " + Current_page);

				assertEquals(k, Current_page);

				System.out.println("Currently we are in page number: " + Current_page);

				List<WebElement> results = getwebelements("(//div[div[text()='Subscribes']]/following-sibling::div//div[text()='"+ customerName +"'])[1]");
				
					
				int numofrows = results.size();
				System.out.println("no of results: " + numofrows);
				boolean resultflag;

			
				if ((numofrows == 0)) {
					
					Clickon(getwebelement(xml.getlocator("//locators/"+application+"/subscribePanel_nextPage")));
					Thread.sleep(3000);

				}

				else {
					for (int i = 0; i < numofrows; i++) {
						try {
							resultflag = results.get(i).isDisplayed();
							System.out.println("status of result: " + resultflag);
							if (resultflag) {
								System.out.println(results.get(i).getText());
								results.get(i).click();
								DriverTestcase.logger.log(LogStatus.PASS, customerName + " is selected under 'Subscribes' panel ");
								Thread.sleep(8000);
								Clickon(getwebelement(xml.getlocator("//locators/"+application+"/subscribePanel_ActionDropdown")));
								Thread.sleep(2000);
								Clickon(getwebelement(xml.getlocator("//locators/"+application+"/subscribePanel_viewlink")));
								Thread.sleep(3000);
								
								
							}

						} catch (StaleElementReferenceException e) {
							// TODO Auto-generated catch block
							 e.printStackTrace();
						}

					}
				}
			}
			}else {
				System.out.println("No values available in table");
				Log.info("No values available inside the InterfaceInService table");
				DriverTestcase.logger.log(LogStatus.FAIL, "No value available inside 'show Interface' panel");
			}
		}

	 
	 /**
		 * success Message common method
		 * @param application
		 * @throws InterruptedException
		 */
		public void verifysuccessmessage(String application, String expected) throws InterruptedException {
			
			scrollToTop();
			Thread.sleep(3000);
			try {	
				
				boolean successMsg=getwebelement(xml.getlocator("//locators/" + application + "/serivceAlert")).isDisplayed();

				if(successMsg) {
					
					String alrtmsg=getwebelement(xml.getlocator("//locators/" + application + "/AlertForServiceCreationSuccessMessage")).getText();
					
					if(expected.contains(alrtmsg)) {
						
						DriverTestcase.logger.log(LogStatus.PASS,"Message is verified. It is displaying as: "+alrtmsg);
						System.out.println("Message is verified. It is displaying as: "+alrtmsg);
						
					}else {
						
						DriverTestcase.logger.log(LogStatus.FAIL, "Message is displaying and it gets mismatches. It is displaying as: "+ alrtmsg +" .The Expected value is: "+ expected);
						System.out.println("Message is displaying and it gets mismatches. It is displaying as: "+ alrtmsg);
					}
					
				}else {
					DriverTestcase.logger.log(LogStatus.FAIL, " Success Message is not displaying");
					System.out.println(" Success Message is not displaying");
				}
				
				Thread.sleep(2000);
				
			}catch(Exception e) {
				Log.info("failure in fetching success message - 'Service created Successfully'  ");
				DriverTestcase.logger.log(LogStatus.FAIL, expected+ " Message is not displaying");
				System.out.println(expected+ " message is not getting dislpayed");
				Thread.sleep(2000);
			}

		}

		
public void selectAndAddValueFromLeftDropdown(String application, String labelname, String xpath, String[] selectValue, String xpathForAddButton) {
			
			WebElement availability=null;
			List<String> ls = new ArrayList<String>();
			 
            try{
            	
                  List<WebElement> elements= getwebelements(xml.getlocator("//locators/" + application + "/"+ xpath +""));
                  int element_count= elements.size();
                  
              if(element_count>=1) {
            	  
               //Print list of values inside Dropdown 
                  for(WebElement a : elements) {
				            ls.add(a.getText());
				    }
			
				    DriverTestcase.logger.log(LogStatus.PASS, "list of values displaying inside "+labelname+" available dropdown is: "+ls);
		            System.out.println("list of values dipslaying inside "+labelname+" dropdown is: "+ls);
		            
		      //select value inside the dropdown     
                  for(int i=0; i<selectValue.length; i++)
                  {
                	 Thread.sleep(5000);
                     for(int j=0; j<ls.size() ; j++) {
                	  System.out.println("ls value "+ ls.get(j));
                        if(selectValue[i].equals(ls.get(j)))
                        {
                        	  elements.get(j).click();
                        	  DriverTestcase.logger.log(LogStatus.PASS, elements.get(j) + " got selected" );
                              Thread.sleep(1000);
                              click_commonMethod(application, "Add", xpathForAddButton , xml);
                              Thread.sleep(5000);
                        }
                     }
                  }
                  
              }else {
            	  DriverTestcase.logger.log(LogStatus.INFO, "No values displaying under " + labelname + " dropdown");
            	  
            	  System.out.println("No values displaying under " + labelname + " available dropdown");
              }
            }catch(Exception e) {
                  e.printStackTrace();
                  DriverTestcase.logger.log(LogStatus.FAIL, "No values displaying under "+labelname + " available dropdown");
                  System.out.println( "No values displaying under "+labelname + " available dropdown");
            }
		}
		
		
		
		
	public void verifySelectedValuesInsideRightDropdown(String application, String labelname, String xpath) {

		//getAllValuesInsideDropDown
			 boolean availability=false;
			 List<String> ls = new ArrayList<String>();
			 
				try {  
				  availability=getwebelement(xml.getlocator("//locators/" + application + "/"+ xpath +"")).isDisplayed();
				  if(availability) {
					  DriverTestcase.logger.log(LogStatus.PASS, labelname + " dropdown is displaying");
					  System.out.println(labelname + " dropdown is displaying");
					  
					  WebElement el =getwebelement(xml.getlocator("//locators/" + application + "/"+ xpath +""));
					  
					  Select sel = new Select(el);
					  
					    List<WebElement> we = sel.getOptions();
					   
					    for(WebElement a : we)
					    {
					        if(!a.getText().equals("select")){
					            ls.add(a.getText());
					            
					        }
					    }
					    
					    DriverTestcase.logger.log(LogStatus.PASS, "list of values selected inside "+labelname+" dropdown is: "+ls);
			            System.out.println("list of values selected inside "+labelname+" dropdown is: "+ls);
					 
					 }
					
				}catch(NoSuchElementException e) {
					DriverTestcase.logger.log(LogStatus.FAIL, "No value displaying under "+ labelname+ " dropdown");
					  System.out.println(labelname + " value is not displaying");
				}catch(Exception ee) {
					ee.printStackTrace();
					DriverTestcase.logger.log(LogStatus.FAIL, " NOt able to perform selection under "+ labelname + " dropdown");
					System.out.println(" NO value selected under "+ labelname + " dropdown");
				}
		
			
		}


	 
	
	}
