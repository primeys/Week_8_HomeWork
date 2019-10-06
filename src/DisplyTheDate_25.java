import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import static java.util.Calendar.*;

public class DisplyTheDate_25 {
    /*
    Java Program to display the date

     */

public static void main (String[]args)
{
SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");

    Date date = new Date();
    System.out.println(java.time.LocalDate.now());
   }
}
