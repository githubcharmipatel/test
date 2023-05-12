package FWAssignment;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class KeywordDriven {@DataProvider(name="charmi")
public String[][] readdata() throws InvalidFormatException, IOException {
	String [][] data=null;
	String filepath ="D:\\charmi selenium\\Book1.xlsx";
	File file=new File(filepath);
	XSSFWorkbook workbook=new XSSFWorkbook(file);
	Sheet sheet=workbook.getSheet("Sheet2");
	int nrow=sheet.getPhysicalNumberOfRows();
	System.out.println("total rows are..."+nrow);
	data=new String[nrow][];
	System.out.println("length: "+data.length);
	for (int i = 0; i < data.length; i++) {
		Row row=sheet.getRow(i);
		int ncol=row.getPhysicalNumberOfCells();
		System.out.println("no of cells in each row..."+ncol);
		data[i]=new String[ncol];
		for (int j = 0; j < data[i].length; j++) {
			org.apache.poi.ss.usermodel.Cell cell=row.getCell(j);
			cell.setCellType(CellType.STRING);
			data[i][j]=cell.getStringCellValue();
		
}
	
}
	return data;
}

WebDriver driver=null;
@Test(dataProvider = "charmi")
public void test(String keyword , String data) throws InvalidFormatException, IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\charmi selenium\\chromedriver_win32\\chromedriver.exe");
//	String[][] data= readdata();
//	for (int i = 0; i < data.length; i++) {
	if (keyword.equals("open browser")) {
		driver=new ChromeDriver();
		Thread.sleep(2000);
	}else if (keyword.equals("enter url")) {
		driver.get("https://accounts.google.com/");
		Thread.sleep(2000);
	}else if (keyword.equals("enter username")) {
		driver.findElement(By.id("identifierId")).sendKeys(data);
		Thread.sleep(2000);
	}else if (keyword.equals("click next")) {
		driver.findElement( By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		Thread.sleep(2000);
	}else if (keyword.equals("enter password")) {
		driver.findElement( By.name("password")).sendKeys(data);
		Thread.sleep(2000);
//	}else if (keyword.equals("enter password")) {
	//	driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span")).click();
	//	Thread.sleep(2000);
	}else if (keyword.equals("click login")) {
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span")).click();
		if (driver.getCurrentUrl().equals("https://accounts.google.com/")) {
			System.out.println("login successfull");
	}else {
		System.out.println("incorrect password");
	}
		Thread.sleep(2000);
	}else if (keyword.equals("close browser")) {
		driver.close();

		
	}
		
		
		
		
	}
	



}
