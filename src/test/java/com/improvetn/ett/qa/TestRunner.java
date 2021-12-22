package com.improvetn.ett.qa;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/specs/features" },
		// glue = {""},
		plugin = { "pretty", "html:target/cucumber-html-report", "json:target/cucumber.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/Experteam.html" }, tags = {
						("@nos-cursus") },

		snippets = SnippetType.CAMELCASE, monochrome = true)

public class TestRunner {

	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File("src/test/ressource/configs/extent-config.xml"));
	}

}
