package com.colt.qa.scripthelpers;

import static org.testng.Assert.assertEquals;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.dom4j.DocumentException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import com.colt.qa.driverlibrary.DriverHelper;
import com.colt.qa.driverlibrary.DriverTestcase;
import com.colt.qa.driverlibrary.Log;
import com.colt.qa.driverlibrary.XMLReader;
import com.colt.qa.reporter.ExtentTestManager;
import com.relevantcodes.extentreports.LogStatus;
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.CompareGenerator;


public class ImsNmbrTranslator_Helper extends DriverHelper{
	
	public ImsNmbrTranslator_Helper(WebDriver dr) {
		super(dr);
		// TODO Auto-generated constructor stub
	}
	
	WebElement ChooseCustomer_Select, Next_Button, CreateOrderService_Text, Wildcard, Search_Field, EmergencyAreaID_Text, OKbtn;
	XMLReader xml = new XMLReader("src\\com\\colt\\qa\\pagerepository\\Manage_Postcode.xml");

	boolean orderdopdown, serviceTypedropdown, modularmspCheckbox, autocreateservicecheckbox, interfacespeeddropdown,
			servicesubtypesdropdown, availablecircuitsdropdown, nextbutton, A_EndTechnolnogy, B_Endtechnolnogy;
	SoftAssert sa = new SoftAssert();


	
	public void navigateToManageCustomerServicePage() throws InterruptedException, DocumentException {
		Clickon(getwebelement(xml.getlocator("//locators/ManageCustomerServiceLink")));
		Thread.sleep(2000);
		Log.info("=== MCS page navigated ===");
		Thread.sleep(2000);
	}

	public void navigateToCreateOrderServicePage(String application) throws InterruptedException, DocumentException {

		navigateToManageCustomerServicePage();

		Clickon(getwebelement(xml.getlocator("//locators/" + application + "/CreateOrderServiceLink")));
		Thread.sleep(2000);
		Log.info("=== Create Order/Service navigated ===");
	}
	
	public void selectImsTranslator (String application) throws InterruptedException, DocumentException
	{
		
		System.out.println("select Manage Colt's Network");
		DriverTestcase.logger.log(LogStatus.PASS, "Step : clicked on 'Manage colt's Network' link");


		Thread.sleep(3000);
		
			Moveon(getwebelement(xml.getlocator("//locators/" + application + "/ManageColtNetworkLink")));
			Thread.sleep(3000);
			System.out.println("Mouse hovered on Manage Colt Network ");
			DriverTestcase.logger.log(LogStatus.PASS, "Step : Mouse hovered on Manage Colt Network");
			
			Thread.sleep(2000);
			boolean isDisplayed = getwebelement(xml.getlocator("//locators/" + application + "/ManageIms")).isDisplayed();
			sa.assertTrue(isDisplayed,"Manage IMS Number Translation is not displayed ");
			
			System.out.println("Manage IMS Number Translation link verifeid");
			DriverTestcase.logger.log(LogStatus.PASS, "Step :Manage IMS Number Translation is displayed ");

			Clickon(getwebelement(xml.getlocator("//locators/" + application + "/ManageIms")));
			Thread.sleep(2000);
			Log.info("=== Clicked on Manage IMS Number Translation link ===");
			System.out.println("Clicked on Manage IMS Number Translation link");
			DriverTestcase.logger.log(LogStatus.PASS, "Step :Clicked on Manage IMS Number Translation link");

			
 		    DriverTestcase.logger.log(LogStatus.PASS, "Navigated to Manage Number Translation");


			Log.info("=== Navigated to Manage Number Translation ===");
	}
	public void verifyManageNumberTranslationcountrypage (String application) throws InterruptedException, DocumentException
	{
		
		
		String[] CountryList= {"SE Manage Number Translation","UK Manage Number Translation","BR Manage Number Translation","PT Manage Number Translation","CH Manage Number Translation",
				"IE Manage Number Translation","AT Manage Number Translation","IT Manage Number Translation"};
		System.out.println(""+CountryList.length);
		DriverTestcase.logger.log(LogStatus.PASS, " Verifying list of countries");

		
		//Verifying list of Countries
		//try {
		List<WebElement> CountryPresent =getwebelements(xml.getlocator("//locators/" +application+ "/CountryPresent"));
		for (WebElement Country: CountryPresent ) {
			boolean match = false;
			System.out.println("Country list displaying from application:"  +Country.getText());
			DriverTestcase.logger.log(LogStatus.PASS, "Country list displaying from application:"+Country.getText());

			
			for (int i=0; i < CountryList.length;i++)
			{
				if (Country.getText().equals(CountryList[i])) {
					match = true;
					Log.info("Country name : " + Country.getText());
					DriverTestcase.logger.log(LogStatus.PASS, "Country name :" + Country.getText());
					System.out.println(CountryPresent);
//					System.out.println("Country list matched");
//					DriverTestcase.logger.log(LogStatus.PASS, "Country list matched");

				}
								
			}
				Log.info("Country lists got mismatched");
				//DriverTestcase.logger.log(LogStatus.PASS, "Country list not matched");
				sa.assertTrue(match);

					}
		
		
		}

	
		public void verifyManageNumberTranslation (String application ,String Countrylist) throws Exception
	{
		if (Countrylist.equals("BR"))
		{
		DriverTestcase.logger.log(LogStatus.PASS, "Verifying Manage Number Translation filed for BR");
	
		Thread.sleep(5000);
		safeJavaScriptClick(getwebelement(
				xml.getlocator("//locators/" + application + "/BRManageTran")));
		Log.info("Clicked on BR Manage Number Translation");
		System.out.println("Clicked on BR Manage Number Translation");

		DriverTestcase.logger.log(LogStatus.PASS, "Clicked on BR Manage Number Translation");
		
		}
		
		else if (Countrylist.equals("IT"))
		{
			DriverTestcase.logger.log(LogStatus.PASS, "Verifying Manage Number Translation filed for IT");
			
			Thread.sleep(5000);
			safeJavaScriptClick(getwebelement(
					xml.getlocator("//locators/" + application + "/ITManageTran")));
			Log.info("Clicked on IT Manage Number Translation");
			System.out.println("Clicked on IT Manage Number Translation");

			DriverTestcase.logger.log(LogStatus.PASS, "Clicked on IT Manage Number Translation");
	
		}
		
		else if (Countrylist.equals("CH"))
		{
			DriverTestcase.logger.log(LogStatus.PASS, "Verifying Manage Number Translation filed for CH");
			
			Thread.sleep(5000);
			safeJavaScriptClick(getwebelement(
					xml.getlocator("//locators/" + application + "/CHManageTran")));
			Log.info("Clicked on CH Manage Number Translation");
			System.out.println("Clicked on CH Manage Number Translation");

			DriverTestcase.logger.log(LogStatus.PASS, "Clicked on IT Manage Number Translation");
	
		}

		
		else if (Countrylist.equals("IE"))
		{
			DriverTestcase.logger.log(LogStatus.PASS, "Verifying Manage Number Translation filed for IE");
			
			Thread.sleep(5000);
			safeJavaScriptClick(getwebelement(
					xml.getlocator("//locators/" + application + "/IEManageTran")));
			Log.info("Clicked on IE Manage Number Translation");
			System.out.println("Clicked on IE Manage Number Translation");

			DriverTestcase.logger.log(LogStatus.PASS, "Clicked on IE Manage Number Translation");
	
		}
		
		
		else if (Countrylist.equals("AT"))
		{
			DriverTestcase.logger.log(LogStatus.PASS, "Verifying Manage Number Translation filed for AT");
			
			Thread.sleep(5000);
			safeJavaScriptClick(getwebelement(
					xml.getlocator("//locators/" + application + "/ATManageTran")));
			Log.info("Clicked on AT Manage Number Translation");
			System.out.println("Clicked on AT Manage Number Translation");

			DriverTestcase.logger.log(LogStatus.PASS, "Clicked on AT Manage Number Translation");
	
		}
		
		else if (Countrylist.equals("SE"))
		{
			DriverTestcase.logger.log(LogStatus.PASS, "Verifying Manage Number Translation filed for SE");
			
			Thread.sleep(5000);
			safeJavaScriptClick(getwebelement(
					xml.getlocator("//locators/" + application + "/SEManageTran")));
			Log.info("Clicked on SE Manage Number Translation");
			System.out.println("Clicked on SE Manage Number Translation");

			DriverTestcase.logger.log(LogStatus.PASS, "Clicked on SE Manage Number Translation");
	
		}
		
		else if (Countrylist.equals("UK"))
		{
			DriverTestcase.logger.log(LogStatus.PASS, "Verifying Manage Number Translation filed for UK");
			
			Thread.sleep(5000);
			safeJavaScriptClick(getwebelement(
					xml.getlocator("//locators/" + application + "/UKManageTran")));
			Log.info("Clicked on UK Manage Number Translation");
			System.out.println("Clicked on UK Manage Number Translation");

			DriverTestcase.logger.log(LogStatus.PASS, "Clicked on UK Manage Number Translation");
	
		}
		else if (Countrylist.equals("PT"))
		{
			DriverTestcase.logger.log(LogStatus.PASS, "Verifying Manage Number Translation filed for PT");
			
			Thread.sleep(5000);
			safeJavaScriptClick(getwebelement(
					xml.getlocator("//locators/" + application + "/PTManageTran")));
			Log.info("Clicked on PT Manage Number Translation");
			System.out.println("Clicked on PT Manage Number Translation");

			DriverTestcase.logger.log(LogStatus.PASS, "Clicked on PT Manage Number Translation");
	
		}
		

		compareText(application, "You can use * as wildcard", "TranslationWildcard", "You can use * as wildcard", xml);
		
//		compareText(application, "Number To Translate", "NumberToTranslate", "Number To Translate", xml);
//		
//		compareText(application, "Number Translated", "NumberToTranslated", "Number Translated", xml);
//		
//		compareText(application, "Country", "Country", "Country", xml);
//		
//		compareText(application, "Carrier", "Carrier", "Carrier", xml);
//		
//		compareText(application, "Nature Of Address", "NatureofAddress", "Nature Of Address", xml);
//		
//		compareText(application, "PSX Sync Status", "PSXsyncstatus", "PSX Sync Status", xml);
//		
//		compareText(application, "Add Number Translation", "AddnumberTranslation", "Add Number Translation", xml);
//		
//		compareText(application, "View Upload History", "ViewUploadHistory", "View Upload History", xml);
//		
//		compareText(application, "View UI History", "ViewUIHistory", "View UI History", xml);
//		
//		compareText(application, "Upload Update File", "Uploadupdatefile", "Upload Update File", xml);
//		
//		compareText(application, "Download Number Translation", "DownloadNumberTranslation", "Download Number Translation", xml);
//
//		compareText(application, "Synchronize All", "SynchronizeAll", "Synchronize All", xml);

				
	}
		
		
		public void verifyWildcardsearch (String application) throws Exception
		{
			DriverTestcase.logger.log(LogStatus.PASS, "Verifying Wildcard * search field");
			
			SendKeys(getwebelement(xml.getlocator("//locators/" + application + "/ImsSearcfield")),"*");
			Log.info("Value Entered in TextField");
			System.out.println("Value Entered in Search TextField");
			DriverTestcase.logger.log(LogStatus.PASS, "Value Entered in Search TextField" );
			
			Clickon(getwebelement(xml.getlocator("//locators/" + application + "/Searchbtn")));
			Log.info("Clicked on Search button");
			System.out.println("Clicked on search button");
			DriverTestcase.logger.log(LogStatus.PASS, "Clicked on search button" );
			
			Thread.sleep(5000);
			
			String ExpWildcardmsg = "The following errors were encountered: At least 3 digits to be entered in the search field.";
			System.out.println("Postcode message");
			//WebElement ActWildcardmsg = driver.findElement(By.xpath("//span[contains(text(),'The following errors were encountered: At least 3 digits to be entered in the search field.')]"));
			WebElement ActWildcardmsg = (getwebelement(xml.getlocator("//locators/" +application+ "/Wildcardmsg")));
			if (ActWildcardmsg.getText().equals(ExpWildcardmsg))
			{
				Log.info("Wildcarde Message : " + ActWildcardmsg.getText());
				DriverTestcase.logger.log(LogStatus.PASS, "Postcode Message :  :" + ActWildcardmsg.getText());
				System.out.println("Message Displayed as:"+ActWildcardmsg.getText());
				DriverTestcase.logger.log(LogStatus.PASS, "Wildcard Search Message Displayed as:" +ActWildcardmsg.getText());
				DriverTestcase.logger.log(LogStatus.PASS, "Wildcard Search Method Verified and Passed" );

			}
			else
			{
				sa.assertTrue(ActWildcardmsg.isDisplayed(),"Message not displayed");
				Log.info("Postcode success message not displayed");
				System.out.println("Wildcard Search message not displayed or mismatched");
				DriverTestcase.logger.log(LogStatus.PASS, "Wildcard Search message not displayed or mismatched and Test Failed" );

			}
			Thread.sleep(5000);
			getwebelement(xml.getlocator("//locators/" + application + "/ImsSearcfield")).clear();
		}
		
		
			public void verifyAddnumberTranslationfields (String application ,String Countrylist) throws Exception
			{
				
				DriverTestcase.logger.log(LogStatus.INFO, "Verifying Add number Translation field" );
				
				safeJavaScriptClick(getwebelement(xml.getlocator("//locators/" + application + "/AddnumberTranslation")));
				Log.info("Clicked on Add Number Translation Link");
				System.out.println("Clicked on Add Number Translation Link");
				DriverTestcase.logger.log(LogStatus.PASS, "Clicked on Add Number Translation Link");
				
			//Number to translate	
				compareText(application, "Number to Translate", "Numbertranslate","Number to Translate", xml);
				
			//Country Code	
				compareText(application, "Country Code", "Countrycode", "Country Code", xml);
				
			//Prefix	
				compareText(application, "Prefix", "Prefix", "Prefix", xml);

				
				
				WebElement ActCountrycode = getwebelement(xml.getlocator("//locators/" +application+ "/ActCountrycode"));
				if (ActCountrycode.getText().equals(Countrylist))
				{
					Log.info("Country Code is same as selected country" + ActCountrycode.getText());
					System.out.println("Country Code is same as selected country:" +ActCountrycode.getText());
					DriverTestcase.logger.log(LogStatus.PASS, "Country Code is same as selected country" + ActCountrycode.getText());
				}
				else
				{
					sa.assertTrue(ActCountrycode.isDisplayed(),"Country Code not displayed or mismatched");
					Log.info("Country Code not displayed or mismatched");
					System.out.println("Country Code not displayed or mismatched");
					DriverTestcase.logger.log(LogStatus.FAIL, "Country Code not displayed or mismatched" );

				}							
				
				if ((Countrylist.equals("SE"))||(Countrylist.equals("UK"))||(Countrylist.equals("PT"))||
						(Countrylist.equals("CH"))||(Countrylist.equals("IT"))||(Countrylist.equals("IE"))||
						(Countrylist.equals("AT")))
			
				{
				   //Carrier	
					compareText(application, "Carrier", "CarrierLabel","Carrier", xml);
					
				}
				
				
				else if ((Countrylist.equals("BR"))||(Countrylist.equals("UK")))
						
				{
					compareText(application, "Nature of Address", "NatureofAddressLabel","Nature of Address", xml);

			//Nature of address dropdown			
				String[] NatureofAddress = {"Subscriber","National","International","Unknown"};
				System.out.println("Nature of address Values :" +NatureofAddress);
				
				boolean Natureofadddropdown = getwebelement(xml.getlocator("//locators/" + application + "/Natureofadddropdown")).isDisplayed();
				sa.assertTrue(Natureofadddropdown,"Nature of adddress dropdown is not displayed");
				System.out.println("Nature of adddress dropdown field is verified");
				DriverTestcase.logger.log(LogStatus.PASS, "Nature of adddress dropdown field is verified");
				
				//Verifying list of values from dropdown
				
				//List<WebElement> listofaddress = driver.findElements(By.xpath("//div/span[@role='option']"));
				List<WebElement> listofaddress = getwebelements(xml.getlocator("//locators/" +application+ "/listofaddressDropDown"));
				for (WebElement valueslist : listofaddress) 
					
				{
					System.out.println("Country list displaying from application:"  +valueslist.getText());
					DriverTestcase.logger.log(LogStatus.PASS, "Country list displaying from application:"+valueslist.getText());
					boolean match = false;
					
					for (int i = 0; i <NatureofAddress.length;i++) {
						if (valueslist.getText().equals(NatureofAddress[i]))
						{
							match = true;
							Log.info("Nature of address values displaying from page dropdown" + valueslist.getText());
							System.out.println("Nature of address values displaying from page dropdown :" + valueslist.getText());
							DriverTestcase.logger.log(LogStatus.PASS, "Nature of address values displaying from page dropdown : " + valueslist.getText());
						}
						
					}
					Log.info("Nature of address values displaying from page dropdown not matched");
					DriverTestcase.logger.log(LogStatus.PASS, "Nature of address values displaying from page dropdown not matched");
					sa.assertTrue(match);

				}
				
			//Range checkbox	
				compareText(application, "Range", "RangeLabel","Range", xml);
				
				click_commonMethod(application, "Range", "RangeFlag", xml);
				Thread.sleep(1000);
				
			//Sequence	
				compareText(application, "Sequence", "sequenceLabelName", "Sequence", xml);
				
				
				}
				
			//Number Translated	
				compareText(application, "Number Translated", "NumberToTranslatedLabel","Number Translated", xml);
				
			//OK button	
				compareText(application, "OK", "OkbtnPostcode","OK", xml);
				
		}
			
			public void filladdtranslation (String application ,String Countrylist ,String TranslateNumber ,String TranslatedNumber , 
					String PrefixNumber ,String NatureAddress, String CarrierNo, String Prefix, String range, String sequence, String countryName) throws Exception
			
			{
				
			//Number to translate	
				addtextFields_commonMethod("ManageColt", "Number to Translate", "Numbertotranslate_Text", TranslateNumber, xml);
				
			//translated Number	
				addtextFields_commonMethod("ManageColt", "Number Translated", "Numbertranslated_Text", TranslatedNumber, xml);
				
			//Prefix number	
				addtextFields_commonMethod("ManageColt", "Prefix", "PrefixText", PrefixNumber, xml);
					
					
				if ((Countrylist.equals("CH"))) {

					
					addDropdownValues_commonMethod(application, "Carrier", "carrierDropdown", CarrierNo, xml);

					addCheckbox_commonMethod(application, "prefix_checkbox", "Prefix", Prefix, "no", xml);
					
				}
				else if((Countrylist.equals("SE"))|| (Countrylist.equals("IE"))|| (Countrylist.equals("PT")) || (Countrylist.equals("AT")) ||
						(Countrylist.equals("IT"))) {
					
					addDropdownValues_commonMethod(application, "Carrier", "carrierDropdown", CarrierNo, xml);
					
					addCheckbox_commonMethod(application, "ddiPrefix_checkbox", "DDI Prefix", Prefix, "no", xml);

				}
				else if ((Countrylist.equals("BR")))  {
					
					addtextFields_commonMethod("ManageColt", "Country", "Country_Text", Countrylist, xml);
					
					addDropdownValues_commonMethod(application, "Nature of Address", "natureOfAddressDropdown", NatureAddress, xml);
				
					addCheckbox_commonMethod(application, "RangeFlag", "Range", range, "no", xml);
				
					if(range.equalsIgnoreCase("yes")) {
						
						//Sequence
						addtextFields_commonMethod(application, "Sequence", "sequencetextField", sequence, xml);
					}
				}
				else if (Countrylist.equals("UK")){
					
					edittextFields_commonMethod(application, "Carrier", "carrierDropdown", CarrierNo, xml);
					
					addtextFields_commonMethod("ManageColt", "Country", "Country_Text", countryName, xml);
					
					addDropdownValues_commonMethod(application, "Nature of Address", "natureOfAddressDropdown", NatureAddress, xml);
				
					addCheckbox_commonMethod(application, "RangeFlag", "Range", range, "no", xml);
				
					if(range.equalsIgnoreCase("yes")) {
						
						//Sequence
						addtextFields_commonMethod(application, "Sequence", "sequencetextField", sequence, xml);
					}
					
				}

					click_commonMethod(application, "OK", "OkbtnPostcode", xml);
					Thread.sleep(2000);
					
					
					verifysuccessmessage(application, "NumberTranslation successfully created.Sync started successfully. Please check the sync status of number translation.");


					
			//Verifying list of values under 'Action' dropdown	
					scrolltoend();
					String[] ExpectedActiondrop = {"View","Edit","Delete","Synchronize"};
					System.out.println("Action DropDown values " +ExpectedActiondrop);
					
					safeJavaScriptClick(getwebelement(xml.getlocator("//locators/" + application + "/PostcodeAction")));
					System.out.println("Clicked on Action Dropdown");
					DriverTestcase.logger.log(LogStatus.PASS, "Clicked on Action Dropdown" );
					
					List<WebElement> ActualActionDD =getwebelements(xml.getlocator("//locators/" +application+ "/ActionDD"));

					//List<WebElement> ActualActionDD = driver.findElements(By.xpath("//a[@role='button']"));
					for (WebElement Dropdownlist : ActualActionDD) 
						
					{
						System.out.println("Action Drop down Values displaying from application:"  +Dropdownlist.getText());
						DriverTestcase.logger.log(LogStatus.PASS, "Country list displaying from application:"+Dropdownlist.getText());
						boolean match = false;
						
						for (int i = 0; i <ExpectedActiondrop.length;i++) {
							if (Dropdownlist.getText().equals(ExpectedActiondrop[i]))
							{
								match = true;
								Log.info("Action Drop down values" + Dropdownlist.getText());
								System.out.println("Action Drop down values as:" + Dropdownlist.getText());
								DriverTestcase.logger.log(LogStatus.PASS, "Action Drop down values are as expected:"  +Dropdownlist.getText());
							}
							
						}
						sa.assertTrue(match);
					}
			}
			
			public void verifyAddnumbertranslationfunction (String application ,String CountryCode, String TranslateNumber,
					String TranslatedNumber, String PrefixNumber, String CarrierNo, String prefixCheckbox, String rage, String sequence, 
					String NatureOfAddress) throws Exception 
			
			{
				//Verifying the values in View
				
				waitForpageload();
				waitforPagetobeenable();
				
				Thread.sleep(5000);
				String prefixValue=null;
				
			//Country field
				String countryName=viewPage_country(application, CountryCode);
				
			//Prefix checkbox	
				if(prefixCheckbox.equalsIgnoreCase("yes")) {
					
					prefixValue="true";
					
				}else if(prefixCheckbox.equalsIgnoreCase("no")) {
					
					prefixValue="false";
					
				}
				DriverTestcase.logger.log(LogStatus.INFO, "Verifying View operation" );
				System.out.println("Verifying View operation ");
				

				selectAddedNumberToTranslateInTable(application, TranslateNumber);
				Thread.sleep(2000);
				
				click_commonMethod(application, "View_Link", "TranslationView", xml);		//click on View link
				Thread.sleep(2000);
				

			//View IMSNT Page	
				compareText_ImsntViewPage(application ,"Number to Translate",TranslateNumber,xml);
				
				compareText_ImsntViewPage(application ,"Country Code",CountryCode,xml);
				
				compareText_ImsntViewPage(application ,"Prefix",PrefixNumber,xml);
				
				compareText_ImsntViewPage(application ,"Number Translated",TranslatedNumber,xml);
			
				
				if ((CountryCode.equals("UK")) || (CountryCode.equals("BR")) ||(CountryCode.equals("IE")) || (CountryCode.equals("AT")))
				{
					compareText_ImsntViewPage(application ,"Carrier",CarrierNo,xml);		//Carrier
				
					compareText(application, "Country", "viewPage_CountryField", countryName, xml);		//Country Name
					
					compareText_ImsntViewPage(application, "Nature of Address", NatureOfAddress, xml);		//Nature of Address
				
				}
				else if ((CountryCode.equals("SE")) ||(CountryCode.equals("IT")))
				{
					compareText_ImsntViewPage(application ,"Carrier",CarrierNo,xml);		//Carrier
				
					compareText(application, "Country", "viewPage_CountryField", countryName, xml);		//Country Name
					
					compareText_ImsntViewPage(application, "Nature of Address", NatureOfAddress, xml);		//Nature of Address
					
					compareText_ImsntViewPage(application, "DDI Prefix", prefixValue, xml);		//DDI Prefix
				
				}
				
				else if ((CountryCode.equals("PT")))
				{
					
					compareText_ImsntViewPage(application ,"Carrier",CarrierNo,xml);		//Carrier
					
					compareText_ImsntViewPage(application, "DDI Prefix", prefixValue, xml);		//DDI Prefix
					
					compareText(application, "Country", "viewPage_CountryField", countryName, xml);		//Country Name
					
					compareText_ImsntViewPage(application, "Nature of Address", NatureOfAddress, xml);		//Nature of Address

				}
				else if(CountryCode.equals("CH")){
					
					compareText_ImsntViewPage(application ,"Carrier",CarrierNo,xml);		//Carrier
					
					compareText(application, "Country", "viewPage_CountryField", countryName, xml);		//Country Name
					
					compareText_ImsntViewPage(application, "Nature of Address", NatureOfAddress, xml);		//Nature of Address
					
					compareText_ImsntViewPage(application, "Prefix", prefixValue, xml);		//Prefix
					
				}
				
				safeJavaScriptClick(getwebelement(xml.getlocator("//locators/" + application + "/Closesign")));
				DriverTestcase.logger.log(LogStatus.PASS, "Clicked on Close button");

				Thread.sleep(2000);
				
			}
			
			
			public void editIMSNT(String application ,String Countrylist ,String TranslateNumber ,String TranslatedNumber , 
					String PrefixNumber , String CarrierNo, String prefixCheckboxvalue) throws InterruptedException, DocumentException, Exception {
				
				
				DriverTestcase.logger.log(LogStatus.INFO, "Verifying Edit operation and Update message" );
				System.out.println("Verifying Edit operation and Update message");
				Thread.sleep(5000);
					
//				selectAddedNumberToTranslateInTable(application, TranslateNumber);
				
				click_commonMethod(application, "Action", "PostcodeAction", xml);		//click on Action dropdown
				
				click_commonMethod(application, "Edit_Link", "PostcodeActionEdit", xml);		//click on Edit Link
			
				
			//Number to Translate
				String actualNumberToTranslate=Gettext(getwebelement(xml.getlocator("//locators/" + application + "/editPage_NumberToTranslateElement")));
				if(actualNumberToTranslate.equals(TranslateNumber)) {
					DriverTestcase.logger.log(LogStatus.PASS, "Number To Translate field value is displaying as "+ actualNumberToTranslate + " as expected");
					System.out.println("Number To Translate field value is displaying as "+ actualNumberToTranslate + " as expected");
				}else {
					DriverTestcase.logger.log(LogStatus.FAIL, "Number To Tanslate value is mismatching. Actual dipslaying as "+actualNumberToTranslate + ". .The expected value is +" + TranslateNumber);
					System.out.println("Number To Tanslate value is mismatching. Actual dipslaying as "+actualNumberToTranslate + " .The expected value is " + TranslateNumber);
					
				}
				
			//Country Code
				String actualCountryCode=Gettext(getwebelement(xml.getlocator("//locators/" + application + "/editPage_countryCodeElement")));
				if(actualCountryCode.equals(Countrylist)) {
					DriverTestcase.logger.log(LogStatus.PASS, "Country code field value is displaying as "+ actualCountryCode + " as expected");
					System.out.println("Country code field value is displaying as "+ actualCountryCode + " as expected");
				}else {
					DriverTestcase.logger.log(LogStatus.FAIL, "Country code value is mismatching. Actual dipslaying as "+actualCountryCode + ". .The expected value is +" + Countrylist);
					System.out.println("Country code value is mismatching. Actual dipslaying as "+actualCountryCode + " .The expected value is " + Countrylist);
				}
				
				
			//Prefix 	
				edittextFields_commonMethod(application, "Prefix", "PrefixText", PrefixNumber, xml);

			//Number Translated
				edittextFields_commonMethod(application, "Number Translated", "Numbertranslated_Text", TranslatedNumber, xml);
				
				
				if ((Countrylist.equals("CH"))) {

					
					addDropdownValues_commonMethod(application, "Carrier", "carrierDropdown", CarrierNo, xml);
					
					editcheckbox_commonMethod(application, prefixCheckboxvalue, "prefix_checkbox","Prefix", xml);
					
				}
				else if((Countrylist.equals("SE"))|| (Countrylist.equals("IE"))|| (Countrylist.equals("PT")) || (Countrylist.equals("AT")) ||
						(Countrylist.equals("IT"))) {
					
					addDropdownValues_commonMethod(application, "Carrier", "carrierDropdown", CarrierNo, xml);
					
					editcheckbox_commonMethod(application, prefixCheckboxvalue , "ddiPrefix_checkbox", "DDI Prefix", xml);

				}
				else if ((Countrylist.equals("BR")))  {
					
						System.out.println("No additoinal fields");
						
				}
				else if (Countrylist.equals("UK")){
					
					edittextFields_commonMethod(application, "Carrier", "carrierDropdown", CarrierNo, xml);
					
				}

				
				 safeJavaScriptClick(getwebelement(xml.getlocator("//locators/" + application + "/OKbtn")));
				 DriverTestcase.logger.log(LogStatus.PASS, "Clicked on OK button");
				 
				 Thread.sleep(10000);
				 
				 
				 verifysuccessmessage(application, "NumberTranslation successfully updated.Sync started successfully. Please check the sync status of number translation.");
				 
			}
			
			
			
			public void uploadUpdatefile (String application, String filepath) throws Exception 
			{
				DriverTestcase.logger.log(LogStatus.PASS, "Verifying Upload Update file Service Area Link and Fields");
				
				click_commonMethod(application, "Upload Update File", "Uploadupdatefile", xml);		//click on upload update file link
				Thread.sleep(2000);
				 
				compareText("ManageColt", "Choose File", "ChosefileTransImsnt", "Choose File", xml);	

				compareText("ManageColt", "OK", "OkbtnPostcode", "OK", xml);	
				
				 SendKeys(getwebelement(xml.getlocator("//locators/" + application + "/ChosefileTransImsnt")), filepath );
					DriverTestcase.logger.log(LogStatus.PASS, "File uploaded");

	 
				click_commonMethod(application, "OK", "OkbtnPostcode", xml);
					
				verifysuccessmessage(application, "NumberTranslation successfully created.");

			}
			
			public void viewuploadHistory (String application) throws Exception 
			{
				DriverTestcase.logger.log(LogStatus.PASS, "Verifying View upload History link and fields");
				
				
				String expectedTitleName="GSX Configuration";
				
				safeJavaScriptClick(getwebelement(
						xml.getlocator("//locators/" + application + "/ViewUploadHistory")));
				Log.info("Clicked on View Upload History");
				System.out.println("Clicked on View Upload History");
				DriverTestcase.logger.log(LogStatus.PASS, "Clicked on View Upload History");
				
				Thread.sleep(3000);
				
				String mainWindow=driver.getWindowHandle();
				Set<String> allwindows = driver.getWindowHandles();
	            Iterator<String> itr = allwindows.iterator();
	            while(itr.hasNext())
	            {
	                  String childWindow = itr.next();
	                  if(!mainWindow.equals(childWindow)){
	                        driver.switchTo().window(childWindow);
	                        
	                        String actualTitlename=driver.switchTo().window(childWindow).getTitle();
	                        if(expectedTitleName.equals(actualTitlename)) {
	                        	DriverTestcase.logger.log(LogStatus.PASS, "Page title is displaying as "+ actualTitlename +" as expected");
	                        	Log.info("Page title is displaying as "+ actualTitlename +" as expected");
	                        }else {
	                        	DriverTestcase.logger.log(LogStatus.FAIL, "Page title is mismatching. Expected title is: "+expectedTitleName +" ."
	                        			+ "But actual title displaying is: "+ actualTitlename);
	                        	System.out.println("Page title is mismatching. Expected title is: "+expectedTitleName +" ."
	                        			+ "But actual title displaying is: "+ actualTitlename);
	                        }
	                        
	                        driver.manage().window().maximize();
	                        Thread.sleep(1000);
	                        
//	                       Write here  whatever you want to do and perform
	                        System.out.println("came inside child window");
	                        
	                        driver.close();
	                  }
	            }
	            
	            driver.switchTo().window(mainWindow);
				
			}
			
		public void synchronise(String application, String numberToTranslate) throws InterruptedException, DocumentException, Exception {
				
			//Synchronize operation
				DriverTestcase.logger.log(LogStatus.INFO, "Verifying Synchronize operation and synchronize message" );
				System.out.println("Verifying Synchronize operation and synchronize message");


				selectAddedNumberToTranslateInTable(application, numberToTranslate);
				
				click_commonMethod(application, "Synchronize", "Synchronize", xml);
				
				Thread.sleep(1000);
				
				verifysuccessmessage(application, "Sync started successfully. Please check the sync status of number translation.");
				
			}
			
			public void deleteIMST(String application, String numberToTranslate) throws InterruptedException, DocumentException, Exception {

				//Delete Operation
				waitForpageload();
				waitforPagetobeenable();
				DriverTestcase.logger.log(LogStatus.INFO, "Verifying Delete operation and message" );
				System.out.println("Verifying Delete operation and message");

				Thread.sleep(10000);
				
			//select the record and click on Action dropdown	
				selectAddedNumberToTranslateInTable(application, numberToTranslate);
				
			//click on delete button	
				click_commonMethod(application, "Delete", "PostcodeActionDelete", xml);
				
				
				safeJavaScriptClick(getwebelement(xml.getlocator("//locators/" + application + "/PostcodeDeletebtn")));
				Log.info("Clicked on Delete button ");
			    System.out.println("Clicked on Delete button");
				DriverTestcase.logger.log(LogStatus.PASS, "Clicked on Delete button");
				
				Thread.sleep(1000);
				
				DriverTestcase.logger.log(LogStatus.PASS, "Verifying Delete  Message");
				
				Thread.sleep(10000);
				
				verifysuccessmessage(application, "NumberTranslation successfully marked for deletion.");
				
				}
			
		public void viewUIHistory (String application, String OperationDropDvalue,String Userfield,String NumberToTranslate) throws Exception 
		{
				DriverTestcase.logger.log(LogStatus.PASS, "Verifying View UI History link and fields");
				
				click_commonMethod(application, "View UI History", "ViewUIHistory", xml);
				
				
			//Verify field names	
				compareText(application, "Operation", "Operation", "Operation", xml);
				
				compareText(application, "User", "ViewUIUser", "User", xml);
				
				compareText(application, "Number to Translate", "ViewUINumbertoTrans", "Number to Translate", xml);

				
				
			//select value under Operation Dropdown
				addDropdownValues_commonMethod(application, "Operation", "operationDropdown_viewUIhistory", OperationDropDvalue, xml);
				
			//Enter User Name and click on search
				addtextFields_commonMethod(application, "User", "UserText", Userfield, xml);
				
			//Enter value in Number To Translate Field
				addtextFields_commonMethod(application, "Number to Translate", "Numbertotranslate_Search", NumberToTranslate, xml);
				
			//click on Search button
				click_commonMethod(application, "Search", "ViewUISearch", xml);

				
				DriverTestcase.logger.log(LogStatus.PASS, "Values populated as per Option selected from Dropdown and Value provided in Number to translate");

				Thread.sleep(3000);
				
				click_commonMethod(application, "Close", "ViewUploadHisClose", xml);
							
			}


			
			public void downlaodTranslationlink (String application) throws Exception 
			{
				click_commonMethod(application, "Download Number Translation", "DownloadNumberTranslation", xml);
				
				isFileDownloaded("C:\\Users\\SKathiresan-ADM\\Downloads", "postcode_cld_63");
				
			}

			public void synchronizeall (String application) throws Exception 
			{
				click_commonMethod(application, "Synchronize", "SynchronizeAll" , xml);

				waitForpageload();
				waitforPagetobeenable();
				
				Thread.sleep(5000);
				
				verifysuccessmessage(application, "Sync started successfully. Please check the sync status of number translation.");
			}
			
			 @SuppressWarnings("unused")
			 public void compareText_ImsntViewPage(String application, String labelname,  String ExpectedText, XMLReader xml) throws InterruptedException, DocumentException {

			       String text = null;
			       WebElement element = null;

			       try {
			             Thread.sleep(1000);
			             
			             element = getwebelement("//div[label[contains(text(),'"+ labelname + "')]]/div[1]"); 
			             String emptyele = element.getText().toString();

			             if(element==null)
			             {
			                   DriverTestcase.logger.log(LogStatus.FAIL, labelname+" not found");
			                   System.out.println(labelname+" not found");
			             }
			             else if (emptyele!=null && emptyele.isEmpty()) {
//			                 DriverTestcase.logger.log(LogStatus.PASS,  labelname + "' value is empty");
			                   
			                   emptyele= "Null";
			                   
			                   sa.assertEquals(emptyele, ExpectedText, labelname + " value is not displaying as expected");
			                   
			                   if(emptyele.equalsIgnoreCase(ExpectedText)) {
			                         
			                         DriverTestcase.logger.log(LogStatus.PASS, " The Expected value for '"+ labelname +"' field '"+ExpectedText+"' is same as the Acutal value '"+text+"'");
			                         System.out.println(" The Expected Text for '"+ labelname +"' field '"+ExpectedText+"' is same as the Acutal Text '"+text+"'");
			                         
			                   }
			                   else 
			                   {
			                         DriverTestcase.logger.log(LogStatus.FAIL,"The Expected value '"+ExpectedText+"' is not same as the Acutal value '"+text+"'");
			                         System.out.println(" The Expected value '"+ExpectedText+"' is not same as the Acutal value '"+text+"'");
			                   }
			                   

			             }else 
			             {   
			                   text = element.getText();
			                   
			                   if(text.equalsIgnoreCase("yes")) {
			                	   text="true";
			                   }
			                   else if(text.equalsIgnoreCase("no")) {
			                	   text="false";
			                   }
			                   
			                   if(text.equals(ExpectedText)) {
			                         DriverTestcase.logger.log(LogStatus.PASS," The Expected value for '"+ labelname +"' field '"+ExpectedText+"' is same as the Acutal value '"+text+"'");
			                         System.out.println(" The Expected value for '"+ labelname +"' field '"+ExpectedText+"' is same as the Acutal value '"+text+"'");
			                   }
			                   else if(text.contains(ExpectedText)) {
			                         DriverTestcase.logger.log(LogStatus.PASS,"The Expected value for '"+ labelname +"' field '"+ExpectedText+"' is same as the Acutal value '"+text+"'");
			                         System.out.println("The Expected value for '"+ labelname +"' field '"+ExpectedText+"' is same as the Acutal value '"+text+"'");
			                   
			                   }
			                   else
			                   {
			                         DriverTestcase.logger.log(LogStatus.FAIL,"The Expected value for '"+ labelname +"' field '"+ExpectedText+"' is not same as the Acutal value '"+text+"'");
			                         System.out.println("The Expected value for '"+ labelname +"' field '"+ExpectedText+"' is not same as the Acutal value '"+text+"'");
			                   }
			             }
			       }catch (Exception e) {
			             text = element.getText();
			             DriverTestcase.logger.log(LogStatus.FAIL,"The Expected value for '"+ labelname +"' field '"+ExpectedText+"' is not same as the Acutal value '"+text+"'");
			             System.out.println("The Expected value for '"+ labelname +"' field '"+ExpectedText+"' is not same as the Acutal value '"+text+"'");
			             e.printStackTrace();
			       }

			 }
			 
			 public void ClickOnCheckbox(WebElement el, String value) throws IOException, InterruptedException
				{ 
					Thread.sleep(3000);
					if(!el.isSelected() && value.equals("CHECK"))
					{
						el.click();
					}
					else if(el.isSelected() && value.equals("UNCHECK"))
					{
						el.click();
					}
					else
					{
						Log.info("Please provide proper input for click check-kbox");
					}
				}

			 public boolean isFileDownloaded(String downloadPath, String fileName) {
				  File dir = new File(downloadPath);
				  File[] dirContents = dir.listFiles();

				  for (int i = 0; i < dirContents.length; i++) {
				      if (dirContents[i].getName().contains(fileName)) {
				          // File has been found, it can now be deleted:
				          //dirContents[i].delete();
				    	  
				    	  String downloadedFileName=dirContents[i].getName();
				    	  System.out.println("Downloaded file name is displaying as: "+ downloadedFileName);
				    	  DriverTestcase.logger.log(LogStatus.PASS, "Downloaded file name is displaying as: "+ dirContents[i]);
				    	  
				          return true;
				      }
				          }
				      return false;
				  }

			 
			 /**
			 	 * success Message common method
			 	 * @param application
			 	 * @throws InterruptedException
			 	 */
			 	public void verifysuccessmessage(String application, String expected) throws InterruptedException {
			 		
			 		waitForpageload();
			 		waitforPagetobeenable();
			 		
			 		scrollToTop();
			 		Thread.sleep(3000);
			 		try {	
			 			
			 			boolean successMsg=getwebelement(xml.getlocator("//locators/" + application + "/alertMsg_managePOstcode")).isDisplayed();

			 			if(successMsg) {
			 				
			 				String alrtmsg=getwebelement(xml.getlocator("//locators/" + application + "/AlertForServiceCreationSuccessMessage_managePOstcode")).getText();
			 				
			 				if(expected.contains(alrtmsg)) {
			 					
			 					DriverTestcase.logger.log(LogStatus.PASS,"Message is verified. It is displaying as: "+alrtmsg);
			 					System.out.println("Message is verified. It is displaying as: "+alrtmsg);
			 					
			 					successScreenshot(application);
			 					
			 				}else if(expected.equals(alrtmsg)){
			 					
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
			 			Log.info("failure in fetching success message  ");
			 			DriverTestcase.logger.log(LogStatus.FAIL, expected+ " Message is not displaying");
			 			System.out.println(expected+ " message is not getting dislpayed");
			 			Thread.sleep(2000);
			 		}
			 	}

			 	
		public void selectAddedNumberToTranslateInTable(String application, String numberToTranslate) throws Exception {
					
			 	//Enter 'Number To Translate' value in search text box	
			 		edittextFields_commonMethod(application, "Search", "searchField_IMSNT", numberToTranslate, xml);

			 		waitForpageload();
			 		waitforPagetobeenable();
			 		
			 		Thread.sleep(2000);
					
				//click on Search button	
					click_commonMethod(application, "Search", "Searchbtn", xml);
					Thread.sleep(2000);
					
					
					WebElement addIMSNTLink=getwebelement(xml.getlocator("//locators/" + application + "/AddnumberTranslation"));
					scrolltoview(addIMSNTLink);
					Thread.sleep(1000);
					
					 	safeJavaScriptClick(getwebelement(xml.getlocator("//locators/" + application + "/ImsntCheckbox").replace("value", numberToTranslate)));
						Log.info("Clicked on checkbox");
						System.out.println("Clicked on checkbox");
						DriverTestcase.logger.log(LogStatus.PASS, "selected Number To Translate record in Table");
						Thread.sleep(3000);
						
						click_commonMethod(application, "Action", "PostcodeAction", xml);
						Thread.sleep(2000);

				}


public String viewPage_country(String application, String countryName) {
		
		String code=null;
		
		if(countryName.equalsIgnoreCase("PT")){
			code="351";
		}
		else if(countryName.equalsIgnoreCase("IT")){
			code="39";
		}
		else if(countryName.equalsIgnoreCase("SE")){
			code="46";
		}
		else if(countryName.equalsIgnoreCase("UK")){
			code="indi";
		}
		else if(countryName.equalsIgnoreCase("BR")){
			code="INFI";
		}
		else if(countryName.equalsIgnoreCase("IE")){
			code="353";	
		}
		else if(countryName.equalsIgnoreCase("CH")){
			code="41";
		}
		else if(countryName.equalsIgnoreCase("AT")){
			code="43";	
		}
		
		return code;
	}



  public void createFileForUploadUpdateFile(String application,String operation, String TranslateNumber, String countryName, String translatedNumber,
		  String editTranslatedNumber, String prefixNumber, String editprefixNumber, String carrier, String editCarrier, String NatureofAddress, String filepath) {
	  
	  String tranalatedNumber_final=null;
	  String prefix_final=null;
	  String carrier_final=null;
	  
	  
	 //Translated Number 
	  if(editTranslatedNumber.equalsIgnoreCase("null")) {
		  tranalatedNumber_final = translatedNumber;
	  }
	  else {
		  tranalatedNumber_final = editTranslatedNumber;
	  }
	  
	  
	 //Prefix 
	  if(editprefixNumber.equalsIgnoreCase("null")) {
		  prefix_final = prefixNumber;
	  }
	  else {
		  prefix_final = editprefixNumber;
	  }
	  
	  
	  //Carrier
	  if(editCarrier.equalsIgnoreCase("null")) {
		  carrier_final = carrier;
	  }
	  else {
		  carrier_final = editCarrier;
	  }
	  
	  //fetch CoutryCode
	  String countryCode=viewPage_country(application, countryName);
	  
	  createNewRecord(filepath, operation, TranslateNumber, tranalatedNumber_final, prefix_final, countryCode, carrier_final,
			  NatureofAddress, "0");
  }
  
  
  public static void createNewRecord(String filepath,String Operation, String translateNumber, String translatedNumber, String prefix, String countryCode,
		  String carrier, String natureOfAdddress, String prefixImsRange) {
		
		String tempFile=filepath;
		File newfile = new File(tempFile);
		String id=""; String name="";
		boolean found=false;
		
		try {
			FileWriter fw= new FileWriter(tempFile, true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			
				pw.println("Operation,Number to Translate,Prefix,Translated Number,Translated Country,Carrier,Nature of address,Prefix imsrange");
				pw.println(Operation + "," + translateNumber + "," + prefix + "," + translatedNumber + "," + countryCode + "," + carrier + "," + natureOfAdddress + "," + prefixImsRange);
				
			pw.flush();
			pw.close();
			
			DriverTestcase.logger.log(LogStatus.PASS, "'Number Translation' file is created");
			Log.info("'Number Translation' file is deleted");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
  
  
  public void deleteFile(String filepath) {
	  
		File newfile = new File(filepath);
	  
	  if(newfile.delete()) {
			System.out.println("old file is deleted");
			DriverTestcase.logger.log(LogStatus.PASS, "'Number Translation' file is deleted");
		}else {
			System.out.println("old file not deleteed");
			DriverTestcase.logger.log(LogStatus.FAIL, "'Number Translation' file is not deleted");
		}
	  
  }


	
	

}