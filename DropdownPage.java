package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownPage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		
		WebElement dropdown1 = driver.findElement(By.id("dropdown1"));
		Select d1 = new Select(dropdown1);
		d1.selectByIndex(1);
		
		WebElement dropdown2 = driver.findElement(By.name("dropdown2"));
		Select d2 = new Select(dropdown2);
		d2.selectByVisibleText("Appium");
		
		WebElement dropdown3 = driver.findElement(By.id("dropdown3"));
		Select d3 = new Select(dropdown3);
		d3.selectByValue("3");
		
		WebElement dropdown4 = driver.findElement(By.className("dropdown"));
		Select d4 = new Select(dropdown4);
		int n = d4.getOptions().size();
		System.out.println("Number of dropdowns "+n);
		
		driver.findElement(By.xpath("//div[@class='example'][5]/select")).sendKeys("LoadRunner");
		
		WebElement dropdown6 = driver.findElement(By.xpath("//div[@class='example'][6]/select"));
		Select d6 = new Select(dropdown6);
		d6.selectByVisibleText("UFT/QTP");
		
		driver.close();
		

	}

}
