package com.trycloud.tests;

import com.trycloud.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Test extends TestBase{


    String userNameInput =  "//input[@aria-label='Username or email']";
    String passwordInput = "//input[@name='password']";
    String loginButton = "//input[@value='Log in']";



//    @org.testng.annotations.Test
//    public void test(){
//        driver.findElement(By.xpath(userNameInput)).sendKeys(ConfigurationReader.getProperty("username"));
//        driver.findElement(By.xpath(passwordInput)).sendKeys(ConfigurationReader.getProperty("password")+ Keys.ENTER);
//
//    }




}
