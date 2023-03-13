package Questions;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class questions1 {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        calendar.set(2023, Calendar.JANUARY, 1);
        int days = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println(days);
    }
}
