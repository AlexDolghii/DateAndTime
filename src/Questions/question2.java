package Questions;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class question2 {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        calendar.set(2023, Calendar.JANUARY, 1);
        if (Calendar.DAY_OF_MONTH == 13 && Calendar.DAY_OF_WEEK == Calendar.FRIDAY)
            System.out.println("its Friday the 13th");
        else
            System.out.println("Its not Friday the 13th");
    }
}
