package hello;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		//above locator
		WebElement namebox=driver.findElement(By.xpath("(//input[@name='name'])[1]"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(namebox)).getText());
		
		//left locator
		WebElement ice=driver.findElement(By.xpath("//label[@for='exampleCheck1']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(ice)).click();
		
		//right locator
		WebElement chkbox=driver.findElement(By.xpath("//div[@class='form-group']/div[1]/input"));
		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(chkbox)).getText());
		
		//below locator
		WebElement dob=driver.findElement(By.cssSelector("label[for='dateofBirth']"));
		driver.findElement(with(By.tagName("input")).below(dob)).click();
		
		
		
		
		
	}

}
