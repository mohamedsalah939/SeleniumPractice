package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tricks {

	public static void main(String[] args) {
		// Create driver object for Google Chrome browser
		// Will implement WebDriver interface
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//navigate to URL in the browser
		driver.get("https://www.google.com/");
		
		//Parent child xpath
		//If you don’t have any unique ID,classname or name and still need to catch the element then use Parent child relationship xpath
		//write a word in the search bar in google
		driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[2]/input")).sendKeys("test");
		//click on images buttons
		driver.findElement(By.xpath("//div[@class='gb_Xd gb_Ta gb_Jd']/div/div/div[2]/a")).click();
		//Go back
		driver.navigate().back();
		//clicking on image using absolute path with another syntax
		driver.findElement(By.xpath("//div/div/div/div/div/div/div/div[2]/a")).click();
		driver.navigate().back();
		//click on image using siblings traverse
		driver.findElement(By.xpath("//div/div/div/div/div/div/div/div/following-sibling::div[1]/a")).click();
		driver.navigate().back();
		//click on parent
		driver.findElement(By.xpath("//div/div/div/div/div/div/div/div/parent::div")).click();
		//click on element using text
		//hardcode approach we cannot rely on it because it may change
		driver.findElement(By.xpath("//*[text()='Gmail']")).click();
		
	}

}
