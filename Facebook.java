package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("firstname")).sendKeys("John");
		driver.findElement(By.name("lastname")).sendKeys("Jones");
		driver.findElement(By.xpath("//div[text()='Mobile number or email address']/following-sibling::input")).sendKeys("9181425891");
		driver.findElement(By.xpath("//div[text()='New password']/following-sibling::input")).sendKeys("John@123");
		Thread.sleep(5000);
		WebElement day = driver.findElement(By.id("day"));
		Select s1 = new Select(day);
		s1.selectByValue("9");
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select s2 = new Select(month);
		s2.selectByValue("11");
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select s3 = new Select(year);
		s3.selectByValue("1989");

		driver.findElement(By.xpath("//label[text()='Female']/following-sibling::input")).click();

		driver.close();

	}

}
