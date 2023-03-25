import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertspractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.cssSelector("input[name='cusid']")).sendKeys("3214");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//input[@name='res']")).click();
		driver.findElement(By.cssSelector("input[name='cusid']")).sendKeys("3215");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		driver.switchTo().alert().accept();
		System.out.println("Customer Deleted Successfully");
		
	}

}
