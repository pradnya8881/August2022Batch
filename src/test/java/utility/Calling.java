package utility;

import java.util.concurrent.TimeUnit;

public class Calling
{

	public static void main(String[] args) throws InterruptedException
	{
		Object[] input=new Object[2];
		        input[0]="webdriver.chrome.driver";
		        input[1]="G:\\Automation Support\\chromedriver.exe"; //browser launcch
		        SeleniumOperations.browserLaunch(input);
		        
		        Object[] input1=new Object[1];
		        input1[0]="https://www.flipkart.com/"; //open application
		        SeleniumOperations.openApplication(input1);
		        
		        Object[] input2=new Object[1];
		        input2[0]="//*[@class='_2KpZ6l _2doB4z']";    //cancel window
		        SeleniumOperations.clickonElement(input2);
		        
		        Object[] input3=new Object[1];
		        input3[0]="//*[@class='_1_3w1N']";   //mouseover login
		        SeleniumOperations.mouseOver(input3);
		        
		       
		        Object[] input4=new Object[1];
		        input4[0]="//*[@class='_3vhnxf']";    //click on my profile
		       SeleniumOperations.clickonElement(input4);

                Thread.sleep(5000);
                Object[] input5=new Object[2];
		        input5[0]="(//*[@type='text'])[2]";  // username
		        input5[1]="9890746249"; 
		        SeleniumOperations.sendKeys(input5);
		        
		        Object[] input6=new Object[2];
		        input6[0]= "//*[@type='password']"; //password
		        input6[1]="sharadnya8881"; 
		        SeleniumOperations.sendKeys(input6);
		        
		        Object[] input7=new Object[1];
		        input7[0]="(//*[@type='submit'])[2]";   // login
		        SeleniumOperations.clickonElement(input7);
		      
		        Thread.sleep(5000);
		        
		        Object[] input8=new Object[1];
			    input8[0]= "//*[text()='Manage Addresses']";    //click on manage address
			    SeleniumOperations.clickonElement(input8);
			    
			    Thread.sleep(5000);
			    Object[] input9=new Object[1];
		        input9[0]="_1QhEVk";    //click on add address
		       SeleniumOperations.addAddress(input9);
		       
		       Object[] input10=new Object[2];
		       input10[0]= "//*[@name='name']"; //name
		       input10[1]="Pradnya"; 
		        SeleniumOperations.sendKeys(input10);
		        
		        Object[] input11=new Object[2];
			      input11[0]="//*[@name='phone']"; //ph num
			      input11[1]="9890746249"; 
			      SeleniumOperations.sendKeys(input11);
			        
			     Object[] input12=new Object[2];
			        input12[0]="//*[@name='pincode']"; //pin code
				    input12[1]="411062"; 
				    SeleniumOperations.sendKeys(input12);
				        
			   Object[] input13=new Object[2];
			     input13[0]="//*[@name='addressLine2']"; //pin code
				  input13[1]="DehuAlandi road,behind River residency.Chikhali"; //address 
				  SeleniumOperations.sendKeys(input13);
				  
				  Object[] input14=new Object[2];
				     input14[0]="//*[@name='addressLine1']"; //address 2
					  input14[1]="D 503 Kolosus Green City"; 
					  SeleniumOperations.sendKeys(input14);
					  
				 Object[] input15=new Object[2];
				 input15[0]="//*[@name='city']"; //city
				  input15[1]="Pimpri"; 
				  SeleniumOperations.sendKeys(input15);
				  
				  Object[] input16=new Object[1];
				    input16[0]="//*[@for='HOME']";    //click on home
				    SeleniumOperations.clickonElement(input16);
				    
				    Object[] input17=new Object[1];
				    input17[0]="(//*[@type='button'])[2]";    //click on save
				    SeleniumOperations.clickonElement(input17);
					  
				    Object[] input18=new Object[1];
				    input18[0]="//*[@class='_1XFPmK']";    //click on radio button
				    SeleniumOperations.clickonElement(input18);
					  
				    Object[] input19=new Object[1];
				    input19[0]="//*[@class='_1XFPmK']";    //click on radio button
				    SeleniumOperations.clickonElement(input19);
				    
				    Object[] input20=new Object[1];
				    input20[0]="//*[text()='Confirm']";    //click on confirm
				    SeleniumOperations.clickonElement(input20);
	}
	
	
	
	}
