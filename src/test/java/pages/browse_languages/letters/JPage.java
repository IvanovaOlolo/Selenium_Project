package pages.browse_languages.letters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.browse_languages.BrowseLanguagesSupMenuPage;
import pages.browse_languages.languages.JQueryLanguagePage;
import pages.pages_abstract.TablePage;

public class JPage extends BrowseLanguagesSupMenuPage {
    @FindBy (xpath = "//a[@href='language-jquery-1361.html']")
    private WebElement JQueryLink;

    public JPage(WebDriver driver) {
        super(driver);
    }

    public JQueryLanguagePage clickJQueryLanguage(){
        click(JQueryLink);
        return new JQueryLanguagePage(getDriver());
    }

    public String getJPAgeURL(){
       return getURL();

    }
}

