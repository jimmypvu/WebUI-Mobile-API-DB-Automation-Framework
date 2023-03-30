package main.config;

import main.config.converters.StringToBrowserTypeConverter;
import main.enums.BrowserRemoteModeType;
import main.enums.BrowserType;
import main.enums.BrowserRunModeType;
import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/test/resources/qa-config.properties"})

public interface FrameworkConfig extends Config {
    @DefaultValue("CHROME")
    @ConverterClass(StringToBrowserTypeConverter.class)
    BrowserType browser();

    @Key("browserRunMode")
    BrowserRunModeType browserRunMode();

    @Key("browserRemoteMode")
    BrowserRemoteModeType browserRemoteMode();
}
