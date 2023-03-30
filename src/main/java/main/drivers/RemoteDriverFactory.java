package main.drivers;

import main.config.ConfigFactory;
import main.enums.BrowserRemoteModeType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class RemoteDriverFactory {
    private RemoteDriverFactory(){}

    public static WebDriver getRWD(){
        BrowserRemoteModeType browserRemoteModeType = ConfigFactory.getConfig().browserRemoteMode();

        if(browserRemoteModeType == BrowserRemoteModeType.SELENIUM_GRID){

        }else if(browserRemoteModeType == BrowserRemoteModeType.SELENOID){

        }else{

        }

        return null;
    }
}
