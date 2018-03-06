@Login
Feature: User Login
Scenario: Successful login
  Given user opened page "https://my-sandbox.maxpay.com/#/signin"
  And enters valid credentials:
  |login |test_user@test.com|
  |password|Qwerty123|
  When Sign In button is clicked
  Then user is logged in

#
 Scenario: Invalid login
  Given user opened page "https://my-sandbox.maxpay.com/#/signin"
  And enters valid login and invalid password:
  |login |testuser@test.com|
   |password          |tester123|
  When Sign In button is clicked
  Then error message is displayed
  And user stays on the same page
