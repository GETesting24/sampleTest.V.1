package cidiTesting.functionalities;

import cidiTesting.PortalPublicoPage;
import cidiTesting.DashBoardPageBase;
import com.qaprosoft.carina.core.foundation.IAbstractTest;

public interface ILogin extends IAbstractTest {

    default DashBoardPageBase login() {
        PortalPublicoPage portal = new PortalPublicoPage(getDriver());
        portal.openPortalPage();
        portal.clickIngresarButton();
        portal.loginCidiTest();
        return initPage(getDriver(), DashBoardPageBase.class);
    }
}
