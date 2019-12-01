package week2.day2;

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
		
		
				
		
		
		
		
		
       
		
	
		

	}
}
