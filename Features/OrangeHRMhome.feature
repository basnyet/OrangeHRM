@OrangeHRM
Feature:

@Test1
  Scenario: Logo Present on the OrangeHRM Home Page

    Given User lunch browser
    When User open URL
    Then The page title should be OrangeHRM
    And Close The browser

  @Test2
  Scenario: Add Employee Page
    Given User lunch browser
    When User open URL as "https://opensource-demo.orangehrmlive.com/"
    Then The page title should be OrangeHRM
    And User enter user name as "Admin" and password as "admin123"
    Then user click login button to log in the page
    Then The page title should be "OrangeHRM"
    And User click PIM button to see other options
    Then User click Add Employee options
    Then User type First, middle and last Name
    And User get inner text from Employee ID box
    Then User verify login Details isDisplayed or not
    And User select login Details check box
    Then User verify login Details isSelected or not
    And If displayed User create new user name and password
    Then User click Save button
    And Close The browser

    @Test3
    Scenario Outline: Nationalities
      Given User lunch browser
      When User open URL as "https://opensource-demo.orangehrmlive.com/"
      Then The page title should be OrangeHRM
      And User enter "<user name>"  and "<password>"
      Then user click login button to log in the page
      Then The page title should be "OrangeHRM"
      And User click Admin button
      Then User Click Nationalities
      And User choose different kind of Nationalities and verify
      And Close The browser
      Examples:
      |user name|password|
      |Admin    |admin123|

      @Test4
      Scenario: Upload File
        Given User lunch browser
        When User open URL as "https://opensource-demo.orangehrmlive.com/"
        Then The page title should be OrangeHRM
        And User enter user name as "Admin" and password as "admin123"
        Then user click login button to log in the page
        Then The page title should be "OrangeHRM"
        And User click PIM button to see other options
        Then User go to the configuration
        And User click Data Imoport
        Then User verify the page is Enable or not
        And User choose file
        And User upload the file
        And Close The browser

        @Test5
        Scenario: Use JavascriptExecutor for direct click
          Given User lunch browser
          When User open URL as "https://opensource-demo.orangehrmlive.com/"
          Then The page title should be OrangeHRM
          And User enter user name as "Admin" and password as "admin123"
          Then user click login button to log in the page
          Then The page title should be "OrangeHRM"
          And User click Admin button
          Then User choose to the configuration
          And user click module
          Then User Click Enable time modules Check Box
          And User Click Enable Directory module
          And Close The browser

          @test6
          Scenario: Use Select Method and Other for Select Object
            Given User lunch browser
            When User open URL as "https://opensource-demo.orangehrmlive.com/"
            Then The page title should be OrangeHRM
            And User enter user name as "Admin" and password as "admin123"
            Then user click login button to log in the page
            Then The page title should be "OrangeHRM"
            And User click PIM button to see other options
            Then User click Employee List
            And User Type User Name and ID
            Then User Select Employeement Status
            And User Select Include
            Then User Type SuperVisor Name
            And User Select Job Title
            Then User Select Sub Unit
            And User Click Search button
            And Close The browser














