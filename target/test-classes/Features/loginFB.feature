Feature: Verifying Adactine home page details

  Scenario: User should book the details in Adaction hotel page with valid credential
    Given User is on the facebook page 
    When User should enter the "<userName>", "<passWord>" 
    And click the login button
    
    