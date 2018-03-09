package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {

	WebDriver driver;
	
	@Given("^Open chrome and start application$")
	public void Open_chrome_and_start_application() throws Throwable {
	    System.out.println("Given executed");
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://www.gcrit.com/build3/admin/login.php");
	}

	@When("^User enter valid a user name$")
	public void User_enter_valid_a_user_name() throws Throwable {
		System.out.println("When executed.");
		driver.findElement(By.name("username")).sendKeys("admin");
	}

	@When("^User enter a valid password$")
	public void User_enter_a_valid_password() throws Throwable {
		driver.findElement(By.name("password")).sendKeys("admin@123");
		System.out.println("And executed");
		
	}

	@Then("^User should be able to login successfully$")
	public void User_should_be_able_to_login_successfully() throws Throwable {
		driver.findElement(By.id("tdb1")).click();
		System.out.println("Then executed");
	}
	
	@Then("^Application should be closed$")
	public void application_should_be_closed() throws Throwable {
		driver.quit();
		System.out.println("Then executed");
	}
	
}
