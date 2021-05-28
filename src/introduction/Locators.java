package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        // Create driver object for Google Chrome browser
				// Will implement WebDriver interface
				System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
				WebDriver driver= new ChromeDriver();
				
				//navigate to URL in the browser
				driver.get("https://www.facebook.com/");
				
				//select an textbox using the ID and write a text inside it
				driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
				//select an textbox using the name and write a text inside it
				driver.findElement(By.name("pass")).sendKeys("abc");
				//select and click on link using link text locator
				driver.findElement(By.linkText("Forgotten password?")).click();
				
				
					
				driver.close();

	}

}
