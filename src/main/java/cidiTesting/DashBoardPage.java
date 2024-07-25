package cidiTesting;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP,parentClass = DashBoardPageBase.class)
public class DashBoardPage extends DashBoardPageBase {

    @FindBy(css = ".mat-tooltip-trigger .user-nombre")
    private ExtendedWebElement username;

    @FindBy(css = "[class='body-1']")
    private ExtendedWebElement testingEnvironmentMessage;

    public DashBoardPage(WebDriver driver) {
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
