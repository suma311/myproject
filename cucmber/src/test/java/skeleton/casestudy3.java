package skeleton;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class casestudy3 {
   WebDriver driver;
	@Given("the testme app url {string}")
	public void the_testme_app_url(String url) {
	   System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get(url);
	}

	@When("user clicks on signIn button")
	public void user_clicks_on_signIn_button() {
		driver.findElement(By.xpath("//a[contains(text(),'SignIn')]")).click();
	}

	@When("user enters {string} as UserName")
	public void user_enters_sri1_as_UserName(String UserName) {
		 driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(UserName);
	}

	@When("user enters {string} as PassWord")
	public void user_enters_nani311_as_PassWord(String PassWord) {
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys(PassWord);
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.xpath("//input[@name='Login']")).click();
	}

	@When("user search for product")
	public void user_search_for_product() {
	    driver.findElement(By.xpath("//input[@id='myInput']")).sendKeys("head");
	}

	@When("user clicks on finddetails")
	public void user_clicks_on_finddetails() {
	  driver.findElement(By.xpath("//form//input[@name='val']")).click();
	}

	@When("user clicks on proceedtopay")
	public void user_clicks_on_proceedtopay() {
	    driver.findElement(By.xpath("//body//form[2]")).click();
	}

	@Then("user doesnot seen the cart icon")
	public void user_doesnot_seen_the_cart_icon() {
	  driver.findElement(By.xpath("//a[contains(text(),'Cart')]")).isDisplayed();
	}



}
