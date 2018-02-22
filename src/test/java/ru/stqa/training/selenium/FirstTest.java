package ru.stqa.training.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by dmalivanov on 1/28/18.
 */
public class FirstTest {

    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void start(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 15);
    }

    @Test
    public void firstTest(){
        driver.get("http://www.google.kz");
        driver.findElement(By.name("q")).sendKeys("webdriver");
        driver.findElement(By.name("btnK")).click();
        driver.findElement(By.id("gs_ok0")).click();
        driver.findElement(By.id("K32")).click();
        driver.findElement(By.id("gs_ok0")).click();
        driver.findElement(By.id("K32")).click();
        //titleIs("webdriver - Поиск в Google");
        //wait.until(titleIs("webdriver - Поиск в Google"));
    }

    @After
    public void stop(){
        driver.quit();
        driver = null;
    }
}
