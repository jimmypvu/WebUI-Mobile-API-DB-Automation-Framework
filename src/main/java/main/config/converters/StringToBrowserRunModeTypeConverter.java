package main.config.converters;

import main.enums.BrowserRunModeType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;

public class StringToBrowserRunModeTypeConverter implements Converter<BrowserRunModeType> {

    @Override
    public BrowserRunModeType convert(Method method,String runMode){
        return BrowserRunModeType.valueOf(runMode.toUpperCase());
    }
}
