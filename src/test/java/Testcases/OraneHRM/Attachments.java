package Testcases.OraneHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

public class Attachments extends Login {

	@AfterMethod
	public void DeleteAttachment() {
		WebDriver driver = Login.driver;

		WebElement username2 = driver.findElement(By.xpath(" (//a[normalize-space()='Immigration'])[1]"));
		username2.click();
		System.out.println("Navigated to Immigration");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement ele = driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='Add'])[2]"));
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
		ele.click();
		System.out.println("Add button clicked");

		WebElement Upload = driver.findElement(By.xpath("(//input[@type='file'])[1]"));
		Upload.sendKeys("C:\\Users\\Sanket\\Desktop\\4334.png");
		System.out.println("Document Uploaded");

		WebElement Comm = driver.findElement(By.xpath("//textarea[@placeholder='Type comment here']"));
		Comm.sendKeys("File Uploaded");
		System.out.println("Comments done");

		WebElement save = driver.findElement(By.xpath("//button[normalize-space()='Save']"));
		save.click();
		System.out.println("Attachment is Saved");
	}
}
