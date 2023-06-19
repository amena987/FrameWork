package Tast;


import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;

import Baseo1.Base;


public class Varify_Employee_Loging_Test2 extends Base {
	@Test
	public  void  Varify_Microtechnaa_02() throws InterruptedException {
		
		/*
		Test Case: Verify Customer Login functionality
			1. Navigate to http://it.microtechlimited.com
			2. Click on Login Menu
			3. Click on Employee Login
			4. Enter User Id as testpilot@gmail.com
			5. Enter Password as 1234
			6. Click Login Button
			7. Verify I am in Home Page
		*/
		
		//setup();//instantiate webDriver
		
		//1. Navigate to http://it.microtechlimited.com
		 navigateURL("http://it.microtechlimited.com/elogin.php");
		 
		 //2. Click on Login Menu
		 
		 click(By.xpath("//a[@href=\"elogin.php\"]"));
		 
		// 3. Click on Employee Login
		 click(By.xpath("//h1[text()='Employee Login ']"));
		 
		// 4. Enter User Id as testpilot@gmail.com
		 sendkeys(By.xpath("//input[@name='mailuid']"),"testpilot@gmail.com");
		
		//5. Enter Password as 1234
		
		 sendkeys(By.xpath("//input[@name='pwd']"),"1234");
		
		//6. Click Login Button
		 Thread.sleep(2000);
		 click(By.name("login-submit"));
		//7. Verify I am in Home Page
		  String s = getElementText(By.xpath("//h2[text()='Welcome Test ']")); // verify the Text of that
		  //assertEquals("Welcome Test",s);
		 //8.Click Product menue
		  click(By.xpath("//a[text()='Product Order']"));
		//9.Click Product Name
		  Thread.sleep(1000);
		  click(By.name("prodId"));
		  click(By.xpath("//option[text()='Tshirt']"));
		  //10.I enter order date
		  sendkeys(By.name("ordDate"),"12-05-23");
		  //11.I Click order Product button
		  click(By.xpath("//button[text()='Order Product']"));
		  
		  //12. I Click confirm
		  click(By.xpath("//tbody/tr[last()]/td[7]/a"));
		  //13.Verify Confirmed
		String actuale =  getElementText(By.xpath("//tbody/tr[last()]/td[6]"));
		  assertEquals("Confirmed",actuale);
		  
		  
		  
	}

}
