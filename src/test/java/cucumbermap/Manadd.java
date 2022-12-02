package cucumbermap;

import cucumber.api.java.en.When;
import utility.SeleniumOperations;

public class Manadd 
{
	@When ("^user click on Manage address$")
	public void manageAdd() throws InterruptedException
	{
		Thread.sleep(5000);
        
        Object[] input8=new Object[1];
	    input8[0]= "//*[text()='Manage Addresses']";    //click on manage address
	    SeleniumOperations.clickonElement(input8);
	    
	}
	
	@When ("^user click on Add address$")
	public void adAdd() throws InterruptedException
	{
		Thread.sleep(5000);
	   Object[] input9=new Object[1];
       input9[0]="_1QhEVk";    //click on add address
       SeleniumOperations.addAddress(input9);
	}
	
	@When ("^user enter \"(.*)\" as name$")
	public void adname(String value)
	{
		Object[] input10=new Object[2];
	    input10[0]= "//*[@name='name']"; //name
	    input10[1]=value; 
        SeleniumOperations.sendKeys(input10);
	}
	
	@When ("^user enter \"(.*)\" as Phone number$")
	public void phNum(String value)
	{
		 Object[] input11=new Object[2];
	      input11[0]="//*[@name='phone']"; //ph num
	      input11[1]=value; 
	      SeleniumOperations.sendKeys(input11);
	}
	
	 @When ("^user enter \"(.*)\" as pin Code$")
	 public void pinCode(String value)
	 {
		   
	     Object[] input12=new Object[2];
	     input12[0]="//*[@name='pincode']"; //pin code
		 input12[1]=value; 
		 SeleniumOperations.sendKeys(input12);
	 }
	
	 @When ("^user enter \"(.*)\" as locality$")
	 public void address1(String value)
	 {
		 Object[] input13=new Object[2];
	     input13[0]="//*[@name='addressLine2']"; //pin code
		 input13[1]="DehuAlandi road,behind River residency.Chikhali"; //address 
	     SeleniumOperations.sendKeys(input13);
		  
	 }
	 
	 @When ("^user enter \"(.*)\" as Building number$")
	 public void address2(String value)
	 {
		 Object[] input14=new Object[2];
	     input14[0]="//*[@name='addressLine1']"; //address 2
	     input14[1]=value; 
		 SeleniumOperations.sendKeys(input14);
	 }
	 
	 @When ("^user enter \"(.*)\" as City$")
	 public void city(String value) 
	 {
		 Object[] input15=new Object[2];
		 input15[0]="//*[@name='city']"; //city
	     input15[1]=value; 
	     SeleniumOperations.sendKeys(input15);
	 }
	 
	 @When ("^user click on Home$")
	 public void selectHome()
	 {
		 Object[] input16=new Object[1];
		 input16[0]="//*[@for='HOME']";    //click on home
		 SeleniumOperations.clickonElement(input16);
	 }
	 
	 @When ("^user click on save button$")
	 public void savebutton()
	 {
		 Object[] input17=new Object[1];
		 input17[0]="(//*[@type='button'])[2]";    //click on save
	     SeleniumOperations.clickonElement(input17); 
	 }
	 
	 @When ("^user click on radio button$")
	 public void radioButton()
	 {
		 Object[] input18=new Object[1];
	     input18[0]="//*[@class='_1XFPmK']";    //click on radio button
		 SeleniumOperations.clickonElement(input18);
	 }
	 
	 @When ("^user click on Confirm$")
	 public void confirm()
	 {
		 Object[] input20=new Object[1];
		 input20[0]="//*[text()='Confirm']";    //click on confirm
		 SeleniumOperations.clickonElement(input20);
	 }
}
