package application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date d = Date.from(Instant.parse("2024-02-06T02:53:03Z"));

        System.out.println(sdf.format(d));

        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.HOUR_OF_DAY, 4);
        d = cal.getTime();
        
        System.out.println(sdf.format(d));
        
        int minutes = cal.get(Calendar.MINUTE);
        int month = cal.get(Calendar.MONTH) + 1; // tem q por o 1 pq o mes começa de 0

        System.out.println("Minutes: " + minutes);
        System.out.println("Month: " + month);
        
    }
}
