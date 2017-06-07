package browserAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by ankit.ramani on 5/29/2017.
 */
public class CommonUtil {

    static WebDriver driver;

    public static void launchBrowser(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/lib/chromedriver.exe");
        driver = new ChromeDriver();
    }

    public static void click(By by){
        driver.findElement(by).click();
    }

    public static void enterText(By by, String s){
        driver.findElement(by).sendKeys(s);
    }
    public static void iwait(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    public static void accessUrl(String url){
        driver.get(url);
    }
    public static void closeBrowser(){
        driver.close();
    }
    public static void iFrame(String s){
        driver.switchTo().frame(s);
    }
}
