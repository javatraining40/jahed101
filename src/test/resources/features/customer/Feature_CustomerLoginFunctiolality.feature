

Feature: Verify Customer Login functionlity 


  #@Sanity @Regression
  Scenario Outline: Verfiy Customer Login functioality happy path
    Given  I am landing page https://it.microtechlimited.com/
    When I click on Login menu
    And  I click on Customer Login
    Then Enter user Id as "<userId>"
    And I Enter Passeord as "<password>"
    And I click on Login Button
    Then I Verify that I am in CUSTOMER Home page
    
    Examples: 
      | userId          | password | 
      | david@gmail.com | 1234     | 

