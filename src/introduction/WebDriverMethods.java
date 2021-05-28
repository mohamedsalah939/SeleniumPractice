package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create driver object for Google Chrome browser
		// Will implement WebDriver interface
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//navigate to web page
		driver.get("https://www.google.com/");
		
		//verify that we landed on the correct URL
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		//navigate back
		driver.get("https://www.yahoo.com/");
		driver.navigate().back();
		
		//navigate forward
		driver.navigate().forward();
		
		//close current browser after finishing
		driver.close();
		
		// close all browsers opened by selenium when using child windows
		driver.quit();

		
	}

}
