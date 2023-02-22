package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.browse_languages.languages.JQueryLanguagePage;
import pages.browse_languages.letters.JPage;

public class JTest extends BaseTest {

    //тесты на навигацию,  нужно сделать проверку, что произошел переход, произошел клик
    @Test
    public void testjQuueryLinkNavigatesToJQueryLanguagePage (){
        final String expectedURL = "https://www.99-bottles-of-beer.net/language-jquery-1361.html";
        final String expectedTitle = "99 Bottles of Beer | Language jQuery";

        JQueryLanguagePage jQueryLanguagePage = new JQueryLanguagePage(getDriver());

        openBaseURL().
                clickBrowseLanguagesMenuFooter().
                clickJSubMenu().
                clickJQueryLanguage();

        String actualURL = jQueryLanguagePage.getURL();
        String actualTitle = jQueryLanguagePage.getTitle();

        Assert.assertEquals(actualURL, expectedURL);
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    //
    @Test
    public void testjQuueryLinkNavigatesToJQueryLanguagePage2 (){
        final String expectedURL = "https://www.99-bottles-of-beer.net/language-jquery-1361.html";
        final String expectedTitle = "99 Bottles of Beer | Language jQuery";

        JQueryLanguagePage jQueryLanguagePage = new JQueryLanguagePage(getDriver());

       String oldURL = openBaseURL().
                clickBrowseLanguagesMenuFooter().
                clickJSubMenu().getJPAgeURL();
       new JPage(getDriver()).clickJQueryLanguage();

        String actualURL = jQueryLanguagePage.getURL();
        String actualTitle = jQueryLanguagePage.getTitle();

        Assert.assertNotEquals(oldURL, getDriver().getCurrentUrl()); //старая ссылка не равна текущей

        Assert.assertEquals(actualURL, expectedURL);
        Assert.assertEquals(actualTitle, expectedTitle);
    }


}
