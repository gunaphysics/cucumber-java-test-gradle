package reporting;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Reports {

    public static void main(String[] args) {
        File reportOutputDirectory = new File("./reports/");
        List<String> jsonFiles = new ArrayList<>();
        jsonFiles.add("./build/cucumber-reports/CucumberTestReport.json");
        String buildNumber = "1";
        String projectName = "cucumberProject";
        boolean runWithJenkins = false;
        boolean parallelTesting = false;
        Configuration configuration = new Configuration(reportOutputDirectory, projectName);
        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
        Reportable result = reportBuilder.generateReports();
    }
}
