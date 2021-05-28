package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        // Create driver object for Google Chrome browser
				// Will implement WebDriver interface
				System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
				WebDriver driver= new ChromeDriver();
				
				driver.get("https://login.salesforce.com/");
				
				//select an textbox using the ID and write a text inside it
				driver.findElement(By.id("username")).sendKeys("abc");
				
				//select an textbox using the name and write a text inside it
				driver.findElement(By.name("pw")).sendKeys("abc");
				
				//this line will not work because it is a compound class name
				//driver.findElement(By.className("button r4 wide primary")).click();
				
				//find button by CSS Selector and click on it
				driver.findElement(By.cssSelector("#rememberUn")).click();
				
				//find button by xpath and click on it
				//replace the double quotes by single quotes to work correctly
				//if you find xpath begin with html don't use it
				driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
				
				//Get the text using CSS Selector
			//	System.out.println(driver.findElement(By.cssSelector("#error.loginError")).getText());
				
				//Select element using customized xpath=  //tagName[@attribute=’value’]
				driver.findElement(By.xpath("//input[@type='password']")).sendKeys("aa");
				//Select element using customized xpath=  //*[@attribute=’value’] with another way
				driver.findElement(By.xpath("//*[@type='password']")).sendKeys("aa");
				//We can use regular expression in xpath like this //tagName[contains(@attribute,’value’)] to make sure script work if the att changes
				driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("aa");
				
				//Select element using customizaed CSS selector = tagName[attribute=’value’]
				driver.findElement(By.cssSelector("input[id='username']")).sendKeys("aaa");
				//Select element using customizaed CSS selector = [attribute=’value’] with another way 
				driver.findElement(By.cssSelector("[id='username']")).sendKeys("aaa");
				//Select element using customizaed CSS selector = 'tagName#id' with another way 
				driver.findElement(By.cssSelector("input#username")).sendKeys("aaa");
				//We can use regular expression in CSS Selector like this tagName[attribute*=’value’] to make sure script work if the att changes
				driver.findElement(By.cssSelector("input[id*='username']")).sendKeys("aaa");
				
				driver.get("https://rediff.com/");
				driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
				driver.findElement(By.xpath("//input[contains(@id,'login')]")).sendKeys("abc");

	}

}
