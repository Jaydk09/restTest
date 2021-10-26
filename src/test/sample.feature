Feature: sample test data
  @login
  Scenario: Get picture of the day
    Given user is logged
    When user click on picture
    Then picture will be shown
    When user inputs firstname as ramesh and lastname as pasupuleti
