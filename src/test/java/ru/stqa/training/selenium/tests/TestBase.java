package ru.stqa.training.selenium.tests;

import org.openqa.selenium.remote.BrowserType;
import org.testng.ITestContext;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import ru.stqa.training.selenium.appmanager.ApplicationManager;

/**
 * Created by dmalivanov on 3/13/18.
 */
public class TestBase {

    protected static final ApplicationManager app
            = new ApplicationManager(System.getProperty("browser" , BrowserType.CHROME));

    @BeforeSuite
    public void setUp(ITestContext context) throws Exception {

        app.init();
        context.setAttribute("app", app);

    }

    @AfterSuite(alwaysRun = true)
    public void tearDown() {
        app.stop();
    }
}
