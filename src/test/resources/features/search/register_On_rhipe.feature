Feature: Rhipe program officer Registration

  @testAssignment
  Scenario: Registration of a program officer
    Given Pranay is on the Sign up with Rhipe home page on the internet
    When he fills his "CustomerName" as "Pranay Singh"
    And he fills his "RegistrationNumber" as "987654321"
    And he fills his "Street1" as "6 Railway Road, Cheltenham"
    And he fills his "City" as "Melbourne"
    And he fills his "State" as "Victoria"
    And he fills his "Country" as "Australia"
    And he fills his "Postcode" as "3192"
    And he fills his "MainPhone" as "123456789"
    And he fills his "WebUrl" as "https://www.rhipe.com/"
    And he selects option for "Source" as "Web Search"
    And he selects option for "IndustryType" as "Web Hosters"
    And he fills his "PrimaryContactFirstName" as "Pranay"
    And he fills his "PrimaryContactLastName" as "Singh"
    And he fills his "PrimaryContactPhone" as "44444444"
    And he fills his "PrimaryContactEmail" as "singh@xyz.com"
    Then he clicks on "submitbutton" button for "Submission"

