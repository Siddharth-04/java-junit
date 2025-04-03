package bridgelabz.advanceJunitProblems;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatting {

    public String formatDate(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.parse(date, formatter);

        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return localDate.format(outputFormatter);
    }
}