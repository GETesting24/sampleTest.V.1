package cidiTesting;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class GestionDeEstudiantesCidiPageBase extends AbstractPage {

   public GestionDeEstudiantesCidiPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isAlertRolePresent();

}
