package cidiTesting;

import com.zebrunner.carina.utils.R;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = PortalPublicoPageBase.class)
public class PortalPublicoPage extends PortalPublicoPageBase {


    @FindBy(css = "[class='mat-button-wrapper']")
    private ExtendedWebElement ingresarButton;

    @FindBy(css = "#cuil")
    private ExtendedWebElement cuil;

    @FindBy(css = "#password")
    private ExtendedWebElement pass;

    @FindBy(css = ".btn--primario ")
    private ExtendedWebElement submitBtn;


    public PortalPublicoPage(WebDriver driver) {
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
    public DashBoardPageBase loginCidiTest() {
        cuil.type(R.CONFIG.TESTDATA.get("cidi_username"));
        pass.type(R.CONFIG.TESTDATA.get("cidi_password"));
        submitBtn.click();
        return initPage(getDriver(), DashBoardPageBase.class);
    }

}
