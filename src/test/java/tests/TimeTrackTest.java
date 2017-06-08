package tests;

import org.testng.annotations.Test;
import pageObjects.TimeTrackPage;

/**
 * Created by ankit.ramani on 6/8/2017.
 */
public class TimeTrackTest {

    @Test
    public static void timeTrack(){
        TimeTrackPage.clickNewbutton();
    }
}
