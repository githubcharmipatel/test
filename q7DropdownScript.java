package Assignmentmodule4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class q7DropdownScript {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\charmi selenum setup\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Select s1=new Select(driver.findElement(By.name("country")));
		s1.selectByIndex(9);
		Thread.sleep(2000);
		
		s1.selectByValue("HUNGARY");
		Thread.sleep(2000);
		
		s1.selectByVisibleText("MALDIVES");
		Thread.sleep(2000);
		
		driver.close();
	}

}
