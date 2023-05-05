package testNG_charmi_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class TestNGassignment {
  @Test
 @Parameters ({"username","password"})
  public void f(String email, String pass ) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "D:\\charmi selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebookcom/login/");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("beingcharmi@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("Rc@30012001");
		Thread.sleep(2000);
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(2000);
		if (driver.getCurrentUrl().equals("https://www.facebook.com/login/")) {
			System.out.println("log in successfull");
		} else {
			System.out.println("log in unsuccessfull");
		}
		driver.close();
  }
}
