package main.drivers;

import org.openqa.selenium.WebDriver;

public class Driver {

    public static void initDriver(){
        WebDriver driver = LocalDriverFactory.getDriver();

    }

    public static void quitDriver(){

    }
}
