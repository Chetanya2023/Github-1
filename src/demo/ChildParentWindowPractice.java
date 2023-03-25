package demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;




public class ChildParentWindowPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/popup.php");
		driver.findElement(By.linkText("Click Here")).click();
		Set<String> pages = driver.getWindowHandles();  // Pages variable will store the number of tabs and this tabs/windows will be fetched using windowshandles method
		Iterator <String> it = pages.iterator();
		String Parentwindow = it.next();
		String Childwindow = it.next();
		driver.switchTo().window(Childwindow);
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("test@1234.com");
		driver.close();
		driver.switchTo().window(Parentwindow);
		

	}
}
