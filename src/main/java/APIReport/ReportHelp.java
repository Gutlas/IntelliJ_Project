package APIReport;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import net.masterthought.cucumber.*;

public class ReportHelp {

    public static void generateCucumberReport() {
        File reportOutputDirectory = new File("target");
        ArrayList<String> jsonFiles = new ArrayList<String>();
        jsonFiles.add("target/cucumber.json");
        String projectName = "Deck of Cards API";
        Configuration configuration = new Configuration(reportOutputDirectory, projectName);
        configuration.addClassifications("Platform", System.getProperty("os.name"));
        List<String> classificationFiles = new ArrayList<String>();
        classificationFiles.add("src/main/resources/Config/config.properties");
        configuration.addClassificationFiles(classificationFiles);
        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
        reportBuilder.generateReports();
    }

}
