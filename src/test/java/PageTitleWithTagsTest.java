import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
@Execution(ExecutionMode.CONCURRENT)
public class PageTitleWithTagsTest extends BaseTest {

    @Tag("siiportal")
    @Tag("Regression")
    @ParameterizedTest
    @ValueSource(strings = {"Logowanie na koncie"})
    public void siiPortalTest(String title) {
        driver.get("https://siiportal.sii.pl");
        assertThat(driver.getTitle(), equalTo(title));
    }

    @Tag("kotuszkowo")
    @Tag("Regression")
    @ParameterizedTest
    @ValueSource(strings = {"Kotuszkowo- blog o kotach"})
    public void shouldHaveKotuszkowoPageTitle(String title) {
        driver.get("http://kotuszkowo.pl");
        assertThat(driver.getTitle(), equalTo(title));
    }

    @Tag("filmweb")
    @Tag("Regression")
    @ParameterizedTest
    @ValueSource(strings = {"Filmweb - filmy takie jak Ty!"})
    public void shouldHaveFilmwebPageTitle(String title) {
        driver.get("https://www.filmweb.pl");
        assertThat(driver.getTitle(), equalTo(title));
    }

    @Tag("selenium")
    @Tag("Regression")
    @ParameterizedTest
    @ValueSource(strings = {"WebDriver | Selenium"})
    public void shouldHaveSeleniumPageTitle(String title) {
        driver.get("https://www.selenium.dev/documentation/en/webdriver");
        assertThat(driver.getTitle(), equalTo(title));
    }

    @Tag("onet")
    @Tag("Regression")
    @ParameterizedTest
    @ValueSource(strings = {"Onet – Jesteś na bieżąco"})
    public void shouldHaveOnetPageTitle(String title) {
        driver.get("https://www.onet.pl");
        assertThat(driver.getTitle(), equalTo(title));
    }
}
