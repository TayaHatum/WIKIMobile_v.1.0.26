package com.telran.fw;


import com.telran.model.User;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserHelper extends HelperBase {
    public UserHelper(AppiumDriver driver) {
        super(driver);
    }


    public void skipWizard() {
        driver.findElement(By.xpath("//*[@resource-id ='org.wikipedia:id/fragment_onboarding_skip_button']")).click();
    }

    public void goToLoginForm() {

        driver.findElement(By.xpath("//*[@resource-id='org.wikipedia:id/main_drawer_login_button']")).click();
        driver.findElement(By.xpath("//*[@resource-id='org.wikipedia:id/create_account_login_button']")).click();

    }

    public void fillLoginForm(User user) {
        //org.wikipedia:id/login_username_text
        type(By.xpath("//*[@resource-id='org.wikipedia:id/login_username_text']/android.widget.FrameLayout/android.widget.EditText"),user.getfName());
        type(By.xpath("//*[@resource-id='org.wikipedia:id/login_password_input']/android.widget.FrameLayout/android.widget.EditText"),user.getPassword());

    }

    public void clickLoginButton() {
        driver.hideKeyboard();
        driver.findElement(By.id("org.wikipedia:id/login_button")).click();
    }

    public void logout() {

        driver.findElement(By.xpath("//*[@resource-id='org.wikipedia:id/main_drawer_login_button']")).click();
        driver.findElement(By.xpath("//*[@resource-id='android:id/button2']")).click();

        //driver.findElement(By.xpath("//*[@resource-id='android:id/button1']")).click();

    }
    public void clickOnMenuButton(){
        driver.findElement(By.xpath("//*[@resource-id='org.wikipedia:id/menu_icon']")).click();
    }

    public String takeUserName() {
        System.out.println(driver.findElement(By.xpath("//*[@resource-id='org.wikipedia:id/main_drawer_account_name']")).getText());
        return driver.findElement(By.xpath("//*[@resource-id='org.wikipedia:id/main_drawer_account_name']")).getText();

    }
}
