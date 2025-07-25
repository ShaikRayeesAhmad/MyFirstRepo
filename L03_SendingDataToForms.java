package Section05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L03_SendingDataToForms {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/rayeesmacbookair/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationtesting.co.uk/contactForm.html");
		
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("rayees");
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("ahmad");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("rayeesahmedme@gmail.com");
		driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys("Hello");
		
		Thread.sleep(3000);
		driver.close();
		driver.quit();

	}

}
