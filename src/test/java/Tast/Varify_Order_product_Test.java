package Tast;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;

import Baseo1.Base;


public class Varify_Order_product_Test extends Base {
	@Test
	public void Varify_Microtechnaa_02() throws InterruptedException {

		/*
		 * Test Case: Verify Customer Login functionality 
		 * 1. Navigate to http://it.microtechlimited.com 
		 * 2. Click on Login Menu 
		 * 3. Click on Customer Login 
		 * 4. Enter User Id as david@gmail.com 
		 * 5. Enter Password as 1234 
		 * 6. Click Login Button 
		 * 7. Verify I am in Home Page
		 * // 8. Click order product menue
		 */

		// 1. Navigate to http://it.microtechlimited.com
		 navigateURL("http://it.microtechlimited.com/elogin.php");

		// 2. Click on Login Menu
		click(By.xpath("//a[text()='LOG IN']"));

		// 3. Click on Customer Login
		click(By.xpath("//a[text()='Customer Login']"));

		// 4. Enter User Id as david@gmail.com
		sendkeys(By.xpath("//input[@name='mailuid']"), "david@gmail.com");

		// 5. Enter Password as 1234
		sendkeys(By.xpath("//input[@name='pwd']"), "1234");

		// 6. Click Login Button
		click(By.name("login-submit"));

		// 7. Verify I am in Home Page
		String s = getElementText(By.xpath("//h2[2]"));

		// 8. Click order product menue
		click(By.linkText("Order Product"));

		// 9. Click product Name
		Thread.sleep(3000);
		click(By.name("prodId"));
		click(By.xpath("//option[text()='Enveloc']"));

		// 10.Enter order Date

		Thread.sleep(3000);

		sendkeys(By.name("ordDate"), "12/12/2024");

		// 11. Click product button
		Thread.sleep(3000);
		click(By.xpath("//button[text()='Order Product']"));

		// 12. Click Order product Confirm Link
		Thread.sleep(2000);
		click(By.xpath("//tbody/tr[last()]/td[last()]/a"));

		// 13. Verify Confirmed
		Thread.sleep(3000);
		String v = getElementText(By.xpath("//tbody/tr[last()]/td[6]"));
		assertEquals("Confirmed", v);

	}

}
