package bridgelabz.advanceJunitProblems;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class DateFormattingTest {
    DateFormatting df = new DateFormatting();

    @ParameterizedTest
    @CsvSource({
            "2018-12-04,04-12-2018",
            "2019-03-09,09-03-2019",
            "2023-05-01,01-05-2023"
    })
    public void shouldformatDate(String date, String expected) {
        String ans = df.formatDate(date);
        assertEquals(expected, ans);
    }
}
