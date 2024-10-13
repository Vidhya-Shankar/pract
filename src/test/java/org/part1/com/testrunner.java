package org.part1.com;

import io.cucumber.core.cli.Main;

public class testrunner {
    public static void main(String[] args) {
        String[] cucumberOptions = {
        		"--plugin", "pretty",
                "--plugin", "html:target/cucumber-reports.html",
                "--plugin", "json:target/cucumber.json",
            "--glue", "org.part1.com", // Adjust to your step definitions package
            "src/test/resources/test.feature"
        };
        
        Main.main(cucumberOptions);
    }
}

