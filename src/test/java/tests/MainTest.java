package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.start.StartPage;
import testData.TestData;

import java.util.List;

public class MainTest extends BaseTest {
    //тест на работу с DataProvider
    @Test(dataProviderClass = TestData.class, dataProvider = "MainTestData")
    public void testTopMenusNavigaterToCorrenspondingPages(
            int index, String menuText, String href, String url, String title){

        StartPage startPage = openBaseURL();

        String oldURL = startPage.getURL();
        String oldTitle = startPage.getTitle();

        startPage.clickTopMenu(index);

        String actualUrl = getDriver().getCurrentUrl();
        String actualTitle = getDriver().getTitle();


        if (index != 0) {
            Assert.assertNotEquals(actualUrl, oldURL);
            Assert.assertNotEquals(actualTitle, oldTitle);
        }
        Assert.assertEquals(actualUrl, url);
        Assert.assertEquals(actualTitle, title);
    }

    //проверить наличие всех элементов в шапке сайта

    @Test
    public void testNavigationMenuLinksAmountAndTexts(){
        final int expectedAmount = 6;
        final String[] expectedTextsTopMenu = {"Start", "Browse Languages", "Search Languages", "Top Lists", "Guestbook", "Submit new Language"};

        int actualAmount = openBaseURL().getMenuLinksAmount();
        List<String> actualTextsTopMenu = openBaseURL().getMenuTexts();

        Assert.assertEquals(actualAmount, expectedAmount);

        for (int i = 0; i < actualTextsTopMenu.size(); i++) {
            Assert.assertEquals(actualTextsTopMenu.get(i), expectedTextsTopMenu[i].toUpperCase());
        }

    }

}
