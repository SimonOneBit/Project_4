package org.example.cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.CircleCalculator;
import org.junit.jupiter.api.Assertions;

public class CircleSteps {
    private double radius;
    private double result;

    @Given("the radius is {int}")
    public void заданРадиус(int radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Радиус не может быть отрицательным: " + radius);
        }
        this.radius = radius;
    }

    @When("the circle area is calculated")
    public void выполняетсяРасчётПлощадиКруга() {
        result = CircleCalculator.calculateArea(radius);
    }

    @Then("the result should be approximately {double}")
    public void результатДолженБытьПриблизительно(double expected) {
        Assertions.assertEquals(expected, result, 0.05);
    }
}
