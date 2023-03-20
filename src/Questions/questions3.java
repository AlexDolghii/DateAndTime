package Questions;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static java.lang.Math.abs;

public class questions3 {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        calendar.set(2023, Calendar.MARCH, 20);
        Calendar age = new GregorianCalendar();
        age.set(2006, Calendar.NOVEMBER, 10);
        int pYear = calendar.get(Calendar.YEAR) - age.get(Calendar.YEAR);
        int pMonth = calendar.get(Calendar.MONTH) - age.get(Calendar.MONTH);
        int pDay = calendar.get(Calendar.DATE) - age.get(Calendar.DATE);

        if (pMonth < 0) {
            pYear -= 1;
            pMonth = abs(pMonth);
        }
        pMonth = 12 - pMonth;
        if (pDay < 0) {
            pMonth -= 1;
            pDay = abs(pDay);
        }

        if (pYear > 0 && pMonth > 1 && pDay > 1
        || pYear == 0 && pMonth > 1 && pDay > 1
        || pYear == 0 && pMonth == 1 && pDay > 1)
            System.out.println("Years: " + pYear + ", Months: " + pMonth + ", Days: " + pDay);
        else
            System.out.println("You arnt born yet");
    }
}
