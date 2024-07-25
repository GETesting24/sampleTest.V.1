package com.GETesting2024.carina.demo.cidiTesting;

import cidiTesting.DashBoard;
import cidiTesting.DashBoardBase;
import cidiTesting.functionalities.ILogin;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.zebrunner.agent.core.annotation.TestLabel;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import com.zebrunner.carina.utils.R;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;

public class CidiBaseTest implements IAbstractTest, ILogin {

    @BeforeSuite
    @MethodOwner(owner = "barreraGerman")
    @TestLabel(name = "loginCidiTest", value = {"web", "functionalTesting"})
    public void loginCidiTest() {
        DashBoardBase dashBoard;
        dashBoard = login(R.CONFIG.TESTDATA.get("cidi_username"), R.CONFIG.TESTDATA.get("cidi_password"));
        Assert.assertTrue(dashBoard.isUserNamePresent(), "Home page is not opened");
    }

}
