Feature: Circle area calculation
  As a user, I want to calculate the area of a circle
  To get accurate results for different radii


Scenario: Correct calculation with positive radius
  Given the radius is 5
  When the circle area is calculated
  Then the result should be approximately 78.54

@parametrized
Scenario Outline: Parameterized test for different radii
  Given the radius is <radius>
  When the circle area is calculated
  Then the result should be approximately <expected_area>

  Examples:
    | radius | expected_area |
    | 1      | 3.14         |
    | 2      | 12.57        |
    | 3      | 28.27        |
    | 0      | 0            |
