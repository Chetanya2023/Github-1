import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class BrokenLink {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://test-customer.appegic.com/");
		System.out.println(driver.findElements(By.xpath("//li/a")).size());
		List <WebElement> links = driver.findElements(By.xpath("//li/a"));  // Used Tag Name only as there are no attributes
		for(WebElement link : links)
		{
			String Store= link.getAttribute("href");
			HttpURLConnection linked =(HttpURLConnection)new URL(Store).openConnection();  // open connection is the method 
			 linked.setRequestMethod("HEAD");
			 linked.connect();
			 int Rest= linked.getResponseCode();
			 System.out.println(Rest);
		}	
	String display= driver.findElement(By.xpath("//p[@class='mt-0 mb-0']")).getText();
	Assert.assertEquals("© Copyright 2022 Virtual Supermarket. All Rights Reserved", display);
	System.out.println("Pass");
	}

	
}
