package cidiTesting;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP,parentClass = GestionDeEstudiantesCidiPageBase.class)
public class GestionDeEstudiantesCidiPage extends GestionDeEstudiantesCidiPageBase {

    @FindBy(css = ".alert")
    private ExtendedWebElement alert;

    public GestionDeEstudiantesCidiPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isAlertRolePresent() {
        return alert.isElementPresent();
    }
}
