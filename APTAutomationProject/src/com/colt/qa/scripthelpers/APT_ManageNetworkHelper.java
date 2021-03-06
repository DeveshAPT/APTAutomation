package com.colt.qa.scripthelpers;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.dom4j.DocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.LogStatus;
import com.colt.qa.driverlibrary.DriverHelper;
import com.colt.qa.driverlibrary.DriverTestcase;
import com.colt.qa.driverlibrary.Log;
import com.colt.qa.driverlibrary.XMLReader;
import com.colt.qa.reporter.ExtentTestManager;

public class APT_ManageNetworkHelper extends DriverHelper {

	public APT_ManageNetworkHelper(WebDriver dr) {
		super(dr);
		// TODO Auto-generated constructor stub
	}

	WebElement el;

	SoftAssert sa = new SoftAssert();

	static XMLReader xml = new XMLReader("src/com/colt/qa/pagerepository/APT_ManageNetwork.xml");

	public void webelementpresencelogger(WebElement ele, String msg) {

		boolean flag = ele.isDisplayed();
		System.out.println("element presence state : " + flag);
		if (flag) {

			System.out.println("webElement is present " + ele.getText());
			ExtentTestManager.getTest().log(LogStatus.PASS, msg);
		} else {

			System.out.println("webElement is not  present" + ele.getText());
			ExtentTestManager.getTest().log(LogStatus.FAIL, msg);
		}

	}
	
	public static String InterfaceAddress;
	public void manageNetwork(String application, String devicename, String Inservice_status, String Inmaintenance_status, String vendormodel, String managementaddress, String snmpro, String country, String city, String site, String premise, String interfacename, 
			String FMC_column, String SMARTS_column, String DCS_column, String FetchInterfaces_column, String Vistamart_column, String PGW_column) throws InterruptedException, DocumentException, ParseException, IOException {
		
		compareText(application, "Manage Network header", "managenetwork_header", "Manage COLT's Network - Manage Network", xml);
		compareText(application, "Status header", "status_header", "Status", xml);
		compareText(application, "Synchronization header", "synchronization_header", "Synchronization", xml);
		
		//verify column headers
		compareText(application, "Device column header", "status_devicecolumn", "Device", xml);
		compareText(application, "Status column header", "status_statuscloumn", "Status", xml);
		compareText(application, "Last Modification column header", "status_lastmodificationcolumn", "Last Modification", xml);
		compareText(application, "Action column header", "status_Action", "Action", xml);
		compareText(application, "Device column header", "synchronization_devicecolumn", "Device", xml);
		compareText(application, "Sync Status column header", "synchronization_syncstatuscolumn", "Sync Status", xml);
		if(FMC_column.equalsIgnoreCase("Yes")) {
			compareText(application, "FMC column header", "synchronization_fmccolumn", "FMC", xml);
		}
		else if(SMARTS_column.equalsIgnoreCase("Yes")) {
		compareText(application, "Smarts column header", "synchronization_smartscolumn", "Smarts", xml);
		}
		else if(DCS_column.equalsIgnoreCase("Yes")) {
		compareText(application, "DCS column header", "synchronization_dcsdevice", "DCS", xml);
		}
		else if(FetchInterfaces_column.equalsIgnoreCase("Yes")) {
		compareText(application, "Fetch Interfaces column header", "synchronization_FetchInterfacescolumn", "Fetch Interfaces", xml);
		}
		else if(Vistamart_column.equalsIgnoreCase("Yes")) {
			compareText(application, "VistaMart Device column header", "synchronization_vistamartdevicecolumn", "VistaMart Device", xml);
			}
		else if(PGW_column.equalsIgnoreCase("Yes")) {
			compareText(application, "PGW column header", "synchronization_pgwcolumn", "PGW", xml);
			}
		compareText(application, "Action column header", "synchronization_actioncolumn", "Action", xml);
		
		//verify Status panel column values
		compareText(application, "Device", "status_devicevalue", devicename, xml);
		String ServiceStatus= GetText(application, "Status", "status_statusvalue");
		if(ServiceStatus.equalsIgnoreCase(Inservice_status))
		{
			compareText(application, "Status", "status_statusvalue", Inservice_status, xml);
		}
		else
		{
			compareText(application, "Status", "status_statusvalue", Inmaintenance_status, xml);
		}
		
		//verify last modification
		try {
		String GMTValue;
		String LastModificationvalue= GetText(application, "Last Modification", "status_lastmodificationvalue");
		System.out.println("Last modified date: " +LastModificationvalue);
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-mm-dd mm:ss");
		
		if (LastModificationvalue.length() > 3) 
		{
		    GMTValue = LastModificationvalue.substring(LastModificationvalue.length() - 3);
		} 
		else
		{
			GMTValue = LastModificationvalue;
		}
		sa.assertEquals(GMTValue, "GMT");
				
		}catch(Exception e)
		{
			e.printStackTrace();
			ExtentTestManager.getTest().log(LogStatus.FAIL, "Step : Last Modification column value field is not displaying");
		}
		
		click_commonMethod(application, "Status", "status_statuslink", xml);
		Thread.sleep(2000);
			compareText(application, "Status page header", "Statuspage_header", "Device", xml);
			
			//verify field headers in status page
			compareText(application, "Name field header", "statuspage_nameheader", "Name", xml);
			compareText(application, "Vendor/Model field header", "statuspage_vendormodelheader", "Vendor/Model", xml);
			compareText(application, "Management Address field header", "statuspage_managementaddressheader", "Management Address", xml);
			compareText(application, "Snmpro field header", "statuspage_snmproheader", "Snmpro", xml);
			compareText(application, "Country field header", "statuspage_countryheader", "Country", xml);
			compareText(application, "City field header", "statuspage_cityheader", "City", xml);
			compareText(application, "Site field header", "statuspage_siteheader", "Site", xml);
			compareText(application, "Premise field header", "statuspage_premiseheader", "Premise", xml);
			
			//verify field values in status page
			compareText(application, "Name", "statuspage_namevalue", devicename, xml);
			compareText(application, "Vendor/Model", "statuspage_vendormodelvalue", vendormodel, xml);
			compareText(application, "Management Address", "statuspage_managementaddressvalue", managementaddress, xml);
			compareText(application, "Snmpro", "statuspage_snmprovalue", snmpro, xml);
			compareText(application, "Country", "statuspage_countryvalue", country, xml);
			compareText(application, "City", "statuspage_cityvalue", city, xml);
			compareText(application, "Site", "statuspage_sitevalue", site, xml);
			GetText(application, "Premise", "statuspage_premisevalue");
			
		compareText(application, "Status header", "Statuspage_statusheader", "Status", xml);
		compareText(application, "Current Status field header", "statuspage_currentstatusfieldheader", "Current Status", xml);
		compareText(application, "New Status field header", "statuspage_newstatusfieldheader", "New Status", xml);
		//compareText(application, "Current Status", "statuspage_currentstatusvalue", Inservice_status, xml);
		GetText(application, "Current Status", "statuspage_currentstatusvalue");
		click_commonMethod(application, "New Status Dropdown", "statuspage_newstatusdropdown", xml);
		WebElement selectNewStatusvalue= getwebelement(xml.getlocator("//locators/" + application + "/statuspage_newstatusdropdownvalue"));
		Clickon(selectNewStatusvalue);
		String NewStatusvalue= getwebelement(xml.getlocator("//locators/" + application + "/statuspage_newstatusdropdownvalue")).getText();
		ExtentTestManager.getTest().log(LogStatus.PASS, "New Status Value is: "+NewStatusvalue);
		click_commonMethod(application, "OK", "statuspage_okbutton", xml);
		waitforPagetobeenable();
		Thread.sleep(3000);
		verifysuccessmessage(application, "Device Status history successfully changed");
		Thread.sleep(1000);
		scrolltoend();
		//verify 'new status' table column headers
		compareText(application, "Status column header", "statuspage_statuscolumnheader", "Status", xml);
		compareText(application, "Changed On column header", "statuspage_changedon_columnheader", "Changed On", xml);
		compareText(application, "Changed By column header", "statuspage_changedby_columnheader", "Changed By", xml);
		
		//verify 'new status' table column values
		//Device status history table
		int TotalPages;
		String TotalPagesText = getwebelement("//div[@class='ag-div-margin row']//div//span[@ref='lbTotal']").getText();
		TotalPages = Integer.parseInt(TotalPagesText);
		System.out.println("Total number of pages in table is: " + TotalPages);

		if (TotalPages != 0) {

			outerloop:
			for (int k = 1; k <= TotalPages; k++) {

				String AddedInterface= getwebelement("//div[@role='grid']//div[@ref='eBodyViewport']/div").getAttribute("style");
				if(!AddedInterface.contains("height: 1px"))
				{
				List<WebElement> results = getwebelements("//div[@class='modal-content']//div[@class='ag-div-margin row']//div[@ref='eBodyContainer']//div[@role='row']");

				int numofrows = results.size();
				System.out.println("no of results: " + numofrows);

				if ((numofrows == 0)) {

					ExtentTestManager.getTest().log(LogStatus.PASS, "Device Status History is empty");
				}
				else {
				// Current page
				String CurrentPage = getwebelement("//div[@class='ag-div-margin row']//div//span[@ref='lbCurrent']").getText();
				int Current_page = Integer.parseInt(CurrentPage);
				System.out.println("The current page is: " + Current_page);

				sa.assertEquals(k, Current_page);

				System.out.println("Currently we are in page number: " + Current_page);
					for (int i = 0; i < numofrows; i++) {
						try {

							String Devicehistorydata = results.get(i).getText();
							System.out.println(Devicehistorydata);
							if (Devicehistorydata.contains(NewStatusvalue)) 
							{
								ExtentTestManager.getTest().log(LogStatus.PASS, "Device status history table has data");
								Thread.sleep(2000);
								compareText(application, "New Status", "statuspage_newstatusvalue", NewStatusvalue, xml);
								try {
									String GMTValue;
									String ChangedOnvalue= GetText(application, "Changed On", "statuspage_changedonvalue");
									System.out.println("Changed On value: " +ChangedOnvalue);
									SimpleDateFormat sdf= new SimpleDateFormat("yyyy-mm-dd mm:ss");
									
									if (ChangedOnvalue.length() > 3) 
									{
									    GMTValue = ChangedOnvalue.substring(ChangedOnvalue.length() - 3);
									} 
									else
									{
										GMTValue = ChangedOnvalue;
									}
									assertEquals(GMTValue, "GMT");
											
									}catch(Exception e)
									{
										e.printStackTrace();
										ExtentTestManager.getTest().log(LogStatus.FAIL, "Step : Changed on column value field is not displaying");
									}
								
								//compareText(application, "Changed By", "statuspage_changedbyvalue", Getkeyvalue("APT_login_1_Username"), xml);
								GetText(application, "Changed By", "statuspage_changedbyvalue");
								Thread.sleep(2000);
								click_commonMethod(application, "Close", "statuspage_closebutton", xml);
								break outerloop;
							}

						} catch (StaleElementReferenceException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();

						}
					}
				}
				}else
				{
					ExtentTestManager.getTest().log(LogStatus.INFO, "No interfaces added");

				}
			}
			
		}else {

			System.out.println("No data available in table");
			Log.info("No data available in table");
			ExtentTestManager.getTest().log(LogStatus.FAIL, "No data available in table");
		}
		
		//verify view interfaces page
		Thread.sleep(2000);
		click_commonMethod(application, "View Interfaces", "status_viewinterfaceslink", xml);
		Thread.sleep(2000);
		compareText(application, "Interface page header", "viewinterfacepage_header", "Interfaces", xml);
		//compareText(application, "Interface page subheader", "viewinterfacepage_interfacesubheader", "Interfaces", xml);
		
		//Added interface in table
		String AddedInterface= getwebelement("//div[@role='grid']//div[@ref='eBodyViewport']/div").getAttribute("style");
		if(!AddedInterface.contains("height: 1px"))
		{
		compareText(application, "Device Name column header", "viewinterface_devicenamecolumnheader", "Device Name", xml);
		compareText(application, "Interface Name column header", "interfacename_columnheader", "Interface Name", xml);
		compareText(application, "Interface Address column header", "interfaceaddress_columnheader", "Interface Address", xml);
		WebElement InterfaceAddressRowValue= driver.findElement(By.xpath("(//div[@role='gridcell'][@col-id='address'])[1]"));
		Clickon(InterfaceAddressRowValue);
		InterfaceAddressRowValue.sendKeys(Keys.TAB);
		compareText(application, "Interface Type column header", "interfacetype_columnheader", "Interface Type", xml);
		WebElement InterfaceTypeRowValue= getwebelement(xml.getlocator("//locators/" + application + "/interfacetype_rowvalue"));
		Clickon(InterfaceTypeRowValue);
		InterfaceTypeRowValue.sendKeys(Keys.TAB);
		compareText(application, "Status column header", "viewinterface_status_columnheader", "Status", xml);
		WebElement StatusRowValue= getwebelement(xml.getlocator("//locators/" + application + "/viewinterface_status_rowvalue"));
		Clickon(StatusRowValue);
		StatusRowValue.sendKeys(Keys.TAB);
		compareText(application, "Last Modification column header", "viewinterface_lastmod_columnheader", "Last Modification", xml);
		
		Thread.sleep(1000);
		click_commonMethod(application, "Close", "viewinterface_closebutton", xml);
		Thread.sleep(2000);
		click_commonMethod(application, "View Interfaces", "status_viewinterfaceslink", xml);
		Thread.sleep(2000);
		
		int TotalPages1;
		String TotalPagesText1 = getwebelement("//div[@class='ag-div-margin row']//div//span[@ref='lbTotal']").getText();
		TotalPages1 = Integer.parseInt(TotalPagesText1);
		System.out.println("Total number of pages in table is: " + TotalPages1);

		if (TotalPages1 != 0) {

			outerloop:
			for (int k = 1; k <= TotalPages1; k++) {

				List<WebElement> results = getwebelements("//div[@role='row']//div[@role='gridcell'][@col-id='name']");

				int numofrows = results.size();
				System.out.println("no of results: " + numofrows);

				if ((numofrows == 0)) {

					ExtentTestManager.getTest().log(LogStatus.PASS, "Interface table is empty");
				}
				else {
				// Current page
				String CurrentPage = getwebelement("//div[@class='ag-div-margin row']//div//span[@ref='lbCurrent']").getText();
				int Current_page = Integer.parseInt(CurrentPage);
				System.out.println("The current page is: " + Current_page);

				sa.assertEquals(k, Current_page);

				System.out.println("Currently we are in page number: " + Current_page);
					for (int i = 0; i < numofrows; i++) {
						try {

							String AddedInterfacedata = results.get(i).getText();
							System.out.println(AddedInterfacedata);
							if (AddedInterfacedata.equalsIgnoreCase(interfacename)) {

								String InterfaceNameRowID= getwebelement("//div[@role='gridcell'][text()='"+interfacename+"']/parent::div[@role='row']").getAttribute("row-id");
								System.out.println("Interface row id: "+InterfaceNameRowID);
								
								//verify interface values in table
								String DeviceNamevalue= getwebelement("//div[@role='gridcell']/parent::div[@row-id="+InterfaceNameRowID+"]//div[@col-id='deviceName']").getText();
								ExtentTestManager.getTest().log(LogStatus.PASS, "Step: Interface Device Name value is displayed as : "+DeviceNamevalue);
								String InterfaceNamevalue= getwebelement("//div[@role='gridcell']/parent::div[@row-id="+InterfaceNameRowID+"]//div[@col-id='name']").getText();
								ExtentTestManager.getTest().log(LogStatus.PASS, "Step: Interface Name value is displayed as : "+InterfaceNamevalue);
								String InterfaceAddressvalue= getwebelement("//div[@role='gridcell']/parent::div[@row-id="+InterfaceNameRowID+"]//div[@col-id='address']").getText();
								ExtentTestManager.getTest().log(LogStatus.PASS, "Step: Interface Address value is displayed as : "+InterfaceAddressvalue);
								WebElement InterfaceAddressRowValue1= driver.findElement(By.xpath("(//div[@role='gridcell'][@col-id='address'])[1]"));
								Clickon(InterfaceAddressRowValue1);
								InterfaceAddressRowValue1.sendKeys(Keys.TAB);
								String InterfaceTypevalue= getwebelement("//div[@role='gridcell']/parent::div[@row-id="+InterfaceNameRowID+"]//div[@col-id='type.desc']").getText();
								ExtentTestManager.getTest().log(LogStatus.PASS, "Step: Interface Type value is displayed as : "+InterfaceTypevalue);
								WebElement InterfaceTypeRowValue1= getwebelement(xml.getlocator("//locators/" + application + "/interfacetype_rowvalue"));
								Clickon(InterfaceTypeRowValue1);
								InterfaceTypeRowValue1.sendKeys(Keys.TAB);
								String Statusvalue= getwebelement("//div[@role='gridcell']/parent::div[@row-id="+InterfaceNameRowID+"]//div[@col-id='currentStatus.desc']").getText();
								ExtentTestManager.getTest().log(LogStatus.PASS, "Step: Status value is displayed as : "+Statusvalue);
								WebElement StatusRowValue1= getwebelement(xml.getlocator("//locators/" + application + "/viewinterface_status_rowvalue"));
								Clickon(StatusRowValue1);
								StatusRowValue1.sendKeys(Keys.TAB);
								String LastModificationvalue= getwebelement("//div[@role='gridcell']/parent::div[@row-id="+InterfaceNameRowID+"]//div[@col-id='m_time']").getText();
								ExtentTestManager.getTest().log(LogStatus.PASS, "Step: Last Modification value is displayed as : "+LastModificationvalue);
								WebElement LastModificationRowValue= getwebelement(xml.getlocator("//locators/" + application + "/viewinterface_lastmod_rowvalue"));
								Clickon(LastModificationRowValue);
								LastModificationRowValue.sendKeys(Keys.TAB);
								WebElement StatusLink= getwebelement("//div[@role='gridcell']/parent::div[@row-id="+InterfaceNameRowID+"]//div[@col-id='Status']/div/a");
								Clickon(StatusLink);
								ExtentTestManager.getTest().log(LogStatus.PASS, "Step: Clicked on Status link in interface table");
								
								InterfaceAddress= InterfaceAddressvalue;
								break outerloop;
							}
							
						} catch (StaleElementReferenceException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();

						}
					}
					Clickon(getwebelement("//div[@class='ag-div-margin row']//div//button[text()='Next']"));
					Thread.sleep(3000);
				}
			}
			
		//verify status page headers & field names
		compareText(application, "Interface header", "statuspage_interfaceheader", "Interface", xml);
		compareText(application, "Name field header", "interface_statuspage_namefield", "Name", xml);
		compareText(application, "Interface Address field header", "interface_statuspage_interfaceaddressfield", "Interface Address", xml);
		compareText(application, "Status header", "interface_statuspage_statusheader", "Status", xml);
		compareText(application, "Current Status field header", "interface_statuspage_currentstatusfield", "Current Status", xml);
		compareText(application, "New Status field header", "interface_statuspage_newstatusfield", "New Status", xml);
		
		//verify status page field values
		compareText(application, "Name", "interface_statuspage_namevalue", interfacename, xml);
		compareText(application, "Interface Address", "interface_statuspage_interfaceaddressvalue", InterfaceAddress, xml);
		//compareText(application, "Current Status", "interface_statuspage_currentstatusvalue", Inservice_status, xml);
		GetText(application, "Current Status", "interface_statuspage_currentstatusvalue");
		click_commonMethod(application, "New Status Dropdown", "interface_statuspage_newstatusdropdown", xml);
		WebElement selectNewStatusvalue1= getwebelement(xml.getlocator("//locators/" + application + "/interface_statuspage_newstatusdropdownvalue"));
		Clickon(selectNewStatusvalue1);
		String NewStatusvalue1= getwebelement(xml.getlocator("//locators/" + application + "/interface_statuspage_newstatusdropdownvalue")).getText();
		ExtentTestManager.getTest().log(LogStatus.PASS, "New Status Value is: "+NewStatusvalue1);
		click_commonMethod(application, "OK", "interface_statuspage_okbutton", xml);
		waitforPagetobeenable();
		Thread.sleep(3000);
		verifysuccessmessage(application, "Interface Status History successfully changed.");
		scrolltoend();
		Thread.sleep(1000);
		//verify 'new status' table column headers
		compareText(application, "Status column header", "interface_statuspage_statuscolumnheader", "Status", xml);
		compareText(application, "Changed On column header", "interface_statuspage_changedon_columnheader", "Changed On", xml);
		compareText(application, "Changed By column header", "interface_statuspage_changedby_columnheader", "Changed By", xml);
		
		//verify 'new status' table column values
		//verify interface status history table
		int TotalPages2=0;
		String TotalPagesText2 = getwebelement("(//div[@class='ag-div-margin row']//div//span[@ref='lbTotal'])[1]").getText();
		TotalPages2 = Integer.parseInt(TotalPagesText2);
		System.out.println("Total number of pages in table is: " + TotalPages2);

		if (TotalPages2 != 0) {

			outerloop:
			for (int k = 1; k <= TotalPages2; k++) {

				List<WebElement> results = getwebelements("(//div[@ref='eBodyContainer'])[2]//div[@role='row']");

				int numofrows = results.size();
				System.out.println("no of results: " + numofrows);

				if ((numofrows == 0)) {

					ExtentTestManager.getTest().log(LogStatus.PASS, "Interface Status History is empty");
				}
				else {
				// Current page
				String CurrentPage = getwebelement("(//div[@class='ag-div-margin row']//div//span[@ref='lbCurrent'])[1]").getText();
				int Current_page = Integer.parseInt(CurrentPage);
				System.out.println("The current page is: " + Current_page);

				sa.assertEquals(k, Current_page);

				System.out.println("Currently we are in page number: " + Current_page);
					for (int i = 0; i < numofrows; i++) {
						try {
							String Interfacehistorydata = results.get(i).getText();
							System.out.println(Interfacehistorydata);
							if (Interfacehistorydata.contains(NewStatusvalue1)) 
							{
								ExtentTestManager.getTest().log(LogStatus.PASS, "Interface status history table has data");
								Thread.sleep(2000);
								compareText(application, "New Status", "interface_statuspage_newstatusvalue", NewStatusvalue1, xml);
								try {
									String GMTValue;
									String ChangedOnvalue= GetText(application, "Changed On", "interface_statuspage_changedonvalue");
									System.out.println("Changed On value: " +ChangedOnvalue);
									SimpleDateFormat sdf= new SimpleDateFormat("yyyy-mm-dd mm:ss");
									
									if (ChangedOnvalue.length() > 3)
									{
									    GMTValue = ChangedOnvalue.substring(ChangedOnvalue.length() - 3);
									} 
									else
									{
										GMTValue = ChangedOnvalue;
									}
									sa.assertEquals(GMTValue, "GMT");
											
									}catch(Exception e)
									{
										e.printStackTrace();
										ExtentTestManager.getTest().log(LogStatus.FAIL, "Step : Changed On column value field is not displaying");
									}
								
								//compareText(application, "Changed By", "interface_statuspage_changedbyvalue", Getkeyvalue("APT_login_1_Username"), xml);
								GetText(application, "Changed By", "interface_statuspage_changedbyvalue");
								Thread.sleep(2000);
								click_commonMethod(application, "Close", "interface_statuspage_closebutton", xml);
								break outerloop;
							}

						} catch (StaleElementReferenceException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();

						}
					}
				}
			}
			
		}else {

			System.out.println("No data available in status history table");
			Log.info("No data available in status history table");
			ExtentTestManager.getTest().log(LogStatus.FAIL, "No data available in status history table");
		}
		}else {

			System.out.println("No data available in Interface table");
			Log.info("No data available in Interface table");
			ExtentTestManager.getTest().log(LogStatus.FAIL, "No data available in Interface table");
		}
		}else
		{
			ExtentTestManager.getTest().log(LogStatus.PASS, "No Interface added in table");
		}
		
		click_commonMethod(application, "Close", "viewinterface_closebutton", xml);
		Thread.sleep(2000);
		
		//verify synchronization panel column values
		Thread.sleep(2000);
		compareText(application, "Device", "synchronization_devicevalue", devicename, xml);
		GetText(application, "Sync Status", "synchronization_syncstatusvalue");
		
		if(FMC_column.equalsIgnoreCase("Yes"))
		{
		//verify FMC value
				GetText(application, "FMC", "synchronization_fmcvalue");
				//verify FMC date time 
				try {
					String GMTValue;
					String FMCvalue= getwebelement(xml.getlocator("//locators/" + application + "/fmc_datetimevalue")).getText();
					String FMCDateTimevalue= "";
					if (FMCvalue.length() > 20) 
					{
						FMCDateTimevalue = FMCvalue.substring(FMCvalue.length() - 20);
						System.out.println("last 20 characters:"+FMCDateTimevalue);
					} 
					else 
					{
						FMCDateTimevalue = FMCvalue;
					}

					ExtentTestManager.getTest().log(LogStatus.PASS, "FMC date value is displayed as: "+FMCDateTimevalue);
					SimpleDateFormat sdf= new SimpleDateFormat("yyyy-mm-dd mm:ss");
					if (FMCDateTimevalue.length() > 3) 
					{
					    GMTValue = FMCDateTimevalue.substring(FMCDateTimevalue.length() - 3);
					} 
					else
					{
						GMTValue = FMCDateTimevalue;
					}
					assertEquals(GMTValue, "GMT");
					
					}catch(Exception e)
					{
						e.printStackTrace();
						ExtentTestManager.getTest().log(LogStatus.FAIL, "Step : FMC date value field is not displaying");
					}
		}
		else if(SMARTS_column.equalsIgnoreCase("Yes"))
		{
		//verify smarts value
		GetText(application, "Smarts", "synchronization_smartsvalue");
		//verify smarts date time 
		try {
			String GMTValue;
			String Smartsvalue= getwebelement(xml.getlocator("//locators/" + application + "/smarts_datetimevalue")).getText();
			String SmartsDateTimevalue= "";
			if (Smartsvalue.length() > 20) 
			{
				SmartsDateTimevalue = Smartsvalue.substring(Smartsvalue.length() - 20);
				System.out.println("last 20 characters:"+SmartsDateTimevalue);
			} 
			else 
			{
				SmartsDateTimevalue = Smartsvalue;
			}

			ExtentTestManager.getTest().log(LogStatus.PASS, "Smarts date value is displayed as: "+SmartsDateTimevalue);
			SimpleDateFormat sdf= new SimpleDateFormat("yyyy-mm-dd mm:ss");
			if (SmartsDateTimevalue.length() > 3) 
			{
			    GMTValue = SmartsDateTimevalue.substring(SmartsDateTimevalue.length() - 3);
			} 
			else
			{
				GMTValue = SmartsDateTimevalue;
			}
			assertEquals(GMTValue, "GMT");
			
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		else if(DCS_column.equalsIgnoreCase("Yes"))
		{
			//verify DCS value
				GetText(application, "DCS", "synchronization_dcsvalue");
				//verify DCS date time
				try {
					String GMTValue;
					String DCSvalue= getwebelement(xml.getlocator("//locators/" + application + "/dcs_datetime")).getText();
					String DCS_DateTimevalue= "";
					if (DCSvalue.length() > 20) 
					{
						DCS_DateTimevalue = DCSvalue.substring(DCSvalue.length() - 20);
						System.out.println("last 20 characters:"+DCS_DateTimevalue);
					} 
					else 
					{
						DCS_DateTimevalue = DCSvalue;
					}
					
					ExtentTestManager.getTest().log(LogStatus.PASS, "DCS date value is displayed as: "+DCS_DateTimevalue);
					SimpleDateFormat sdf= new SimpleDateFormat("yyyy-mm-dd mm:ss");
					if (DCS_DateTimevalue.length() > 3) 
					{
					    GMTValue = DCS_DateTimevalue.substring(DCS_DateTimevalue.length() - 3);
					} 
					else
					{
						GMTValue = DCS_DateTimevalue;
					}
					assertEquals(GMTValue, "GMT");
					
					}catch(Exception e)
					{
						e.printStackTrace();
						ExtentTestManager.getTest().log(LogStatus.FAIL, "Step : DCS date value field is not displaying");
					}
		}
		else if(FetchInterfaces_column.equalsIgnoreCase("Yes"))
		{
		//verify fetch interfaces value
		GetText(application, "Fetch Interfaces", "synchronization_fetchinterfacesvalue");
		//verify fetch interfaces date time
		try {
			String GMTValue;
			String FetchInterfacesvalue= getwebelement(xml.getlocator("//locators/" + application + "/fetchinterfaces_datetime")).getText();
			String FetchInterfaces_DateTimevalue= "";
			if (FetchInterfacesvalue.length() > 20) 
			{
				FetchInterfaces_DateTimevalue = FetchInterfacesvalue.substring(FetchInterfacesvalue.length() - 20);
				System.out.println("last 20 characters:"+FetchInterfaces_DateTimevalue);
			} 
			else 
			{
				FetchInterfaces_DateTimevalue = FetchInterfacesvalue;
			}

			ExtentTestManager.getTest().log(LogStatus.PASS, "Fetch Interfaces date value is displayed as: "+FetchInterfaces_DateTimevalue);
			SimpleDateFormat sdf= new SimpleDateFormat("yyyy-mm-dd mm:ss");
			if (FetchInterfaces_DateTimevalue.length() > 3) 
			{
			    GMTValue = FetchInterfaces_DateTimevalue.substring(FetchInterfaces_DateTimevalue.length() - 3);
			} 
			else
			{
				GMTValue = FetchInterfaces_DateTimevalue;
			}
			assertEquals(GMTValue, "GMT");
			
			}catch(Exception e)
			{
				e.printStackTrace();
				ExtentTestManager.getTest().log(LogStatus.FAIL, "Step : Fetch Interfaces date value field is not displaying");
			}
		}
		else if(Vistamart_column.equalsIgnoreCase("Yes")) {
			//verify vistamart device value
			GetText(application, "VistaMart Device", "synchronization_vistamartdevicevalue");
			//verify vistamart device date time
			try {
				String GMTValue;
				String VistaMartDevicevalue= getwebelement(xml.getlocator("//locators/" + application + "/vistamartdevice_datetime")).getText();
				String VistaMartDevice_DateTimevalue= "";
				if (VistaMartDevicevalue.length() > 20) 
				{
					VistaMartDevice_DateTimevalue = VistaMartDevicevalue.substring(VistaMartDevicevalue.length() - 20);
					System.out.println("last 20 characters:"+VistaMartDevice_DateTimevalue);
				} 
				else 
				{
					VistaMartDevice_DateTimevalue = VistaMartDevicevalue;
				}
				
				ExtentTestManager.getTest().log(LogStatus.PASS, "Vistamart Device date value is displayed as: "+VistaMartDevice_DateTimevalue);
				SimpleDateFormat sdf= new SimpleDateFormat("yyyy-mm-dd mm:ss");
				if (VistaMartDevice_DateTimevalue.length() > 3) 
				{
				    GMTValue = VistaMartDevice_DateTimevalue.substring(VistaMartDevice_DateTimevalue.length() - 3);
				} 
				else
				{
					GMTValue = VistaMartDevice_DateTimevalue;
				}
				assertEquals(GMTValue, "GMT");
				
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			
		}
		else if(PGW_column.equalsIgnoreCase("Yes")) {
			//verify PGW value
			GetText(application, "PGW", "synchronization_pgwvalue");
			//verify PGW date time
			try {
				String GMTValue;
				String PGWvalue= getwebelement(xml.getlocator("//locators/" + application + "/pgw_datetime")).getText();
				String PGW_DateTimevalue= "";
				if (PGWvalue.length() > 20) 
				{
					PGW_DateTimevalue = PGWvalue.substring(PGWvalue.length() - 20);
					System.out.println("last 20 characters:"+PGW_DateTimevalue);
				} 
				else 
				{
					PGW_DateTimevalue = PGWvalue;
				}
				
				ExtentTestManager.getTest().log(LogStatus.PASS, "PGW date value is displayed as: "+PGW_DateTimevalue);
				SimpleDateFormat sdf= new SimpleDateFormat("yyyy-mm-dd mm:ss");
				if (PGW_DateTimevalue.length() > 3) 
				{
				    GMTValue = PGW_DateTimevalue.substring(PGW_DateTimevalue.length() - 3);
				} 
				else
				{
					GMTValue = PGW_DateTimevalue;
				}
				assertEquals(GMTValue, "GMT");
				
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			
		}
		//verify synchronize link
		Thread.sleep(2000);
		click_commonMethod(application, "Synchronize", "synchronization_synchronizelink", xml);
		waitforPagetobeenable();
		Thread.sleep(3000);
		verifysuccessmessage(application, "Sync started successfully. Please check the sync status of this device.");
		Thread.sleep(1000);
		
		//verify device name link in status panel
		click(application, "Device", "status_devicevalue", xml);
		Thread.sleep(2000);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step: Navigated to 'View Device' page");
		driver.navigate().back();
		Thread.sleep(1000);
		
		//verify device name link in synchronization panel
		click(application, "Device", "synchronization_devicevalue", xml);
		Thread.sleep(2000);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Step: Navigated to 'View Device' page");
		Thread.sleep(2000);
	}
	
	
	public void searchdevice(String application, String devicename) throws InterruptedException, DocumentException, IOException {

		Moveon(getwebelement(xml.getlocator("//locators/" + application + "/managecoltnetworklink")));
		Thread.sleep(1000);
		Clickon(getwebelement(xml.getlocator("//locators/" + application + "/searchdevicelink")));
		SendKeys(getwebelement(xml.getlocator("//locators/" + application + "/devicenamefield")),devicename);
		Thread.sleep(1000);
		ScrolltoElement(application, "searchbutton", xml);
		WebElement searchbutton= getwebelement(xml.getlocator("//locators/" + application + "/searchbutton"));
		Clickon(searchbutton);
		waitforPagetobeenable();
		ScrolltoElement(application, "searchbutton", xml);
		Clickon(getwebelement(xml.getlocator("//locators/" + application + "/deviceradiobutton")));
		Thread.sleep(1000);
		Clickon(getwebelement(xml.getlocator("//locators/" + application + "/searchdevice_actiondropdown")));
		Clickon(getwebelement(xml.getlocator("//locators/" + application + "/managelink")));
		Thread.sleep(1000);
	}

	
	//========================= Common Methods =========================================
	
	public void cleartext(String application, String labelname, String xpath) throws InterruptedException, DocumentException {
		WebElement element= null;
		try {
			Thread.sleep(1000);
			element = getwebelement(xml.getlocator("//locators/" + application + "/"+ xpath +""));
			String value= getwebelement(xml.getlocator("//locators/" + application + "/"+ xpath +"")).getAttribute("value");
			if(element==null)
			{
				ExtentTestManager.getTest().log(LogStatus.FAIL, "Step:  '"+labelname+"' not found");
			}
			else if(value!=null) {
				Thread.sleep(1000);
				element.clear();	
			}			
		} catch (Exception e) {
			e.printStackTrace();
			ExtentTestManager.getTest().log(LogStatus.FAIL, "Step:  '"+labelname+"' not found");
		}
	}

	public void isDisplayed(String application, String xpath, String labelname) {
		boolean availability = false;

		try {
			Thread.sleep(1000);
			availability= getwebelement(xml.getlocator("//locators/" + application + "/"+ xpath +"")).isDisplayed();
			System.out.println(availability);
			if (availability) {
				Thread.sleep(2000);
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step: '"+labelname+"' is displayed as expected");
			}
			else {
				ExtentTestManager.getTest().log(LogStatus.FAIL, "Step: '"+labelname+"' is not displaying as expected");
			}

		} catch (Exception e) {
			ExtentTestManager.getTest().log(LogStatus.FAIL,"Step: '"+labelname+"' is not available to display");
			e.printStackTrace();
		}
	}
	
	public String GetText(String application, String labelname, String xpath) throws InterruptedException, DocumentException {

		String text = null;
		WebElement element = null;

		try {
			Thread.sleep(1000);
			element = getwebelement(xml.getlocator("//locators/" + application + "/"+ xpath +"")); 
			String ele = getwebelement(xml.getlocator("//locators/" + application + "/"+ xpath +"")).getAttribute("value");
			if(element==null)
			{
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step : '"+ labelname +"' is not found");
			}
			else if (ele!=null && ele.isEmpty()) {
				ExtentTestManager.getTest().log(LogStatus.PASS, "Step : '"+ labelname +"' value is empty");
			}
			else {   

				text = element.getText();
				ExtentTestManager.getTest().log(LogStatus.PASS,"Step: '"+ labelname +"' value is displayed as : '"+text+"'");

			}
		}catch (Exception e) {
			ExtentTestManager.getTest().log(LogStatus.FAIL,"Step: '"+ labelname +"' value is not displaying");
			e.printStackTrace();
		}
		return text;

	}

	public void verifysuccessmessage(String application, String expected) throws InterruptedException {

		scrollToTop();
		Thread.sleep(3000);
		try {	

			boolean successMsg=getwebelement(xml.getlocator("//locators/" + application + "/alertMsg")).isDisplayed();

			if(successMsg) {

				String alrtmsg=getwebelement(xml.getlocator("//locators/" + application + "/AlertForServiceCreationSuccessMessage")).getText();

				if(expected.contains(alrtmsg)) {

					ExtentTestManager.getTest().log(LogStatus.PASS,"Message is verified. It is displaying as: "+alrtmsg);
					System.out.println("Message is verified. It is displaying as: "+alrtmsg);
					successScreenshot(application);
					
				}else {

					ExtentTestManager.getTest().log(LogStatus.FAIL, "Message is displaying and it gets mismatches. It is displaying as: "+ alrtmsg +" .The Expected value is: "+ expected);
					System.out.println("Message is displaying and it gets mismatches. It is displaying as: "+ alrtmsg);
					successScreenshot(application);
				}

			}else {
				ExtentTestManager.getTest().log(LogStatus.FAIL, " Success Message is not displaying");
				System.out.println(" Success Message is not displaying");
			}

		}catch(Exception e) {
			Log.info("Failure in fetching success message ");
			ExtentTestManager.getTest().log(LogStatus.FAIL, expected+ " Message is not displaying");
			System.out.println(expected+ " message is not getting dislpayed");
			successScreenshot(application);
		}

	}

	
}
