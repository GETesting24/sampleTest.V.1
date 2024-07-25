package cidiTesting;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = CidiHomePageBase.class)
public class CidiPortal extends CidiHomePageBase{


    @FindBy(css = "[class='mat-button-wrapper']")
    private ExtendedWebElement ingresarButton;

    public CidiPortal(WebDriver driver) {
        super(driver);
    }

    @Override
    public void openPortalPage() {
        open();
    }


    @Override
    public void clickIngresarButton() {
        ingresarButton.click();
    }

    @Override
    public DashBoard loginCidiTest(String user, String pas) {
        return null;
    }


}
