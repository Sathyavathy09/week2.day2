package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxPage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.findElement(By.xpath("//div[text()='Java']/input")).click();
		driver.findElement(By.xpath("//div[text()='SQL']/input")).click();
		driver.findElement(By.xpath("//div[text()='Selenium']/input")).isSelected();
		
		if (driver.findElement(By.xpath("//div[text()='I am Selected']/input")).isSelected())
			driver.findElement(By.xpath("//div[text()='I am Selected']/input")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'Option 1')]/input")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Option 2')]/input")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Option 3')]/input")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Option 4')]/input")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Option 5')]/input")).click();
		
		driver.close();

	}

}
