package pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ProductPage extends PageObject {

    private By addToCartButton = By.id("add-to-cart");
    private By productQuantityInput = By.id("quantity");

    public void addProductToCart(int quantity) {
        $(productQuantityInput).clear();
        $(productQuantityInput).sendKeys(String.valueOf(quantity));
        $(addToCartButton).click();
    }
}