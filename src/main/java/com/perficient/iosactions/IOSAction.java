package com.perficient.iosactions;

import io.appium.java_client.ios.IOSDriver;

public class IOSAction {

    protected IOSDriver driver;

    public IOSAction(IOSDriver driver) {
        this.driver = driver;
    }
}
