#Feature: Checking multiple features in single feature file


Feature: Add to cart
#  @scenario2
#  Scenario Outline: Add another quantity to cart
#    Given I am on the product page
#    When I add a "<product_name>" to the cart
#    Then I see the "<product_name>" in the cart
#    Then I see 1 product in cart
#    And I see 2 products in cart
#    Examples:
#      | product_name |
#      | Yellow Shoes |
#  Rule: Add from Store
  @scenario1
  Scenario Outline: Add to cart
    Given I am on the store page
    When I add a "<product_name>" to the cart
    Then I see the "<product_name>" in the cart
    Then I see 1 product in cart
        #And I see 2 products in cart
    Examples:
      | product_name    |
      | Blue Shoes      |
      | Anchor Bracelet |
      | Blue Tshirt     |


