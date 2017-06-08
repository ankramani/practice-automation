package pageObjects;

import browserAction.CommonUtil;
import org.openqa.selenium.By;

/**
 * Created by ankit.ramani on 6/7/2017.
 */
public class ExplorePage {

//    static By playerframe = By.id("videoPlayerId");
    static By vplayer = By.id("player");
    static By expbut = By.xpath("//span[text() = 'Start exploring actiTIME']");

    /*public static void switchFrame(){
        CommonUtil.iFrame(playerframe);
    }*/
    public static void videoPlay(){
        CommonUtil.click(vplayer);
    }
    public static void exploreButton(){
        CommonUtil.click(expbut);
    }
}
