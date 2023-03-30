package main.drivers;

import main.drivers.managers.ChromeManager;
import main.drivers.managers.EdgeManager;
import main.drivers.managers.FirefoxManager;
import main.enums.BrowserType;
import org.openqa.selenium.WebDriver;

import static main.config.ConfigFactory.getConfig;

public final class LocalDriverFactory {

    private LocalDriverFactory(){}

    public static WebDriver getDriver(){
        WebDriver driver = null;

        if(getConfig().browser() == BrowserType.FIREFOX){
            driver = FirefoxManager.getFirefoxDriver();
        }else if(getConfig().browser() == BrowserType.EDGE){
            driver = EdgeManager.getEdgeDriver();
        }else{
            driver = ChromeManager.getChromeDriver();
        }

        return driver;
    }

}
