package ru.stqa.training.selenium.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by dmalivanov on 3/13/18.
 */
public class NavigationHelper extends BaseHelper{

    public NavigationHelper(WebDriver wd) {
        super(wd);
    }

    public void goToJurPage(){
        if (isElementPresent(By.cssSelector("#menu-wrap > div.login > a"))){
            return;
        }
        click(By.linkText("Юридическим лицам"));
    }

    public void goToLoginPage(){
        if (isElementPresent(By.id("reg_form"))){
            return;
        }
        click(By.linkText("Войти"));
    }
}
