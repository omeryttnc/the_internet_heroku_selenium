package tests;

import org.testng.Assert;
import org.testng.annotations.*;

import pages.HomePage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class deneme {
    HomePage homePage = new HomePage();

    @Test
    public void name() {
        System.out.println("ssss");
    }

    @Test
    public void a() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        ReusableMethods.waitForPageToLoad(10);
        ReusableMethods.waitFor(5);
        homePage.AB_Testing.click();
        ReusableMethods.waitForPageToLoad(10);
        ReusableMethods.waitFor(5);
        Assert.assertEquals(homePage.title.getText(), "A/B Test Variation 1" );
    }
}
