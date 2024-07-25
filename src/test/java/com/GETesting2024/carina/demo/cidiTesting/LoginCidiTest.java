package com.GETesting2024.carina.demo.cidiTesting;

import cidiTesting.DashBoardPageBase;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginCidiTest extends CidiBaseTest implements IAbstractTest {

    @Test
    public void loginTest() {
        DashBoardPageBase dashboard = initPage(getDriver(), DashBoardPageBase.class);
        Assert.assertTrue(dashboard.isUserNamePresent(),"Login was not performed");
//        Assert.assertTrue(dashBoard.isPageOpened("Estás en el ambiente de TESTING"),"The page was not opened");

    }
}
