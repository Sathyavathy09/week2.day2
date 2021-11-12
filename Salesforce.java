package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Salesforce {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.name("UserFirstName")).sendKeys("John");
		driver.findElement(By.name("UserLastName")).sendKeys("Jones");
		driver.findElement(By.name("UserEmail")).sendKeys("John.Jones@test.com");
		WebElement job = driver.findElement(By.name("UserTitle"));
		Select S1 = new Select(job);
		S1.selectByVisibleText("Customer Service Manager");
		driver.findElement(By.name("CompanyName")).sendKeys("TCS");
		WebElement emp = driver.findElement(By.name("CompanyEmployees"));
		Select S2 = new Select(emp);
		S2.selectByValue("950");
		driver.findElement(By.name("UserPhone")).sendKeys("1234567890");
		WebElement country = driver.findElement(By.name("CompanyCountry"));
		Select S3 = new Select(country);
		S3.selectByValue("AL");
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//div[@class='checkbox-ui']")).click();
		WebElement chkBox1 = driver.findElement(By.xpath("(//div[@class='checkbox-ui'])[1]"));
		driver.executeScript("arguments[0].click();", chkBox1);

	}

}

// Step 1: Download and set the path
// Step 2: Launch the chromebrowser
// Step 3: Load the URL
// https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk
// Step 4: Maximise the window
// Step 5: Add implicit wait
// Step 6: Fill in all the text boxes
// Step 7: Handle all the dropdowns
// Step 8: Click the check box
// Step 9: Close the browser
