Feature: Rhipe program officer Registration

  @testAssignment
  Scenario: Registration of a program officer
    Given Pranay is on the Sign up with Rhipe home page on the internet
    When he fills his "BusinessName_Field" as "Nepal"
    And he fills "EntityID_Field" as "123456789"
    And he fills "Address1_Field" as "209/6 Railway Road, Cheltenham 3192"
    And he fills "City_Field" as "Melbourne"
    And he fills "Country_Field" as "Nepal"
    And he fills "State_Field" as "Victoria"
    And he fills "PostCode_Field" as "3192"
    And he fills "MainPhone_Field" as "123456789"
    And he fills "WebSite_Field" as "https://www.rhipe.com/"
    And he selects option for "HearAbout_Field" as "Web Search"
    And he selects option for "IndustryType_Field" as "Web Hosters"
    And he fills "FirstName_Field" as "Pranay"
    And he fills "LastName_Field" as "Singh"
    And he fills "DirectPhone_Field" as "123456789"
    And he fills "Email_Field" as "Pranay85singh@outook.com"
    Then he clicks on "SingUpButton_Field" button for "Submission"

