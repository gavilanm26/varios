package com.banistmo.certificacion.stepdefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import net.thucydides.core.steps.StepEventBus;


import static com.banistmo.certificacion.ManualTest.validate;

public class StepDefinitions {

    private Scenario scenario;

    @Before
    public void getScenario(Scenario scenario) {
        this.scenario = scenario;
    }

    @Given("^(.*)$")
    public void stepValidator(String step){
        validate(step, scenario.getName());
    }
}
