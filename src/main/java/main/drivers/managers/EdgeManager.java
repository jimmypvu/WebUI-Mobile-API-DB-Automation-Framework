package main.drivers.managers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public final class EdgeManager {
    private EdgeManager(){}

    public static WebDriver getEdgeDriver(){
        WebDriverManager.edgedriver().setup();
        EdgeOptions eo = new EdgeOptions();
        eo.addArguments("--window-size=1920,1080");
//            eo.addArguments("--headless=new");

        return new EdgeDriver(eo);
    }
}
