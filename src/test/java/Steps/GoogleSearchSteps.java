package Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {

	WebDriver driver = null;
	
	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("browser is open");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	//Master

	@And("user is on google webpage")
	public void user_is_on_google_webpage() {
		System.out.println("user is on google webpage");
		driver.get("http://google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() {
		System.out.println("user enters a text in search box");
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("facebook");
	}

	@And("hits enter")
	public void hits_enter() {
		System.out.println("hits enter");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		System.out.println("user is navigated to search results");
		driver.getPageSource().contains("Facebook");
		driver.quit();
	}

}
