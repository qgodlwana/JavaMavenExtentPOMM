package Pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import static Tests.SeleniumTest.driver;

public class ShoeTypesPage {
    public static String formalShoeTypePara_xpath = "//*[@id=\"SmokeTests\"]/p";
    public static String sportsShoeTypePara_xpath = "//*[@id=\"RegressionTests\"]/p";
    public static String sneakerShoeTypePara_xpath = "//*[@id=\"VanguardTests\"]/p";
    public static String formalShoeExclusiveCollection_xpath = "/html/body/div[3]/div/div[1]/button";
    public static String exclusiveFormalShoeName_xpath = "/html/body/div[2]/table/tbody/tr[4]/td[1]";

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
    public static void clickFormalShoeExclusiveCollectionBtn() throws InterruptedException{
        driver.findElement(By.xpath(formalShoeExclusiveCollection_xpath)).click();
    }
    public static void verifyExclusiveFormalShoeName() throws InterruptedException{
        Thread.sleep(1000);
        String expectedExclusiveFormalShoeName = "   Prestigue Suede";
        String actualExclusiveFormalShoeName = driver.findElement(By.xpath(exclusiveFormalShoeName_xpath)).getText();
        Assert.assertEquals(expectedExclusiveFormalShoeName, actualExclusiveFormalShoeName);
    }
}
