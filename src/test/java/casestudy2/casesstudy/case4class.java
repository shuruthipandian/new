package casestudy2.casesstudy;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class case4class {
	WebDriver driver;
	@Given("^User in Login page$")
	public void user_in_Login_page() throws Throwable {
		driver=newutility.testRegistration("Chrome");
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.findElement(By.linkText("SignIn")).click();
		Assert.assertEquals("Login",driver.getTitle());
	
	}

	@When("^user enters the credentials$")
	public void user_enters_the_credentials() throws Throwable {
		driver.findElement(By.name("userName")).sendKeys("Lalitha");
		driver.findElement(By.name("password")).sendKeys("Password123");
		driver.findElement(By.name("Login")).click();
		
	   
	}

	@When("^user is redirected to homepage$")
	public void user_is_redirected_to_homepage() throws Throwable {
		Assert.assertEquals("Home",driver.getTitle());
	}

	@When("^user enters the product as \"([^\"]*)\"$")
	public void user_enters_the_product_as(String arg1) throws Throwable {
		driver.findElement(By.name("products")).sendKeys(arg1);
	
	}

	@When("^Click on search products$")
	public void click_on_search_products() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	  
	}

	@Then("^no items in cart displayed$")
	public void no_items_in_cart_displayed() throws Throwable {
		Assert.assertEquals("Search",driver.getTitle());
	
	}



}
