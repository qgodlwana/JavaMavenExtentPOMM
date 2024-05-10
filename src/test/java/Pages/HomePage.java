package Pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import static Tests.SeleniumTest.driver;

public class HomePage {
    public static String hamBurger_menu_xpath = "//*[@id=\"menuToggle\"]/input";
    public static String home_menu_xpath = "//*[@id=\"menu\"]/a/li";
    public static String onlineProduct_link_xpath = "//*[@id=\"menu\"]/a[3]/li";
    public static String SignInPortal_xpath = "//*[@id=\"menu\"]/a[2]/li";
    public static String shoePortalTitle_xpath = "//*[@id=\"ShoePortalTitle\"]";
    public static String shoePageFooter_xpath = "//*[@id=\"CopyrightFooter\"]";
    public static void verifyShoePortalTitle() throws InterruptedException {
        Thread.sleep(2000);
        String expectedShoePortalTitle ="Ace Online Shoe Portal";
        String actualShoePortalTitle = driver.findElement(By.xpath(shoePortalTitle_xpath)).getText();
        Assert.assertEquals(expectedShoePortalTitle, actualShoePortalTitle);
    }
    public static void verifyShoePageFooter() throws InterruptedException {
        Thread.sleep(2000);
        String expectedShoePageFooter = "Ace Automation © All Rights Reserved 2024";
        String actualShoePageFooter = driver.findElement(By.xpath(shoePageFooter_xpath)).getText();
        Assert.assertEquals(expectedShoePageFooter,actualShoePageFooter);
    }
    public static void click_signInPortal_menu()  throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.xpath(SignInPortal_xpath)).click();
    }
    public static void click_hamburger_menu() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(hamBurger_menu_xpath)).click();
    }
    public static void click_home_menu() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.xpath(home_menu_xpath)).click();
    }
    public static void click_onlineProducts_link() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(onlineProduct_link_xpath)).click();
    }
}
