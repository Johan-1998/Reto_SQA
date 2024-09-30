Feature: Add products to the shopping cart

  Scenario: Add two different products with specified quantities to the shopping cart
    Given I am on the product page
    When I add 2 units of the first product to the cart
    And I add 5 units of the second product to the cart
    Then I should see both products in the cart with correct quantities