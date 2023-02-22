package pages.pages_abstract;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BrowseLanguageABSPage;
import pages.SearchLanguagesPage;
import pages.guestbook.GuestbookPage;

import java.util.List;

public abstract class MainPаge extends BasePage {

    @FindBy(xpath = "//div[@id='navigation']//a[@href='/search.html']")
    private WebElement searchLanguageMenu;

    @FindBy(xpath = "//div[@id='navigation']//a[@href='/abc.html']")
    private WebElement browseLanguagesMenu;

    @FindBy(xpath = "//div[@id='navigation']//a[@href='/guestbookv2.html']")
    private WebElement guestbookMenu;

    @FindBy(xpath = "//ul[@id='menu']//li")
    private List<WebElement> menuLinks;

    //footer menu

    @FindBy(xpath = "//div[@id='footer']//a[@href='/abc.html']")
    private WebElement browseLanguagesMenuFooter;



    public MainPаge(WebDriver driver) {
        super(driver);
    }

    public SearchLanguagesPage clickSearchLanguageMenu(){
        click(searchLanguageMenu);
        return new SearchLanguagesPage(getDriver());
    }

    public BrowseLanguageABSPage clickBrowseLanguagesMenu(){
        click(browseLanguagesMenu);
        return new BrowseLanguageABSPage(getDriver());
    }

    public BrowseLanguageABSPage clickBrowseLanguagesMenuFooter(){
        click(browseLanguagesMenuFooter);
        return new BrowseLanguageABSPage(getDriver());
    }
    public void clickTopMenu(int index) {
        menuLinks.get(index).click();
    }

    public GuestbookPage clickGuestbookMenu(){
        click(guestbookMenu);
        return new GuestbookPage(getDriver());
    }

    public int getMenuLinksAmount(){
        return getListSize(menuLinks);
    }

    public List<String> getMenuTexts(){
        return getListText(menuLinks);
    }


}


