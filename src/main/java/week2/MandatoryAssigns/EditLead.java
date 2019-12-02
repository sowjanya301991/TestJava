package week2.MandatoryAssigns;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
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
		driver.findElementByXPath("//a[@href='/crmsfa/control/leadsMain']").click();
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]").click();
		driver.findElementByXPath("//div[text()='View Lead']").getText();
		driver.findElementByXPath("//a[text()='Edit']").click();
		WebElement cmpnyTxtFld = driver.findElementByXPath("(//input[@name='companyName'])[2]");
		cmpnyTxtFld.clear();
		cmpnyTxtFld.sendKeys("TCS");
		Thread.sleep(2000);
		driver.findElementByXPath("//input[@value='Update']").click();
		driver.close();
		

	}

}
