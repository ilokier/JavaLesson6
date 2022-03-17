import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class PageTitleTest extends BaseTest{

    @Tag("Regression")
    @ParameterizedTest
    @CsvSource({
            "https://siiportal.sii.pl,Logowanie na koncie",
            "http://www.kotuszkowo.pl,Kotuszkowo- blog o kotach",
            "https://www.filmweb.pl, Filmweb - filmy takie jak Ty!",
            "https://www.selenium.dev/documentation/en/webdriver, WebDriver | Selenium",
            "https://www.onet.pl, Onet – Jesteś na bieżąco"
    })
    public void openingMainPageShouldReturnAccuratePageTitle(String url, String title) {
        driver.get(url);
        assertThat(driver.getTitle(), equalTo(title));
    }

}

