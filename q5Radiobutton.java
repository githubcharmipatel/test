package Assignmentmodule4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class q5Radiobutton {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\charmi selenum setup\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://theautomationzone.blogspot.com/search/label/selenium%20practice%20page");
		
        driver.findElement(By.id("ie")).click();
	    Thread.sleep(2000);

	    driver.findElement(By.id("ff")).click();
	    Thread.sleep(2000);
	    
	    
	    driver.findElement(By.id("opera")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("gc")).click();
	    Thread.sleep(2000);
	    
	    for (int i = 1; i <=4; i++) {
	    	 driver.findElement(By.id("ie"+i)).click();
	 	    Thread.sleep(2000);
	    }
	    driver.close();

	}
	    

}
