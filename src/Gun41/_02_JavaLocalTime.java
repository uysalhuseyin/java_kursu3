package Gun41;

import java.time.LocalTime;

public class _02_JavaLocalTime {
    public static void main(String[] args) throws InterruptedException {
        LocalTime saat=LocalTime.now();
        System.out.println("saat = " + saat);


        //System.out.println("saat = " + saat.getHour());
        //System.out.println("saat = " + saat.getMinute());
        //System.out.println("saat = " + saat.getSecond());

        while (true){
            saat=LocalTime.now();
            System.out.print("\rsaat="+saat);
            Thread.sleep(1000);
        }
    }
}
