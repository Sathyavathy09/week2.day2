package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class ImagePage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.findElement(By.xpath("//label[@for='home']/following-sibling::img")).click();
		driver.navigate().back();
		WebElement a = driver.findElement(By.xpath("//label[text()='Am I Broken Image?']/following-sibling::img"));
		String n = a.getAttribute("naturalWidth");
		if (n=="0");
		System.out.println("The image is broken");
		WebElement a1 = driver.findElement(By.xpath("//label[text()='Click me using Keyboard or Mouse']/following-sibling::img"));
		
		Actions obj = new Actions(driver);
        obj.doubleClick(a1)
                .build().perform();

	}

}
