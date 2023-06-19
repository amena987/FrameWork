package Tast;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;

import Baseo1.Base;


public class Varify02_Customer_Loging_TextPart1 extends Base{
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
			
			//7. Verify I am in Home Page
			String s = getElementText( By.xpath("//h2[2]") );
			
			//8. Click Profile Menu
			click( By.linkText("My Profile") );
			
			//9. Click Update Info
			Thread.sleep(3000);
			click( By.xpath("//button[@class='btn btn--radius btn--green']") );
			
			//10. Replace Contact Number 662789
			clear(By.xpath("//input[@type='number']") );
			Thread.sleep(3000);
			
			sendkeys( By.xpath("//input[@type='number']") , "662789");
			
			//11. Click Submit button
			Thread.sleep(3000);
			click( By.xpath("//button[@name='update']") );
			
			//12. Verify Contact Number is changed to 662789
			Thread.sleep(3000);
			String v = driver.findElement( By.xpath("//input[@type='number']") ).getAttribute("value");
			assertEquals("662789", v);
	        //tearDown();
		

	}

}
