package pages.start;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StartPage extends StartSubMenuPage {

    @FindBy (xpath = "//div[@id='header']/h1")
    private WebElement H1LogoHeaders;

    @FindBy (xpath = "//div[@id='header']/h2")
    private WebElement H2LogoHeaders;

    @FindBy (xpath = "//a[@href='./info.html']")
    private WebElement linkHistoricInformation;

    public StartPage(WebDriver driver) {
        super(driver);
    }

    public String getTextH1LogoHeaders(){
        return getText(H1LogoHeaders);
    }

    public String getTextH2LogoHeaders(){
        return getText(H2LogoHeaders);
    }

    public HistoryPage clickLinkHistoricInformation(){
        click(linkHistoricInformation);
        return new HistoryPage (getDriver());
    }



}
