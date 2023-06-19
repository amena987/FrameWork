package Tast;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;

import Baseo1.Base;



public class Varify02_Customer_Loging_TextPart2 extends Base{
@Test
	public void  Varify02_Microtech_02() throws InterruptedException { 
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
	//1. Navigate to http://it.microtechlimited.com
	 navigateURL("http://it.microtechlimited.com/elogin.php");
			
			
			//2. Click on Login Menu
			click( By.xpath("//a[@href='elogin.php']") );
			
			//3. Click on Customer Login
			click(By.xpath("//a[@href='clogin.php']") );
			
			//4. Enter User Id as david@gmail.com
			sendkeys(By.xpath("//input[@name='mailuid']"), "david@gmail.com");
			
			//5. Enter Password as 1234
			sendkeys(By.xpath("//input[@name='pwd']"), "1234");
			
			//6. Click Login Button
			click( By.name("login-submit")  );
			
			//7. Verify  Home Page
			String s= getElementText( By.xpath("//h2[2]") );
			//8. Click Profile Menu
			click(By.linkText("My Profile"));
			//9.I click update info
			click(By.name("send"));
			//10. Replace Contact Number 999
			clear(By.name("contact"));
			Thread.sleep(1000);
			sendkeys( By.name("contact") , "999");
			//11. Click Submit button
			click(By.name("update"));
			//12. Verify Contact Number is changed to999
			
			Thread.sleep(3000);
			String v = driver.findElement( By.xpath("//input[@type='number']") ).getAttribute("value");
			assertEquals("999", v);
		//tearDown();
		

	}

}
