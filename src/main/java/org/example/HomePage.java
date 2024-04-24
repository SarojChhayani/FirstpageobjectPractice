package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils{
public void clickonregisterbutton(){
    clickOnElement(By.className("ico-register"));
}
public void clickonLoginPage(){
    clickOnElement(By.className("ico-login"));
}
public void clickOnFeaturedproducts(){
    clickOnElement(By.linkText("Build your own computer"));
}

}
