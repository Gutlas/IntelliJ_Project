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
