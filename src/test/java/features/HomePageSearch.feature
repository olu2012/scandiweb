Feature: Product Search

  Scenario: User searches for products

    Given a user is on the home search page

    When the user enters a search term "Shirt" in the search bar

    And the user presses the "Enter" key (or clicks the search icon)

    Then the product listing area should display products matching the search term