package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    public static WebDriver driver;
    @Before
    public static void setDriver()
    {
        driver = new ChromeDriver();
    }

    @After
    public static void tearDown()
    {
        driver.quit();
    }

}
