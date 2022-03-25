import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@Execution(ExecutionMode.CONCURRENT)
public class PageTitleWithTagsTest extends BaseTest {
    Logger log = LoggerFactory.getLogger(PageTitleWithTagsTest.class);
    private String siteUrl;

    @Tag("siiportal")
    @Tag("Regression")
    @ParameterizedTest
    @ValueSource(strings = {"Logowanie na koncie"})
    public void siiPortalTest(String title) {
        siteUrl = "https://siiportal.sii.pl";
        driver.get(siteUrl);
        log.info("<<<Provided site url is: " + siteUrl);
        log.info("<<<expected site title is: " + title);
        log.info("Actual site title is " + driver.getTitle());
        assertThat(driver.getTitle(), equalTo(title));
    }

    @Tag("kotuszkowo")
    @Tag("Regression")
    @ParameterizedTest
    @ValueSource(strings = {"Kotuszkowo- blog o kotach"})
    public void shouldHaveKotuszkowoPageTitle(String title) {
        siteUrl = "http://kotuszkowo.pl";
        driver.get(siteUrl);
        log.info("<<<Provided site url is: " + siteUrl);
        log.info("<<<expected site title is: " + title);
        log.info("Actual site title is " + driver.getTitle());
        assertThat(driver.getTitle(), equalTo(title));

    }

    @Tag("filmweb")
    @Tag("Regression")
    @ParameterizedTest
    @ValueSource(strings = {"Filmweb - filmy takie jak Ty!"})
    public void shouldHaveFilmwebPageTitle(String title) {
        siteUrl = "https://www.filmweb.pl";
        driver.get(siteUrl);
        log.info("<<<Provided site url is: " + siteUrl);
        log.info("<<<expected site title is: " + title);
        log.info("Actual site title is " + driver.getTitle());
        assertThat(driver.getTitle(), equalTo(title));

    }

    @Tag("selenium")
    @Tag("Regression")
    @ParameterizedTest
    @ValueSource(strings = {"WebDriver | Selenium"})
    public void shouldHaveSeleniumPageTitle(String title) {
        siteUrl = "https://www.selenium.dev/documentation/en/webdriver";
        driver.get(siteUrl);
        log.info("<<<Provided site url is: " + siteUrl);
        log.info("<<<expected site title is: " + title);
        log.info("Actual site title is " + driver.getTitle());
        assertThat(driver.getTitle(), equalTo(title));
    }

    @Tag("onet")
    @Tag("Regression")
    @ParameterizedTest
    @ValueSource(strings = {"Onet – Jesteś na bieżąco"})
    public void shouldHaveOnetPageTitle(String title) {
        siteUrl = "https://www.onet.pl";
        driver.get(siteUrl);
        log.info("<<<Provided site url is: " + siteUrl);
        log.info("<<<expected site title is: " + title);
        log.info("Actual site title is " + driver.getTitle());
        assertThat(driver.getTitle(), equalTo(title));


    }
}
