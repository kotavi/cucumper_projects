package com.project.amazonWithJunit;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
		monochrome = true,
		features = "src/com/project",
		plugin = {"pretty", "html:target/cucumber-html-report"},
		tags = "@Sanity"
)

public class amazonTestRunner {
	

}