package Tast;


import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;

import Baseo1.Base;


public class Varify_Employee_Loging_Test extends Base {
	@Test
	public  void  Varify_Microtechnaa_02() throws InterruptedException {
		
		/*
		Test Case: Verify Customer Login functionality
			1. Navigate to http://it.microtechlimited.com
			2. Click on Login Menu
			3. Click on Customer Login
			4. Enter User Id as david@gmail.com
			5. Enter Password as 1234
			6. Click Login Button
			7. Verify I am in Home Page
		*/
		
		//setup();//instantiate webDriver
		
		//1. Navigate to http://it.microtechlimited.com
		 navigateURL("http://it.microtechlimited.com/elogin.php");
		 
		 //2. Click on Login Menu
		 
		 click(By.xpath("//a[@href=\"elogin.php\"]"));
		 
		// 3. Click on Customer Login
		 click(By.xpath("//h1[text()='Employee Login ']"));
		 
		// 4. Enter User Id as david@gmail.com
		 sendkeys(By.xpath("//input[@name='mailuid']"),"testpilot@gmail.com");
		
		//5. Enter Password as 1234
		
		 sendkeys(By.xpath("//input[@name='pwd']"),"1234");
		
		//6. Click Login Button
		 Thread.sleep(2000);
		 click(By.name("login-submit"));
		//7. Verify I am in Home Page
		
		
		  String s = getElementText(By.xpath("//h2[text()='Welcome Test ']")); // verify the Text of that
		  assertEquals("Welcome Test",s);
		 
		
	
	
	}

}
