package no.nav.bidrag.felles.test.data.time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtils {
    public static final DateTimeFormatter DEFAULT_DATE_FORMAT = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    public static LocalDate parseString(String dateStr) {
        return LocalDate.parse(dateStr, DEFAULT_DATE_FORMAT);
    }
}
