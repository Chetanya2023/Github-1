package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticalTest {

	
		//public static void main(String[] args) throws InterruptedException
		//{
			//System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
	//	WebDriver driver= new ChromeDriver();
		public static WebDriver driver;
		
		public static void scrollByVisibilityOfElement( WebElement ele) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", ele);

			}
			public static void explicitWait(WebElement element, int timeOut ) {
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
			wait.until(ExpectedConditions.visibilityOf(element));
			}
			void openWebPage(String enteradd,String enterFlat, String city ) throws InterruptedException
			{
			String url= "https://biz6060.goododata.com/";
			   driver.get(url);
			   driver.manage().deleteAllCookies();
			   driver.manage().window().maximize();
			   
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			   driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(120));
			   
			   WebElement paradizeHotel=driver.findElement(By.xpath("//section[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/a[1]"));
			   scrollByVisibilityOfElement(paradizeHotel);
			   paradizeHotel.click();
			 
			   WebElement plusCounter=driver.findElement(By.xpath("//*[@id='increase']"));
			   explicitWait(plusCounter,20);
			   scrollByVisibilityOfElement(plusCounter);
			   plusCounter.click();

			   
			   WebElement cartBtn=driver.findElement(By.xpath("//*[@class='btn btn-danger_Card mt-3']"));
			   scrollByVisibilityOfElement(cartBtn);
			   cartBtn.click();
			   
			   WebElement checkout=driver.findElement(By.xpath("(//*[contains(text(),'Checkout')])[1]"));
			   checkout.click();
			   
			   WebElement skipSignIn=driver.findElement(By.xpath("//*[text()='Skip Sign In ']"));
			   explicitWait(skipSignIn,10);
			   skipSignIn.click();
			   
			   WebElement orderForBTn=driver.findElement(By.xpath("(//div[@class='cart-edit']/a/img)[1]"));
			   explicitWait(orderForBTn,10);
			   orderForBTn.click();
			   
			   WebElement fullName=driver.findElement(By.xpath("//input[@name='order_for']"));
			   fullName.sendKeys("Wen Fang");
			   
			   WebElement mobile=driver.findElement(By.xpath("//input[@name='order_for_mobile']"));
			   mobile.sendKeys("84598563256");
			   
			   WebElement confirmDetails=driver.findElement(By.xpath("//button[text()='Confirm ']"));
			   confirmDetails.click();
			   
			   WebElement selectAdress=driver.findElement(By.xpath("//p[contains(text(),'Select Address')]"));
			   selectAdress.click();
			   
			   WebElement addNewAdress=driver.findElement(By.xpath("//p[contains(text(),'Add New Address')]"));
			   explicitWait(addNewAdress,10);

			   addNewAdress.click();
			   
			   WebElement enterAdress=driver.findElement(By.xpath("//input[@id='select_address']"));
			   explicitWait(enterAdress,10);
			   enterAdress.sendKeys(enteradd);
			   
			   WebElement enterFlatNo=driver.findElement(By.xpath("//textarea[@id='Flatno']"));
			   enterFlatNo.sendKeys(enterFlat);
			   
			   WebElement entercity=driver.findElement(By.xpath("//input[@id='city']"));
			   entercity.sendKeys(city);
			   
			   WebElement saveAdress=driver.findElement(By.xpath("//input[@id='btnSaveAddress']"));
			   saveAdress.click();
			   //**************
			   WebElement okBtn=driver.findElement(By.xpath("//button[contains(text(),'OK')]"));
			   explicitWait(okBtn,10);

			   okBtn.click();
			   
			   WebElement proceedBtn=driver.findElement(By.xpath("//a[@id='btnProceed']"));
			   proceedBtn.click();
			   
			   WebElement proceed=driver.findElement(By.xpath("//button[contains(text(),'Proceed')]"));
			   proceed.click();
			   
			   WebElement ePayment=driver.findElement(By.xpath("//a[@id='btnConfirmPayment']"));
			   ePayment.click();
			   
			   WebElement enterEmail=driver.findElement(By.xpath("//*[@id='email']"));
			   explicitWait(enterEmail,10);
			   enterEmail.sendKeys("wenfang@gmail.com");
			   
			   WebElement enterCardNo=driver.findElement(By.xpath("//*[@id='card_number']"));
			   enterCardNo.sendKeys("4111 1111 1111 1111");
			   
			   WebElement enterCardExp=driver.findElement(By.xpath("//*[@id='cc-exp']"));
			   enterCardExp.sendKeys("12/2023");

			   WebElement enterCvc=driver.findElement(By.xpath("//*[@id='cc-csc']"));
			   enterCvc.sendKeys("123");
			   
			   WebElement payBtn=driver.findElement(By.xpath("//span[contains(text(),'Pay')]"));
			   payBtn.click();
			   
			   WebElement viewOrdersummary=driver.findElement(By.xpath("//a[@class='view-order']"));
			   viewOrdersummary.click();
			   
	}

}
