package week2.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		WebElement dropdwn = driver.findElementByXPath("//select[@id='dropdown1']");
		WebElement multpldd = driver.findElementByXPath("//select[@multiple]");
		Select dd=new Select(multpldd);
		dd.selectByVisibleText("Appium");
		dd.selectByValue("3");
		List<WebElement> options = dd.getOptions();
		int size = options.size();
		for(int i=0;i<size;i++) {
			System.out.println(options.get(i).getText());
		}
		
		

	}
	

}
