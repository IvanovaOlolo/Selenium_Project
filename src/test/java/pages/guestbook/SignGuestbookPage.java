package pages.guestbook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.pages_abstract.MainPаge;

public class SignGuestbookPage extends MainPаge {

    @FindBy(css = "a[onclick*='url']")
    private WebElement altWebAddress;

    public SignGuestbookPage(WebDriver driver) {
        super(driver);
    }

    public void clickAltWebAddress(){
        click(altWebAddress);
    }
}
