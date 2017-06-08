package tests;

import Initiation.Initiate;
import browserAction.CommonUtil;
import org.testng.annotations.Test;
import pageObjects.ExplorePage;

/**
 * Created by ankit.ramani on 6/7/2017.
 */
public class ExplorationTest extends Initiate {

    @Test
    public void startExplore(){
        CommonUtil.iwait();
        CommonUtil.iFrame("videoPlayerId");
        ExplorePage.videoPlay();
        ExplorePage.exploreButton();
    }

}
