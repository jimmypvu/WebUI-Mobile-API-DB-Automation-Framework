package main.drivers.managers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public final class FirefoxManager {
    private FirefoxManager(){}

    public static WebDriver getFirefoxDriver(){
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions fo = new FirefoxOptions();
        fo.addArguments("-width=1920");
        fo.addArguments("-height=1080");
//            fo.addArguments("--headless");

        return new FirefoxDriver(fo);
    }
}
