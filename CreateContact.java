package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Willium");
		driver.findElement(By.id("lastNameField")).sendKeys("Jones");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Willium");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Henry");
		driver.findElement(By.name("departmentName")).sendKeys("Information tech");
		driver.findElement(By.name("description")).sendKeys("test description");
		driver.findElement(By.name("primaryEmail")).sendKeys("test@gmail.com");
		WebElement state = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select S = new Select(state);
		S.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.name("importantNote")).sendKeys("updated");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		System.out.println(driver.getTitle());
		driver.close();

	}

}
