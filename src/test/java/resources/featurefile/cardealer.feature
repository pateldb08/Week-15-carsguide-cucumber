Feature: Car Dealer search functionality
  As a user I want to check Car dealers are searchable.

  @sanity @regression
  Scenario: Search the dealer name
    Given I am on homepage
    When I mouse hover on “buy+sell” tab
    And I click ‘Find a Dealer’ link
    Then I see the dealer lists
      | 77 Motors             |
      | A&S Autos Pty Ltd     |
      | AUDI CENTRE MELBOURNE |