package Initiation;

import browserAction.CommonUtil;
import pageObjects.LoginPage;
import org.testng.annotations.BeforeSuite;
/**
 * Created by ankit.ramani on 5/30/2017.
 */
public class Initiate extends CommonUtil {

    @BeforeSuite
    public void startPoint(){
        CommonUtil.launchBrowser();
        CommonUtil.accessUrl("https://demo.actitime.com");
        LoginPage.enterUsername();
        LoginPage.enterPassword();
        LoginPage.clickLogin();

    }

   /* @AfterSuite
    public void endPoint() {

        CommonUtil.closeBrowser();
    }*/


}
