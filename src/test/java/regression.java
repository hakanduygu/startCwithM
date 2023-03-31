
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;






@CucumberOptions(
        plugin = {
                "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ExtentReportRegression.html"
        },
        features = "src\\test\\resources\\senaryo.feature",
        glue = "stepDefinitions",
        dryRun = false,
        tags = "@regression"
)
public class regression extends AbstractTestNGCucumberTests {}
