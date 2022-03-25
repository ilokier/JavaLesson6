import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@Execution(ExecutionMode.CONCURRENT)
public class PageTitleTest extends BaseTest {
    private static Logger log = LoggerFactory.getLogger("PageTitleTest.class");


    @Tag("Regression")
    @ParameterizedTest
    @CsvFileSource(resources = "/parameters.csv")
    public void shouldHaveProperPageTitle(String url, String title) {
        driver.get(url);
        log.info("<<<app url is: " + url);
        log.info("<<<expected title is: " + title);
        log.info("Actual title is: " + driver.getTitle());
        assertThat("Title is not correct", driver.getTitle(), equalTo(title));
    }

}

