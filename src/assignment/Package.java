package assignment;



		import java.util.concurrent.TimeUnit;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class Package {

		public static void main(String[] args) throws InterruptedException {
		     System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver.exe");

		     WebDriver driver=new ChromeDriver();

		     driver.get("https://biz6060.goododata.com/");
		 //   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		    driver.manage().window().maximize();
		     
		     driver.manage().deleteAllCookies();
		     
		   /* WebElement searchbox = driver.findElement(By.xpath("//input[@name='searchfilter'][1]"));

		    searchbox .sendKeys("paradise restaurant");*/
		   
		    WebElement search_button = driver.findElement(By.xpath("//input[@id='filter'][1]"));
		   
		    Thread.sleep(2000);
		   search_button.click();
		 WebElement enter_button = driver.findElement(By.xpath("//a[text()='Enter']"));
		 enter_button .click();
		   driver.findElement(By.xpath("//div[@id='increase']")).click();
		  Thread.sleep(2000);
		 
		   driver.findElement(By.xpath("//div[@id='increase']")).click();
		   
		   Thread.sleep(2000);
		 
		 WebElement goToCart = driver.findElement(By.xpath("//a[text()='Go to Cart']"));
		 
		 goToCart.click();
		 
		WebElement cheackoutButton = driver.findElement(By.xpath("//a[text()='Checkout (1 item) $20']"));
		cheackoutButton.click();
		 
		WebElement skipLoginButton = driver.findElement(By.xpath("//button[@class='btn skip-bxbtn']"));
		skipLoginButton .click();
		 
		WebElement edit = driver.findElement(By.xpath("//div[@class='cart-edit']//a[@data-target='#orderFor']"));
		edit.click();
		 
		WebElement textBox = driver.findElement(By.xpath("//input[@name='order_for']"));
		textBox.sendKeys("XYZ");
		 
		 WebElement mobileNumberTextBOX = driver.findElement(By.xpath("//input[@name='order_for_mobile']"));
		 mobileNumberTextBOX.sendKeys("1234567891");
		 
		WebElement confirmButton = driver.findElement(By.xpath("//button[text()='Confirm ']"));
		confirmButton.click();
		WebElement selectAddressButton = driver.findElement(By.xpath("//p[@class='fa fa-address-card']"));
		selectAddressButton.click();

		WebElement addNewAddress = driver.findElement(By.xpath("//p[@class='fa fa-plus-circle']"));
		addNewAddress.click();

		WebElement selectAddressText = driver.findElement(By.xpath("//input[@name='address']"));
		selectAddressText.sendKeys("pune");

		WebElement flatText = driver.findElement(By.xpath("//textarea[@id='Flatno']"));
		flatText.sendKeys("House No. 1");
		WebElement cityTextBox = driver.findElement(By.xpath("//input[@name='city']"));
		cityTextBox.sendKeys("pune");

		WebElement saveButton = driver.findElement(By.xpath("//input[@id='btnSaveAddress']"));
		saveButton.click();
		 
		WebElement okButton = driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']"));
		okButton.click();

		WebElement proceedButton = driver.findElement(By.xpath("//a[text()='Proceed']"));
		proceedButton.click();
		WebElement orderInstructionText = driver.findElement(By.xpath("//textarea[@id='exampleFormControlTextarea1']"));
		orderInstructionText.sendKeys("xyz abc");
		WebElement proceedButton1 = driver.findElement(By.xpath("//button[text()='Proceed']"));
		proceedButton1.click();

		WebElement tipText = driver.findElement(By.xpath("//input[@id='tipvalue']"));
		tipText.sendKeys("10");
		WebElement submitButton = driver.findElement(By.xpath("//a[@id='btntip']"));
		submitButton.click();
		WebElement ePaymentButton = driver.findElement(By.xpath("//a[@id='btnConfirmPayment']"));
		ePaymentButton.click();
		WebElement EmailText = driver.findElement(By.xpath("//input[@id='email']"));
		EmailText.sendKeys("xyz@gmail.com");
		WebElement cardNumberText = driver.findElement(By.xpath("//input[@id='card_number']"));
		cardNumberText.sendKeys("4111 1111 1111 1111");

		WebElement date = driver.findElement(By.xpath("//input[@placeholder='MM / YY']"));
		date.sendKeys("122023");

		WebElement cvcText = driver.findElement(By.xpath("//input[@placeholder='CVC']"));
		cvcText.sendKeys("123");
		//span[text()='Pay $23.00']
		 WebElement payButton = driver.findElement(By.xpath("//span[text()='Pay $23.00']"));
		 payButton.click();
		 
		 driver.close();
		}

		
	}


