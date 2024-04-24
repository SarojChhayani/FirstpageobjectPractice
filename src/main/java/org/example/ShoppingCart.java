package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ShoppingCart extends Utils {
    String expectedproductname = getTextFromElement(By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[1]/h1"));


    public void addtocartproduct() {
        //Click on Shopping cart button
        clickOnElement(By.className("ico-cart"));
        //verify currect product added
        Assert.assertEquals(getTextFromElement(By.className("product-name")), expectedproductname);

    }
}
