import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;


public class Rewebsite {

	public static void main(String[] args) throws InterruptedException,MalformedURLException, IOException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		SoftAssert oo = new SoftAssert();
				List<WebElement> links = driver.findElements(By.tagName("a"));
				
				for (WebElement link : links)
				{
				String some= link.getAttribute("href");
				HttpURLConnection linked =(HttpURLConnection)new URL(some).openConnection();  // open connection is the method 
				 linked.setRequestMethod("HEAD");
				 linked.connect();
				 int res = linked.getResponseCode();
				 System.out.println(res);
				 oo.assertTrue(res<400," Name" + link.getText());
				}
				oo.assertAll();
		


	   
	}
	

}
