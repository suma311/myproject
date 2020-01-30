package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class casestudy1 {
	WebDriver driver;
	@Given("The URL of the test me app {string}")
	public void the_URL_of_the_test_me_app(String url) {
	   System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get(url);
	   driver.manage().window().maximize();
	}

	@When("user clicks on SignUp button")
	public void user_clicks_on_SignUp_button() {
	   driver.findElement(By.xpath("//a[contains(text(),'SignUp')]")).click();
	}

	@When("user enters {string} as username")
	public void user_enters_as_username(String username) {
	   driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(username);
	}

	@When("user enters {string} as firstname")
	public void user_enters_as_firstname(String firstname) {
	   driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(firstname);
	}

	@When("user enters {string} as lastname")
	public void user_enters_as_lastname(String lastname) {
	   driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(lastname);
	   
	}

	@When("user enters {string} as password")
	public void user_enters_as_password(String password) {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
	   
	}

	@When("user enters {string} as confirmpassword")
	public void user_enters_as_confirmpassword(String confirmpassword) {
	    driver.findElement(By.xpath("//input[@id='pass_confirmation']")).sendKeys(confirmpassword);
	}

	@When("user selects {string} as gender")
	public void user_selects_as_gender(String gender) {
	    driver.findElement(By.xpath("//span[contains(text(),'Female')]")).click();
	}

	@When("user enters {string} as email")
	public void user_enters_as_email(String email) {
	   driver.findElement(By.xpath("//input[@id='emailAddress']")).sendKeys(email);
	}

	@When("user enters {string} as mobileno")
	public void user_enters_as_mobileno(String mobileno) {
	    driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys(mobileno);
	}

	@When("user enters {string} as dob")
	public void user_enters_as_dob(String dob) {
	   driver.findElement(By.xpath("//input[@id='dob']")).sendKeys(dob);
	}

	@When("user enters {string} as address")
	public void user_enters_as_address(String address) {
	    driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys(address);
	}

	@When("user selects {string} as securityquestion")
	public void user_selects_as_security_question(String securityquestion) {
	   driver.findElement(By.xpath("//option[contains(text(),'What is your Birth Place?')]")).click();
	}

	@When("user enters {string} as Answer")
	public void user_enters_as_Answer(String Answer) {
	    driver.findElement(By.xpath("//input[@id='answer']")).sendKeys(Answer);
	}

	@When("user clicks on register button")
	public void user_clicks_on_register_button() {
	   driver.findElement(By.xpath("//input[@name='Submit']")).click();
	}

	@Then("user on valid page")
	public void user_on_valid_page() {
	    driver.findElement(By.xpath("//div[contains(text(),'User Registered Succesfully!!! Please login')]"));
	}




}
