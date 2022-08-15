package Gun41;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Set;

public class _04_ZonedDateTime {
    public static void main(String[] args) throws InterruptedException {
        ZonedDateTime zdt=ZonedDateTime.now();
        System.out.println("zdt = " + zdt);

        while (true){
            zdt=ZonedDateTime.now().now();
            System.out.print("\rsaat="+zdt.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)));
            Thread.sleep(1000);
        }

    }
}
