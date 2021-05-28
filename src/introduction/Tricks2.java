package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tricks2 {

	public static void main(String[] args) {
		// Create driver object for Google Chrome browser
		// Will implement WebDriver interface
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//navigate to URL in the browser
		driver.get("https://login.salesforce.com/");
		//identify element using CSS selector [attribute='value']
	    driver.findElement(By.cssSelector("[id='username']")).sendKeys("test");
	    driver.findElement(By.cssSelector("input[id='password']")).sendKeys("test");
		driver.findElement(By.cssSelector("[id='Login']")).click();
		
		// another way to identify element using CSS selector #ID
		driver.findElement(By.cssSelector("#username")).sendKeys("test");
		driver.findElement(By.cssSelector("#password")).sendKeys("test");
		driver.findElement(By.cssSelector("#Login")).click();
		
		// another way to identify element using CSS selector .clasname (replace space with dots)
		driver.findElement(By.cssSelector(".input.r4.wide.mb16.mt8.username")).sendKeys("test");
		driver.findElement(By.cssSelector(".input.r4.wide.mb16.mt8.password")).sendKeys("test");
		driver.findElement(By.cssSelector(".button.r4.wide.primary")).click();
				
	}

}
