package tests;

import Initiation.Initiate;
import browserAction.CommonUtil;
import org.testng.annotations.Test;
import pageObjects.Explore;

/**
 * Created by ankit.ramani on 6/7/2017.
 */
public class ExplorationTest extends Initiate {

    @Test
    public void explorePage(){
        CommonUtil.iwait();
        CommonUtil.iFrame("videoPlayerId");
        Explore.videoPlay();
        System.out.println("Explore");
    }

}
