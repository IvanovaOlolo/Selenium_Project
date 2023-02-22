package tests;

import base.BaseTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class SignGuestbookTest extends BaseTest {
    // тесты на работу с alert

    @Test
    public void testCheckTextForAlert(){


        String expectedTextFromPromptURL = "Enter the URL for the link you want to add.";

        openBaseURL().
                clickGuestbookMenu().
                clicksubMenuSignGuestbook().
                clickAltWebAddress();

        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

        Alert alertURL = wait.until(ExpectedConditions.alertIsPresent());

        String actualTextFromPromptURL = alertURL.getText();

        Assert.assertEquals(actualTextFromPromptURL, expectedTextFromPromptURL);

    }

}
