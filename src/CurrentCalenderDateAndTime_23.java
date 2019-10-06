import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class CurrentCalenderDateAndTime_23 {
    /*
    Java Program to get and display information (yyyy/mm/dd/hh/min)
     */

    public static void main(String[] args) {
        SimpleDateFormat dt = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        dt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));
        System.out.println("\nNow:" + dt.format(System.currentTimeMillis()));
    }

}
