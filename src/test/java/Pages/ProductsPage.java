package Pages;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.io.IOException;

import static Tests.SeleniumTest.driver;
import static Tests.SeleniumTest.*;

public class ProductsPage{
    public static String formalShoes_xpath = "/html/body/div[2]/center/h2";
    public static String sportsShoes_xpath = "/html/body/div[3]/center/h2";
    public static  String sneakers_xpath = "/html/body/div[4]/center/h2";
    public static String  formalShoesDropDown_xpath ="/html/body/div[2]/center/div/i[1]";
    public static String sportsShoesDropDown_xpath = "/html/body/div[3]/center/div/i[1]";
    public static String sneakerDropDown_xpath = "/html/body/div[4]/center/div/i[1]";
    public static String formalShoes_firstShoeName_xpath = "/html/body/div[2]/table/tbody/tr[1]/td[1]";
    public static String sportsShoes_firstShoeName_xpath = "/html/body/div[3]/table/tbody/tr[1]/td[1]";
    public static String sneaker_firstShoeName_xpath = "/html/body/div[4]/table/tbody/tr[1]/td[1]";

    public static void formalShoes_getTitle() throws InterruptedException, IOException {
        Thread.sleep(2000);
        String expectedTitleFS = "Formal Shoes";
        String actualTitleFS = driver.findElement(By.xpath(formalShoes_xpath)).getText();
        Assert.assertEquals(expectedTitleFS, actualTitleFS);
        if(expectedTitleFS.equals(actualTitleFS)){
            test.log(Status.PASS, "Test passed for title verification of formal shoes");
            test.log(Status.PASS, test.addScreenCaptureFromPath(capture(driver))+"Test Passed");
        }
        else{
            test.log(Status.FAIL,"Test failed for title verification of formal shoes");
        }
    }
    public static void sportsShoes_getTitle() throws InterruptedException, IOException {
        Thread.sleep(2000);
        String expectedTitleSS = "Sports Shoes";
        String actualTitleSS = driver.findElement(By.xpath(sportsShoes_xpath)).getText();
        Assert.assertEquals(expectedTitleSS, actualTitleSS);
        if(expectedTitleSS.equals(actualTitleSS)){
            test.log(Status.PASS, "Test passed for title verification of Sports shoes");
            test.log(Status.PASS, test.addScreenCaptureFromPath(capture(driver))+"Test Passed");
        }
        else{
            test.log(Status.FAIL,"Test failed");
        }
    }
    public static void sneakers_getTitle() throws InterruptedException, IOException {
        Thread.sleep(2000);
        String expectedTitleS = "Sneakers";
        String actualTitleS = driver.findElement(By.xpath(sneakers_xpath)).getText();
        Assert.assertEquals(expectedTitleS, actualTitleS);
        if(expectedTitleS.equals(actualTitleS)){
            test.log(Status.PASS, "Test passed for title verification of Sneakers");
            test.log(Status.PASS, test.addScreenCaptureFromPath(capture(driver))+"Test Passed");
        }
        else{
            test.log(Status.FAIL,"Test failed");
        }
    }
    public static void formalShoes_dropdown_click() throws InterruptedException, IOException {
        Thread.sleep(2000);
        String expectedFirstFormalShoes = "   Classic Cheltenham";
        driver.findElement(By.xpath(formalShoesDropDown_xpath)).click();
        Thread.sleep(3000);
        String actualFirstFormalShoes = driver.findElement(By.xpath(formalShoes_firstShoeName_xpath)).getText();
        Assert.assertEquals(expectedFirstFormalShoes, actualFirstFormalShoes);
        if(expectedFirstFormalShoes.equals(actualFirstFormalShoes)){
            test.log(Status.PASS, "Test passed for title verification of Sneakers");
            test.log(Status.PASS, test.addScreenCaptureFromPath(capture(driver))+"Test Passed");
        }
        else{
            test.log(Status.FAIL,"Test failed");
        }
    }
    public static void sportsShoes_dropdown_click() throws InterruptedException, IOException {
        String expectedFirstSportsShoes = "   Ultimate";
        Thread.sleep(2000);
        driver.findElement(By.xpath(sportsShoesDropDown_xpath)).click();
        Thread.sleep(2000);
        String actualFirstSportShoes = driver.findElement(By.xpath(sportsShoes_firstShoeName_xpath)).getText();
        Assert.assertEquals(expectedFirstSportsShoes, actualFirstSportShoes);
        if(expectedFirstSportsShoes.equals(actualFirstSportShoes)){
            test.log(Status.PASS, "Test passed for title verification of Sneakers");
            test.log(Status.PASS, test.addScreenCaptureFromPath(capture(driver))+"Test Passed");
        }
        else{
            test.log(Status.FAIL,"Test failed");
        }
    }
    public static void sneaker_dropdown_click() throws InterruptedException, IOException {
        Thread.sleep(2000);
        String expectedFirstSneakers = "   Archivo";
        driver.findElement(By.xpath(sneakerDropDown_xpath)).click();
        Thread.sleep(2000);
        String actualFirstSneaker = driver.findElement(By.xpath(sneaker_firstShoeName_xpath)).getText();
        Assert.assertEquals(expectedFirstSneakers, actualFirstSneaker);
        if(expectedFirstSneakers.equals(actualFirstSneaker)){
            test.log(Status.PASS, "Test passed for title verification of Sneakers");
            test.log(Status.PASS, test.addScreenCaptureFromPath(capture(driver))+"Test Passed");
        }
        else if(false){
            test.log(Status.FAIL,"Test failed ");
            test.fail(MediaEntityBuilder.createScreenCaptureFromBase64String("base64").build());
        }
    }


}
