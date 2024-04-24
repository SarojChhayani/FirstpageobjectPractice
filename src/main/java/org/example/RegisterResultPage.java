package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterResultPage extends Utils {
    static String expectedMsg = "Your registration completed";
public void userRegisteredSuccessfully(){
    //Verify correct registration message displayed
    Assert.assertEquals(getTextFromElement(By.className("result")),"Your registration completed");
    //Click on Continue button
    clickOnElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[2]/a"));
}
}

