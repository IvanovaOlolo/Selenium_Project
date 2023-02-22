package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.pages_abstract.SearchLanguagesSupMenuPage;

public class SearchLanguagesPage extends SearchLanguagesSupMenuPage {

    @FindBy (name = "search")
    private WebElement searchForField;

    @FindBy (name = "submitsearch")
    private WebElement goButton;


    public SearchLanguagesPage(WebDriver driver) {
        super(driver);
    }

    public  SearchLanguagesPage clickSearchForField(){
        click(searchForField);
        return this;
    }

    public SearchLanguagesPage inputSearchCriteria(String text){
        inPut(searchForField, text);
        return this;
    }

    public SearchLanguagesPage clickGoButton(){
        click(goButton);
        return this;
    }


}
