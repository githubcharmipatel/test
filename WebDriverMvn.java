package com.mvn;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMvn {
	WebDriver driver=null;
	@Before
	public void beforesetp() {
		System.setProperty("webdriver.chrome.driver", "D:\\charmi selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
	}
	@Test
	public void loginsetup() throws InterruptedException {
		driver.findElement(By.id("user-name")).sendKeys
		("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		Thread.sleep(2000);
				
		
	}
	@After
	public void aftertest() {
		System.out.println("bye bye");
	driver.close();	
	}
}
