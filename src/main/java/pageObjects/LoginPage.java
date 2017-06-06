package pageObjects;

import browserAction.CommonUtil;
import org.openqa.selenium.By;

/**
 * Created by ankit.ramani on 6/6/2017.
 */
public class LoginPage extends CommonUtil {

    static By username = By.id("username");
    static By password = By.name("pwd");
    static By login = By.id("loginButton");
    public static void enterUsername(){
        CommonUtil.enterText(username, "user");
    }

    public static void enterPassword(){
        CommonUtil.enterText(password, "user");
    }
    public static void clickLogin(){
        CommonUtil.click(login);
    }
}
