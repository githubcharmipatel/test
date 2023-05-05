package com.unitAssignment;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
	WebDriver driver=null;
	@Before
	public void beforesetp() {
		System.setProperty("webdriver.chrome.driver", "D:\\charmi selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		
	}
	@Test
	public void loginsetup() throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys
		("beingcharmi@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("Rc@30012001");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		
		
		
	}
	@After
	public void aftertest() {
		System.out.println("bye bye");
	driver.close();	
	}

}
