package cidiTesting;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class DashBoardBase extends AbstractPage {

    public DashBoardBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isUserNamePresent();

    public abstract boolean isPageOpened(String message);
}
