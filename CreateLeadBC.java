package week5.day1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateLeadBC extends BaseClassBC {
	@Test
	public void createLeadBC() {
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		driver.findElement(By.name("submitButton")).click();
		
}
}






