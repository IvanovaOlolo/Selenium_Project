package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.start.StartPage;

import java.util.List;

public class StartPageTest extends BaseTest {

    @Test
    public void testSearchForLanguageByName() {

        final String LANGUAGE_PYTHON = "python";

        List<String> languagesNames =
                openBaseURL().
                        clickSearchLanguageMenu().
                        clickSearchForField().
                        inputSearchCriteria(LANGUAGE_PYTHON).
                        clickGoButton().
                        getNamesInLowerCase();

        Assert.assertTrue(languagesNames.size() > 0);

        for (String languageName : languagesNames) {
            Assert.assertTrue(languageName.contains(LANGUAGE_PYTHON));
        }
    }

    // Тест: стартовая страница успешно загрузилась

    @Test
    public void testbaseURLLoadingSuccessful() {
        StartPage startPage = openBaseURL();

        String actualURL = startPage.getURL();
        String actualTitle = startPage.getTitle();

        String h1LogoHeaders = startPage.getTextH1LogoHeaders();
        String h2LogoHeaders = startPage.getTextH2LogoHeaders();

        Assert.assertEquals(actualURL, "https://www.99-bottles-of-beer.net/");
        Assert.assertEquals(actualTitle, "99 Bottles of Beer | Start");

        Assert.assertEquals(h1LogoHeaders, "99 Bottles of Beer");
        Assert.assertEquals(h2LogoHeaders, "one program in 1500 variations");
    }

    @Test
    public void testStartPageLinkNavigatesToHistoryPage(){
        final String expectedURL = "https://www.99-bottles-of-beer.net/info.html";
        final String expectedTitle ="99 Bottles of Beer | Background and historic information";

        String oldURL = openBaseURL().getURL();

        String actualResultURL = openBaseURL().clickLinkHistoricInformation().getURL();
        String actualResultTitle = openBaseURL().clickLinkHistoricInformation().getTitle();

        Assert.assertNotEquals(oldURL, actualResultURL);
        Assert.assertEquals(actualResultTitle, expectedTitle);
        Assert.assertEquals(actualResultURL, expectedURL);

    }





}
