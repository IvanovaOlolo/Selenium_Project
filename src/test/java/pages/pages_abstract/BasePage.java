package pages.pages_abstract;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public abstract class BasePage {

    private WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(getDriver(), this); // в этом случае придется работать не с локаторами, а с элементами
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void click(WebElement element) {
        element.click();
    }

    public void inPut(WebElement element, String text) {
        element.sendKeys(text);
    }

    public String getText(WebElement element){
        return element.getText();
    }

    public int getListSize(List <WebElement> list) {
        return list.size();
    }

    public List<String> getListText(List <WebElement> list) {
        if (getListSize(list) > 0) {
            List<String> textList = new ArrayList<>();
            for (WebElement element : list) {
                textList.add(element.getText());
            }
            return textList;
        }
        return null;

    }

    public List<String> getListTextInLowerCase_POM3(List <WebElement> list) {
        if (list.size() > 0) {
            List<String> textList = new ArrayList<>(); // создание пустого списка String-ов
            for (WebElement element : list) {
                textList.add(element.getText().toLowerCase());
            }
            return textList;
        }
        return null;
    }

    public String getTitle(){
        return getDriver().getTitle();
    }

    public String getURL(){
        return getDriver().getCurrentUrl();
    }





}
