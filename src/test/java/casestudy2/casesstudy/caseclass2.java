package casestudy2.casesstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class caseclass2 {
	WebDriver driver;
	@Given("^user in login page$")
	public void user_in_login_page() throws Throwable {
		driver =newutility.testRegistration("Chrome");
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.findElement(By.linkText("SignIn")).click();
		Assert.assertEquals("Login",driver.getTitle());
	
	}
	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String arg1, String arg2) throws Throwable {
		driver.findElement(By.name("userName")).sendKeys(arg1);
		driver.findElement(By.name("password")).sendKeys(arg2);
		
	}
	

@When("^clicks on login$")
public void clicks_on_login() throws Throwable {
	driver.findElement(By.name("Login")).click();
}

	@Then("^user successfully access the homepage$")
	public void user_successfully_access_the_homepage() throws Throwable {
		Assert.assertEquals("Home",driver.getTitle());

	}



}
