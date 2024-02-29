package Testcases.OraneHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
	public static WebDriver driver;

	@SuppressWarnings("deprecation")
	@Test
	public void LoginTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\maven\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

		System.out.println("Driver Openend and Site opened");
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		username.click();
		username.sendKeys("Admin");
		System.out.println("Login ID Entered");

		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.click();
		password.sendKeys("admin123");
		System.out.println("Password Entered");

		WebElement clicker = driver.findElement(By.xpath(" //button[normalize-space()='Login']"));
		clicker.click();

		WebElement username1 = driver.findElement(By.xpath("(//li[@class='oxd-main-menu-item-wrapper'])[6]"));
		username1.click();
		System.out.println("Navigated to Myinfo");

	}
}
