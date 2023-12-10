package root;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckUrl {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		Thread.sleep(3000);
	
		//String expectedTitle = "Swag  Labs";
		//String actualTitle = driver.getTitle();
//		System.out.println(actualTitle);
		
//		if(actualTitle.equals(expectedTitle))
//		{
//			System.out.println("Title matched");
//		}
//		else {
//			System.out.println("Title does not matched");
//		}
		
		//Assert.assertEquals(actualTitle, expectedTitle);
		
		String expectedUrl = "https://www.saucedemo.com/";
		String actualUrl = driver.getCurrentUrl();
		System.out.println(actualUrl);

		Assert.assertEquals(actualUrl, expectedUrl);
		
	
	}

}
