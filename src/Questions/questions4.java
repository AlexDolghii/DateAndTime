package Questions;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class questions4 {
    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(2006, Month.NOVEMBER, 10);

        System.out.println("Day of the week: " + birthDate.getDayOfWeek());
        System.out.println("Day in the year: " + birthDate.getDayOfYear());
        System.out.println("Month: " + birthDate.getMonth());
        System.out.println("Year: " + birthDate.getYear());

        LocalDate currentDate = LocalDate.now();

        long daysDifference = ChronoUnit.DAYS.between(birthDate, currentDate);

        System.out.println("Days difference: " + daysDifference);

        if (birthDate.isAfter(currentDate)) {
            System.out.println("Birthdate is after current date");
        } else if (birthDate.isBefore(currentDate)) {
            System.out.println("Birthdate is before current date");
        } else {
            System.out.println("Birthdate is the same as current date");
        }
    }
}
