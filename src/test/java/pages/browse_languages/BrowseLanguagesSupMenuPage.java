package pages.browse_languages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.browse_languages.letters.JPage;
import pages.pages_abstract.TablePage;

public abstract class BrowseLanguagesSupMenuPage extends TablePage {

    @FindBy(xpath = "//a[@href='j.html']")
    private WebElement jSubMenu;


    public BrowseLanguagesSupMenuPage(WebDriver driver) {
        super(driver);
    }

    public JPage clickJSubMenu(){
        click(jSubMenu);
        return new JPage(getDriver());
    }

}
