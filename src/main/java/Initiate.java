import org.testng.annotations.BeforeSuite;

/**
 * Created by ankit.ramani on 5/30/2017.
 */
public class Initiate extends CommonUtil{

    @BeforeSuite
    public void startPoint(){
        CommonUtil.launchBrowser();
        CommonUtil.accessUrl("https://www.google.com");
    }




}
