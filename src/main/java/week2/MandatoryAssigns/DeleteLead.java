package week2.MandatoryAssigns;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

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
		driver.findElementByXPath("//a[text()='Leads']").click();
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		driver.findElementByXPath("//span[text()='Phone']").click();
		WebElement PhCountryCode = driver.findElementByXPath("//input[@name='phoneCountryCode']");
		PhCountryCode.clear();
		PhCountryCode.sendKeys("+91");
		WebElement PhAreaCode = driver.findElementByXPath("//input[@name='phoneAreaCode']");
		
		PhAreaCode.sendKeys("100");
		WebElement PhNum = driver.findElementByXPath("//input[@name='phoneNumber']");
		PhNum.sendKeys("9008796633");
		Thread.sleep(2000);
		driver.findElementByXPath("//button[@class='x-btn-text x-tbar-page-next']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();
		Thread.sleep(2000);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//a[@class='subMenuButtonDangerous']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("(//div[@class='x-form-element'])[18]/input").sendKeys("10091");
		Thread.sleep(2000);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		driver.close();
			}
	

}
