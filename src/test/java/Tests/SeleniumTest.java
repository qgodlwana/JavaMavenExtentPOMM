package Tests;

import Pages.HomePage;
import Pages.ProductsPage;
import Pages.SignInPage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.internal.Utils;

import java.io.File;
import java.io.IOException;

public class SeleniumTest {
    public static WebDriver driver = new ChromeDriver();
    static ExtentReports report;
    public static ExtentTest test;
    static ExtentReports extent = new ExtentReports();


    @BeforeSuite
    public static void Setup() throws InterruptedException {
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
        ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
        extent.attachReporter(spark);
        HomePage.verifyShoePortalTitle();
        HomePage.verifyShoePageFooter();
    }
    public static String capture(WebDriver driver) throws IOException{
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File Dest = new File("src/../ExecImage/" + System.currentTimeMillis() + ".png");
        String errflpath = Dest.getAbsolutePath();
        FileUtils.copyFile(scrFile, Dest);
        return errflpath;
    }

    @Test
    void validateTitles_onlineProducts() throws InterruptedException, IOException {
        test = extent.createTest("validate shoe titles on products page", "This test validates that the different shoe types are correct on online products");
        HomePage.click_hamburger_menu();
        HomePage.click_home_menu();
        HomePage.click_hamburger_menu();
        HomePage.click_onlineProducts_link();
        ProductsPage.formalShoes_getTitle();
        ProductsPage.sportsShoes_getTitle();
        ProductsPage.sneakers_getTitle();
    }
    @Test
    void validFirstFormalShoeName() throws InterruptedException, IOException {
        test = extent.createTest("validate the first formal shoes", "This test validates that the name of the first formal shoe is correct on online products");
        HomePage.click_hamburger_menu();
        HomePage.click_onlineProducts_link();
        ProductsPage.formalShoes_dropdown_click();
    }
    @Test
    void validateFirstSportsShoeName() throws InterruptedException, IOException {
        test = extent.createTest("validate the first sports shoes", "This test validates that the name of the first sport shoe is correct on online products");
        HomePage.click_hamburger_menu();
        HomePage.click_home_menu();
        HomePage.click_hamburger_menu();
        HomePage.click_onlineProducts_link();
        ProductsPage.sportsShoes_dropdown_click();
    }
    @Test
    void validateFirstSneakerName() throws InterruptedException, IOException {
        test = extent.createTest("validate the first sneaker shoes", "This test validates that the name of the first sneaker shoe is correct on online products");
        HomePage.click_hamburger_menu();
        HomePage.click_home_menu();
        HomePage.click_hamburger_menu();
        HomePage.click_onlineProducts_link();
        ProductsPage.sneaker_dropdown_click();
    }
    @Test
    void verifySignInFormIsLoaded() throws InterruptedException {
        test = extent.createTest("user click on sign in portal menu", "The test will load the sign in form successfully");
        HomePage.click_hamburger_menu();
        HomePage.click_home_menu();
        HomePage.click_hamburger_menu();
        HomePage.click_signInPortal_menu();
        SignInPage.verifyUsernameLabel();
        SignInPage.verifyPasswordLabel();
    }
    @Test
    void verifySignInSuccessful() throws InterruptedException{
        test = extent.createTest("user sign in using valid credentials", "user must be logged in successfully after entering valid username and valid password");
        HomePage.click_hamburger_menu();
        HomePage.click_home_menu();
        HomePage.click_hamburger_menu();
        HomePage.click_signInPortal_menu();
        SignInPage.verifyUsernameLabel();
        SignInPage.enterValidUsername();
        SignInPage.verifyPasswordLabel();
        SignInPage.enterValidPassword();
        SignInPage.clickLoginButton();
        SignInPage.verifyFormalShoeTypeParagraph();
        SignInPage.verifySportShoeTypeParagraph();
        SignInPage.verifySneakerShoeTypeParagraph();
    }

    @AfterSuite
    void closeBrowser(){
        extent.flush();
        driver.close();
    }
}
