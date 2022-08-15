package Gun41;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class _01_Period {
    // 2 tarih arasindaki farki gosterir
    //LocalDate icin kullanilir.
    public static void main(String[] args) {
        LocalDate DT= LocalDate.of(1995, 6,9);
        LocalDate BG=LocalDate.now();
        Period fark=Period.between(DT,BG);
        System.out.println("fark = " + fark);

        System.out.println("fark = " + fark.getYears()+"(yil)-"+fark.getMonths()+"(ay)-"+fark.getDays()+"(gun)");
    }
}
