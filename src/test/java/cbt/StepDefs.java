package cbt;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.fail;

public class StepDefs {
	WebDriver driver;

	@Given("^I am on the home page$")
	public void i_am_on_the_home_page() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://etsy.com");

	}

	@When("^I search for \"([^\"]*)\"$")
	public void i_search_for(String search) throws Throwable {
		driver.findElement(By.id("search-query")).sendKeys(search + Keys.ENTER);
	}

	@Then("^I should be see the results$")
	public void i_should_be_see_the_results() throws Throwable {
		Assert.assertTrue(driver.getCurrentUrl().contains("search"));
		driver.quit();
	}
	
	@Then("^I should be see the list$")
	public void i_should_be_see_the_resultss() throws Throwable {
		Assert.assertTrue(driver.getCurrentUrl().contains("search"));
		driver.quit();
		fail();
	}

}
