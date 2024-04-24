package org.example;

import org.openqa.selenium.By;

public class Electronics extends Utils {
    public void referaproducttofriend ()
    {
        //Click on Electronics option from top bar
        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']"));

        //Click on Camera & photo option
        clickOnElement(By.xpath("//a[@title='Show products in category Camera & photo'][normalize-space()='Camera & photo']"));

        //Click on Leica T Mirrorless Digital Camera
        clickOnElement(By.xpath("//a[normalize-space()='Leica T Mirrorless Digital Camera']"));

        //Click on email friend
        clickOnElement(By.xpath("//button[normalize-space()='Email a friend']"));

        //Entre the friend email
        typeText(By.xpath("//input[@id='FriendEmail']"), "ddss@gmail.com");

        //Click on SEND EMAIl button
        clickOnElement(By.xpath("//button[normalize-space()='Send email']"));
    }
}
