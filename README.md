# IntelliJ_Project

Once the project is imported to IntelliJ from GitHub, test related files/folders are in  below two paths 
path /src/main/java and /src/main/resources.

Folder src/main/java  has 
APIReport  has ReportHelp file,  has the code to generate the report
APIRunner - has the Cucumber Runner file to execute the tests
APIStepDef - has StepDefFile which contains test related code.
ReusableFiles – has Utilites file

Folder /src/main/resources has 
FeatureFiles – has scenarios written in using cucumber BDD development.
Config - has the test configration files
JSON  - 

Once file is imported to Intellij and after compile access folder src\main\java\APIRunner\CucumberRunner to execute the test.

Test Execution Status report can be accessed in the \target\cucumber-html-reports\folder and RightClick the below, and Select the option to open report in browser.
IntelliJ_Project/target/cucumber-html-reports/report-feature_955431658.html


Identify/document all the test cases you would execute for the above APIs to demonstrate coverage

In General for evey API Request, below test Actions are required
1.Verify correct HTTP/HTTP statusCode
2.Verify response Payload
3.Verify response headers
4.Verify correct application state
5.Verify basic performance sanity.
 
Scenarios Brand New Deck
Validate StatusCode for API Call with Valid URI
Validate the StatusCode for API Call with InValid URI
Validate remaining count is 52.
Validate the structure is  as per API Service Contract


Draw a Card:
Validate Response when remaining card count=0 and user still tries to draw a Card.
Validate Response when user user enters count=0 to draw the card
Validate Response when incorrect <deck_id> is passed.
Validate Response when <deck_id> to draw has not been used for two weeks.
Validate the structure is  as per API Service Contract
