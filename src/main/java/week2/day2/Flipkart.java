package week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElementByXPath("//button[text()='✕']").click();
		Actions builder = new Actions(driver);
		WebElement electrncsdd = driver.findElementByXPath("//span[text()='Electronics']");
		WebElement Applephn = driver.findElementByXPath("//a[@title='Apple']");
		builder.moveToElement(electrncsdd);
		Thread.sleep(2000);
		builder.click(Applephn).perform();
		

		
		
		

	}

}
