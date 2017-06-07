package pageObjects;

import browserAction.CommonUtil;
import org.openqa.selenium.By;

/**
 * Created by ankit.ramani on 6/7/2017.
 */
public class Explore {

//    static By playerframe = By.id("videoPlayerId");
    static  By vplayer = By.id("player");

    /*public static void switchFrame(){
        CommonUtil.iFrame(playerframe);
    }*/
    public static void videoPlay(){
        CommonUtil.click(vplayer);
    }
}
