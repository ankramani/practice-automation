package pageObjects;

import browserAction.CommonUtil;
import org.openqa.selenium.By;

/**
 * Created by ankit.ramani on 6/8/2017.
 */
public class TimeTrackPage {

    static By clicknew = By.xpath("//span[text() = 'New']");

    public static void clickNewbutton(){
        CommonUtil.click(clicknew);
    }
}
