package Testcases.OraneHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

public class Delete extends Login {
	@AfterMethod
	public void Deletefile() {
		WebDriver driver = Login.driver;

		WebElement immi = driver.findElement(By.xpath("(//div[@class='orangehrm-tabs-wrapper'])[5]"));
		immi.click();
		System.out.println("Navigated to Immigration");

		WebElement maincheck = driver.findElement(By.xpath(
				"(//span[@class=\"oxd-checkbox-input oxd-checkbox-input--active --label-right oxd-checkbox-input\"])[1]"));
		maincheck.click();
		System.out.println("Checkbox selected");

		WebElement delete = driver.findElement(By.xpath(
				"//button[@class=\"oxd-button oxd-button--medium oxd-button--label-danger orangehrm-horizontal-margin\"]"));
		delete.click();
		System.out.println("Alert message");
		WebElement alertdel = driver.findElement(By.xpath(
				"//button[@class=\"oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin\"]"));

		alertdel.click();
		System.out.println("Deleted succesfully");

	}
}