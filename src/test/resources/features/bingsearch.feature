@smoke
Feature: Bing Search

  Scenario Outline: Search
    Given I search in bing with a random data
    Examples:
      | testId |
      | 1 |
      | 2 |
      | 3 |
      | 4 |

  Scenario: Login
    Given I search in bing with a random data


  Scenario: Logout
    Given I search in bing with a random data
