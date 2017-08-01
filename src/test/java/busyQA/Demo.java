package busyQA;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Demo
{
	@Test
	public  void Signup() 
	{
		String baseURL = "https://www.facebook.com/";
		WebDriver driver = new FirefoxDriver();
		driver.get(baseURL);
		driver.manage().window().maximize();
		String actualTitle = driver.findElement(By.xpath("//h2[@class='mbs _3ma _6n _6s _6v']")).getText();
		System.out.println(actualTitle);
		
	}

}
