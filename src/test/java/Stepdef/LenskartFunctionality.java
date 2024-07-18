package Stepdef;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import Pages.Home;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LenskartFunctionality {
	 WebDriver driver;
	    Home homePage = new Home(driver);

	    @Given("I am on the Lenskart homepage")
	    public void i_am_on_the_lenskart_homepage() throws InterruptedException {
	    	WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
	        driver.get("https://www.lenskart.com/");
	        driver.manage().window().maximize();
	        homePage = new Home(driver);
	        Thread.sleep(2000);
	    }

	    @When("I search for Sunglasses in the Mens category")
	    public void i_search_for_in_the_category() {
	    
	    	homePage.Entersearchtext("Mens Sunglasses" + Keys.ENTER);
	       
	    }

	    @Then("I should see search results for mens sunglasses")
	    public void i_should_see_search_results_for_mens_sunglasses() {
	        // Write code here that turns the phrase above into concrete actions
	       System.out.println("search result");
	    }

	    @When("I filter by brand Ray-Ban")
	    public void i_filter_by_brand_ray_ban() {
	        // Write code here that turns the phrase above into concrete actions
	       System.out.println("I Filter By ray ban");
	    }

	    @Then("I should see only Ray-Ban mens sunglasses displayed")
	    public void i_should_see_only_ray_ban_mens_sunglasses_displayed() {
	        // Write code here that turns the phrase above into concrete actions
	       System.out.println("Ray Ban Glasses displayed");
	    }
	    
	    @When("I search for SunGlases \\(misspelled)")
	    public void i_search_for_sun_glases_misspelled() {
	        // Write code here that turns the phrase above into concrete actions
	    	homePage.Entersearchtext("SUNGLASES" + Keys.ENTER);
	       
	    }

	    @Then("I should see suggestions for the correct spelling or a message indicating no results found")
	    public void i_should_see_suggestions_for_the_correct_spelling_or_a_message_indicating_no_results_found() {
	        // Write code here that turns the phrase above into concrete actions
	       homePage.EnterNoResultFound();
	    }
	    
	    // third scenerio
	    @Given("I am on the product details page for a specifc spectacle frame")
	    public void i_am_on_the_product_details_page_for_a_specifc_spectacle_frame() throws InterruptedException {
	        // Write code here that turns the phrase above into concrete actions
	    	WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
	        driver.get("https://www.lenskart.com/");
	        driver.manage().window().maximize();
	        homePage = new Home(driver);
	        Thread.sleep(2000);
	    	homePage.Entersearchtext("EYEGLASSES" + Keys.ENTER);
	    	 homePage.ClickOnProduct();
	    
	    }

	    @When("I iterate through all available frame colors")
	    public void i_iterate_through_all_available_frame_colors() throws InterruptedException {
	        // Write code here that turns the phrase above into concrete actions
	    	System.out.println("new item");
	    	homePage.ClickOnColorIcon();
	    	
	    }

	    @Then("for each color, I should be able to add the frame to the cart assuming different colors are separate products")
	    public void for_each_color_i_should_be_able_to_add_the_frame_to_the_cart_assuming_different_colors_are_separate_products() {
	        // Write code here that turns the phrase above into concrete actions
	       System.out.println("ele");
	    }


}
