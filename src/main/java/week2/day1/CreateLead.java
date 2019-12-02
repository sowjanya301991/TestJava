package week2.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		WebElement input = driver.findElementById("username");	
		input.sendKeys("DemoSalesManager");
		WebElement pswd = driver.findElementById("password");
		pswd.sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Test Leaf");
		driver.findElementById("createLeadForm_firstName").sendKeys("sowjanya");
		driver.findElementById("createLeadForm_lastName").sendKeys("Katuri");
		driver.findElementByName("personalTitle").sendKeys("Mrs");
		driver.findElementByName("generalProfTitle").sendKeys("Tester");
		driver.findElementByName("annualRevenue").sendKeys("10 lacs");
		driver.findElementByName("sicCode").sendKeys("12345");
		driver.findElementById("createLeadForm_description").sendKeys("welcome to the new lead");
		driver.findElementById("createLeadForm_importantNote").sendKeys("Alert /alert");
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("612");
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("600123");
		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("044");
		driver.findElementById("createLeadForm_departmentName").sendKeys("Testing");
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("1000");
		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("$");
		driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("sahaja");
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("www.testleaf.com");
		driver.findElementById("createLeadForm_generalToName").sendKeys("sahaja");
		driver.findElementById("createLeadForm_generalAddress1").sendKeys("5/11,gundur");
		driver.findElementById("createLeadForm_generalAddress2").sendKeys("2nd street,venboil");
		driver.findElementById("createLeadForm_generalCity").sendKeys("vempadu");
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("600073");
		driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("0440");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("ksowjanya991@gmail.com");
		WebElement dropDown = driver.findElementById("createLeadForm_dataSourceId");
		Select dd = new Select(dropDown);
		//dd.selectByVisibleText("Cold Call");
		//dd.selectByValue("LEAD_CONFERENCE");
		//dd.selectByIndex(5);
		List<WebElement> options = dd.getOptions();
		int len = options.size();
		dd.selectByIndex(len-1);
		WebElement dropDown2 = driver.findElementById("createLeadForm_industryEnumId");
		Select dd2=new Select(dropDown2);
		List<WebElement> options2 = dd2.getOptions();
		int len2 = options2.size();
		dd2.selectByIndex(len2-1);
		WebElement dropDown3 = driver.findElementById("createLeadForm_ownershipEnumId");
		Select dd3=new Select(dropDown3);
		List<WebElement> options3 = dd3.getOptions();
		int len3 = options3.size();
		dd3.selectByIndex(len3-1);
		WebElement dropDown4 = driver.findElementById("createLeadForm_currencyUomId");
		Select dd4=new Select(dropDown4);
		List<WebElement> options4 = dd4.getOptions();
		int len4 = options4.size();
		dd4.selectByIndex(len4-2);
		WebElement dropDown5 = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		Select dd5=new Select(dropDown5);
		List<WebElement> options5 = dd5.getOptions();
		int len5 = options5.size();
		dd5.selectByIndex(len5-2);
		WebElement dropDown6 = driver.findElementById("createLeadForm_generalCountryGeoId");
		Select dd6=new Select(dropDown6);
		List<WebElement> options6 = dd6.getOptions();
		int len6 = options6.size();
		dd6.selectByIndex(len6-2);
		driver.findElementByXPath("//input[@value='Create Lead']").click();
		
		
				
		
		
		
		
		
       
		
	
		

	}
}
