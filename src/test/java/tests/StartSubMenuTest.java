package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrowseLanguageABSPage;
import pages.start.StartPage;
import testData.TestData;

public class StartSubMenuTest extends BaseTest {
    @Test(dataProviderClass = TestData.class, dataProvider = "StartSubMenuData")
    public void testStartSubMenusNavigaterToCorrenspondingPages(
            int index, String menuText, String href, String url, String title){
        StartPage startPage = openBaseURL();

        String oldURL = startPage.getURL();
        String oldTitle = startPage.getTitle();

        startPage.clickStartSubMenu(index);

        String actualUrl = getDriver().getCurrentUrl();
        String actualTitle = getDriver().getTitle();

        Assert.assertNotEquals(actualUrl, oldURL);
        Assert.assertNotEquals(actualTitle, oldTitle);

        Assert.assertEquals(actualUrl, url);
        Assert.assertEquals(actualTitle, title);

    }
}
