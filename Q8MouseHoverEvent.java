package Assignmentmodule4;

import javax.smartcardio.Card;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Q8MouseHoverEvent {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\charmi selenum setup\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		WebElement home= driver.findElement(By.linkText("Home"));
		 WebElement Flight= driver.findElement(By.linkText("Flights"));
		 WebElement hotel = driver.findElement(By.linkText("Hotels"));
		 WebElement CarRentals= driver.findElement(By.linkText("Car Rentals"));
		 WebElement Cruises= driver.findElement(By.linkText("Cruises"));

		 
	     Actions actions =new Actions(driver);
		 Action a1=actions.moveToElement(home).build();
		 a1.perform();
		 Thread.sleep(2000);
		 
		 Action a2=actions.moveToElement(Flight).build();
		 a2.perform();
		 Thread.sleep(2000);
		 
		 Action a3=actions.moveToElement(hotel).build();
		 a3.perform();
		 Thread.sleep(2000);
		 
		 Action a4=actions.moveToElement(CarRentals).build();
		 a4.perform();
		 Thread.sleep(2000);
		 
		 Action a5=actions.moveToElement(Cruises).build();
		 a5.perform();
		 Thread.sleep(2000);
		 
		 driver.close();
		 
	}

}

	


