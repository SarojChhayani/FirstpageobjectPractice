package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BrowserManager extends Utils{
    //anything relate to browser to go here
    public void openBrowser(){
        //open browser
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //open URL
        driver.get("https://demo.nopcommerce.com/");
    }
    public void closeBrowser(){
        driver.quit();
    }
}
