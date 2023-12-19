package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class Hooks {
    public static WebDriver driver=null;
    @Before
    public void openBrowser(){
        String ChromePath=System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",ChromePath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20000));
        driver.get("https://demo.nopcommerce.com/");
    }
    @After
    public static void quitDriver() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

}
