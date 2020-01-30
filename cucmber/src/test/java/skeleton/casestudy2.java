package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class casestudy2 {
	WebDriver driver;
	@Given("the URL of the testme app {string}")
	public void the_URL_of_the_testme_app(String url) {
	   System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get(url);
	   driver.manage().window().maximize();
	}

	@When("user clicks on SignIn button")
	public void user_clicks_on_SignIn_button() {
	   driver.findElement(By.xpath("//a[contains(text(),'SignIn')]")).click();
	}

	@When("user enters {string} as Username")
	public void user_enters_as_Username(String username) {
	    driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(username);
	}

	@When("user enters {string} as Password")
	public void user_enters_as_Password(String password) {
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
	}

	@Then("user clicks on Login button")
	public void user_clicks_on_Login_button() {
	  driver.findElement(By.xpath("//input[@name='Login']")).click();
	}


}
