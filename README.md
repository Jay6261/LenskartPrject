![image](https://github.com/user-attachments/assets/0814ef23-866b-438c-8028-aef4a60061a2)# Java - Selenium-based Web Automation Framework

## Overview
This project is a Selenium-based web automation framework designed to perform web testing using the following technologies and methodologies:
- **Cucumber BDD Framework** for behavior-driven development
- **Page Object Model (POM)** for clean and maintainable code
- **Screenshot Capture** for test failures
- **Retry Mechanism** for failed test cases
- **HTML Report Generation** for test results
- **Parallel Testing** functionality
- **Cross-Browser** capabilities
- **Logging** feature for debugging

## Features
- **Feature:** Lenskart Product Search and Filters
  - **Scenario:** Search for product by category and brand
    - **Given** I am on the Lenskart homepage
    - **When** I search for "Sunglasses" in the "Men's" category
    - **Then** I should see search results for men's sunglasses
    - **When** I filter by brand "Ray-Ban"
    - **Then** I should see only Ray-Ban men's sunglasses displayed
  - **Scenario:** Search with misspelled keyword
    - **Given** I am on the Lenskart homepage
    - **When** I search for "SunGlases" (misspelled)
    - **Then** I should see suggestions for the correct spelling or a message indicating no results found
  - **Scenario:** Iterate through product colors and add to cart
    - **Given** I am on the product details page for a specific spectacle frame
    - **When** I iterate through all available frame colors
    - **Then** for each color, I should be able to add the frame to the cart (assuming different colors are separate products)
  - **Scenario:** Select random lens material from dropdown
    - **Given** I am on the product details page for a specific spectacle frame
    - **When** I get all available lens material options from the dropdown and store them in an array
    - **Then** I should be able to randomly select a lens material from the array and apply it
  - **Scenario:** Verify recently added items appear in wishlist
    - **Given** I am on the Lenskart homepage
    - **When** I add a few different spectacle frames to the wishlist
    - **Then** I navigate to the wishlist page
    - **And** the displayed items should be a subset of the recently added frames (assuming a collection is used)

## Setup

### Prerequisites
- Java JDK 8 or higher
- Maven
- ChromeDriver (or any other WebDriver of your choice)
- Selenium cucumber step defination file runner file
- Page Object Modal
- Use locators findelement xpath index sendskey click and so on.

  =========================================================================================================================

1.)working on first scenerios

 **Feature:** Lenskart Product Search and Filters
  - **Scenario:** Search for product by category and brand
    - **Given** I am on the Lenskart homepage
    - **When** I search for "Sunglasses" in the "Men's" category
    - **Then** I should see search results for men's sunglasses
    - **When** I filter by brand "Ray-Ban"
    - **Then** I should see only Ray-Ban men's sunglasses displayed
   
    Steps:=>
    1.) First open any browser chrome or firefox
    2.) Enter url:- Lenskart
    3.) go to search box
    4.) Enter data that is : Men's SunGlasses
    5.) see the suggestion Men Sunglasses
    6.) Check name of brand Ray Ban
    7.) Rayban brand is not here

    Screenshot of brand that are not present here

### Installing Dependencies![Screenshot (222)](https://github.com/user-attachments/assets/f7dcf625-aea2-4840-998e-48cdb976eb59)

==========================================================================================================================================================================

2.) Working on second scenerios

  **Scenario:** Search with misspelled keyword
    - **Given** I am on the Lenskart homepage
    - **When** I search for "SunGlases" (misspelled)
    - **Then** I should see suggestions for the correct spelling or a message indicating no results found


Steps 2:=>
   1.) First open any browser chrome or firefox
    2.) Enter url:- Lenskart
    3.) go to search box
    4.) Enter data that is : "sunglases"
    5.) result is not found
    6.) display one message that is " oops no result found

    Screenshot:=>
![Screenshot (223)](https://github.com/user-attachments/assets/d0b619c1-38f6-4ad7-afd4-96c6566d62f9)

===========================================================================================================================================

3) working on third scenerios
   
 **Scenario:** Iterate through product colors and add to cart
    - **Given** I am on the product details page for a specific spectacle frame
    - **When** I iterate through all available frame colors
    - **Then** for each color, I should be able to add the frame to the cart (assuming different colors are separate products)

    Steps=>
    1.) First open any browser chrome or firefox
    2.) Enter url:- Lenskart
    3.) go to search box
    4.)search any one product
    5) click on the product
    6) iterate all the colors through the loops
    7) click on by on diiferent types of colors
    
 ![Screenshot (224)](https://github.com/user-attachments/assets/7f4a5b0e-a999-43de-95cc-c8499c70058e)

==================================================================================================================================================    


               1. Folder File structure=>

src/main/java
    |__ pageObjects
    |__ utilities
src/test/java
    |__ stepDefinitions __folder  __file
    |__ runners __ folder __ file
    
src/tes/resource
    |__ lenskart :- package
    |__ feature

    ----------------------------------------------------------------------------------------------------------------------------------------------------

            2.  Add Dependencies=>

<dependencies>
	  <!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-testng -->
<dependency>
    <groupId>io.cucumber</groupId>
    <artifactId>cucumber-testng</artifactId>
    <version>6.9.1</version>
</dependency>
<!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-java -->
<dependency>
    <groupId>io.cucumber</groupId>
    <artifactId>cucumber-java</artifactId>
    <version>6.9.1</version>
</dependency>
<!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>3.141.59</version>
</dependency>

<dependency>
    <groupId>io.github.bonigarcia</groupId>
    <artifactId>webdrivermanager</artifactId>
    <version>5.5.3</version>
</dependency>

<!-- ExtentReports for HTML report generation -->
        <dependency>
            <groupId>com.aventstack</groupId>
            <artifactId>extentreports</artifactId>
            <version>5.0.9</version>
        </dependency>
        <!-- Apache Commons IO for screenshot capture -->
        <dependency>
            <groupId>commons-io</groupId>
            <artifactId>commons-io</artifactId>
            <version>2.11.0</version>
        </dependency>
        </dependencies>
   ====================================================================================================================================================

3.Page Object Modal file=>

package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
    WebDriver driver;

    public Home(WebDriver d) {
        this.driver = d;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@type='text']")
     private WebElement searchbox;
    
    @FindBy(xpath = "//*[text()='Oops No result found']")
    private WebElement NoResultFound;
   
    //(//img[@alt='Lenskart Hustlr Monza Red Full Rim Wayfarer left side'])[1]
    
    @FindBy(xpath="(//div[@class='ProductContainer--1dcah6v VStwK'])[1]")
    private WebElement Product;
    
    @FindBy(xpath="//div[@id='product-swatch']//a")
    private WebElement coloricons;
    
    public void Entersearchtext(String b) {
        this.searchbox.sendKeys(b);
    }

    public void EnterNoResultFound()
    {
    	String ele = this.NoResultFound.getText();
    	System.out.println("Message is : " + ele);
    }
    
    public void ClickOnProduct()
    {
    	this.Product.click();
    }
    
    public void ClickOnColorIcon()
    {
    	for(int i=0;i<3;i++)
    	{
    		
    		this.coloricons.click();
    	}
    	
    }
    
}
====================================================================================================================================

4.)=>runner file :=>

package runner_;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"G://spring-tool//sts-4.21.0.RELEASE//LenskartAutomation//src//test//resources//LenskartFunctionality//Lenskart.feature"},
		glue = {"Stepdef"}
		)
public class lenskartfunctionality1 extends AbstractTestNGCucumberTests {

}


-----------------------------------------------------------------------------------------------------------------------------------------------
5.)step defination file=>

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
--------------------------------------------------------------------------------------------------------------------------------------------------

Clone the repository and navigate to the project directory:
```sh
git clone https://github.com/yourusername/yourrepository.git
cd yourrepository
