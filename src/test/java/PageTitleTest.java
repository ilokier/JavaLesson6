import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@Execution(ExecutionMode.CONCURRENT)
public class PageTitleTest extends BaseTest {

    @Tag("Regression")
    @ParameterizedTest
    @CsvFileSource(resources = "/parameters.csv")
    public void shouldHaveProperPageTitle(String url, String title) {
        driver.get(url);
        assertThat("Title is not correct", driver.getTitle(), equalTo(title));
    }

}

