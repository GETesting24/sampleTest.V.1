package cidiTesting;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class CidiHomePageBase extends AbstractPage {
    public CidiHomePageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void openPortalPage();

    public abstract void clickIngresarButton();

    public abstract DashBoard loginCidiTest(String user, String pas);

}
