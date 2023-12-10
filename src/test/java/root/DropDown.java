package root;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://trytestingthis.netlify.app/");
		driver.manage().window().maximize();

		// Enter First and last name
		driver.findElement(By.id("fname")).sendKeys("Sanjina");
		driver.findElement(By.id("lname")).sendKeys("Nowshin");
		Thread.sleep(1000);

		// Check Gender
		driver.findElement(By.id("female")).click();

		// Select from DropDown
		WebElement dropDown = driver.findElement(By.id("option"));
		Select dropdown = new Select(dropDown);
		dropdown.selectByIndex(2);
		Thread.sleep(1000);

		// Select from Scrolling multiple option
		WebElement multipleOption = driver.findElement(By.id("owc"));
		Select selectOption = new Select(multipleOption);
		selectOption.selectByIndex(3);
		Thread.sleep(1000);
		selectOption.selectByValue("option 1");
		Thread.sleep(1000);

		// Checklist
		WebElement checkList1 = driver.findElement(By.name("option1"));
		checkList1.click();
		
		WebElement checkList2 = driver.findElement(By.name("option2"));
		checkList2.click();
		Thread.sleep(1000);
		
		WebElement checkList3 = driver.findElement(By.name("option3"));
		checkList3.click();
		Thread.sleep(1000);
		
		//Long Message
		WebElement describeMessage = driver.findElement(By.name("message"));
		describeMessage.clear();
		Thread.sleep(1000);
		describeMessage.sendKeys("I am Sanjina Nowshin Moon. A dedicated person with a strong foundation in software testing methodologies and a passion for ensuring the highest quality of\r\n"
				+ "software products. Seeking a Software Quality Assurance Engineer position to apply my analytical and problem-solving skills in a\r\n"
				+ "vibrant team, contribute to product excellence, and continually enhance my expertise in quality assurance processes and test\r\n"
				+ "automation.");
		Thread.sleep(3000);
		
		// Submit Option
		WebElement submit = driver.findElement(By.className("btn-success"));
		submit.click();
		

	}

}
