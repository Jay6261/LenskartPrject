# Java - Selenium-based Web Automation Framework

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

### Installing Dependencies
Clone the repository and navigate to the project directory:
```sh
git clone https://github.com/yourusername/yourrepository.git
cd yourrepository
