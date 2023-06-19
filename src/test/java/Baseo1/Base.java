package Baseo1;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {


	public static WebDriver driver;// without public it will be defult modifiyer

	

	public static void navigateURL(String url) {
		driver.get(url);
	}

	public static void click(By a) {// without String,int datatype that time we can use (By a)333
		driver.findElement(a).click();
		// public static void click(String a) {//when datatype String then we use this
		// way
		// driver.findElement(By.xpath(xpath)).click();
	}
	
	
	public static void clear(By locator) {
		driver.findElement( locator ).clear();
	}

	public static void sendkeys(By xpath, String value) {// we write send keys this way

		driver.findElement(xpath).sendKeys(value);
	}

	public static String getElementText(By locator) {

		WebElement element = driver.findElement(locator);
		String s = element.getText();
		return s;
	}
	
	
	 

}
