package pages.top_lists;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TopRatedPage extends TopListsSubMenuPage {

    @FindBy (xpath = "//table[@id='category']//tr/th")
    private List<WebElement> tableTopRated;

    public TopRatedPage(WebDriver driver) {
        super(driver);
    }

    public List <String> getNameHeadesrTable(){
        return getListText(tableTopRated);
    }


}
