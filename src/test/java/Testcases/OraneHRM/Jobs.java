package Testcases.OraneHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

public class Jobs extends Login {

	@SuppressWarnings("deprecation")
	@AfterMethod
	public void jobs() {

		WebDriver driver = Login.driver;
		WebElement job = driver.findElement(By.xpath("//a[normalize-space()='Job']"));
		job.click();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		System.out.println("Clicked on Job");

		WebElement slider = driver
				.findElement(By.xpath("//span[@class='oxd-switch-input oxd-switch-input--active --label-right']"));
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		slider.click();
		System.out.println("Clicked on button now its showing Contract Details");

	}
}