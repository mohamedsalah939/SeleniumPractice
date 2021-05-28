package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElements {

	public static void main(String[] args) {
		// Create driver object for Google Chrome browser
				// Will implement WebDriver interface
				System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
				WebDriver driver= new ChromeDriver();
				
				//navigate to web page
				driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
				
				WebElement staticDropDown= driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")); 
				//dropdown with select tag
				Select dropdown = new Select(staticDropDown);
				

	}

}
