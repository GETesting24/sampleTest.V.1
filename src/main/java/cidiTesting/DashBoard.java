package cidiTesting;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP,parentClass = DashBoardBase.class)
public class DashBoard extends DashBoardBase {

    @FindBy(css = ".mat-tooltip-trigger .user-nombre")
    private ExtendedWebElement username;

    @FindBy(css = "[class='body-1']")
    private ExtendedWebElement testingEnvironmentMessage;

    public DashBoard(WebDriver driver) {
        super(driver);
    }
    @Override
    public boolean isUserNamePresent() {
        return username.isElementPresent();
    }

    @Override
    public boolean isPageOpened(String message) {
        return testingEnvironmentMessage.isElementWithTextPresent(message);
    }
}
