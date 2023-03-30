import config.ConfigFactory;
import org.testng.annotations.Test;

public class DemoTests {

    // local, remote(selenium grid, selenoid, browserstack, lambdatest, saucelabs, etc) : chrome, firefox

    @Test
    public void loginTest(){
        System.out.println(ConfigFactory.getConfig().browser());

//        WebDriverManager.chromedriver().setup();
//        ChromeOptions co = new ChromeOptions();
//        co.addArguments("--remote-allow-origins=*");
//        co.addArguments("--headless=new");
//        WebDriver driver = new ChromeDriver(co);
//
//        driver.get("https://www.google.com/");
//        driver.quit();
    }
}
