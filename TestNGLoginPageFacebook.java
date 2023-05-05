package testNG_charmi_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGLoginPageFacebook {
	WebDriver driver=null;
	@BeforeTest
	public void beforetest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\charmi selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
	}
	@Test(priority = 0)
	public void username() throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys("beingcharmi@gmail.com");
		Thread.sleep(2000);
	}
	@Test(priority = 1)
	public void password() throws InterruptedException {
		driver.findElement(By.id("pass")).sendKeys("charmi@3001");
		Thread.sleep(2000);
	}
	@Test(priority = 2)
	public void login() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
		Thread.sleep(2000);
		
	}
	@AfterTest
	public void aftertest() {
		driver.close();
		
	}

}

