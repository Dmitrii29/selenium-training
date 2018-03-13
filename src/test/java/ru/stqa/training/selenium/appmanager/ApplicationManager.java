package ru.stqa.training.selenium.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/**
 * Created by dmalivanov on 3/13/18.
 */
public class ApplicationManager {

    public Properties properties;
    private String browser;
    WebDriver wd;
    private SessionHelper sessionHelper;
    private UsersHelper usersHelper;
    private NavigationHelper navigationHelper;

    public ApplicationManager(String browser){
        this.browser = browser;
        properties = new Properties();
    }

    public void init() throws IOException {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        wd = new ChromeDriver(chromeOptions);
        //driver.manage().window().maximize();
        wd.get(properties.getProperty("web.baseUrl"));

        sessionHelper = new SessionHelper(wd);
        usersHelper = new UsersHelper(wd);
        navigationHelper = new NavigationHelper(wd);
    }

    public void stop() {
        wd.quit();
    }

    public NavigationHelper goTo(){
        return navigationHelper;
    }

    public UsersHelper usersHelper(){
        return usersHelper;
    }

    public SessionHelper sessionHelper(){
        return sessionHelper;
    }
}
