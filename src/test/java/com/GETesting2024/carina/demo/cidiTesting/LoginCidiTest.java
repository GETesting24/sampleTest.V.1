package com.GETesting2024.carina.demo.cidiTesting;

import cidiTesting.DashBoardBase;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import org.testng.annotations.Test;

public class LoginCidiTest extends CidiBaseTest implements IAbstractTest {

    @Test
    public void loginCidiTest() {
      DashBoardBase dashBoard = initPage(getDriver(), DashBoardBase.class);

//        Assert.assertTrue(dashBoard.isPageOpened("Estás en el ambiente de TESTING"),"The page was not opened");

    }
}
