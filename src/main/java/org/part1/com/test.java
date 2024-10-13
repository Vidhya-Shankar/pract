package org.part1.com;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class test{
    private WebDriver driver;

    @Given("I launch the Chrome browser")
    public void launchChrome() {
        WebDriverManager.chromedriver().setup(); // Automatically sets up ChromeDriver
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
    }


    @Then("I see results")
    public void seeResults() {
        driver.quit(); // Close the browser
    }
}

