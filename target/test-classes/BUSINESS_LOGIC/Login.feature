Feature: Login functionality

Background: User succesfully clicked on initial login page
When user provide "webdriver.chrome.driver" and exe location as "G:\\Automation Support\\chromedriver.exe"
When user provide url as "https://www.flipkart.com/"
When user cancel initial login page


@SmokeTest
Scenario: Login functionality with valid username and valid password
When navigate on Login
When user click on My Profile
When user enter "9890746249" as username
When user enter "sharadnya8881" as password
When user click on Login button
Then application shows user profile to user

