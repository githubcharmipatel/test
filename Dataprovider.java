package testNG_charmi_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	@DataProvider(name="charmi")
	public Object[][] input(){
		return new Object[][] {{"standard_user","secret_sauce"},{"problem_user","secret_sauce"}};
	}
		@Test(dataProvider = "charmi")
	public void test(String username, String password) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\charmi selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.id("user-name")).sendKeys(username);
		Thread.sleep(2000);
		
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(2000);
		
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		if (driver.getCurrentUrl().equals("https://www.saucedemo.com/inventory.html")) {
			System.out.println("log in success");
		} else {
			System.out.println("log in unsuccess");
		}
		
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("logout_sidebar_link")).click();
		Thread.sleep(2000);
		
		
		System.out.println("byee..!!!!");
		driver.close();
		
  }
	}



