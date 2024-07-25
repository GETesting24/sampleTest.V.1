package com.GETesting2024.carina.demo.cidiTesting;

import cidiTesting.functionalities.ILogin;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.zebrunner.agent.core.annotation.TestLabel;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.testng.annotations.BeforeSuite;

public class CidiBaseTest implements IAbstractTest, ILogin {

    @BeforeSuite
    @MethodOwner(owner = "barreraGerman")
    @TestLabel(name = "loginCidiTest", value = {"web", "functionalTesting"})
    public void loginCidiTest() {
        login();

    }

}
