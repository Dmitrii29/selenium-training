package ru.stqa.training.selenium.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by dmalivanov on 1/28/18.
 */

public class FirstTest extends TestBase{
    @Before
    public void init(){
        init();
    }


   @Test
    public void loginTest(){
       app.goTo().goToJurPage();
       app.goTo().goToLoginPage();
       app.sessionHelper().login("admin", "123123");
   }

   /* private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void start(){
        //DesiredCapabilities caps = new DesiredCapabilities();
        //caps.setCapability("unexpectedAlertBehavior", "dismiss");
        //driver = new ChromeDriver(caps);

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        driver = new ChromeDriver(chromeOptions);
        //driver.manage().window().maximize();

        //запрос настроек браузера с которыми он стартует
        //System.out.println(((HasCapabilities) driver).getCapabilities());
        wait = new WebDriverWait(driver, 15);
    }

    @Test
    public void firstTest(){
        driver.get("https://preprod.mykhat.kz");
        driver.findElement(By.xpath("/*//*[@id=\"menu-wrap\"]/div[2]/a")).click();
        driver.findElement(By.xpath("/*//*[@id=\"menu-wrap\"]/div[2]/a")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/form/div[1]/input")).sendKeys("admin");
        driver.findElement(By.xpath("/*//*[@id=\"reg_form\"]/div[3]/button")).click();
        //el.sendKeys("webdriver");
        //driver.findElement(By.name("btnK")).click();
        //titleIs("webdriver - Поиск в Google");
        //wait.until(titleIs("webdriver - Поиск в Google"));
    }

    @After
    public void stop(){
        driver.quit();
        driver = null;
    }*/
}
