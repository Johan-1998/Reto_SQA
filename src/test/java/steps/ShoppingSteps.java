package steps;

import net.thucydides.core.annotations.Step;
import pages.ProductPage;

public class ShoppingSteps {

    ProductPage productPage;

    @Step("Add {0} units of a product to the cart")
    public void addProductToCart(int quantity) {
        productPage.addProductToCart(quantity);
    }
}