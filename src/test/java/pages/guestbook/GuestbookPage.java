package pages.guestbook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.pages_abstract.BasePage;

public class GuestbookPage extends BasePage {
    @FindBy (xpath = "//a[@href='./signv2.html']")
    private WebElement subMenuSignGuestbook;

    public SignGuestbookPage clicksubMenuSignGuestbook(){
        click(subMenuSignGuestbook);
        return new SignGuestbookPage(getDriver());
    }

    public GuestbookPage(WebDriver driver) {
        super(driver);
    }
}
