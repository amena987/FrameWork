package Step_Def;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import Baseo1.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Ebay_Search_Box_Functionality extends Base{
	@Given("I am in landing page")
	public void i_am_in_landing_page() {
		navigateURL("https://www.ebay.com");
	}

	@When("I Click on Search Box")
	public void i_click_on_search_box() {
		click(By.id("gh-ac"));
	}

	@Then("Enter product Camera")
	public void enter_product_camera() {
		sendkeys(By.id("gh-ac"), "Camera");
	}

	@Then("I Click Search Button")
	public void i_click_search_button() {
		click(By.id("gh-btn"));
	}

	@Then("Verify I am in my Home Page")
	public void verify_i_am_in_my_home_page() {
		String s = getElementText(By.xpath("//h2[text()='Category']"));
		assertEquals("Category", s);
	}

}
