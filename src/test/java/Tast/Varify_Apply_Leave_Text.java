package Tast;


import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;

import Baseo1.Base;


public class Varify_Apply_Leave_Text extends Base {
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
		// 7. Verify I am in Home Page
		 String a = getElementText(By.xpath("//h2[2]"));	
		// 8. Click apply leave menue
		 click(By.linkText("Apply Leave"));
		// 9. Enter Reason
		Thread.sleep(3000);
		sendkeys(By.xpath("//input[@name='reason']"), "For study abroad");

		// 10. Enter Start Date
		
		sendkeys(By.name("start"), "01-27-2023");
		
		// 11. Enter End Date
		
		sendkeys(By.name("end"), "02-23-2023");
		
		// 12. Click Submit  button
		Thread.sleep(3000);
		click(By.xpath("//button[text()='Submit']"));
		// 13. Verify Confirmed
		Thread.sleep(3000);
		String v = getElementText(By.xpath("//tbody/tr[last()]/td[4]"));
		assertEquals("For study abroad", v);

		
	
	
	}

}
