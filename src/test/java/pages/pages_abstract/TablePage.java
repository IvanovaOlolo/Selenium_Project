package pages.pages_abstract;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.pages_abstract.MainPаge;

import java.util.List;

public abstract class TablePage extends MainPаge {

    @FindBy(xpath = "//table[@id='category']/tbody/tr/td/a")
    private List <WebElement> languagesNameList;


    public TablePage(WebDriver driver) {
        super(driver);
    }

    public List<String> getNamesInLowerCase(){
        return getListTextInLowerCase_POM3(languagesNameList);
    }


}
