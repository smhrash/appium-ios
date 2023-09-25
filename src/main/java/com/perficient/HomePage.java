package com.perficient;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends IOSAction{
    public HomePage(IOSDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @iOSXCUITFindBy(accessibility = "Alert Views")
    private WebElement alertViews;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label='Text Entry'`]")
    private WebElement textEntity;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeChain")
    private WebElement textField;

    @iOSXCUITFindBy(accessibility = "OK")
    private WebElement okButton;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND value == 'Confirm / Cancel'")
    private WebElement confirmationButton;

    @iOSXCUITFindBy(iOSNsPredicate = "value BEGINSWITH[c] 'A message'")
    private WebElement friendlyMessage;

    @iOSXCUITFindBy(iOSNsPredicate = "Confirm")
    private WebElement confirm;

    public void selectAlertViews() {
        alertViews.click();
    }

    public void fillTextLevel() {
        textEntity.click();
        textField.sendKeys("Perficient");
        okButton.click();
    }

    public String textMessage() {
        confirmationButton.click();
        return friendlyMessage.getText();
    }

    public void doConfirm() {
        confirm.click();
    }
}
