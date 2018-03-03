package com.test.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertTrue;

public class StepDefs {
    int x,y;
    int sum;
    @Given("^Numbers (0|[1-9][0-9]*) and (0|[1-9][0-9]*)$")
    public void getNumbers(int a, int b){
        this.x = a;
        this.y=b;
        System.out.println("given");
    }
    @When("we add the numbers")
    public void add(){
        this.sum = this.x + this.y;
    }
    @Then("we will get the result as (0|[1-9][0-9]*)")
    public void verifyResult(int result){
        assertTrue(result == this.sum);
    }

}
