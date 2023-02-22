package pages.start;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SongLyricsPage extends StartSubMenuPage {

    @FindBy (xpath = "//div[@id='main']/p")
    private List<WebElement> pTags;

    public SongLyricsPage(WebDriver driver) {
        super(driver);
    }

    public String getSongLyrics() {
        StringBuilder songLyrics = new StringBuilder();

        for (String text : getListText(pTags)) {
            songLyrics.append(text);
        }

        return songLyrics.toString();
    }


    }

