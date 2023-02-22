package pages.start;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.pages_abstract.MainPаge;
import pages.start.SongLyricsPage;

import java.util.List;


public abstract class StartSubMenuPage extends MainPаge {

    @FindBy(xpath = "//a[@href='lyrics.html']")
    private WebElement linkSongLyrics;

    @FindBy(xpath = "//ul[@id='submenu']/li")
    private List<WebElement> subMeniLinks;

    public SongLyricsPage clickLinkSongLyrics(){
        click(linkSongLyrics);
        return new SongLyricsPage(getDriver());
    }

    public void clickStartSubMenu(int index) {
        subMeniLinks.get(index).click();
    }

    public StartSubMenuPage(WebDriver driver) {
        super(driver);
    }
}
