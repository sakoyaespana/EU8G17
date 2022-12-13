package com.cydeo.centrilli.step_definitions;

import com.cydeo.centrilli.utilities.Driver;
import io.cucumber.java.en.Given;

public class ABC {
    @Given("go to amazon")
    public void goToAmazon() {

        Driver.getDriver().get("http://www.amazon.com");
    }
}
