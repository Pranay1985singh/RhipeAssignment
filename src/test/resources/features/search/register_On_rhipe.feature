Feature: Rhipe program officer Registration

  @testAssignment
  Scenario: Registration of a program officer
    Given Pranay is on the Sign up with Rhipe home page on the internet
    When he fills his "BusinessName_Field" as "Pranay Singh"
    And he fills his "EntityID_Field" as "987654321"
    And he fills his "Address1_Field" as "209/6 Railway Road, Cheltenham 3192"
    And he fills his "City_Field" as "Melbourne"
    And he fills his "Country_Field" as "Nepal"
    And he fills his "State_Field" as "Victoria"
    And he fills his "PostCode_Field" as "3192"
    And he fills his "MainPhone_Field" as "123456789"
    And he fills his "WebSite_Field" as "https://www.rhipe.com/"
    And he selects option for "HearAbout_Field" as "Web Search"
    And he selects option for "IndustryType_Field" as "Web Hosters"
    And he fills his "FirstName_Field" as "Pranay"
    And he fills his "LastName_Field" as "Singh"
    And he fills his "DirectPhone_Field" as "44444444"
    And he fills his "Email_Field" as "singh@xyz.com"
    Then he clicks on "SingUpButton_Field" button for "Submission"

