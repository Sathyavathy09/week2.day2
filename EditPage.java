package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditPage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.findElement(By.id("email")).sendKeys("Sathya@test.com");
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("Sathya");
		System.out.println(driver.findElement(By.name("username")).getAttribute("value"));
		driver.findElement(By.xpath("(//input[@name='username'])[2]")).clear();
		boolean a = driver.findElement(By.xpath("//label[text()='Confirm that edit field is disabled']/following-sibling::input")).isEnabled();
		Assert.assertEquals(a, false);
		driver.close();

	}

}
