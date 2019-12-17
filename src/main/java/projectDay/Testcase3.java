package projectDay;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.zoomcar.com/chennai");
		driver.manage().window().maximize();
		driver.findElementByXPath("//a[@class='search']").click();
		driver.findElementByXPath("//div[@class='items']").click();
		driver.findElementByXPath("//button[@class='proceed']").click();
		driver.findElementByXPath("(//div[@class='day'])[1]").click();
		driver.findElementByXPath("//button[text()='Next']").click();
		driver.findElementByXPath("//button[text()='Done']").click();
		List<WebElement> carImgs = driver.findElementsByXPath("//div[@class='car-listing']");
		System.out.println(carImgs.size());
		
		List<WebElement> carsPrice = driver.findElementsByXPath("//div[@class='price']");
		
		List<Integer> priclist=new ArrayList<>();
        for (int i = 0; i<carsPrice.size(); i=i+1) 
        {
        System.out.println(carsPrice.get(i).getText());  
       String wt= carsPrice.get(i).getText();
      String rm=wt.replaceAll("[\\-\\+\\ \\^:,]","");
      String bn=rm.substring(1);
       //System.out.println("number"+num);
      priclist.add(Integer.valueOf(bn));
        }
        
        System.out.println("maxprice"+ Collections.max(priclist));
      
        
       // TakesScreenshot scrShot =((TakesScreenshot)driver);
        //File source = scrShot.getScreenshotAs(OutputType.FILE);
        //File target = new File("./snaps/snap.png");
      //  FileUtils.copyFile(source, target);
        //driver.close();
        TakesScreenshot ts = (TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source, new File("./snaps/snap.png"));
        System.out.println("the Screenshot is taken");
        driver.quit();
        }
        
      	
	}

	

