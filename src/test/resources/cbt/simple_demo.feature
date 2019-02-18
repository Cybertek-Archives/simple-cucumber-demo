Feature: The application should be running

  @Smoke
  Scenario: simple search
    Given I am on the home page
    When I search for "wooden spoon"
    Then I should see the results

  @smoke
  Scenario: another search
    Given I am on the home page
    When I search for "useless box"
    Then I should see the results
