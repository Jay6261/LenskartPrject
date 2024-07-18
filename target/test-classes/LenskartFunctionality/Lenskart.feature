
@tag
Feature: Lenskart Product Search and Filters

  @tag1
  Scenario: Search for product by category and brand
     	Given I am on the Lenskart homepage
		  When I search for Sunglasses in the Mens category
		  Then I should see search results for mens sunglasses
		  When I filter by brand Ray-Ban
		  Then I should see only Ray-Ban mens sunglasses displayed


	@Teg2
	Scenario: Search with misspelled keyword 
			Given I am on the Lenskart homepage
			When I search for SunGlases (misspelled)
			Then I should see suggestions for the correct spelling or a message indicating no results found
	
	@Tag3
	Scenario: Iterate through product colors and add to cart 
			Given I am on the product details page for a specifc spectacle frame
			When I iterate through all available frame colors
			Then for each color, I should be able to add the frame to the cart assuming different colors are separate products
	

