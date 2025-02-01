package hello;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MutipleTabs {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://rahulshettyacademy.com/");
		Set<String> win=driver.getWindowHandles();
		Iterator<String> it=win.iterator();
		String url1=it.next();
		String url2=it.next();
		driver.switchTo().window(url2);
		String course=driver.findElement(By.xpath("//div[@id='courses-block']/div[contains(@class,'col-xs-12')]/div/div[2]/div/h2")).getText();
		driver.close();
		driver.switchTo().window(url1);
		driver.findElement(By.xpath("(//input[@name='name'])[1]")).sendKeys(course);
		File src=driver.findElement(By.xpath("//div[@class='form-group'][1]")).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\Partha\\Desktop\\Selenium Screenshot folder\\ss.png"));
		System.out.println(driver.findElement(By.xpath("(//input[@name='name'])[1]")).getSize());
		
		
		
		
		
		
	}

}
