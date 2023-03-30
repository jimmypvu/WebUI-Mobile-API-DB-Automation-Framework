package tests;

import main.config.ConfigFactory;
import org.testng.annotations.Test;

public class DemoTests {

    // run tests on local machine
    // run tests on remote(selenium grid, selenoid, browserstack, lambdatest, saucelabs, etc) : chrome, firefox, edge

    @Test
    public void loginTest(){
        System.out.println(ConfigFactory.getConfig().browser());

    }
}
