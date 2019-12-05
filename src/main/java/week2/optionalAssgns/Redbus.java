package week2.optionalAssgns;

import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in");
		driver.findElementByXPath("//input[@type='text']").sendKeys("chennai");;
		driver.findElementById("dest").sendKeys("trichy");
		driver.findElementByXPath("//label[text()='Onward Date']").click();
		driver.findElementByXPath("//td[@class='current day']").click();
		//driver.findElementByXPath("//label[text()='Return Date']");

	}

}
