package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkPage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.findElement(By.linkText("Go to Home Page")).click();
		driver.navigate().back();
		String link = driver.findElement(By.linkText("Find where am supposed to go without clicking me?"))
				.getAttribute("href");
		System.out.println("Here is the link which you will navigate to: " + link);

		driver.findElement(By.linkText("Verify am I broken?")).click();

		String a = driver.getTitle();

		if (a.contains("404"))
			System.out.println("The link is broken");
		else
			System.out.println("The link is NOT broken");
		driver.navigate().back();

		driver.findElement(By.linkText("Go to Home Page")).click();
		driver.navigate().back();

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Number of links:" + links.size());

	}

}
