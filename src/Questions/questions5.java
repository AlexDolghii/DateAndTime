package Questions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class questions5 {
    public static void main(String[] args) {
        int year = 2023;
        Map<String, LocalDate> holidays = new HashMap<>();

        holidays.put("New Year's Day", LocalDate.of(year, 1, 1));
        holidays.put("Birthday", LocalDate.of(year, 11, 10));
        holidays.put("Memorial Day", LocalDate.of(year, 5, 31));
        holidays.put("Independence Day", LocalDate.of(year, 7, 4));
        holidays.put("Labor Day", LocalDate.of(year, 9, 6));
        holidays.put("Thanksgiving Day", LocalDate.of(year, 11, 25));
        holidays.put("Christmas Day", LocalDate.of(year, 12, 25));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d");
        for (String holiday : holidays.keySet()) {
            LocalDate date = holidays.get(holiday);
            String formattedDate = date.format(formatter);
            System.out.println(holiday + " - " + formattedDate);
        }
    }
}
