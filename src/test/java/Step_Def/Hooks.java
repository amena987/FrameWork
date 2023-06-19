package Step_Def;


import org.openqa.selenium.chrome.ChromeDriver;

import Baseo1.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends Base{
	@Before
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Before run");
	}
	 @After public void tearDown() { 
		  driver.quit();
	  System.out.println("After run"); 
	 }

}
//https://nxtgenaiacademy.com/alertandpopup