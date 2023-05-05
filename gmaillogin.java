package com.unitAssignment;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmaillogin {
	WebDriver driver=null;
public void beforsetup() {
	System.setProperty("webdriver.chrome.driver", "D:\\charmi selenium\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
	
}
@Test
public void loginsetup() throws InterruptedException {
driver.findElement(By.name("firstName")).sendKeys("patel");
Thread.sleep(2000);
driver.findElement(By.name("lastName")).sendKeys("charmi");
Thread.sleep(2000);
driver.findElement(By.name("Username")).sendKeys("beingcharmi");
Thread.sleep(2000);
driver.findElement(By.name("Passwd")).sendKeys("Rc@30012001");
Thread.sleep(2000);
driver.findElement(By.name("ConfirmPasswd")).sendKeys("Rc@30012001");
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/button/span")).click();
Thread.sleep(2000);

}
@After
public void aftertest() {
	System.out.println("bye bye");
driver.close();	
	
}
}
