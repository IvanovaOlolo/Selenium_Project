package base;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import pages.start.StartPage;
import utils.ReportUtils;

import java.lang.reflect.Method;

public abstract class BaseTest { // кажды класс должен наследоваться от данного класса, чтобы была возможность драйвер создать
    // и чтобы была возможность из драйвера выходить

    private static final String BASE_URL = "https://www.99-bottles-of-beer.net/";

    private WebDriver driver;

    @BeforeSuite
    protected void beforeSuite(ITestContext context) {

        Reporter.log(ReportUtils.getReportHeader(context), true);
    }

    @BeforeMethod
    protected void beforeMethod(Method method, ITestResult result) {
        driver = BaseUtils.createDriver(); //драйвер создался

        Reporter.log(ReportUtils.END_LINE, true);
        Reporter.log("TEST RUN", true);
        Reporter.log(ReportUtils.getClassNameTestName(method, result), true);
    }

    @AfterMethod
    protected void afterMethod(Method method, ITestResult result) {
        Reporter.log(ReportUtils.getTestStatistics(method, result), true);

        driver.quit(); // выход из драйвера
    }

    protected WebDriver getDriver() {

        return driver;
    }

    public static String getBaseUrl() {

        return BASE_URL;
    }

    public StartPage openBaseURL() {
        getDriver().get(BASE_URL);
        return new StartPage(getDriver());
    }

    public String getExternalPageTitle() { // методы не работающие с POM

        return getDriver().getTitle();
    }

    public String getExternalPageURL() { // методы не работающие с POM

        return getDriver().getCurrentUrl();
    }
}
