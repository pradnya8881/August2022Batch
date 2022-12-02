package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Tempt {

	public static void main(String[] args) throws InterruptedException 
	{
		//launch browser
		System.setProperty("webdriver.chrome.driver","G:\\Automation Support\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		//Open Application
		driver.get("https://www.flipkart.com/");
		
		//cancel window
		driver.findElementByXPath("//*[@class='_2KpZ6l _2doB4z']").click();
		
		//Go to Login
		Actions act=new Actions(driver);
		WebElement one=driver.findElementByXPath("//*[@class='_1_3w1N']");
		act.moveToElement(one).build().perform();
		//Go to My profile
		driver.findElementByXPath("//*[@class='_3vhnxf']").click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Enter User name
	    driver.findElementByXPath("(//*[@type='text'])[2]").sendKeys("9890746249");
	    
		
		//enter password
		driver.findElementByXPath("//*[@type='password']").sendKeys("sharadnya8881");
		
		//click on login
		driver.findElementByXPath("(//*[@type='submit'])[2]").click();
		
		Thread.sleep(5000);
		//Manage address
	  driver.findElementByXPath("//*[text()='Manage Addresses']").click();
		
        //Add address
         driver.findElementByClassName("_1QhEVk").click();

          driver.findElementByXPath("//*[@name='name']").sendKeys("Pradnya");//name
          driver.findElementByXPath("//*[@name='phone']").sendKeys("9890746249");//ph number
          driver.findElementByXPath("//*[@name='pincode']").sendKeys("411062");//pin code
          driver.findElementByXPath("//*[@name='addressLine2']").sendKeys("DehuAlandi road,behind River residency.Chikhali");//locality
          driver.findElementByXPath("//*[@name='addressLine1']").sendKeys("D 503 Kolosus Green City");//add
          driver.findElementByXPath("//*[@name='city']").sendKeys("Pimpri");//city
         // Select s=new Select(driver.findElementByXPath("//*[@name='state']"));
         //  s.selectByValue("Maharashtra");
          driver.findElementByXPath("//*[@for='HOME']").click();
          driver.findElementByXPath("(//*[@type='button'])[2]").click();
         WebElement rb= driver.findElementByXPath("//*[@class='_1XFPmK']");
         rb.click();
          driver.findElementByXPath("//*[text()='Confirm']").click();
         
     
      
     	}

}