Feature: Verify scenario of website


  Scenario: Verify user can place an order
    Given user open website
    Then verify login page is displayed
    When user enters login credentials
    Then verify user is on home page
    When user adds 4 distinct items to cart
    Then verify total cart quantity
    When user clicks on cart icon
    Then verify cart page is displayed
    When user clicks checkout button
    Then verify address page is displayed
    When user enters his details
    Then user clicks continue button
    Then verify finish page is displayed
    When user clicks finish button
    Then verify success message

