package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoodoWebsite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://biz6060.goododata.com/");
		Thread.sleep(2000);
		String Title = driver.getTitle();
		System.out.println(Title);
		
		
		// To Scroll the Page and shift focus on to specific part 
		
		JavascriptExecutor jr = (JavascriptExecutor)driver;
		jr.executeScript("window.scrollBy(0,700)");
		driver.findElement(By.linkText("Enter")).click();
		System.out.println("Entered the Restaurant");
		Thread.sleep(2000);
		jr.executeScript("window.scrollBy(0,600)");
		
		// To go to the Food Menu category -1 (Appetizer) 
	    driver.findElement(By.id("itemsize_109")).click();
		driver.findElement(By.xpath("//select[@id='itemsize_109'] //option[@value='92']")).click();
		driver.findElement(By.xpath("//select[@id='itemlocation_109'] //option[@value='189']")).click();
		
		// Increasing qty of that item using the loop
		for (int i=0;i<2;i++)
		{
			driver.findElement(By.id("increase")).click();
			Thread.sleep(i);
		}
		
		
		// To go to the Food Menu Category -2  ( Rice Roll)
		/*driver.findElement(By.xpath("(//a[@id='GetItem'])[3]")).click();
		driver.findElement(By.name("Rice Roll")).click();                   //getting an alert here which is causing issue
		JavascriptExecutor rr = (JavascriptExecutor)driver;
		rr.executeScript("window.scrollBy(0,1000)");    // issue here as the page is not scrolling exactly to the downside and when compared with console works fine
		Thread.sleep(2000);
		driver.switchTo().
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		
		System.out.println(driver.findElement(By.xpath("//div/h4")).getText());*/
		
		driver.findElement(By.linkText("Go to Cart")).click();
		//driver.findElement(By.className(".view-more.checkout-button.login-redirect")).click();
		driver.navigate().back();
		driver.navigate().back();
		driver.findElement(By.xpath("//a /i[@class='fas fa-shopping-cart fa-lg']")).click();
		driver.close();
		
		
	}

}
