package main.config.converters;

import main.enums.BrowserType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class StringToBrowserTypeConverter implements Converter<BrowserType> {
    @Override
    public BrowserType convert(Method method, String browserName){
        Map<String, BrowserType> stringBrowserTypeMap = new HashMap<>();
        stringBrowserTypeMap.put("CHROME", BrowserType.CHROME);
        stringBrowserTypeMap.put("FIREFOX", BrowserType.FIREFOX);
        stringBrowserTypeMap.put("EDGE", BrowserType.EDGE);

        return stringBrowserTypeMap.getOrDefault(browserName.toUpperCase(), BrowserType.CHROME);
    }
}
