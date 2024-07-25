package cidiTesting;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class PortalPublicoPageBase extends AbstractPage {
    public PortalPublicoPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void openPortalPage();

    public abstract void clickIngresarButton();

    public abstract DashBoardPageBase loginCidiTest();


}
