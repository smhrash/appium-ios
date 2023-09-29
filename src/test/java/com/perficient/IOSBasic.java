package com.perficient;

import com.perficient.utils.IOSBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IOSBasic extends IOSBaseTest {

    @Test
    public void iOSBasicTest() {

        homePage.selectAlertViews();
        homePage.fillTextLevel();
        String textMessage = homePage.textMessage();
        Assert.assertTrue(textMessage.startsWith("A message"));
    }
}
