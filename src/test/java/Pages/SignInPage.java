package Pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import static Tests.SeleniumTest.driver;

public class SignInPage {
    public static String usernameTxtField_xpath = "//*[@id=\"usr\"]";
    public static String usernameTxtLabel_xpath = "//*[@id=\"second_form\"]/div[1]/b/h4/label";
    public static String passwordTxtField_xpath = "//*[@id=\"pwd\"]";
    public static String passwordTxtLabel_xpath = "//*[@id=\"second_form\"]/div[2]/h4/label";
    public static String loginBtn_xpath = "//*[@id=\"second_form\"]/input";
    public static String newUserBtn_xpath = "//*[@id=\"NewRegistration\"]";
    public static void verifyUsernameLabel() throws InterruptedException {
        Thread.sleep(1000);
        String expectedUsernameLabel = "Username:";
        String actualUsernameLabel = driver.findElement(By.xpath(usernameTxtLabel_xpath)).getText();
        Assert.assertEquals(expectedUsernameLabel, actualUsernameLabel);
    }
    public static void verifyPasswordLabel() throws InterruptedException{
        Thread.sleep(1000);
        String expectedPasswordLabel = "Password:";
        String actualPasswordLabel = driver.findElement(By.xpath(passwordTxtLabel_xpath)).getText();
        Assert.assertEquals(expectedPasswordLabel, actualPasswordLabel);
    }

    public static void enterValidUsername(){
        driver.findElement(By.xpath(usernameTxtField_xpath)).sendKeys("sa");
    }
    public static void enterValidPassword(){
        driver.findElement(By.xpath(passwordTxtField_xpath)).sendKeys("sa");
    }
    public static void clickLoginButton(){
        driver.findElement(By.xpath(loginBtn_xpath)).click();
    }
    public static void clickRegisterNewUserButton(){
        driver.findElement(By.xpath(newUserBtn_xpath)).click();
    }
}
