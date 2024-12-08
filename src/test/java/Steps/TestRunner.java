package Steps;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\Features",glue= {"Steps"},
monochrome=true,
plugin = {"pretty","json:target/JsonReports/jsonreport.json",
		"html:target/HtmlReports/htmlreport.html",
		"junit:target/JunitReports/junitreport.xml"})
public class TestRunner {


}
