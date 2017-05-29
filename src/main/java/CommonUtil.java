import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by ankit.ramani on 5/29/2017.
 */
public class CommonUtil {

    static WebDriver driver;

    public void launchBrowser(){
        System.setProperty("webdriver.gecko.driver", "src/main/resources/lib/geckodriver.exe");
        driver = new FirefoxDriver();
    }

    public void click(By by){
        driver.findElement(by).click();
    }

    public void enterText(By by, String s){
        driver.findElement(by).sendKeys(s);
    }

    public void accessUrl(String url){
        driver.get(url);
    }
}
