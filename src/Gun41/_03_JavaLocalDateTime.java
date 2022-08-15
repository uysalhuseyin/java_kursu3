package Gun41;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class _03_JavaLocalDateTime {
    public static void main(String[] args) throws InterruptedException {
        LocalDateTime dt=LocalDateTime.now ();
        System.out.println("dt = " + dt);

        while (true){
            dt=LocalDateTime.now();
            System.out.print("\rsaat="+dt.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)));
            Thread.sleep(1000);
        }

    }
}
