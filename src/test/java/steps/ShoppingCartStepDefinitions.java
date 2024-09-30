package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class ShoppingCartStepDefinitions {

    @Steps
    ShoppingSteps shoppingSteps;

    @Given("I am on the product page")
    public void navigateToProductPage() {
        // Navega a la página del producto
    }

    @When("I add {int} units of the first product to the cart")
    public void addFirstProductToCart(int quantity) {
        shoppingSteps.addProductToCart(quantity);
    }

    @When("I add {int} units of the second product to the cart")
    public void addSecondProductToCart(int quantity) {
        shoppingSteps.addProductToCart(quantity);
    }

    @Then("I should see both products in the cart with correct quantities")
    public void verifyCartContents() {
        // Verifica que los productos están en el carrito
    }
}