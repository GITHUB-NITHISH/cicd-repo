Feature: Agent Creation in Zudu AI App

  Scenario: Create a new agent and verify in dashboard
    Given User launches the Zudu AI application
    When User logs in with valid credentials
    And User navigates to Agents module
    And User creates a new agent named "TestAgent01"
    Then Success message should be displayed
    And Agent should be visible in dashboard list
    And User logs out
