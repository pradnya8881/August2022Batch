Feature: Manage address Functionality

Background: user succesfully clicked on login page
When user provide "webdriver.chrome.driver" and exe location as "G:\\Automation Support\\chromedriver.exe"
When user provide url as "https://www.flipkart.com/"
When user cancel initial login page
When navigate on Login
When user click on My Profile
When user enter "9890746249" as username
When user enter "sharadnya8881" as password
When user click on Login button



Scenario: User succesfully clicked on manage address
When user click on Manage address
When user click on Add address
When user enter "Pradnya" as name
When user enter "9890746249" as Phone number
When user enter "411062" as pin Code
When user enter "DehuAlandi road,behind River residency.Chikhali" as locality
When user enter "D 503 Kolosus Green City" as Building number 
When user enter "Pimpri" as City
When user click on Home
When user click on save button
When user click on radio button
When user click on Confirm
Then application shows confirmed new address