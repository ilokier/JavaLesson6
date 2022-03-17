import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class PageTitleTest extends BaseTest {

    @Tag("Regression")
    @ParameterizedTest
    @CsvSource({
            "https://siiportal.sii.pl,Logowanie na koncie",
            "http://www.kotuszkowo.pl,Kotuszkowo- blog o kotach",
            "https://www.filmweb.pl, Filmweb - filmy takie jak Ty!",
            "https://www.selenium.dev/documentation/en/webdriver, WebDriver | Selenium",
            "https://www.onet.pl, Onet – Jesteś na bieżąco"
    })
    public void shouldHaveProperPageTitle(String url, String title) {
        driver.get(url);
        assertThat("Title is not correct", driver.getTitle(), equalTo(title));
    }

}

