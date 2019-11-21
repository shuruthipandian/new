package casestudy2.casesstudy;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class case3class {
	WebDriver driver;

@Given("^User in login page$")
public void user_in_login_page() throws Throwable {
	driver= newutility.testRegistration("Chrome");
	driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
}

	@When("^user enter login credentials$")
	public void user_enter_login_credentials() throws Throwable {
		driver.findElement(By.linkText("SignIn")).click();
		Assert.assertEquals("Login",driver.getTitle());
	
	}

	@When("^user is redirected tp homepage$")
	public void user_is_redirected_tp_homepage() throws Throwable {
		driver.findElement(By.name("userName")).sendKeys("Lalitha");
		driver.findElement(By.name("password")).sendKeys("Password123");
		driver.findElement(By.name("Login")).click();
		Assert.assertEquals("Home",driver.getTitle());
	}

	@When("^type first four letters of the product$")
	public void type_first_four_letters_of_the_product() throws Throwable {
	  WebElement s= driver.findElement(By.name("products"));
	  Actions act=new Actions(driver);
	  act.sendKeys(s,"h").pause(1000).sendKeys(s,"e").pause(1000).sendKeys(s,"a").pause(1000).sendKeys(s,"d").pause(1000).build().perform();
	}

	@When("^select product from drop down$")
	public void select_product_from_drop_down() throws Throwable {
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"myInputautocomplete-list\"]/div"))).click().build().perform();
	}

	@When("^click on search products$")
	public void click_on_search_products() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();

	}
	@Then("^product details provided to user$")
	public void product_details_provided_to_user() throws Throwable {
		Assert.assertEquals("Search", driver.getTitle());
	  
	}



}
