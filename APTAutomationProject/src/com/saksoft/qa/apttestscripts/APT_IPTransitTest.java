package com.saksoft.qa.apttestscripts;

import java.io.IOException;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.dom4j.DocumentException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import com.saksoft.qa.driverlibrary.DataReader_PK;
import com.saksoft.qa.driverlibrary.DriverTestcase;
import com.saksoft.qa.scripthelpers.APT_LoginHelper;

public class APT_IPTransitTest extends DriverTestcase{
	
	
	@Test(description = "TC-01",dataProviderClass = DataReader_PK.class, dataProvider = "Finaldatareader_IPTransit", priority=0)
	public void CreateCustomer(Map<String, String> map) throws Exception {
		
		DriverTestcase.logger = DriverTestcase.extent.startTest("CreateCustomer"); 
		APT_IPTransitHelper.get().createcustomer("iptransit", map.get("Name"), map.get("MainDomain"), map.get("CountryToBeSelected"), map.get("OCN"), map.get("Reference"),  map.get("TechnicalContactName"), map.get("TypeToBeSelected"), map.get("Email"), map.get("Phone"), map.get("Fax"));		
	} 
	
	@Test(description = "TC-02",dataProviderClass = DataReader_PK.class, dataProvider = "Finaldatareader_IPTransit", priority=1)
    public void choosecustomer(Map<String, String> map) throws InterruptedException, DocumentException, IOException {
		
		DriverTestcase.logger = DriverTestcase.extent.startTest("choosecustomer"); 
		APT_IPTransitHelper.get().selectCustomertocreateOrder("iptransit",map.get("ChooseCustomerToBeSelected"),map.get("Name1"),map.get("Name2"));
		
	}


	@Test(description = "TC-03",dataProviderClass = DataReader_PK.class, dataProvider = "Finaldatareader_IPTransit", priority=2)
	 public void verifycreateorder(Map<String, String> map) throws InterruptedException, DocumentException, IOException {
		
		DriverTestcase.logger = DriverTestcase.extent.startTest("verifyneworder");
		APT_IPTransitHelper.get().createorderservice("iptransit", map.get("NewOrderService"), map.get("NewOrderNumber"), map.get("NewRFIREQNumber"), map.get("ExistingOrderService"), map.get("ExistingOrderNumber"));
	}
	
		
	@Test(description = "TC-04",dataProviderClass = DataReader_PK.class, dataProvider = "Finaldatareader_IPTransit", priority=3)
	 public void verifyservicetypeselection(Map<String, String> map) throws InterruptedException, DocumentException, IOException {
		
		DriverTestcase.logger = DriverTestcase.extent.startTest("verifyservicetypeselection");
		APT_IPTransitHelper.get().verifyselectservicetype("iptransit", map.get("ServiceType"));
	}
	
	
	@Test(description = "TC-05",dataProviderClass = DataReader_PK.class, dataProvider = "Finaldatareader_IPTransit", priority=4)
	 public void verifyservicecreation(Map<String, String> map) throws InterruptedException, DocumentException, IOException {
		
		DriverTestcase.logger = DriverTestcase.extent.startTest("verifyservicecreation");
		APT_IPTransitHelper.get().verifyservicecreation("iptransit", map.get("ServiceIdentification"), map.get("Remarks"),  map.get("NewOrderNumber"), map.get("NewRFIREQNumber"), map.get("ServiceType"), map.get("TerminationDate"), map.get("BillingTypevalue"), map.get("Email"), map.get("PhoneContact"), map.get("PerformanceReporting_Checkbox"), map.get("IPGuardian_Checkbox"));
	}
	
	
	@Test(description = "TC-06",dataProviderClass = DataReader_PK.class, dataProvider = "Finaldatareader_IPTransit", priority=5)
	 public void verifyCustomerDetailsInformation(Map<String, String> map) throws InterruptedException, DocumentException, IOException {
		
		DriverTestcase.logger = DriverTestcase.extent.startTest("verifyCustomerDetailsInformation");
		//APT_IPTransitHelper.get().searchorder("iptransit", map.get("ServiceIdentification"));
		APT_IPTransitHelper.get().verifyCustomerDetailsInformation("iptransit", map.get("Name"), map.get("MainDomain"), map.get("CountryToBeSelected"), map.get("OCN"), map.get("Reference"),  map.get("TechnicalContactName"), map.get("TypeToBeSelected"), map.get("Email"), map.get("Phone"), map.get("Fax"));
		APT_IPTransitHelper.get().verifyUserDetailsInformation("iptransit", map.get("LoginColumn"), map.get("NameColumn"), map.get("EmailColumn"), map.get("RolesColumn"), map.get("AddressColumn"), map.get("ResourceColumn"));
	}
		
	@Test(description = "TC-07",dataProviderClass = DataReader_PK.class, dataProvider = "Finaldatareader_IPTransit", priority=6)
	public void verifyUserDetailsInformation(Map<String, String> map) throws InterruptedException, DocumentException, IOException {
			
		DriverTestcase.logger = DriverTestcase.extent.startTest("verifyUserDetailsInformation");
		//APT_IPTransitHelper.get().searchorder("iptransit", map.get("ServiceIdentification"));
		APT_IPTransitHelper.get().createnewuser("iptransit", map.get("UserName"), map.get("FirstName"), map.get("SurName"), map.get("PostalAddress"), map.get("UserEmail"), map.get("Phone"), map.get("EditUserName"), map.get("EditFirstName"), map.get("EditSurName"), map.get("EditPostalAddress"), map.get("EditEmail"), map.get("EditPhone"), map.get("IPGuardianAccountGroup"), map.get("ColtOnlineUser"), map.get("SelectRole"));
		
	}
	
	@Test(description = "TC-08",dataProviderClass = DataReader_PK.class, dataProvider = "Finaldatareader_IPTransit", priority=7)
	public void verifyOrderDetailsInformation(Map<String, String> map) throws InterruptedException, DocumentException, IOException {
		
		DriverTestcase.logger = DriverTestcase.extent.startTest("verifyOrderDetailsInformation");
		//APT_IPTransitHelper.get().searchorder("iptransit", map.get("ServiceIdentification"));
		//APT_IPTransitHelper.get().verifyorderpanelinformation_Existingorder("iptransit", map.get("Existing OrderService"), map.get("ExistingOrderNumber"), map.get("Existing RFIREQNumber"));
		APT_IPTransitHelper.get().verifyorderpanelinformation_Neworder("iptransit", map.get("NewOrderService"), map.get("NewOrderNumber"), map.get("NewRFIREQNumber"));
		APT_IPTransitHelper.get().verifyorderpanel_editorder("iptransit", map.get("EditOrder_OrderNumber"), map.get("EditOrder_VoicelineNumber"));
		APT_IPTransitHelper.get().verifyorderpanel_changeorder("iptransit", map.get("ChangeOrder_OrderNumber"), map.get("ChangeOrder_VoicelineNumber"));
		
	}
	
	@Test(description = "TC-09",dataProviderClass = DataReader_PK.class, dataProvider = "Finaldatareader_IPTransit", priority=8)
	 public void verifyServicepanelinviewservicepage(Map<String, String> map) throws InterruptedException, DocumentException, IOException {
		
		DriverTestcase.logger = DriverTestcase.extent.startTest("verifyServicepanelinviewservicepage");
		//APT_IPTransitHelper.get().searchorder("iptransit", map.get("ServiceIdentification"));
	  	APT_IPTransitHelper.get().verifyservicepanelInformationinviewservicepage("iptransit", map.get("ServiceIdentification"), map.get("ServiceType"), map.get("Remarks"), map.get("TerminationDate"), map.get("BillingTypevalue"), map.get("Email"), map.get("PhoneContact"));
		APT_IPTransitHelper.get().verifyservicepanel_links("iptransit", map.get("EditRemarks"), map.get("Remarks"), map.get("ServiceIdentification"), map.get("Edit_TerminationDate"), map.get("Edit_BillingTypevalue"), map.get("Edit_Email"), map.get("Edit_PhoneContact"), map.get("Edit_PerformanceReporting_Checkbox"), map.get("Edit_IPGuardian_Checkbox"));
		//APT_IPTransitHelper.get().verifyManageService("iptransit", map.get("ChangeOrder_OrderNumber"), map.get("ServiceIdentification"), map.get("ServiceType"), map.get("ServiceStatus"), map.get("syncstatus"), map.get("ServiceStatusChangeRequired"));
	}
	
	@Test(description = "TC-10",dataProviderClass = DataReader_PK.class, dataProvider = "Finaldatareader_IPTransit", priority=9)
	 public void verifyManagementOptionspanel(Map<String, String> map) throws InterruptedException, DocumentException, IOException {
		
		DriverTestcase.logger = DriverTestcase.extent.startTest("verifyManagementOptionspanel");
		//APT_IPTransitHelper.get().searchorder("iptransit", map.get("ServiceIdentification"));
		APT_IPTransitHelper.get().verifyManagementOptionspanel("iptransit", map.get("PerformanceReporting_Checkbox"), map.get("IPGuardian_Checkbox"));
	
	}

	@Test(description = "TC-11",dataProviderClass = DataReader_PK.class, dataProvider = "Finaldatareader_IPTransit", priority=10)
	public void addExistingPEDevice(Map<String, String> map) throws InterruptedException, DocumentException, IOException {
		
		DriverTestcase.logger = DriverTestcase.extent.startTest("addExistingPEDevice");
		//APT_IPTransitHelper.get().searchorder("iptransit", map.get("ServiceIdentification"));
		APT_IPTransitHelper.get().addExistingPEDevice("iptransit", map.get("ExistingDeviceName"));
		APT_IPTransitHelper.get().verifyExistingDevice_ViewDevicedetails("iptransit", map.get("ExistingDeviceName"));
		APT_IPTransitHelper.get().deleteExistingDevice("iptransit", map.get("ExistingDeviceName"));
		
	}	
		
	 
	@Test(description = "TC-12",dataProviderClass = DataReader_PK.class, dataProvider = "Finaldatareader_IPTransit", priority=11)
	public void addNewPEDevice(Map<String, String> map) throws InterruptedException, DocumentException, IOException {
		
		DriverTestcase.logger = DriverTestcase.extent.startTest("addNewPEDevice");
		//APT_IPTransitHelper.get().searchorder("iptransit", map.get("ServiceIdentification"));
		APT_IPTransitHelper.get().navigateToAddNewDevicepage("iptransit");
		APT_IPTransitHelper.get().verifyadddevicefields("iptransit");
		APT_IPTransitHelper.get().addNewPEDevice("iptransit", map.get("DeviceName"), map.get("DeviceType"), map.get("VendorModel"), map.get("Telnet"), map.get("SSH"), map.get("Snmp2C"), map.get("SnmPro"), map.get("Snmprw"), 
													map.get("SnmProNewValue"), map.get("SnmprwNewValue"), map.get("Snmp3"), map.get("Snmpv3Username"),
													map.get("Snmpv3Authpassword"), map.get("Snmpv3Privpassword"), map.get("Snmpv3UsernameNewValue"), 
													map.get("Snmpv3AuthpasswordNewValue"), map.get("Snmpv3PrivpasswordNewValue"),
													map.get("Country"), map.get("ManagementAddress"), map.get("ExistingCity"), map.get("ExistingCityValue"), map.get("ExistingSite"),
													map.get("Existing SiteValue"), map.get("ExistingPremise"), map.get("Existing PremiseValue"), map.get("NewCity"), map.get("NewCityName"), map.get("NewCityCode"), 
													map.get("NewSiteName"),map.get("NewSiteCode"), map.get("NewPremiseName"), map.get("NewPremiseCode"), map.get("NewSite"), map.get("NewPremise"));
		APT_IPTransitHelper.get().verifyViewpage_Devicedetails("iptransit", map.get("DeviceName"), map.get("VendorModel"), map.get("Telnet"), map.get("SSH"), map.get("Snmp2C"), map.get("SnmPro"), map.get("Snmprw"), 
													map.get("SnmProNewValue"), map.get("SnmprwNewValue"), map.get("Snmp3"), map.get("Snmpv3Username"),
													map.get("Snmpv3Authpassword"), map.get("Snmpv3Privpassword"), map.get("Snmpv3UsernameNewValue"), 
													map.get("Snmpv3AuthpasswordNewValue"), map.get("Snmpv3PrivpasswordNewValue"),
													map.get("Country"), map.get("ManagementAddress"), map.get("ExistingCity"), map.get("ExistingCityValue"), map.get("ExistingSite"),
													map.get("Existing SiteValue"), map.get("ExistingPremise"), map.get("Existing PremiseValue"), map.get("NewCity"), map.get("NewCityName"), map.get("NewCityCode"), 
													map.get("NewSiteName"),map.get("NewSiteCode"), map.get("NewPremiseName"), map.get("NewPremiseCode"), map.get("NewSite"), map.get("NewPremise"));
		APT_IPTransitHelper.get().verifyViewDevicepage_Links("iptransit");
		APT_IPTransitHelper.get().verifyFetchInterface("iptransit", map.get("DeviceName"), map.get("InServiceStatus"), map.get("InMaintenanceStatus"), map.get("VendorModel"), map.get("ManagementAddress"), map.get("SnmProNewValue"), map.get("Country"), map.get("InterfaceName"));
		APT_IPTransitHelper.get().verifyEditDevice("iptransit", map.get("editdeviceName"), map.get("editVendorModel"), map.get("editTelnet"), map.get("editSSH"), map.get("editSnmp2C"), map.get("editSnmp3"), map.get("editSnmProNewValue"), map.get("editSnmprwNewValue"), map.get("editSnmpv3UsernameNewValue"),
													map.get("editSnmpv3AuthpasswordNewValue"), map.get("editSnmpv3PrivpasswordNewValue"),map.get("editManagementAddress"), map.get("editCountry"), map.get("editExistingCity"),
													map.get("editExistingCityValue"), map.get("editExistingSite"), map.get("editExistingSiteValue"), map.get("editExistingPremise"), map.get("editExistingPremiseValue"),
													map.get("editNewCity"), map.get("editNewSite"), map.get("editNewPremise"), map.get("editNewCityName"), map.get("editNewCityCode"), map.get("editNewSiteName"),
													map.get("editNewSiteCode"), map.get("editNewPremiseName"), map.get("editNewPremiseCode"));
		
		APT_IPTransitHelper.get().verifyViewpage_UpdatedDevicedetails("iptransit", map.get("editdeviceName"), map.get("editVendorModel"), map.get("editTelnet"), map.get("editSSH"), map.get("editSnmp2C"), map.get("editSnmp3"), map.get("editSnmProNewValue"), map.get("editSnmprwNewValue"), map.get("editSnmpv3UsernameNewValue"),
													map.get("editSnmpv3AuthpasswordNewValue"), map.get("editSnmpv3PrivpasswordNewValue"),map.get("editManagementAddress"), map.get("DeviceName"), map.get("VendorModel"), map.get("Telnet"), map.get("SSH"), map.get("Snmp2C"), map.get("SnmPro"), map.get("Snmprw"), 
													map.get("SnmProNewValue"), map.get("SnmprwNewValue"), map.get("Snmp3"), map.get("Snmpv3Username"), map.get("Snmpv3Authpassword"), map.get("Snmpv3Privpassword"), map.get("Snmpv3UsernameNewValue"), 
													map.get("Snmpv3AuthpasswordNewValue"), map.get("Snmpv3PrivpasswordNewValue"), map.get("ManagementAddress"));

		}
	 
	@Test(description = "TC-13",dataProviderClass = DataReader_PK.class, dataProvider = "Finaldatareader_IPTransit", priority=12)
	 public void verifyRouterTools(Map<String, String> map) throws InterruptedException, DocumentException, IOException {
			
		DriverTestcase.logger = DriverTestcase.extent.startTest("verifyRouterTools");
		//APT_IPTransitHelper.get().searchorder("iptransit", map.get("ServiceIdentification"));
		 
		String managementAddressEdit=map.get("editManagementAddress");
		String managementAddressCreated=map.get("ManagementAddress");
		if(map.get("VendorModel").contains("Cisco"))
		{
		if(managementAddressEdit.equalsIgnoreCase("null")) {
			
			APT_IPTransitHelper.get().verify_Cisco_RouterTools("iptransit", map.get("command_ipv4"), map.get("command_ipv6"), managementAddressCreated,
					map.get("vrf_Ipv4"), map.get("vrf_Ipv6"));
		}
		else {
			APT_IPTransitHelper.get().verify_Cisco_RouterTools("iptransit", map.get("command_ipv4"), map.get("command_ipv6"), managementAddressEdit,
					map.get("vrf_Ipv4"), map.get("vrf_Ipv6"));
			
		}
		}
		else
		{
			if(managementAddressEdit.equalsIgnoreCase("null")) {
				
				APT_IPTransitHelper.get().verify_Juniper_RouterTools("iptransit", map.get("command_ipv4"), managementAddressCreated,
						map.get("vrf_Ipv4"));
			}
			else {
				APT_IPTransitHelper.get().verify_Juniper_RouterTools("iptransit", map.get("command_ipv4"), managementAddressEdit,
						map.get("vrf_Ipv4"));
				
			}
		}
	}
	
	@Test(description = "TC-14",dataProviderClass = DataReader_PK.class, dataProvider = "Finaldatareader_IPTransit", priority=13)
	 public void verifyInterfacePanel(Map<String, String> map) throws InterruptedException, DocumentException, IOException {
			
			DriverTestcase.logger = DriverTestcase.extent.startTest("verifyRoutesPanel");
			//APT_IPTransitHelper.get().searchorder("iptransit", map.get("ServiceIdentification"));
			if(map.get("VendorModel").contains("Cisco"))
			{
			APT_IPTransitHelper.get().verify_CiscoVendor_InterfacePanel("iptransit", map.get("ConfigureInterface_Checkbox"), map.get("InterfaceName"), map.get("GetAddress_Button"), map.get("IPV6_GetAddressButton"), map.get("InterfaceAddressRange_Value"), map.get("EIPAllocation_City"), map.get("EIPAllocation_SubnetSize"), map.get("EIPAllocation_IPv6_SubnetSize"), map.get("EIPAllocation_AvailableBlocksValue"), map.get("LinkValue"), map.get("BearerType_Value"), map.get("Bandwidth_Value"), map.get("Encapsulation_Value"), map.get("BGP_Checkbox"), map.get("FramingType_Value"), map.get("VLANID_Value"), map.get("BGPTemplate_Value"), map.get("CPEWAN_Value"), map.get("CPEWANIPv6_Value"), map.get("Description_Value"), map.get("AsCustomer_Value"), map.get("BGPPassword_Value"), map.get("DeviceName"), map.get("editdeviceName"), map.get("Edit_ConfigureInterface_Checkbox"), map.get("Edit_InterfaceName"), map.get("Edit_Network"), map.get("Edit_EIPAllocation_City"), map.get("Edit_InterfaceAddressRange_value"), map.get("Edit_InterfaceAddressRangeIPv6_value"), map.get("Edit_AvailableBlocksvalue"), map.get("Edit_LinkValue"), map.get("Edit_BearerType_value"), map.get("Edit_Bandwidth_value"), map.get("Edit_FramingTypeValue"), map.get("Edit_EncapsulationValue"), map.get("Edit_VLANIDvalue"), map.get("Edit_BGPCheckbox"), map.get("Edit_BGPTemplate_Dropdownvalue"), map.get("Edit_CPEWAN_Value"), map.get("Edit_CPEWANIPv6_Value"), map.get("Edit_DescriptionValue"), map.get("Edit_AsCustomerValue"), map.get("Edit_BGPPasswordValue"), map.get("Edit_IPSubnetIPv6Value"), map.get("Edit_IPSubnetIPv4Value"));
			APT_IPTransitHelper.get().verifyAddMultilink("iptransit", map.get("DeviceName"), map.get("Multilink_InterfaceName"), map.get("GetAddress_Button"), map.get("IPV6_GetAddressButton"), map.get("InterfaceAddressRange_Value"), map.get("EIPAllocation_City"), map.get("EIPAllocation_SubnetSize"), map.get("EIPAllocation_IPv6_SubnetSize"), map.get("EIPAllocation_AvailableBlocksValue"), map.get("LinkValue"), map.get("Bandwidth_Value"), map.get("Encapsulation_Value"), map.get("BGP_Checkbox"), map.get("BGPTemplate_Value"), map.get("CPEWAN_Value"), map.get("CPEWANIPv6_Value"), map.get("Description_Value"), map.get("AsCustomer_Value"), map.get("BGPPassword_Value"), map.get("Multilink_ConfigInterface_checkbox"), map.get("InterfaceName"), map.get("CheckToAddInterface_Checkbox"), map.get("UnitIDValue"), map.get("SlotValue"), map.get("PicValue"), map.get("PortValue"));
			}
			else
			{
				APT_IPTransitHelper.get().verify_JuniperVendor_InterfacePanel("iptransit", map.get("InterfaceName"), map.get("GetAddress_Button"), map.get("IPV6_GetAddressButton"), map.get("InterfaceAddressRange_Value"), map.get("EIPAllocation_City"), map.get("EIPAllocation_SubnetSize"), map.get("EIPAllocation_IPv6_SubnetSize"), map.get("EIPAllocation_AvailableBlocksValue"), map.get("LinkValue"), map.get("BearerType_Value"), map.get("Bandwidth_Value"), map.get("Encapsulation_Value"), map.get("BGP_Checkbox"), map.get("FramingType_Value"), map.get("VLANID_Value"), map.get("BGPTemplate_Value"), map.get("CPEWAN_Value"), map.get("CPEWANIPv6_Value"), map.get("Description_Value"), map.get("AsCustomer_Value"), map.get("BGPPassword_Value"), map.get("DeviceName"), map.get("editdeviceName"), map.get("Edit_ConfigureInterface_Checkbox"), map.get("Edit_InterfaceName"), map.get("Edit_Network"), map.get("Edit_EIPAllocation_City"), map.get("Edit_InterfaceAddressRange_value"), map.get("Edit_InterfaceAddressRangeIPv6_value"), map.get("Edit_AvailableBlocksvalue"), map.get("Edit_LinkValue"), map.get("Edit_BearerType_value"), map.get("Edit_Bandwidth_value"), map.get("Edit_FramingTypeValue"), map.get("Edit_EncapsulationValue"), map.get("Edit_VLANIDvalue"), map.get("Edit_BGPCheckbox"), map.get("Edit_BGPTemplate_Dropdownvalue"), map.get("Edit_CPEWAN_Value"), map.get("Edit_CPEWANIPv6_Value"), map.get("Edit_DescriptionValue"), map.get("Edit_AsCustomerValue"), map.get("Edit_BGPPasswordValue"), map.get("Edit_IPSubnetIPv6Value"), map.get("Edit_IPSubnetIPv4Value"), map.get("Juniper_ConfigInterface_checkbox"), map.get("CardType_DropdownValue"), map.get("ClockSourceValue"), map.get("STM1NumberValue"), map.get("BearerNumber_Value"), map.get("UnitIDValue"), map.get("SlotValue"), map.get("PicValue"), map.get("PortValue"), map.get("IVManagement_checkbox"), map.get("AtricaConnected_checkbox"), map.get("Edit_Juniper_ConfigInterface_checkbox"), map.get("Edit_Juniper_InterfaceName"), map.get("Edit_CardType_DropdownValue"), map.get("Edit_ClockSourceValue"), map.get("Edit_STM1NumberValue"), map.get("Edit_BearerNumber_Value"), map.get("Edit_UnitIDValue"), map.get("Edit_SlotValue"), map.get("Edit_PicValue"), map.get("Edit_PortValue"), map.get("Edit_IVManagement_checkbox"), map.get("Edit_AtricaConnected_checkbox"), map.get("CardType_Dropdown_Gigabit"), map.get("Edit_EIPAllocation_Subnetsize"), map.get("Edit_EIPAllocation_IPv6_Subnetsize"), map.get("Edit_EIPAllocation1"), map.get("Edit_GetAddress"), map.get("Edit_EIPAllocation2"), map.get("Edit_IPv6_GetAddress"), map.get("Edit_IPSubnetIPv6_Value"), map.get("Edit_IPSubnetIPv4_value"));
				APT_IPTransitHelper.get().verifyAddMultilink("iptransit", map.get("DeviceName"), map.get("Multilink_InterfaceName"), map.get("GetAddress_Button"), map.get("IPV6_GetAddressButton"), map.get("InterfaceAddressRange_Value"), map.get("EIPAllocation_City"), map.get("EIPAllocation_SubnetSize"), map.get("EIPAllocation_IPv6_SubnetSize"), map.get("EIPAllocation_AvailableBlocksValue"), map.get("LinkValue"), map.get("Bandwidth_Value"), map.get("Encapsulation_Value"), map.get("Multilink_BGPCheckbox"), map.get("BGPTemplate_Value"), map.get("CPEWAN_Value"), map.get("CPEWANIPv6_Value"), map.get("Description_Value"), map.get("AsCustomer_Value"), map.get("BGPPassword_Value"), map.get("Multilink_ConfigInterface_checkbox"), map.get("InterfaceName"), map.get("CheckToAddInterface_Checkbox"), map.get("UnitIDValue"), map.get("SlotValue"), map.get("PicValue"), map.get("PortValue"));
			}
	}
	
	@Test(description = "TC-15",dataProviderClass = DataReader_PK.class, dataProvider = "Finaldatareader_IPTransit", priority=14)
	 public void verifyInterfaceConfigurationHistory(Map<String, String> map) throws InterruptedException, DocumentException, IOException {
	
		APT_IPTransitHelper.get().verifyInterfaceConfigHistory("iptransit");
		
	}
	
	@Test(description = "TC-16",dataProviderClass = DataReader_PK.class, dataProvider = "Finaldatareader_IPTransit", priority=15)
	 public void verifySelectInterfaces(Map<String, String> map) throws InterruptedException, DocumentException, IOException {
	
		APT_IPTransitHelper.get().selectInterfacelinkforDevice("iptransit", map.get("DeviceName"));
		
		if(map.get("RemoveInterface_Selection").equalsIgnoreCase("yes")) {
			APT_IPTransitHelper.get().SelectInterfacetoremovefromservice("iptransit", map.get("InterfaceName"), map.get("VendorModel"));
			//APT_IPTransitHelper.get().verifyInterfaceremovedFromService("iptransit", map.get("Interfaceinservice_Interfacenumber"));
		}else {
			System.out.println("interfaces are not removed");
		}
		
		if(map.get("AddInterface_Selection").equalsIgnoreCase("yes")) {
			APT_IPTransitHelper.get().SelectInterfacetoaddwithservcie("iptransit", map.get("InterfaceName"), map.get("VendorModel"));
			//APT_IPTransitHelper.get().verifyInterfaceaddedToService("iptransit", map.get("Interfacetoselect_Interfacenumber"));
		}else {
			System.out.println("Interfaces are not added");
		}
		
		
		APT_IPTransitHelper.get().deleteInterface("iptransit", map.get("InterfaceName"), map.get("DeviceName"), map.get("editdeviceName"));
		APT_IPTransitHelper.get().deleteDevice("iptransit", map.get("DeviceName"));
		APT_IPTransitHelper.get().deleteService("iptransit");
	}
	
	
}
	