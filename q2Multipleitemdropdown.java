package Assignmentmodule4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.xml.sax.ext.Attributes2;

public class q2Multipleitemdropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\charmi selenum setup\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://theautomationzone.blogspot.com/search/label/selenium%20practice%20page");
		driver.manage().window().maximize();
		Select s1 = new Select(driver.findElement(By.id("cars")));
		s1.selectByIndex(0);
		
		
		Thread.sleep(2000);
		s1.selectByVisibleText("Saab");
		Thread.sleep(2000);
		s1.selectByValue("opel");
		Thread.sleep(2000);
		for (int i = 0; i <=50; i++) {
			s1.selectByIndex(1);
			Thread.sleep(2000);
		}
		driver.close();

	}

}
