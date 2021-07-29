Feature: :book hotel
Scenario Outline:
Given user launch the application
When Enter the "<UserName>" In UserName field
And user enter the "<password>" in password field
Then user click the login button and it navigates to search hotel page
Examples:
      |username||password|
      |AjayDeno||ST455U|

Scenario: search the hotel in adactin Application
When user select the location in Adactin Application
And user select the Hotels in Adactin Application
And user select the roomType in Adactin Application
And  user select number of rooms in Adactin Application
And user check in date in Adactin Application
And user check out date in Adactin Application
And adults per room in Adactin Application
And children per room in Adactin Application
Then user click the search button and it navigates to select hotel

Scenario: select hotel page  in Adactin Application
When  user select hotel sunshine in Adactin Application
Then user click the continue button it navigates to book a hotel in Adactin Application

Scenario: select hotel page in Adactin Application
When user enter the firstName in firstname field
And user enter the LastName in lastname field
And  user enter the billingAddress in Adactin Application
And  user  enter the  credit card number in credit card Number Field
And user select  the creditCard type
And user select the Expiry Month
And user select the Expiry Year
And  user enter the cvv number in cvv number field
Then user click the BookNow and it navigates to booking confirm in in Adactin Application

Scenario: My itinerary page in adactinApplicatioin
Then user click the My iterinery Button in adactin Application

