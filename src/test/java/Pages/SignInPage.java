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
    public static String formalShoeTypePara_xpath = "//*[@id=\"SmokeTests\"]/p";
    public static String sportsShoeTypePara_xpath = "//*[@id=\"RegressionTests\"]/p";
    public static String sneakerShoeTypePara_xpath = "//*[@id=\"VanguardTests\"]/p";

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
    public static void verifyFormalShoeTypeParagraph() throws  InterruptedException{
        Thread.sleep(1000);
        String expectedFormalShoeType = "Suitable for office wear, board meetings, black tie events, cocktail parties, and even daily wear";
        String actualFormalShoeType = driver.findElement(By.xpath(formalShoeTypePara_xpath)).getText();
        Assert.assertEquals(expectedFormalShoeType, actualFormalShoeType);
    }
    public static void verifySportShoeTypeParagraph() throws InterruptedException{
        Thread.sleep(1000);
        String expectedSportShoeType = "Suitable for running/training, court sports, field sports, winter sports, outdoor sports, track and field";
        String actualSportShoeType = driver.findElement(By.xpath(sportsShoeTypePara_xpath)).getText();
        Assert.assertEquals(expectedSportShoeType, actualSportShoeType);
    }
    public static void verifySneakerShoeTypeParagraph() throws InterruptedException{
        Thread.sleep(1000);
        String expectedSneakerShoeType = "Elevated styles suitable for running, dancing, and jumping.";
        String actualSneakerShoeType = driver.findElement(By.xpath(sneakerShoeTypePara_xpath)).getText();
        Assert.assertEquals(expectedSneakerShoeType, actualSneakerShoeType);
    }
}
