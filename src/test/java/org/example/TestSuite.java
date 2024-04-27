package org.example;


import org.checkerframework.checker.units.qual.C;
import org.testng.annotations.Test;

public class TestSuite extends BaseTest {
    HomePage homePage = new HomePage();
    RegisterPage registerPage= new RegisterPage();
    RegisterResultPage registerResultPage= new RegisterResultPage();
    LoginPage loginPage = new LoginPage();
    Electronics electronics = new Electronics();
    CameraAndPhoto cameraAndPhoto = new CameraAndPhoto();
    LeicaTMirrorlessDigitalCamera leicaTMirrorlessDigitalCamera=new LeicaTMirrorlessDigitalCamera();
    ProductEmailAFriend productEmailAFriend =new ProductEmailAFriend();
    BuildYourownComputer buildYourownComputer = new BuildYourownComputer();
    ShoppingCart shoppingCart = new ShoppingCart();

    @Test
    public void verifyusershouldbeabletoregistersuccessfully() {
        //click on Register button
        homePage.clickonregisterbutton();
        //Enter Registration Details
        registerPage.registrationDetails();
        //Verify user Register successfully
        registerResultPage.userRegisteredSuccessfully();
    }

    @Test
    public void verifyregisteredusershouldbeabletologin(){
        //click on Register button
        homePage.clickonregisterbutton();
        //Enter Registeration Details
        registerPage.registrationDetails();
        //Verify user Register successfully
        registerResultPage.userRegisteredSuccessfully();
        //click on login button
        homePage.clickonLoginPage();
        //Enter login Details
        loginPage.loginDetails();

    }
    @Test
    public void verifyregisteredusershouldbeablereferaproducttofriendbyemail(){
        //click on Register button
        homePage.clickonregisterbutton();
        //Enter Registeration Details
        registerPage.registrationDetails();
        //Verify user Register successfully
        registerResultPage.userRegisteredSuccessfully();
        //click on login button
        homePage.clickonLoginPage();
        //Enter login Details
        loginPage.loginDetails();
        //Click On Camera & Photo
        electronics.clickOnCameraandPhoto();
        //Click On Product
        cameraAndPhoto.ClickOnProduct();
        //Click On Email A Friend
        leicaTMirrorlessDigitalCamera.clickOnEmailAFriend();
        //Refer A Product To friend By Email
        productEmailAFriend.productReferAFriend();
    }
    @Test
    public void veryfyuesrshouldbeabletoaddtocartprodut(){
        //click on Register button
        homePage.clickonregisterbutton();
        //Enter Registeration Details
        registerPage.registrationDetails();
        //Verify user Register successfully
        registerResultPage.userRegisteredSuccessfully();
        //click on login button
        homePage.clickonLoginPage();
        //Enter login Details
        loginPage.loginDetails();
        //Select a product
        homePage.clickOnFeaturedproducts();
        //build your own computer
        buildYourownComputer.custmiseyourcomputer();
        //verify currect product added
        shoppingCart.addtocartproduct();

    }
}

