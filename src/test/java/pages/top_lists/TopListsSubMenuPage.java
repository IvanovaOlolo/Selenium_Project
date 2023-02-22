package pages.top_lists;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.pages_abstract.MainPаge;
import pages.pages_abstract.TablePage;

import java.util.List;

public abstract class TopListsSubMenuPage extends TablePage {

    @FindBy (xpath = "//ul[@id='submenu']/li/a")
    private List<WebElement> listSubMenu;

    public TopListsSubMenuPage(WebDriver driver) {
        super(driver);
    }

    public List <String> getTextListSubMenuTopLists(){
        return getListText(listSubMenu);
    }


}
