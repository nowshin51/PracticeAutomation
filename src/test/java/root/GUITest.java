package root;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GUITest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		
		//Add to cart
		driver.findElement(By.xpath("//button[@id=\"add-to-cart-sauce-labs-bike-light\"]")).click();
		driver.findElement(By.xpath("//button[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")).click();
		Thread.sleep(2000);
		
		
		//Click to cart icon
		driver.findElement(By.xpath("//a[@class=\"shopping_cart_link\"]")).click();
		Thread.sleep(2000);
		
		
		//Checkout Button Click
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(2000);
		 
		//Enter First name, last name
		driver.findElement(By.id("first-name")).sendKeys("Sanjina");
		Thread.sleep(2000);
		driver.findElement(By.id("last-name")).sendKeys("Nowshin");
		Thread.sleep(2000);
		driver.findElement(By.id("postal-code")).sendKeys("1209");
		driver.findElement(By.xpath("//input[@id=\"continue\"]")).click();
		Thread.sleep(2000);
		
		//Finish Shopping
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[9]/button[2]")).click();
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
