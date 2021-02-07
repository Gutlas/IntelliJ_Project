package APIRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import APIReport.ReportHelp;

@CucumberOptions(strict = true, monochrome = true, features = "src/main/resources/FeatureFiles", glue = "APIStepDef", plugin = {

        "pretty", "json:target/cucumber.json", "html:target/cucumber-reports/report.html" })

public class CucumberRunner extends AbstractTestNGCucumberTests {

    @BeforeClass(alwaysRun = true)
    public void beforeClass() throws Exception {

    }

    @AfterClass(alwaysRun = true)
    public void takeScreenshot() throws Exception {

    }

    @AfterSuite(alwaysRun = true)
    public void generateHTMLReports() {
        ReportHelp.generateCucumberReport();
    }

}