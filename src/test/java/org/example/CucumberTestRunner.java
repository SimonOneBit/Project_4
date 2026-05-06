package org.example;


import io.cucumber.junit.platform.engine.Cucumber;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

@Suite
@Cucumber
@SelectClasspathResource("org/example/cucumber/features")
public class CucumberTestRunner {
}
