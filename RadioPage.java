package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioPage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		driver.findElement(By.id("yes")).click();
		WebElement radio = driver.findElement(By.xpath("//label[@for = 'Checked']/input"));
		if (radio.isSelected())

			System.out.println("Default Radio button is Selected");
		else
			radio.click();

		WebElement check = driver.findElement(By.xpath("//input[@class='myradio'][2]"));

		if (check.isSelected())
			System.out.println("Already Selected");
		else {
			driver.findElement(By.xpath("//input[@class='myradio'][2]")).click();
		}

	}
}
