package testNG_charmi_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGgmailLogin {
	WebDriver driver=null;
	@BeforeTest
	public void beforlogin() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\charmi selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		Thread.sleep(2000);
	}
	@Test(priority = 0)
	public void firstname() throws InterruptedException {
		driver.findElement(By.name("firstName")).sendKeys("amisha");
		Thread.sleep(2000);
		
	}
	@Test(priority = 1)
	public void lastname() throws InterruptedException {
		driver.findElement(By.name("lastName")).sendKeys("patel");
		Thread.sleep(2000);
		
		
	}
	@Test(priority = 2)
	public void username() throws InterruptedException {
		driver.findElement(By.name("Username")).sendKeys("ap6359237489");
		Thread.sleep(2000);
		
	}
	@Test(priority = 3)
	public void password() throws InterruptedException {
		driver.findElement(By.name("Passwd")).sendKeys("AMISHA000");
		Thread.sleep(2000);
		
	}
	@Test(priority = 4)
	public void conformpassword() throws InterruptedException {
		driver.findElement(By.name("ConfirmPasswd")).sendKeys("AMISHA000");
		Thread.sleep(2000);
		
	}
	@Test(priority = 5)
	public void login() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"accountDetailsNext\"]/div/button/span")).click();
		Thread.sleep(2000);
	}
	@Test(priority = 6)
	public void phonenumber() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"phoneNumberId\"]")).sendKeys("6359237489");
		Thread.sleep(2000);
		
	}
	@Test(priority = 7)
	public void next() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/span"));
		Thread.sleep(2000);
		
	}
	@AfterTest
	public void aftertest() {
		driver.close();
	}
	
}
	
