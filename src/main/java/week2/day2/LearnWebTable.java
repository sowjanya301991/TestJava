package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://erail.in");
		WebElement elesource = driver.findElementById("txtStationFrom");
		elesource.clear();
		elesource.sendKeys("MAS",Keys.TAB);
		Thread.sleep(3000);
		WebElement eledest = driver.findElementById("txtStationTo");
		eledest.clear();
		eledest.sendKeys("SBC",Keys.TAB);
		 driver.findElementByXPath("//input[@id='chkSelectDateOnly']").click();
		Thread.sleep(3000);
		
		WebElement eleTable = driver.findElementByXPath("//table[@ class='DataTable TrainList TrainListHeader']");
		List<WebElement> elerows = eleTable.findElements(By.tagName("tr"));
		int len = elerows.size();
		for(int i=0;i<len;i++)
		{
			List<WebElement> elecols = elerows.get(i).findElements(By.tagName("td"));
		System.out.println(elecols.get(1).getText());
			
			
		}
		
		
		
		

	}

}
