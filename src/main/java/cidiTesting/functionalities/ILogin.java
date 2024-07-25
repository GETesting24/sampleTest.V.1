package cidiTesting.functionalities;

import cidiTesting.CidiPortal;
import cidiTesting.DashBoard;
import cidiTesting.DashBoardBase;
import com.qaprosoft.carina.core.foundation.IAbstractTest;

public interface ILogin extends IAbstractTest {

    default DashBoardBase login(String user, String pass) {
        CidiPortal portal = new CidiPortal(getDriver());
        portal.openPortalPage();
        portal.clickIngresarButton();
        portal.loginCidiTest(user, pass);
        return initPage(getDriver(), DashBoardBase.class);
    }
}
