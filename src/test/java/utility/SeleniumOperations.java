package utility;


import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumOperations
{
//browser launch
	public static ChromeDriver driver = null;
	public static Hashtable<String,Object> outputParameters=new Hashtable<String,Object>();
	public static Hashtable<String, Object> browserLaunch(Object[] inputParameters)
	{
		try
		{
		String key=(String) inputParameters[0];
				String value =(String) inputParameters[1];
		System.setProperty(key,value);
	    driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		outputParameters.put("STATUS","PASS");
		outputParameters.put("MESSAGE", "MethodUsed:browserlaunch,InputGiven:"+ inputParameters[0].toString());
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS","FAIL");
			outputParameters.put("MESSAGE", "MethodUsed:browserlaunch,InputGiven:"+ inputParameters[0].toString());
		}
		
		return outputParameters;
	}
	//Open Application
	public static Hashtable<String, Object> openApplication(Object[] inputParameters)
    {
		try
		{
		String url=(String) inputParameters[0];
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		outputParameters.put("STATUS","PASS");
		outputParameters.put("MESSAGE", "MethodUsed:openApplication,InputGiven:"+ inputParameters[0].toString());
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS","FAIL");
			outputParameters.put("MESSAGE", "MethodUsed:openApplication,InputGiven:"+ inputParameters[0].toString());
		}
		return outputParameters;
	}
	
	//Click on Login
	public static Hashtable<String, Object> clickonElement(Object[] inputParameters) 
	{
		try
		{
		String xpath=(String) inputParameters[0];
		driver.findElementByXPath(xpath).click();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		outputParameters.put("STATUS","PASS");
		outputParameters.put("MESSAGE", "MethodUsed:clickonElement,InputGiven:"+ inputParameters[0].toString());
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS","FAIL");
			outputParameters.put("MESSAGE", "MethodUsed:clickonElement,InputGiven:"+ inputParameters[0].toString());
		}
		return outputParameters;
	}
	//mouse over
	public static Hashtable<String, Object> mouseOver(Object[] inputParameters)
    {
		try 
		{
		String xpath=(String) inputParameters[0];
		Actions act=new Actions(driver);
		WebElement one=driver.findElementByXPath(xpath);
		act.moveToElement(one).build().perform();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		outputParameters.put("STATUS","PASS");
		outputParameters.put("MESSAGE", "MethodUsed:mouseOver,InputGiven:"+ inputParameters[0].toString());
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS","FAIL");
			outputParameters.put("MESSAGE", "MethodUsed:mouseOver,InputGiven:"+ inputParameters[0].toString());
		}
		return outputParameters;
	}
	//send keys
	public static Hashtable<String, Object> sendKeys(Object[]inputParameters)
	{
		try
		{
		String xpath=(String) inputParameters[0];
		String value =(String) inputParameters[1];
		driver.findElementByXPath(xpath).sendKeys(value);
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		outputParameters.put("STATUS","PASS");
		outputParameters.put("MESSAGE", "MethodUsed:sendKeys,InputGiven:"+ inputParameters[1].toString());
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS","FAIL");
			outputParameters.put("MESSAGE", "MethodUsed:sendKeys,InputGiven:"+ inputParameters[1].toString());
		}
		return outputParameters;
	}
	  //clickaddress
	public static Hashtable<String, Object> addAddress(Object[]inputParameters) throws InterruptedException
	{
		try
		{
		String path=(String) inputParameters[0];
		driver.findElementByClassName(path).click();
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		outputParameters.put("STATUS","PASS");
		outputParameters.put("MESSAGE", "MethodUsed:addAddress,InputGiven:"+ inputParameters[0].toString());
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS","FAIL");
			outputParameters.put("MESSAGE", "MethodUsed:addAddress,InputGiven:"+ inputParameters[0].toString());
		}
		return outputParameters;
	}
	
	//validate login

	public static Hashtable<String, Object> validateLogin(Object[]inputParameters) throws InterruptedException
	{
		try
		{
		Thread.sleep(5000);
		String requiredUrl= (String) inputParameters[0];
		
		String catchUrl= driver.getCurrentUrl();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		
		if(catchUrl.equalsIgnoreCase(requiredUrl))
				{
			    System.out.println("Test case pass");
			    outputParameters.put("STATUS","PASS");
				outputParameters.put("MESSAGE", "MethodUsed:validateLoginInputGiven:"+ inputParameters[0].toString());
				}
		else
		{
			System.out.println("Test case fail");
		}
	
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS","FAIL");
			outputParameters.put("MESSAGE", "MethodUsed:validateLogin,InputGiven:"+ inputParameters[0].toString());
		}
		return outputParameters;
	}

}

