package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//div[@id='x-form-el-ext-gen248']/input")).sendKeys("SathyaTest");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.findElement(By.linkText("Edit")).click();
		String companyName = "TataConsult";
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(companyName);
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		Thread.sleep(2000);
		String updatedName = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		System.out.println(updatedName);
		String[] company = updatedName.split(" ");
		String expected = company[0];
		Assert.assertEquals(companyName, expected);
		driver.close();
		
		
		
		
		/*http://leaftaps.com/opentaps/control/main
			
			* 1	Launch the browser
			* 2	Enter the username
			* 3	Enter the password
			* 4	Click Login
			* 5	Click crm/sfa link
			* 6	Click Leads link
			* 7	Click Find leads
			* 8	Enter first name
			* 9	Click Find leads button
			* 10 Click on first resulting lead
			* 11 Verify title of the page
			* 12 Click Edit
			* 13 Change the company name
			* 14 Click Update
			* 15 Confirm the changed name appears
			* 16 Close the browser (Do not log out)
*/

	}

}
