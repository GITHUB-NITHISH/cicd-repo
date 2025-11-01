Feature: Location & Address

  Background:
			Given User open Application
  Scenario: Check the use case button
    Given   user Navigate To Location & Address Tool
    Then 		user Verify Address Text
    And 		user Click Use Case Button
    And 		user Click Submit My Use Case Button
    And 		user Verify Use Case Page

