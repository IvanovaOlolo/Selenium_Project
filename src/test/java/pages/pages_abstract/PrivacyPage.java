package pages.pages_abstract;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.start.StartSubMenuPage;

public class PrivacyPage extends StartSubMenuPage {

    @FindBy(xpath = "//div[@id='main']//p")
    private WebElement mail;

    public String getTextMail(){
        return getText(mail);
    }

    public PrivacyPage(WebDriver driver) {
        super(driver);
    }


}
